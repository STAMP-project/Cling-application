import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}", "hihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}" + "'", str2, "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}");
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "-1-10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 100);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) (byte) 1);
        java.lang.Class<?> wildcardClass9 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) " aaahihi...  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("{-1,10,0,10,1,10,0,0}", 2, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true, (int) ' ');
        boolean[] booleanArray17 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray24 = new boolean[] { false, false, true, true, false, true };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray17, booleanArray24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray24);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray26, false, 93);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray26, true);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray26);
        boolean[] booleanArray39 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray46 = new boolean[] { false, false, true, true, false, true };
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray39, booleanArray46);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray46);
        boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray32, booleanArray46);
        boolean[] booleanArray51 = org.apache.commons.lang3.ArrayUtils.add(booleanArray32, true);
        boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray32);
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[false, false, true, true, false, true, false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[false, false, true, true, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[false, false, false, true, true, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        java.lang.Character[][] charArray0 = new java.lang.Character[][] {};
        java.lang.Character[] charArray2 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray4 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray6 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray8 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray10 = new java.lang.Character[] { ' ' };
        java.lang.Character[][] charArray11 = new java.lang.Character[][] { charArray2, charArray4, charArray6, charArray8, charArray10 };
        java.lang.Character[][] charArray12 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character[][] charArray14 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 94, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("100 1", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100 1" + "'", str2, "100 1");
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        java.lang.Long[][][][] longArray0 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, (int) (byte) 1, 8);
        java.lang.Long[][][][] longArray4 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray7 = org.apache.commons.lang3.ArrayUtils.subarray(longArray4, (int) (byte) 1, 8);
        java.lang.Long[][][][] longArray8 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) longArray4);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("     AAAH", "... aa-11001011000-11001011000-11001011000-11 aaahihi...  ", "  10110010aa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000AAAH" + "'", str3, "00000AAAH");
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", "aaa                            aaaA", 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaa", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aAA");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("AAA                                                                                               aaaA", strArray5, strArray8);
        long[] longArray15 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.add(longArray15, (long) (short) 1);
        long[] longArray23 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.add(longArray23, (long) (short) 1);
        long[] longArray29 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(longArray29, (long) ' ');
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray29);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray29);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray15);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray34);
        long[] longArray41 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.add(longArray41, (long) (short) 1);
        long[] longArray47 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(longArray47, (long) ' ');
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.addAll(longArray43, longArray47);
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.addAll(longArray35, longArray43);
        long[] longArray57 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.add(longArray57, (long) (short) 1);
        long[] longArray65 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray67 = org.apache.commons.lang3.ArrayUtils.add(longArray65, (long) (short) 1);
        long[] longArray71 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.contains(longArray71, (long) ' ');
        long[] longArray74 = org.apache.commons.lang3.ArrayUtils.addAll(longArray67, longArray71);
        long[] longArray75 = org.apache.commons.lang3.ArrayUtils.addAll(longArray57, longArray71);
        long[] longArray76 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray57);
        long[] longArray77 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray76);
        long[] longArray80 = org.apache.commons.lang3.ArrayUtils.subarray(longArray77, (int) (short) -1, 0);
        long[] longArray81 = org.apache.commons.lang3.ArrayUtils.addAll(longArray51, longArray77);
        long[] longArray83 = org.apache.commons.lang3.ArrayUtils.add(longArray51, (long) '#');
        int int85 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray5, (java.lang.Object) '#', 42);
        java.lang.String[] strArray87 = org.apache.commons.lang3.StringUtils.split("aaaA");
        java.lang.String str88 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAa       ", strArray5, strArray87);
        java.lang.String[] strArray90 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "10.01.0                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AAA                                                                                               aaaA" + "'", str9, "AAA                                                                                               aaaA");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "AAa       " + "'", str88, "AAa       ");
        org.junit.Assert.assertNotNull(strArray90);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        java.lang.Double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 1L);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("-1011001-10110010-1011001");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1011001-10110010-1011001" + "'", str1, "-1011001-10110010-1011001");
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaa1      aaaa            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa1aaaa" + "'", str1, "aaaa1aaaa");
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        int[] intArray4 = new int[] { (byte) 100, 1, 35, (short) 10 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 100);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 0);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray7);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray7, 65, 14);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = org.apache.commons.lang3.ArrayUtils.remove(intArray7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray15, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 28, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("trueaaahtrueaaahtrueaaahfalse", "aahi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "              1110               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "0.0       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        int[] intArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, 19, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaa1aaaa", "                              HIHIH                                                        aaa", 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa1aaaa" + "'", str3, "aaaa1aaaa");
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "            Hi             ", "444444444hihi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "{-1,10,0,10,1,10,0,0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa", "hihi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("{true,true,true,false}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{true,true,true,false}" + "'", str1, "{true,true,true,false}");
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray4);
        float[] floatArray10 = new float[] { (byte) 10 };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) '4');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray14);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(floatArray14, (float) 10);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray14, 10.0f, (int) (byte) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray14, (float) (short) 1, 0);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray14);
        float[] floatArray26 = new float[] { (byte) 10 };
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.add(floatArray26, (float) (-1));
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray26);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.add(floatArray29, (int) (short) 0, (float) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray29);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray29);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.add(floatArray34, 3, (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0, 10.0]");
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                              HIHIH                                                        aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa                                                        HIHIH                              " + "'", str1, "aaa                                                        HIHIH                              ");
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "      aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      aaa" + "'", str1, "      aaa");
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAAA1######AAAA#############", "AAAH", "aaaa1aaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        java.lang.Float[][][][] floatArray0 = new java.lang.Float[][][][] {};
        java.lang.Float[][][][][] floatArray1 = new java.lang.Float[][][][][] { floatArray0 };
        java.lang.Float[][][][][] floatArray2 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray1);
        java.lang.Float[][][][] floatArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float[][][][][] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, 25, floatArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 25, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
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
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray61, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray66 = org.apache.commons.lang3.ArrayUtils.add(doubleArray61, 65, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 65, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("{hihih}", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("AAAA1######AAAA#############", "10.01.0                                                                                                   ", (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "               HIHIH               ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        java.lang.Long[] longArray21 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray22);
        long[] longArray29 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray29, (long) (short) 1);
        long[] longArray37 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.add(longArray37, (long) (short) 1);
        long[] longArray43 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(longArray43, (long) ' ');
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.addAll(longArray39, longArray43);
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray43);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray29);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray48);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.subarray(longArray49, (int) (short) -1, 0);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.clone(longArray52);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray53);
        java.lang.Long[] longArray55 = org.apache.commons.lang3.ArrayUtils.toObject(longArray53);
        java.lang.Long[] longArray56 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray55);
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertNotNull(longArray56);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0.0a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0A" + "'", str1, "0.0A");
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "------------aaa----------------------------------1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "------------aaa----------------------------------1.0" + "'", str1, "------------aaa----------------------------------1.0");
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("false{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false", "                                    ##1      AAAA1      AAAA1##                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray8, '4');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap14 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, 'a', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "a444#a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("a1a10a0a0", "1      aaaa1      aaaa10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaah", "-1 0 1 100 1", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("{hihih}", 11, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("atrueaaahitrueaaahitrueaaahifalse#trueaaahitrueaaahitrueaaahifalseatrueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4", "AAa       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}", "aAAAa                                                                                               aaaaaA", 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}" + "'", str3, "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}");
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("a", "AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("00000AAAH", " HIHIH10     HIHIH0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HIHIH10     HIHIH0" + "'", str2, " HIHIH10     HIHIH0");
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3, (double) 0L);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, 100.0d);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray5, 93, 2);
        double[] doubleArray14 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray14, (double) 100);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray14, (double) 10L);
        double[] doubleArray19 = new double[] {};
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) '4', (double) (byte) -1);
        double[] doubleArray27 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray19, doubleArray27);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray19, (double) 100, (double) 100);
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray19, 0, 0);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) 1L);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray14, doubleArray19);
        double[] doubleArray38 = new double[] {};
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray38, (double) '4', (double) (byte) -1);
        double[] doubleArray46 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray38, doubleArray46);
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray38, (double) 10.0f, (int) '4');
        double[] doubleArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray38, (double) (byte) -1);
        double[] doubleArray54 = new double[] { 1.0f };
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray54);
        double[] doubleArray56 = new double[] {};
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray54, doubleArray56);
        double[] doubleArray59 = org.apache.commons.lang3.ArrayUtils.add(doubleArray54, (double) (short) -1);
        double[] doubleArray60 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray38, doubleArray54);
        double[] doubleArray62 = org.apache.commons.lang3.ArrayUtils.add(doubleArray54, (double) 3);
        double[] doubleArray65 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray62, 10, (int) (byte) 10);
        double[] doubleArray66 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray14, doubleArray65);
        double[] doubleArray69 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray14, 33, (int) 'a');
        double[] doubleArray73 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray75 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray73, (double) 100);
        double[] doubleArray76 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray69, doubleArray73);
        int int79 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray69, (double) 10.0f, (double) 139);
        boolean boolean80 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray10, doubleArray69);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '#', (int) '4', 13);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.add(booleanArray8, (int) (byte) 1, false);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray8, true);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaahihi..", "HIHIH                                                        aaa##################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahihi.." + "'", str2, "aaahihi..");
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("               HIHIH               ", "1      aaaA1      aaaA10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               HIHIH               " + "'", str2, "               HIHIH               ");
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAA", "aaa                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA" + "'", str2, "AAA");
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "{-1,52,10,1,0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("          a#a444          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("trueaaa", "eslafihaaaeurtihaaaeurtihaaaeurt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "trueaaa" + "'", str2, "trueaaa");
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "AAAA1      AAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA1      AAAA" + "'", str1, "AAAA1      AAAA");
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray15);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, true);
        boolean[] booleanArray24 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray29 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray29, false);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray31);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray31);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray24, booleanArray31);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray34, true);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray15, booleanArray34);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray15, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, true, false, false, true, true, true, false, false, false, true, false, false, true, true, true, false]");
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " aaahihi...  ", "{100,1,-1,0,1,");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray6, (java.lang.Object) (short) 100);
        java.lang.Long[] longArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) 0);
        java.lang.Long[] longArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray13);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("{}0.0----------------------------------------------------------------aaa----------------------");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}0.0----------------------------------------------------------------aaa----------------------" + "'", str1, "{}0.0----------------------------------------------------------------aaa----------------------");
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a#a444", "  10110010aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray29 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray29, (long) (short) 1);
        long[] longArray37 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.add(longArray37, (long) (short) 1);
        long[] longArray43 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(longArray43, (long) ' ');
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.addAll(longArray39, longArray43);
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray43);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray43);
        java.lang.Long[] longArray49 = org.apache.commons.lang3.ArrayUtils.toObject(longArray43);
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray49);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray19, longArray50);
        long[] longArray57 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.add(longArray57, (long) (short) 1);
        long[] longArray63 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.contains(longArray63, (long) ' ');
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.addAll(longArray59, longArray63);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray66);
        java.lang.Long[] longArray74 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray75 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray74);
        long[] longArray76 = org.apache.commons.lang3.ArrayUtils.addAll(longArray66, longArray75);
        int int79 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray75, (long) 1, 35);
        long[] longArray80 = org.apache.commons.lang3.ArrayUtils.addAll(longArray19, longArray75);
        int int82 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray19, (long) 14);
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[0, -1, -1, 1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[0, -1, -1, 1, 0, 100, 1, 0, 97, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 4 + "'", int79 == 4);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[-1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0     HIHIH0     HIHIH10    {}", "-11001011000-11001011000-11001011000-11 aaahihi...  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-11001011000-11001011000-11001011000-11 aaahihi...  " + "'", str2, "-11001011000-11001011000-11001011000-11 aaahihi...  ");
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 1, false);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray22, true);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaa", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("10               HIHIH               1", "aaahihi..", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE", "                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 " + "'", str2, "                                 ");
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray10, 'a', 4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        long[] longArray4 = new long[] { '#', (byte) 100, (byte) 10, 1L };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray7 = org.apache.commons.lang3.ArrayUtils.remove(longArray4, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 24, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                              HIHIH", "", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aahi", "                                                                 aAAAa                                                                                               aaaaaAeaaahfalse");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray11, (byte) 1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(byteArray11, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, '4');
        float[] floatArray11 = new float[] { (byte) 10 };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (float) (-1));
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray13, (float) '4');
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray15);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray15, (float) (-1L));
        float[] floatArray20 = new float[] { (byte) 10 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (-1));
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray22, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray22);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray18, floatArray22);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray18, (float) 35, (-1));
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (float) (byte) 100);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, (float) 1);
        java.lang.Float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray33);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray33, (float) 10L, 100);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) charArray5, (java.lang.Object) 100);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[10.0, -1.0, 52.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAA                                                                                               aaaA", "Hi");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                 AAAAA                                                                                               AAAAAAEAAAHFALSE", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("101101", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
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
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray42 = org.apache.commons.lang3.ArrayUtils.add(charArray34, 24, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 24, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" AAAHIHI...  ", "0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(shortArray6, (short) (byte) 10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray6, 3, 35);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[1, 10, 0]");
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "0.0a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0a" + "'", str1, "0.0a");
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("       AAA     HIHIH     HIHIH     HIHIH  ", "                             aaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       AAA     HIHIH     HIHIH     HIHIH  " + "'", str2, "       AAA     HIHIH     HIHIH     HIHIH  ");
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, (short) 0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.clone(shortArray1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray4, (short) 10);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray4);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, 35, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0]");
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaa                  ...aaaaaa", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AAA                                                                                               aaa   h   h   h   h   h   h   h   h   h  ", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA                                                                                               aaa   h   h   h   h   h   h   h   h   h  " + "'", str2, "AAA                                                                                               aaa   h   h   h   h   h   h   h   h   h  ");
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAA                                                                                               aaa", (int) (byte) 10, "aAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAA                                                                                               aaa" + "'", str3, "AAA                                                                                               aaa");
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("trueaaa                            aaaAtrueaaa                            aaaAtrueaaa                            aaaAfalse", "                      hi!4hi! hi!ahi!ahi!4                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.remove(byteArray0, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 24, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaa1aaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "      aaaA");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaa                                ", strArray3);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(objArray5, "aahi", (int) (short) 0, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi]");
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        long[] longArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) 82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1" + "'", str1, "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1");
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA", "0.1A0.01");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAA4444444444-1A10A0A10A1A10A0A0", " 100 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA4444444444-1A10A0A10A1A10A0A0" + "'", str2, "AAA4444444444-1A10A0A10A1A10A0A0");
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                 aAAAa                                                                                               aaaaaA", "false4false4true4true4false4true4false", 23, 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                       false4false4true4true4false4true4false" + "'", str4, "                       false4false4true4true4false4true4false");
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) (short) 10);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaa                                                                                               aaaa", (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAA1      AAAA            ", "      aaa", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "-11001011000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray5 = null;
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray1, floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 19);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, (float) (byte) 0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
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
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray87 = org.apache.commons.lang3.ArrayUtils.remove(shortArray85, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 33, Length: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) (short) 10, (int) ' ');
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, 0.0d);
        double[] doubleArray13 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray13, (-1.0d));
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) (byte) 1, 100);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray13);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 1, (int) (short) 0);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 33, 28, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("... aaa", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa" + "'", str1, "a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa");
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrAAArrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrAAArrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr" + "'", str2, "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrAAArrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                             ", "{a,#,a,4,4,4}", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        int[] intArray4 = new int[] { (byte) 100, 1, 35, (short) 10 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 100);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 0);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray7);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        int int18 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) intArray4);
        int[] intArray19 = null;
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray19);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray11);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(byteArray17, (byte) 10);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray17);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray2, byteArray20);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) -1, (int) 'a');
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray24, (byte) 10);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray24);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 1 };
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray33, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray33);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray33);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray38);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.contains(byteArray39, (byte) 10);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray39);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray24, byteArray42);
        java.lang.Byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray42);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.clone(byteArray42);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray21, byteArray42);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray42, (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                               AAA                                                                                               aaa", "00000AAAH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                               AAA                                                                                               aaa" + "'", str2, "                                                               AAA                                                                                               aaa");
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        java.lang.Long[] longArray21 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray22);
        long[] longArray29 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray29, (long) (short) 1);
        long[] longArray37 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.add(longArray37, (long) (short) 1);
        long[] longArray43 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(longArray43, (long) ' ');
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.addAll(longArray39, longArray43);
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray43);
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray29, (-1L), 4);
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.addAll(longArray22, longArray29);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray51, (long) 0);
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray51, (long) 0, 10);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray51);
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[0, 100, 1, 0, 97, 0, 1, 0, -1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[100, 1, -1, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HI                        ", "                                 aaa                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray0, 100, 18);
        org.junit.Assert.assertNull(booleanArray3);
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        java.lang.Byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray9);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray9, (int) (byte) 1, 10);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray9);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray9);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray9, (byte) 0);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray28, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaahihi..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaahihi.." + "'", str1, "aaahihi..");
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        java.lang.Long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) (byte) 10);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "-1 0 1 100 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 0 1 100 1" + "'", str1, "-1 0 1 100 1");
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaA1110aaaA1110aaaA1110aaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaA1110aaaA1110aaaA1110aaaA" + "'", str1, "aaaA1110aaaA1110aaaA1110aaaA");
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaahihi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray0, 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        byte[] byteArray0 = null;
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, 93, 106);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("-11001011000", "44444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0aaa                                10aaa                                1aaa                                1aaa                                0", "aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ahaaahaaahaaahaaahaaahaaa.1a0.01  aaaA", "...", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("10.0a1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0a1" + "'", str2, "10.0a1");
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAA                                                                                               aaa   h   h   h   h   h   h   h   h   h  ", 17, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
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
        boolean[] booleanArray34 = null;
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray34);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA1-1.0 AAAA1 AAAA110.01 AAAA1 AAAA110.01 AAAA1 AAAA1100.01 AAAA1 AAAA11.01 AAAA1 0.01" + "'", str2, "AAAA1-1.0 AAAA1 AAAA110.01 AAAA1 AAAA110.01 AAAA1 AAAA1100.01 AAAA1 AAAA11.01 AAAA1 0.01");
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils1 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils2 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils3 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils4 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils5 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray6 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils0, arrayUtils1, arrayUtils2, arrayUtils3, arrayUtils4, arrayUtils5 };
        org.apache.commons.lang3.ArrayUtils arrayUtils7 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils8 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils9 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils10 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils11 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils12 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray13 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils7, arrayUtils8, arrayUtils9, arrayUtils10, arrayUtils11, arrayUtils12 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray14 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray6, arrayUtilsArray13 };
        org.apache.commons.lang3.ArrayUtils arrayUtils15 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils16 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils17 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils18 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils19 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils20 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray21 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils15, arrayUtils16, arrayUtils17, arrayUtils18, arrayUtils19, arrayUtils20 };
        org.apache.commons.lang3.ArrayUtils arrayUtils22 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils23 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils24 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils25 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils26 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils27 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray28 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils22, arrayUtils23, arrayUtils24, arrayUtils25, arrayUtils26, arrayUtils27 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray29 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray21, arrayUtilsArray28 };
        org.apache.commons.lang3.ArrayUtils arrayUtils30 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils31 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils32 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils33 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils34 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils35 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray36 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils30, arrayUtils31, arrayUtils32, arrayUtils33, arrayUtils34, arrayUtils35 };
        org.apache.commons.lang3.ArrayUtils arrayUtils37 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils38 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils39 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils40 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils41 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils42 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray43 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils37, arrayUtils38, arrayUtils39, arrayUtils40, arrayUtils41, arrayUtils42 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray44 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray36, arrayUtilsArray43 };
        org.apache.commons.lang3.ArrayUtils arrayUtils45 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils46 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils47 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils48 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils49 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils50 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray51 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils45, arrayUtils46, arrayUtils47, arrayUtils48, arrayUtils49, arrayUtils50 };
        org.apache.commons.lang3.ArrayUtils arrayUtils52 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils53 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils54 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils55 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils56 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils57 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray58 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils52, arrayUtils53, arrayUtils54, arrayUtils55, arrayUtils56, arrayUtils57 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray59 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray51, arrayUtilsArray58 };
        org.apache.commons.lang3.ArrayUtils arrayUtils60 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils61 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils62 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils63 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils64 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils65 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray66 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils60, arrayUtils61, arrayUtils62, arrayUtils63, arrayUtils64, arrayUtils65 };
        org.apache.commons.lang3.ArrayUtils arrayUtils67 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils68 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils69 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils70 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils71 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils72 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray73 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils67, arrayUtils68, arrayUtils69, arrayUtils70, arrayUtils71, arrayUtils72 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray74 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray66, arrayUtilsArray73 };
        org.apache.commons.lang3.ArrayUtils arrayUtils75 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils76 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils77 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils78 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils79 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils80 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray81 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils75, arrayUtils76, arrayUtils77, arrayUtils78, arrayUtils79, arrayUtils80 };
        org.apache.commons.lang3.ArrayUtils arrayUtils82 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils83 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils84 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils85 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils86 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils87 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray88 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils82, arrayUtils83, arrayUtils84, arrayUtils85, arrayUtils86, arrayUtils87 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray89 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray81, arrayUtilsArray88 };
        org.apache.commons.lang3.ArrayUtils[][][] arrayUtilsArray90 = new org.apache.commons.lang3.ArrayUtils[][][] { arrayUtilsArray14, arrayUtilsArray29, arrayUtilsArray44, arrayUtilsArray59, arrayUtilsArray74, arrayUtilsArray89 };
        org.apache.commons.lang3.ArrayUtils[][][] arrayUtilsArray92 = org.apache.commons.lang3.ArrayUtils.remove(arrayUtilsArray90, 0);
        org.junit.Assert.assertNotNull(arrayUtilsArray6);
        org.junit.Assert.assertNotNull(arrayUtilsArray13);
        org.junit.Assert.assertNotNull(arrayUtilsArray14);
        org.junit.Assert.assertNotNull(arrayUtilsArray21);
        org.junit.Assert.assertNotNull(arrayUtilsArray28);
        org.junit.Assert.assertNotNull(arrayUtilsArray29);
        org.junit.Assert.assertNotNull(arrayUtilsArray36);
        org.junit.Assert.assertNotNull(arrayUtilsArray43);
        org.junit.Assert.assertNotNull(arrayUtilsArray44);
        org.junit.Assert.assertNotNull(arrayUtilsArray51);
        org.junit.Assert.assertNotNull(arrayUtilsArray58);
        org.junit.Assert.assertNotNull(arrayUtilsArray59);
        org.junit.Assert.assertNotNull(arrayUtilsArray66);
        org.junit.Assert.assertNotNull(arrayUtilsArray73);
        org.junit.Assert.assertNotNull(arrayUtilsArray74);
        org.junit.Assert.assertNotNull(arrayUtilsArray81);
        org.junit.Assert.assertNotNull(arrayUtilsArray88);
        org.junit.Assert.assertNotNull(arrayUtilsArray89);
        org.junit.Assert.assertNotNull(arrayUtilsArray90);
        org.junit.Assert.assertNotNull(arrayUtilsArray92);
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18, false);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", "                                aaa");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray25);
        java.lang.Byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray27, "aaaA");
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray27, (byte) 100);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray26, (java.lang.Object) byteArray27, 0);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray27);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray21, (java.lang.Object) byteArray27);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) booleanArray21);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.add(booleanArray38, 17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 17, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "truetruetruefalse" + "'", str36, "truetruetruefalse");
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[true, true, true, false]");
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "              1110               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("          ", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("  HIHIH", "AAAA1      AAAA             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) (short) 10, (int) ' ');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 19, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) (short) 1);
        long[] longArray14 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.add(longArray14, (long) (short) 1);
        long[] longArray20 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(longArray20, (long) ' ');
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray16, longArray20);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray20);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray20, (long) '#', (int) (short) 100);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray20, 1L);
        long[] longArray35 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.add(longArray35, (long) (short) 1);
        long[] longArray43 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray45 = org.apache.commons.lang3.ArrayUtils.add(longArray43, (long) (short) 1);
        long[] longArray49 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.contains(longArray49, (long) ' ');
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.addAll(longArray45, longArray49);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray35, longArray49);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray35);
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray54);
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.subarray(longArray55, (int) (short) -1, 0);
        java.lang.Long[] longArray59 = org.apache.commons.lang3.ArrayUtils.toObject(longArray58);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray20, longArray58);
        long[] longArray61 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray58);
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray58, 0L);
        java.lang.Long[] longArray64 = org.apache.commons.lang3.ArrayUtils.toObject(longArray58);
        int int66 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray58, (long) 3);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                               AAA                                                                                               aaa");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}", "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaA1110aaaA1110aaaA1110aaaA", "HIHIH                                                        aaa##################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaA1110aaaA1110aaaA1110aaaA" + "'", str2, "aaaA1110aaaA1110aaaA1110aaaA");
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.remove(shortArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        double[] doubleArray0 = null;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 32, 25);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaah");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaah" + "'", str1, "aaah");
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", "1      AAAA1      AAAA", "0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0.0a", "0.1a0.01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0a" + "'", str2, "0.0a");
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa" + "'", str1, "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa");
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("1      AAAA1      AAAA", "Aaaaaa                                                                                               aAAAa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0.0a", "0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0a" + "'", str2, "0.0a");
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444...", "aaa444", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "10.0a1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaHihih", 96, "TRUE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUE" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUE");
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        byte[] byteArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(charArray6, 'a');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(charArray6, 'a');
        char[] charArray19 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray20 = org.apache.commons.lang3.ArrayUtils.toObject(charArray19);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, '4');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray19);
        char[] charArray31 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.add(charArray31, 'a');
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.add(charArray31, ' ');
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray31);
        int int37 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray36);
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray36);
        java.lang.Character[] charArray44 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray44, ' ');
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray44);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray47);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', 93);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray54 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 32, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#,  ]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), " 4 aa4 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), " 4 aa4 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ , 4,  , a, a, 4,  , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#, #, 4, a, #]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{true,true,true,false}", "10.0a1.", 65);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1001-1010");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("#", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "10.0a1.aaahaaahaaahaaahaaahaaaha");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("false0false0true0true0false0true", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) shortArray17, (java.lang.Object[]) strArray20);
        java.lang.Short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        java.lang.Short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(shortArray23);
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaa                                                        HIHIH                              ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaHIHIH" + "'", str2, "aaaHIHIH");
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "A1A10A0A0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a1A10A0A0" + "'", str1, "a1A10A0A0");
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("{}0.0----------------------------------------------------------------aaa----------------------");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}0.0----------------------------------------------------------------aaa----------------------" + "'", str1, "{}0.0----------------------------------------------------------------aaa----------------------");
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI..." + "'", str1, "HI...");
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray16 = org.apache.commons.lang3.ArrayUtils.remove(longArray14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!HI", charArray8);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.subarray(charArray8, 94, 0);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray18, '4', (int) (byte) -1);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "       aAA", charArray18);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray16 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.toObject(charArray16);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, '4');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray18);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(charArray18, ' ');
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                          ", charArray18);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HIHIH                                                        aaa", "a1A10A0A0", "HIHIH                              ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HIHIH                                                        aaa" + "'", str4, "HIHIH                                                        aaa");
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE" + "'", str2, "FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE");
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) -1 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) -1);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray5, (short) 10, 96);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[-1]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                aaa                                 ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "       aAA");
        double[] doubleArray5 = new double[] { 1.0f };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray5);
        double[] doubleArray7 = new double[] {};
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray7);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) doubleArray5, (int) (short) 1);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        double[] doubleArray12 = new double[] {};
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray12, (double) '4', (double) (byte) -1);
        double[] doubleArray20 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray12, doubleArray20);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 100, (double) 100);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray12, 0, 0);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) 27, (double) 'a');
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, (double) 10L);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray32);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray32);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0.0A", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) byteArray0);
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!HI", "AAAA1######AAAA#############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray19, (short) -1);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray19, 28, 8);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.remove(shortArray24, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[]");
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        java.lang.Character[] charArray6 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", charArray12);
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
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, 4, a, #]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
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
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray36, 17);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("{-1}", "0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{-1}" + "'", str3, "{-1}");
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0", "1      aaaa1      aaaa10", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("true", "{97,0,1,100,0}", 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaa                            aaaA", "trueaaahitrueaaahitrueaaahifalse");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "AAAA1      AAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.add(booleanArray8, (int) (byte) 1, false);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray15, (byte) -1, (int) 'a');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray15);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.clone(byteArray15);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray15, (byte) 100);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) false, (java.lang.Object) byteArray15);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray26, (byte) -1, (int) 'a');
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray26);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray26, (byte) 0);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1 };
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray35, (byte) -1, (int) 'a');
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray35, (byte) 10);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray35);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.add(byteArray41, (byte) -1);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray26, byteArray43);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.remove(byteArray15, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 14, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1 Hihih 1 1HihihHihih 1", "false4false4true4true4false4true4false");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaa4444444444-1a10a0a10a1a10a0a0", "aaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444-1a10a0a10a1a10a0a0" + "'", str2, "4444444444-1a10a0a10a1a10a0a0");
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "trueaaahtru   eaaahfalse");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" aaahihi...  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) '4', (int) (short) 100, (double) 4);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0", "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}", 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.", "{-1,0,1,100,1}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("##1      AAAA1      AAAA1##", "HIHIH                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##1      AAAA1      AAAA1##" + "'", str2, "##1      AAAA1      AAAA1##");
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", "atrueaaahitrueaaahitrueaaahifalse#trueaaahitrueaaahitrueaaahifalseatrueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("       AAA                  ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray8, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, false, true, true]");
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "##                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0.0--------------------0.0       0.0--------------------0.0       0.0--------------------0.0       110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa" + "'", str3, "0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("           ...", "93933393943");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ..." + "'", str2, "           ...");
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        java.lang.Float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray2, "0.0 1.0 100.0 10.0 10.0 -1.0");
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" AAAHIHI...  ", 14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaahi", 10, "               aaahihi#..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  aaahi   " + "'", str3, "  aaahi   ");
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10);
        java.lang.Character[] charArray18 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18, '4');
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray20);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray20);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray20);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray11);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray26 = org.apache.commons.lang3.ArrayUtils.remove(charArray24, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 17, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "a#a444a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "a#a444a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[a, #, a, 4, 4, 4, a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[a, #, a, 4, 4, 4]");
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "0     HIHIH0     HIHIH10    {}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray13);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.clone(charArray13);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "      AAAA1      AAA", charArray13);
        char[] charArray25 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.add(charArray25, 'a');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray25, '#');
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.subarray(charArray29, (int) (short) 1, (int) (short) -1);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray29);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray29, ' ', (int) 'a');
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.addAll(charArray13, charArray29);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray40 = org.apache.commons.lang3.ArrayUtils.add(charArray37, 26, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 26, Length: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), " 4 aa4 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), " 4 aa4 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[ , 4,  , a, a, 4,  , 4,  , a, a, 4]");
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                       AAa       ", "            Hi             ", 516);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        float[] floatArray9 = new float[] { (byte) 10 };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) (-1));
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray9);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray13);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, 33, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 33, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAA" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAA");
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA", "     HIHIH", "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaahi", 28, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaahi#######################" + "'", str3, "aaahi#######################");
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                 aaa                                                            aaaA", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################aaa############################################################aaaA" + "'", str3, "#################################aaa############################################################aaaA");
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray6, (java.lang.Object) (short) 100);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray16 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.add(longArray16, (long) (short) 1);
        long[] longArray22 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(longArray22, (long) ' ');
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.addAll(longArray18, longArray22);
        java.lang.Long[] longArray32 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray32);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray33);
        long[] longArray40 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.add(longArray40, (long) (short) 1);
        long[] longArray48 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.add(longArray48, (long) (short) 1);
        long[] longArray54 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.contains(longArray54, (long) ' ');
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.addAll(longArray50, longArray54);
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.addAll(longArray40, longArray54);
        int int61 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray40, (-1L), 4);
        long[] longArray62 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray40);
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.add(longArray62, (long) (byte) 0);
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.addAll(longArray10, longArray62);
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray62, (long) 7, (int) 'a');
        int int70 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray62, (long) (byte) 10);
        java.lang.Long[] longArray71 = org.apache.commons.lang3.ArrayUtils.toObject(longArray62);
        int int74 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray62, (long) 18, (int) (short) 10);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0, 0]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[100, 1, -1, 0, 1, 0, 100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0.0       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.", 5, "aaa                                                                                               aaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1." + "'", str3, "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.");
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                 ", "AAA                                                                                               aaa   h   h   h   h   h   h   h   h   h  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", (-1), "10.01.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1," + "'", str3, "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("trueaaahtru   eaaahfalse", "{-1,52,10,1,0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "trueaaahtru   eaaahfalse" + "'", str2, "trueaaahtru   eaaahfalse");
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("H", "1110");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!H" + "'", str1, "hi!H");
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", "                                                                 aAAAa                                                                                               aaaaaA", 21, 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1Aaa                                                                   aAAAa                                                                                               aaaaaA            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1" + "'", str4, "-1Aaa                                                                   aAAAa                                                                                               aaaaaA            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0                                  ", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0                                  " + "'", str2, "0                                  ");
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                           " + "'", str1, "                           ");
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        char[] charArray18 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.add(charArray18, 'a');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.add(charArray18, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray18);
        char[] charArray27 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray28 = org.apache.commons.lang3.ArrayUtils.toObject(charArray27);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.clone(charArray27);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray29, '4');
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray18, charArray29);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray29);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray29, '#', (int) 'a');
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.subarray(charArray29, 24, 24);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray11, charArray39);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray43 = org.apache.commons.lang3.ArrayUtils.add(charArray11, (int) (short) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", str2, "aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("10.01.0#############################################################################################################################################################", "itrueaaah");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray8, (byte) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray8, (byte) 100);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray8);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(byteArray8, (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray8);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("  ...ihihaaa 11-00011010011-00011010011-00011010011-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...ihihaaa 11-00011010011-00011010011-00011010011-" + "'", str1, "...ihihaaa 11-00011010011-00011010011-00011010011-");
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray0);
        java.lang.Float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray3);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                   ", "trueaaahtru   eaaahfalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3, (double) 0L);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, 100.0d);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray5, 93, 2);
        boolean[] booleanArray17 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray24 = new boolean[] { false, false, true, true, false, true };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray17, booleanArray24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray24);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.add(booleanArray24, false);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.add(booleanArray24, false);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray24, false);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray24, true);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray24);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray35, true, 6);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) doubleArray5, (java.lang.Object) 6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        long[] longArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("1001-1010", "10.0A1.10.0A1.10.0A1.10.0A1.10HI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1010" + "'", str2, "-1010");
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                             ", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                ..." + "'", str2, "                ...");
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUE" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUE");
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        char[] charArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray0, 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaahi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0" + "'", str3, "                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0");
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("44444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0", "HI", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                 aaa                                             ", "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "     HIHIH", 14, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[                                 ,                                              ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[                                 ,                                              ]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAA", "      aaa", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        float[] floatArray1 = new float[] { (-1L) };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "1110");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "aaaaaaaa                  ...aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1" + "'", str2, "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("AAAA1######AAAA#############", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (int) (short) 0, (short) (byte) 100);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.remove(shortArray15, 139);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 139, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[100, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 0, 10, 1, 10, 0]");
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("{-1,0,1,100,1}", "##                                                                                                 ", (int) (byte) 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                 AAA                                                                                               aaaA", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) (-1L));
        float[] floatArray10 = new float[] { (byte) 10 };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray8, floatArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, (float) 35, (-1));
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) (byte) 100);
        float[] floatArray23 = new float[] { (byte) 10 };
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (float) (-1));
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray23, 0.0f, 100);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray23, (float) 0L);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray30, 10, (int) (byte) 10);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray30, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray36, (float) (short) 100);
        float[] floatArray40 = new float[] { (byte) 10 };
        float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.add(floatArray40, (float) (-1));
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.add(floatArray42, (float) '4');
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray42);
        float[] floatArray46 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray36, floatArray42);
        float[] floatArray47 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray21, floatArray36);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray49 = org.apache.commons.lang3.ArrayUtils.remove(floatArray36, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[10.0, -1.0, 52.0, -1.0, 100.0]");
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("10110010");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10110010" + "'", str1, "10110010");
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray13, (short) (byte) 1, (int) ' ');
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray13, (short) 0);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray13);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray19);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray19);
        short[] shortArray28 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray28, (short) (byte) 0, (-1));
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray28);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.add(shortArray28, 2, (short) (byte) 0);
        short[] shortArray42 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray42, (short) (byte) 0, (-1));
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.add(shortArray42, (short) (byte) -1);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.add(shortArray42, (short) (byte) 1);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray49, (short) (byte) 1, (int) ' ');
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.add(shortArray49, (short) 0);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray35, shortArray54);
        java.lang.Short[] shortArray58 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray58, (short) 1);
        short[] shortArray67 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int70 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray67, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray67);
        short[] shortArray72 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray60, shortArray67);
        int int74 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray60, (short) 10);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray35, shortArray60);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray60);
        short[] shortArray78 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray60, (short) (byte) -1);
        short[] shortArray79 = org.apache.commons.lang3.ArrayUtils.clone(shortArray60);
        short[] shortArray80 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray19, shortArray79);
        int int83 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray19, (short) (byte) 1, 7);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[10, -1]");
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray78), "[10]");
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray79), "[10, -1]");
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray80), "[0, 0, 10, 1, 10, 0, 1, 10, -1]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 6 + "'", int83 == 6);
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
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
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(longArray24, (long) 5);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray24, (long) '4');
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.clone(longArray24);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.add(longArray24, 0L);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0, 0]");
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0.0   1.0   100.0   10.0   10.0   -1.0", "-1a10a0a10a1a10a0a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("     AAAH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
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
        java.lang.Double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray16);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray16);
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
        org.junit.Assert.assertNotNull(doubleArray25);
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("H", "                             ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                    ##1      AAAA1      AAAA1##                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        java.lang.String str8 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                       false4false4true4true4false4true4false", 0, "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       false4false4true4true4false4true4false" + "'", str3, "                       false4false4true4true4false4true4false");
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 3, (double) 1L);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 100, (int) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray6);
        short[] shortArray15 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray15, (short) (byte) 0, (-1));
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.add(shortArray15, (short) (byte) -1);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.clone(shortArray15);
        java.lang.Class<?> wildcardClass22 = shortArray15.getClass();
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) doubleArray6, (java.lang.Object) shortArray15);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray6, 0.0d, (double) 28);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0-------------------------------------------------" + "'", str2, "0.0-------------------------------------------------");
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HIHIH                                                        aaa##################", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi.H{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAA                                                                                               aaaA", "trueaaa                            aaaAtrueaaa                            aaaAtrueaaa                            aaaAfalse");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 28, (int) ' ');
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray9, 0);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.clone(intArray11);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray2, intArray12);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray14, 10);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray14);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                    ##1      AAAA1      AAAA1##                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        java.lang.Object obj20 = null;
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray19, obj20, 65);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[true, true, true, false]");
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                 AAA                                                                                               aaa", strArray4, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                 AAA                                                                                               aaa" + "'", str6, "                                                                 AAA                                                                                               aaa");
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "{-1,10,0,10,1,10,0,0}", 4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.", strArray6, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                 aAAAa                                                                                               aaaaaAeaaahfalse");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("                                 aAAAa                                                                                               aaaaaA", strArray6, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 161");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1." + "'", str10, "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0.0a1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray19);
        java.lang.Boolean[] booleanArray25 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, false);
        java.lang.Long[] longArray34 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray34);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray34, (java.lang.Object) (short) 100);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray25, (java.lang.Object) longArray34);
        java.lang.Boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray25);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, false);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray19, booleanArray41);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray41, false);
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray41, true, 25);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, false, true, true, false, true, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.", "{0,10,1,1,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, (double) 0L);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (-1.0d), 6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("##1      AAAA1      AAAA1##", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        java.lang.Long[] longArray21 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray22);
        long[] longArray29 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray29, (long) (short) 1);
        long[] longArray37 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.add(longArray37, (long) (short) 1);
        long[] longArray43 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(longArray43, (long) ' ');
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.addAll(longArray39, longArray43);
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray43);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray29);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray48);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.subarray(longArray49, (int) (short) -1, 0);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.clone(longArray52);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray53);
        java.lang.Long[] longArray55 = org.apache.commons.lang3.ArrayUtils.toObject(longArray53);
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray53, 0L);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray60 = org.apache.commons.lang3.ArrayUtils.add(longArray53, 12, (long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[]");
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("-1010", "0.0--------------------0.0       0.0--------------------0.0       0.0--------------------0.0       110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1010" + "'", str2, "-1010");
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0.1A0.01", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.add(charArray2, ' ');
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aAAAa                                                                                               aaaaaA", "{-1,10,10,1,10,0,0}      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("      aaaA", "44444444444444444444444444444                                aaa444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("-{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", 0, "  10110010AA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa" + "'", str3, "-{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        java.lang.Long[] longArray21 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray22);
        long[] longArray29 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray29, (long) (short) 1);
        long[] longArray37 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.add(longArray37, (long) (short) 1);
        long[] longArray43 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(longArray43, (long) ' ');
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.addAll(longArray39, longArray43);
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray43);
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray29, (-1L), 4);
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.addAll(longArray22, longArray29);
        java.lang.Long[] longArray52 = org.apache.commons.lang3.ArrayUtils.toObject(longArray51);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray52, (long) 3);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray54);
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        java.lang.Object[] objArray0 = null;
        int[] intArray5 = new int[] { (-1), '4', (byte) 10, 1 };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (int) (short) 100, 100);
        int[] intArray9 = new int[] {};
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray9, (int) (short) 1);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.subarray(intArray9, (int) (short) 0, (int) (short) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray5, intArray9);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.add(intArray5, 0);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, (int) 'a', 0);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 0, (int) ' ');
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.add(intArray5, 10);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(intArray5, 27);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (int) '4');
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, 14);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) int31, 9);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 52, 10, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray14);
        java.lang.Long[] longArray22 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray23);
        long[] longArray30 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.add(longArray30, (long) (short) 1);
        long[] longArray38 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.add(longArray38, (long) (short) 1);
        long[] longArray44 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.contains(longArray44, (long) ' ');
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.addAll(longArray40, longArray44);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.addAll(longArray30, longArray44);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray30);
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray49);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray50, (long) 0);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray52);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray55 = org.apache.commons.lang3.ArrayUtils.remove(longArray53, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42, Length: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, -1, -1, 1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, -1, -1, 1, 0, 100, 1, 0, 97, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[100, 1, -1, 0, 1, 0, 97, 1, 100, 0]");
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa" + "'", str1, "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa");
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray3);
        float[] floatArray10 = null;
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray3, floatArray10);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) 100);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray10, (int) (byte) 1, 106);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[100.0]");
        org.junit.Assert.assertNull(floatArray16);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hihi...", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi...                  " + "'", str2, "hihi...                  ");
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hihi...                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi...                 " + "'", str1, "hihi...                 ");
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("100.00.0-1.0", "                                aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("aaahihi...", (java.lang.Object[]) longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1, (long) (byte) 10);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(longArray5, (long) (short) 1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("               HIHIH               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIH" + "'", str1, "HIHIH");
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("10.0a1", "0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaA", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray4, (int) 'a', (int) (short) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray7, 24);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        java.lang.Integer[] intArray11 = org.apache.commons.lang3.ArrayUtils.toObject(intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray12, (int) (short) 1);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray14, 0);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray17, 28, (-1));
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray17, 94, (int) (short) 1);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.clone(intArray17);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray24, 33, 0);
        int[] intArray32 = new int[] { (-1), '4', (byte) 10, 1 };
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray32, (int) (short) 100, 100);
        int[] intArray36 = new int[] {};
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray36, (int) (short) 1);
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.subarray(intArray36, (int) (short) 0, (int) (short) -1);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray32, intArray36);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains(intArray32, (-1));
        java.lang.Integer[] intArray45 = new java.lang.Integer[] {};
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray45, 35);
        java.lang.Integer[] intArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray45);
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray45);
        java.lang.Integer[] intArray50 = org.apache.commons.lang3.ArrayUtils.toObject(intArray49);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray32, intArray49);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray24, intArray32);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray7, intArray32);
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray32, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                 aaa", (int) (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 aaa" + "'", str3, "                                                                                                 aaa");
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("44444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA", "AAAA1      AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA" + "'", str2, "44444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray7 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray14 = new boolean[] { false, false, true, true, false, true };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray14);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray14);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, false, 35);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, 0, false);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray14, false);
        boolean[] booleanArray33 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray38 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray38, false);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray40);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray40);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray33, booleanArray40);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray33);
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.add(booleanArray33, (int) (short) 1, false);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray33, true);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray14, booleanArray33);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray14, false, (int) (byte) -1);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[false, false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) (short) 1);
        long[] longArray12 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(longArray12, (long) ' ');
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.addAll(longArray8, longArray12);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray8);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.subarray(longArray16, (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray19, 93, (long) 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 93, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAA                                ", 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("truetruetruefalse", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "truetruetruefalse               " + "'", str2, "truetruetruefalse               ");
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#                              HIHIH                                                        aaa#                              HIHIH                                                        aaa4                              HIHIH                                                        aaaa                              HIHIH                                                        aaa#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaahihi..");
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[aaahihi, ..]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[aaahihi, ..]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                   ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                 AAA                                                                                               aaa", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 28 + "'", int4 == 28);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("##   ", "0                                  ", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray3, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray3);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray3);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray8);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 1 };
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray12, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray12);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray17, (byte) 100, 0);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray8, byteArray17);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.remove(byteArray21, (int) (byte) 1);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray23);
        java.lang.Byte[] byteArray30 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray30);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.add(byteArray31, (byte) 0);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray31);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray34);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray34);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray34);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray0, byteArray34);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        float[] floatArray0 = new float[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) (byte) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray0);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, false, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, 17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 17, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0.0--------------------0.0       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0--------------------0.0       " + "'", str1, "0.0--------------------0.0       ");
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
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
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int[] intArray46 = new int[] {};
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray46, (int) (short) 1);
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray46, 100);
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.add(intArray46, (int) '4');
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray52);
        int[] intArray54 = org.apache.commons.lang3.ArrayUtils.clone(intArray52);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray52);
        int[] intArray57 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray52, 6);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray60 = org.apache.commons.lang3.ArrayUtils.add(intArray52, 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[52]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[52]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[52]");
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("10.041.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              HIHIH                                                        aaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                              HIHIH", "444444444444444444444444444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi.H{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        char[] charArray0 = null;
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, '#', 6);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaahi#######################", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################" + "'", str2, "#######################");
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hi", "-1A10A0A10A1A10A0A0", 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi" + "'", str3, "hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi");
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "93933393943", "     HIHIH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils1 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils2 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils arrayUtils3 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray4 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils0, arrayUtils1, arrayUtils2, arrayUtils3 };
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray5 = org.apache.commons.lang3.ArrayUtils.clone(arrayUtilsArray4);
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray6 = org.apache.commons.lang3.ArrayUtils.toArray(arrayUtilsArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) arrayUtilsArray4);
        org.apache.commons.lang3.ArrayUtils arrayUtils9 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray10 = org.apache.commons.lang3.ArrayUtils.add(arrayUtilsArray4, 1, arrayUtils9);
        org.junit.Assert.assertNotNull(arrayUtilsArray4);
        org.junit.Assert.assertNotNull(arrayUtilsArray5);
        org.junit.Assert.assertNotNull(arrayUtilsArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(arrayUtilsArray10);
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444                                aaa444444444444444444444444444444", "", "{-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444                                aaa444444444444444444444444444444" + "'", str3, "44444444444444444444444444444                                aaa444444444444444444444444444444");
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(floatArray3, (float) 99);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) 516);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray3, (float) 5, (int) (byte) 0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, -1.0, 516.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray8);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 10, 27);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(floatArray8, (float) 96);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray11);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4, a]");
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
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
        java.lang.Character[] charArray43 = org.apache.commons.lang3.ArrayUtils.toObject(charArray28);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) charArray43);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi", "hi", (int) 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) ' ', 3);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HIHIH", strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray0, (int) (short) 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                       ", "     AAAH", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("itrueaaah", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "itrueaaah" + "'", str3, "itrueaaah");
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        double[] doubleArray0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAA4444444444-1A10A0A10A1A10A0A0", " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444hihi...", "0.1A0.01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("#################################aaa############################################################aaaA", "10.0a1.aaahaaahaaahaaahaaahaaaha", "aaaA1110aaaA1110aaaA1110aaaA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 5);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray11, (float) 'a', 21);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "44444444444444444444444444444                                AAA44444444hi", (java.lang.CharSequence) "                                AAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44444444444444444444444444444                                AAA44444444hi" + "'", charSequence2, "44444444444444444444444444444                                AAA44444444hi");
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                       AAa                          0.0       ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        double[] doubleArray5 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray6);
        boolean[] booleanArray14 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray21 = new boolean[] { false, false, true, true, false, true };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray14, booleanArray21);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray14);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, true, (int) '#');
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, true);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) doubleArray6, (java.lang.Object) true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0.0a", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        java.lang.String[] strArray3 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[] strArray7 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[] strArray11 = new java.lang.String[] { "                                                                AAA                                 ", "                                aaa", "0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray3, strArray7, strArray11 };
        java.lang.String[][] strArray13 = org.apache.commons.lang3.ArrayUtils.toArray(strArray12);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("aaa", strArray18);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aAA");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("AAA                                                                                               aaaA", strArray18, strArray21);
        java.lang.Comparable<java.lang.String>[][] strComparableArray23 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.Comparable<java.lang.String>[][]) strArray12, (java.lang.Object) strArray18);
        boolean[] booleanArray30 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray37 = new boolean[] { false, false, true, true, false, true };
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray30, booleanArray37);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray30);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray30, true, (int) '#');
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray12, (java.lang.Object) booleanArray30, 33);
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray30, false);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray46);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AAA                                                                                               aaaA" + "'", str22, "AAA                                                                                               aaaA");
        org.junit.Assert.assertNotNull(strComparableArray23);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[true, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                AAA", "1.0a0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                AAA" + "'", str2, "                                AAA");
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int int15 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) intArray4);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "      aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                          " + "'", str2, "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                          ");
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0.0-------------------------------------------------", 58, "-1a10a0a10a1a10a0a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1a10a0.0-------------------------------------------------" + "'", str3, "-1a10a0.0-------------------------------------------------");
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("{true,true,true,false}", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH", 21);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "aaa                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        float[] floatArray1 = new float[] { (-1L) };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) 100);
        float[] floatArray5 = new float[] { (byte) 10 };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) (-1));
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) 2, 10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray3, floatArray5);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(floatArray3, (float) 12);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) shortArray17, (java.lang.Object[]) strArray20);
        java.lang.Short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) shortArray22);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortArray22);
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "-1A10A0A10A1A10A0A0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("{-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{-" + "'", str1, "{-");
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "      aaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hiaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) "                                                                AAA                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                AAA                                 " + "'", str1, "                                                                AAA                                 ");
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("{-", "false4false4true4true4false4true4false");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        float[] floatArray1 = new float[] { (-1L) };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray1);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray5, 9, 32);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        int[] intArray10 = new int[] { (-1), '4', (byte) 10, 1 };
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, (int) (short) 100, 100);
        int[] intArray14 = new int[] {};
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray14, (int) (short) 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.subarray(intArray14, (int) (short) 0, (int) (short) -1);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray10, intArray14);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray5, (java.lang.Object) boolean20, 100);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, (double) 64);
        double[] doubleArray28 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray28, (double) 100);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray30, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray30);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray34, (double) 10.0f);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.add(doubleArray36, 100.0d);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray36, 0.0d, (double) (-1.0f));
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray36, (double) 98, (int) (short) 1);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray24, doubleArray36);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) boolean45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                aaa                                 ", "                                                                aaa                                 ", (int) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) strArray3, "101101");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{}" + "'", str6, "{}");
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HIHIH######################", "0     HIHIH0     HIHIH10    {}", 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIH######################" + "'", str3, "HIHIH######################");
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0aaa                                10aaa                                1aaa                                1aaa                                0", "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", 82);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0aaa                                10aaa                                1aaa                                1aaa                                0" + "'", str3, "0aaa                                10aaa                                1aaa                                1aaa                                0");
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi..." + "'", str1, "hi...");
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#                              HIHIH                                                        aaa#                              HIHIH                                                        aaa4                              HIHIH                                                        aaaa                              HIHIH                                                        aaa#", "10.0a1", "                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#                              HIHIH                                                        aaa#                              HIHIH                                                        aaa4                              HIHIH                                                        aaaa                              HIHIH                                                        aaa#" + "'", str3, "#                              HIHIH                                                        aaa#                              HIHIH                                                        aaa4                              HIHIH                                                        aaaa                              HIHIH                                                        aaa#");
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray9);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray9);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1011001" + "'", str12, "-1011001");
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) 28);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaa4444444444-1a10a0a10a1a10a0a0", 64, "aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa4444444444-1a10a0a10a1a10a0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi" + "'", str3, "aaa4444444444-1a10a0a10a1a10a0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi");
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 28, (int) ' ');
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray9, 0);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.clone(intArray11);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray2, intArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray2, 28);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "1     HIHIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0");
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray2);
        boolean[] booleanArray9 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray14 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray14, false);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray16);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray16);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray9, booleanArray16);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray20);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray20);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray3, (java.lang.Object) booleanArray22);
        java.lang.Class<?> wildcardClass24 = objArray3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "falsefalsetruefalsefalsetruetruetruefalse" + "'", str21, "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "{-1,10,0,10,1,10,0,0}", (java.lang.CharSequence) "     HIHIAaa                            aaaA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("       AAA     HIHIH     HIHIH     HIHIH  ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       AAA     HIHIH     HIHIH     HIHIH  " + "'", str2, "       AAA     HIHIH     HIHIH     HIHIH  ");
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("H  ", "                                                                                              aaa", 9, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                              aaa" + "'", str4, "                                                                                              aaa");
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
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
        java.lang.Long[] longArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray25);
        java.lang.Long[] longArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray25);
        java.lang.Long[] longArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray25);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray28, '4');
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
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-14-140" + "'", str30, "-14-140");
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "eslafihaaaeurtihaaaeurtihaaaeurt", "... aaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "44444444444444444444444444444                                AAA444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUE", (java.lang.CharSequence) "hihi...                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH", 28, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!HI", charArray8);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ');
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "{-1,-1,0}", charArray8);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(charArray8, '4');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI", "{100,1,-1,0,1,0}", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("          ", "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hihi...", (java.lang.CharSequence) "               HIHIH               ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hihi..." + "'", charSequence2, "hihi...");
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray13);
        int[] intArray19 = new int[] { (-1), '4', (byte) 10, 1 };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray19, (int) (short) 100, 100);
        int[] intArray23 = new int[] {};
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray23, (int) (short) 1);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.subarray(intArray23, (int) (short) 0, (int) (short) -1);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray19, intArray23);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.add(intArray19, 0);
        int[] intArray32 = new int[] {};
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray32, (int) (short) 1);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray32, 100);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray32, (int) '#', 0);
        int[] intArray44 = new int[] { (-1), '4', (byte) 10, 1 };
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray44, (int) (short) 100, 100);
        int[] intArray48 = new int[] {};
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray48, (int) (short) 1);
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.subarray(intArray48, (int) (short) 0, (int) (short) -1);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray44, intArray48);
        int[] intArray56 = org.apache.commons.lang3.ArrayUtils.add(intArray44, 0);
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray44, (int) 'a', 0);
        int[] intArray60 = org.apache.commons.lang3.ArrayUtils.addAll(intArray32, intArray44);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray31, intArray32);
        int int63 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray32, (int) ' ');
        int int64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray14, (java.lang.Object) intArray32);
        int int66 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray32, (int) (byte) 100);
        java.lang.Integer[] intArray67 = org.apache.commons.lang3.ArrayUtils.toObject(intArray32);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#################################aaa############################################################aaaA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hihi...                  ", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi...                  " + "'", str2, "hihi...                  ");
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                aAA         ", 139, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 " + "'", str1, "                                 ");
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", "aAA", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28 + "'", int3 == 28);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("            hI             ", "a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "{-1,10,0,10,1,10,0,0}", 4);
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("-1 0 1 100 1", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) ",aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1.0a0.0                              HIHIH                                                      ...", "#################################aaa############################################################aaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0.0   1.0   100.0   10.0   10.0   -1.0", (java.lang.CharSequence) "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.", "aaaa1      aaaa            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrAAArrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRaaaRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR" + "'", str1, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRaaaRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "100.00.0-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.add(booleanArray8, (int) (byte) 1, false);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1 };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray15, (byte) -1, (int) 'a');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray15);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.clone(byteArray15);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray15, (byte) 100);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) false, (java.lang.Object) byteArray15);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray26, (byte) -1, (int) 'a');
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray26);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray26, (byte) 0);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1 };
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray35, (byte) -1, (int) 'a');
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray35, (byte) 10);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray35);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.add(byteArray41, (byte) -1);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray26, byteArray43);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray43);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray43, (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, false, true, true, false]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", 24, "-10110010AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0" + "'", str3, "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0");
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray17 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray17, 'a');
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray17, '#');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray21);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray21);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(charArray21, '4');
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
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "aaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi", 82, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "{-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...ihihaaa 11-00011010011-00011010011-00011010011-", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "44444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    " + "'", str1, "                    ");
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!H", "trueaaahitrueaaahitrueaaahifalse");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
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
        java.lang.Integer[] intArray60 = new java.lang.Integer[] {};
        int[] intArray62 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray60, 35);
        int[] intArray63 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray60);
        java.lang.Integer[] intArray64 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray60);
        int[] intArray65 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray64);
        int[] intArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray64);
        int[] intArray67 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray64);
        int[] intArray68 = new int[] {};
        int[] intArray70 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray68, (int) (short) 1);
        int int72 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray68, 100);
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray68, (int) '#', 0);
        int[] intArray80 = new int[] { (-1), '4', (byte) 10, 1 };
        int int83 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray80, (int) (short) 100, 100);
        int[] intArray84 = new int[] {};
        int[] intArray86 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray84, (int) (short) 1);
        int[] intArray89 = org.apache.commons.lang3.ArrayUtils.subarray(intArray84, (int) (short) 0, (int) (short) -1);
        boolean boolean90 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray80, intArray84);
        int[] intArray92 = org.apache.commons.lang3.ArrayUtils.add(intArray80, 0);
        int int95 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray80, (int) 'a', 0);
        int[] intArray96 = org.apache.commons.lang3.ArrayUtils.addAll(intArray68, intArray80);
        int[] intArray97 = org.apache.commons.lang3.ArrayUtils.addAll(intArray67, intArray96);
        int[] intArray98 = org.apache.commons.lang3.ArrayUtils.addAll(intArray51, intArray67);
        int[] intArray99 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray51);
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
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray96), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray97), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray98);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray98), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray99);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray99), "[-1, 52, 10, 1]");
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(charArray11, '#');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(charArray11, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray17 = org.apache.commons.lang3.ArrayUtils.remove(charArray11, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1000, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) (short) -1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                aaa                                 ", strArray4);
        long[] longArray14 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.add(longArray14, (long) (short) 1);
        long[] longArray22 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.add(longArray22, (long) (short) 1);
        long[] longArray28 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(longArray28, (long) ' ');
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.addAll(longArray24, longArray28);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray28);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray14);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray33);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray34);
        java.lang.Long[] longArray36 = org.apache.commons.lang3.ArrayUtils.toObject(longArray34);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) longArray36, (int) (short) 100);
        java.lang.String[] strArray39 = null;
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.replaceEach("aaaa1      aaaa            ", strArray4, strArray39);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "aaaa1      aaaa            " + "'", str40, "aaaa1      aaaa            ");
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("-14-140", "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 10L);
        double[] doubleArray8 = new double[] {};
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) '4', (double) (byte) -1);
        double[] doubleArray16 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray8, doubleArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 100, (double) 100);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray8, 0, 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 1L);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray8);
        double[] doubleArray27 = new double[] {};
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) '4', (double) (byte) -1);
        double[] doubleArray35 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray27, doubleArray35);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) 10.0f, (int) '4');
        double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray27, (double) (byte) -1);
        double[] doubleArray43 = new double[] { 1.0f };
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray43);
        double[] doubleArray45 = new double[] {};
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray43, doubleArray45);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.add(doubleArray43, (double) (short) -1);
        double[] doubleArray49 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray27, doubleArray43);
        double[] doubleArray51 = org.apache.commons.lang3.ArrayUtils.add(doubleArray43, (double) 3);
        double[] doubleArray54 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray51, 10, (int) (byte) 10);
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray54);
        double[] doubleArray58 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray3, 33, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray60 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray58, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 28, (int) ' ');
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, (int) (byte) 10, (int) '#');
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray2);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.clone(intArray10);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray10, 24);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray13);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.clone(intArray13);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = org.apache.commons.lang3.ArrayUtils.remove(intArray15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 10.0f);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, 100.0d);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, 0.0d, (double) (-1.0f));
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray11, (double) 94, (int) (short) 1, 0.0d);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray11, 33, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray23, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 17, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("trueaaa", "{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("{{ ,#},{ ,#},{ ,#},{ ,#}}", "false");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{ ,#},{ ,#},{ ,#},{ ,#}}" + "'", str2, "{{ ,#},{ ,#},{ ,#},{ ,#}}");
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        int[] intArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, 164);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0.0a1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0a1.0" + "'", str1, "0.0a1.0");
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "44444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 445 + "'", int1 == 445);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        java.lang.Double[] doubleArray0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAA1######AAAA#############", 17, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA1######AAAA#############" + "'", str3, "AAAA1######AAAA#############");
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HIHIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihih" + "'", str1, "hihih");
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "-1100100-10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("1     HIHIH", "hihi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1     HIHIH" + "'", str2, "1     HIHIH");
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.remove(shortArray19, 2);
        java.lang.String str22 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) shortArray21);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.add(shortArray21, 11, (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 11, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{-1,10,10,1,10,0,0}" + "'", str22, "{-1,10,10,1,10,0,0}");
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hiaaaaaaaa", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRaaaRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray4);
        float[] floatArray10 = new float[] { (byte) 10 };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) '4');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray14);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(floatArray14, (float) 10);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray14, 10.0f, (int) (byte) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray14, (float) (short) 1, 0);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray14);
        java.lang.Float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray14);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray25);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        char[] charArray1 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        boolean boolean3 = org.apache.commons.lang3.StringUtils.containsAny("{{ ,#},{ ,#},{ ,#},{ ,#}}", charArray1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0.1A0.01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.1a0.01" + "'", str1, "0.1a0.01");
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("     HIHIAaa                            aaaA", "  4444444444444444444444444...   ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaa", "44444444444444444444444444444                                AAA44444444hiaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray8, (double) ' ');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray12, (double) 3);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray14, (double) (byte) 100);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 10.0, 35.0, 3.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
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
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.subarray(longArray25, (int) (short) -1, 0);
        long[] longArray34 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.add(longArray34, (long) (short) 1);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray28, longArray36);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray36);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray41 = org.apache.commons.lang3.ArrayUtils.add(longArray38, 106, (long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 106, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0, 1]");
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                    ", "                                                               Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                        ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        " + "'", str2, "                        ");
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                 aAAAa                                                                                               aaaaaAeaaahfalse", "       AAA                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aAA", "93933393943", "  10110010AA                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAA" + "'", str3, "aAA");
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "       aAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                              HIHIH                                                        aaa", "10.01.0#############################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 100.0d, (-1.0d), (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap7 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '100.0', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0", "100 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0" + "'", str2, "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA");
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray9);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray10, (float) 35);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray12, (-1.0f), 10);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Aaaaaa                                                                                               aAAAa", (int) ' ', "                                                                 AAA                                                                                               aaaA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaa                                                                                               aAAAa" + "'", str3, "Aaaaaa                                                                                               aAAAa");
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...", "444444444hihi...", "aaa                  ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HIHIH######################", "...ihihaaa 11-00011010011-00011010011-00011010011-", "                                                                                              aaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A", (java.lang.CharSequence) "truetruetruefalse");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        short[] shortArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) (byte) 1, 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  10110010AA", 11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "-10110010AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("{a,#,a,4,4,4}", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ",4,4,4}a,#,a{" + "'", str2, ",4,4,4}a,#,a{");
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "     Hi      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0", "", "aaaA1110aaaA1110aaaA1110aaaA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0" + "'", str3, "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaa");
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaahihi...", "aaa 1.0 aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0.0--------------------0.0       ", "444444444444444444444444444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi.H{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi..", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       " + "'", str3, "       ");
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray0, "aaaA");
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0, (byte) 1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA", "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0", 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        char[] charArray9 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray9, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray9, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaA", charArray16);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("0.0       ", charArray16);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                AAA                                 ", "a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                       AAa       ", 516);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                       AAa                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "                                                       AAa                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaa 1.0 aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.0", 33, "trueaaahitrueaaahitrueaaahifalse");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa 1.0 aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.0" + "'", str3, "aaa 1.0 aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.0");
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("atrueaaahitrueaaahitrueaaahifalse#trueaaahitrueaaahitrueaaahifalseatrueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "atrueaaahitrueaaahitrueaaahifalse#trueaaahitrueaaahitrueaaahifalseatrueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4" + "'", str2, "atrueaaahitrueaaahitrueaaahifalse#trueaaahitrueaaahitrueaaahifalseatrueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4");
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("aaahihi...", (java.lang.Object[]) longArray1);
        int int3 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray1, "{a,#,a,4,4,4}", 9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "hi!HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "10.0A1.10.0A1.10.0A1.10.0A1.10HI...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "a1a10a0a0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[] floatArray10 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[] floatArray15 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[][] floatArray16 = new java.lang.Float[][] { floatArray5, floatArray10, floatArray15 };
        java.lang.Float[] floatArray20 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray24 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray28 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray32 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray36 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[][] floatArray37 = new java.lang.Float[][] { floatArray20, floatArray24, floatArray28, floatArray32, floatArray36 };
        java.lang.Float[][] floatArray38 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray16, floatArray37);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                    ", (java.lang.Object[]) floatArray37);
        java.lang.Float[] floatArray44 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[] floatArray49 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[] floatArray54 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[][] floatArray55 = new java.lang.Float[][] { floatArray44, floatArray49, floatArray54 };
        java.lang.Float[] floatArray59 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray63 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray67 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray71 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray75 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[][] floatArray76 = new java.lang.Float[][] { floatArray59, floatArray63, floatArray67, floatArray71, floatArray75 };
        java.lang.Float[][] floatArray77 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray55, floatArray76);
        java.lang.Float[][] floatArray78 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray37, floatArray77);
        java.lang.String str79 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray37);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertNotNull(floatArray71);
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertNotNull(floatArray78);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "10.0a1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("       ", "  10110010aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("a", " aaahihi... ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        java.lang.Byte[] byteArray13 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray14, (byte) 0);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray14);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(byteArray14, (byte) -1);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray14, (byte) 0);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray21);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.clone(byteArray7);
        java.lang.Byte[] byteArray29 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray29);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.add(byteArray30, (byte) 0);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray30);
        java.lang.Byte[] byteArray39 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray39);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.add(byteArray40, (byte) 0);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray42);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray33, byteArray42);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.clone(byteArray44);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray44, (byte) -1, 0);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray44, (byte) -1, (int) (short) -1);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray23, byteArray44);
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 1 };
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray55, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray59 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray55);
        byte[] byteArray60 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray55);
        byte[] byteArray61 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray60);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 1 };
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray64, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray68 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray64);
        byte[] byteArray69 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray64);
        int int72 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray69, (byte) 100, 0);
        byte[] byteArray73 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray60, byteArray69);
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray73, (byte) 10);
        byte[] byteArray78 = org.apache.commons.lang3.ArrayUtils.add(byteArray73, (int) (byte) 0, (byte) 0);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray23, byteArray78);
        int int81 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray23, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray84 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (int) (byte) 10, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[10, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0, 10, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                                             aaa                                 ", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = org.apache.commons.lang3.ArrayUtils.remove(charArray9, 139);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 139, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) 10, 35);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(byteArray21, (byte) 1);
        java.lang.Byte[] byteArray32 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray32);
        java.lang.Byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray32);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray32, (byte) -1);
        java.lang.Object[] objArray37 = null;
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray32, objArray37);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray32);
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray21, byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.remove(byteArray40, 139);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 139, Length: 16");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0, -1, 0, 1, 100, 1]");
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA", "aaah");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) (byte) 0);
        float[] floatArray11 = new float[] { (byte) 10 };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (float) (-1));
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray11, 0.0f, 100);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray11, (float) 0L);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray18, 10, (int) (byte) 10);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray18, (int) (byte) 1, (int) (byte) 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray24, (float) (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray24);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray4, floatArray24);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray24, (float) 52);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray24);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAA1      AAAA             ", "{}0.0----------------------------------------------------------------aaa----------------------");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI..." + "'", str1, "AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...");
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "a...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        java.lang.Object[] objArray10 = null;
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray5, objArray10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) 100);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray13, (byte) 0);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray13);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray16);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("{", "aaah");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("               aaahihi#..", 35, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }
}

