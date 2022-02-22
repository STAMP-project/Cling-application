import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "{0,0,10,1,10,0}");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1", strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith("                                                    ", (java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, ' ');
        java.lang.Boolean[] booleanArray18 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18, false);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray20);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray20);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray22);
        boolean[] booleanArray30 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray37 = new boolean[] { false, false, true, true, false, true };
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray30, booleanArray37);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray37, false);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray37, false, (int) (short) 0);
        boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray22, booleanArray37);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray37);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray37, false);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray37, true);
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray37);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) charArray9, (java.lang.Object) booleanArray37);
        char[] charArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray52);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "a4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "a4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[a, 4, a, a,  , 4,  ]");
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("1      aaaA1      aaaA1", "                  AAA       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 1, (int) (short) 10);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (int) (byte) 0, (byte) -1);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray9);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray9);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray9, (byte) 100);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray0, byteArray9);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray20);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray20);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray20);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray20);
        java.lang.Byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray27);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) byteArray28);
        java.lang.Byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray28);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray28, (byte) -1);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray32, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "101101" + "'", str29, "101101");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        long[] longArray20 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray20, (long) (short) 1);
        long[] longArray28 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.add(longArray28, (long) (short) 1);
        long[] longArray34 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains(longArray34, (long) ' ');
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.addAll(longArray30, longArray34);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.addAll(longArray20, longArray34);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray20);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray39);
        long[] longArray46 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.add(longArray46, (long) (short) 1);
        long[] longArray52 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.contains(longArray52, (long) ' ');
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.addAll(longArray48, longArray52);
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.addAll(longArray40, longArray48);
        long[] longArray62 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.add(longArray62, (long) (short) 1);
        long[] longArray70 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray72 = org.apache.commons.lang3.ArrayUtils.add(longArray70, (long) (short) 1);
        long[] longArray76 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.contains(longArray76, (long) ' ');
        long[] longArray79 = org.apache.commons.lang3.ArrayUtils.addAll(longArray72, longArray76);
        long[] longArray80 = org.apache.commons.lang3.ArrayUtils.addAll(longArray62, longArray76);
        long[] longArray81 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray62);
        long[] longArray82 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray81);
        long[] longArray85 = org.apache.commons.lang3.ArrayUtils.subarray(longArray82, (int) (short) -1, 0);
        long[] longArray86 = org.apache.commons.lang3.ArrayUtils.addAll(longArray56, longArray82);
        long[] longArray87 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray82);
        long[] longArray89 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray14, 0L);
        boolean boolean91 = org.apache.commons.lang3.ArrayUtils.contains(longArray89, (long) 32);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray93 = org.apache.commons.lang3.ArrayUtils.remove(longArray89, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 21, Length: 8");
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
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[]");
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[97, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("##################################################################.1a0.01##################################################################", "44444444444444444444444444444aaa444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0.0          hi...                                                      AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", "                    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                             {}                                              ", "44444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.add(longArray0, (long) 305);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[305]");
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) 18);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                 aaa                                                            aaaA", ' ');
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , aaa, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , aaaA]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , aaa, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , aaaA]");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAa", 626, 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AaaaaaAAaaaaaAAatrueaaaaAAaaaaaAAaa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        java.lang.Object[] objArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(charArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray2, ' ');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.subarray(charArray2, 2, 99);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(charArray8, ' ');
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH", charArray8);
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) charArray15);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray9);
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
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.addAll(intArray11, intArray23);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray9, (java.lang.Object) intArray39);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray39, (int) ' ', (int) 'a');
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.add(intArray39, (int) (byte) 0, (int) (byte) -1);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.addAll(intArray6, intArray39);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray50 = org.apache.commons.lang3.ArrayUtils.add(intArray47, (int) '4', 165);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 5");
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
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
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, -1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, -1, 52, 10, 1]");
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a1A10A0A0", "Aaaaaa                                                                                               aAAAa", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
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
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray24);
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
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
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
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray19, 33, (-1));
        short[] shortArray31 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray31, (short) (byte) 0, (-1));
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray31);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray31);
        java.lang.Short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray31);
        java.lang.Short[] shortArray40 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray40, (short) 1);
        short[] shortArray49 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray49, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray49);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray42, shortArray49);
        java.lang.Short[] shortArray55 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray54);
        java.lang.Short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray55);
        short[] shortArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray56);
        short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.add(shortArray57, (short) 0);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray57);
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray31, shortArray57);
        short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray24, shortArray61);
        short[] shortArray64 = org.apache.commons.lang3.ArrayUtils.remove(shortArray62, 12);
        short[] shortArray65 = null;
        short[] shortArray66 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray65);
        short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.add(shortArray66, (short) 0);
        short[] shortArray69 = org.apache.commons.lang3.ArrayUtils.clone(shortArray66);
        short[] shortArray70 = org.apache.commons.lang3.ArrayUtils.clone(shortArray69);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray62, shortArray70);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray73 = org.apache.commons.lang3.ArrayUtils.remove(shortArray70, 626);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 626, Length: 0");
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
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray66), "[]");
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[0]");
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[]");
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
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
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray20);
        java.lang.Integer[] intArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray20);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("393933393943793933393943289393339394310");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "393933393943793933393943289393339394310" + "'", str1, "393933393943793933393943289393339394310");
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aAA4444444444-1A10A0A10...", 36, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAA4444444444-1A10A0A10..." + "'", str3, "aAA4444444444-1A10A0A10...");
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("{-1.0,10.0,35.0}", "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-1.0,10.0,35.0}" + "'", str2, "{-1.0,10.0,35.0}");
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###########################################################################################     ###h", (java.lang.CharSequence) "0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAA", "    aAAaaahihi... aAAaaah...    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("1.0a0.0                              hihih                                                        aaa1.0a0.0                              hihih                                                itrueaaah", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1...." + "'", str2, "1....");
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444A1A10A0A0444444444444444444444", 57, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###444444444444444444444A1A10A0A0444444444444444444444###" + "'", str3, "###444444444444444444444A1A10A0A0444444444444444444444###");
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("     HIHIAaa                            aaaA", 139);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     HIHIAaa                            aaaA                                                                                               " + "'", str2, "     HIHIAaa                            aaaA                                                                                               ");
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1.0a0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.0a0.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.0a0.", "                                                                 aAAAa                                                                                               aaaaaAeaaahfalse");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1      AAAA1      AAAA10", "AAAA1      AAAA");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah");
        double[] doubleArray8 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray8, (double) 100);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray8, (double) 10L);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray12, 100.0d, 0);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray12);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray16, (double) (short) 0, 27, (double) 100.0f);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) 100.0f, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        int[] intArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("... aaa");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 100);
        java.lang.Short[] shortArray8 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray8, (short) 1);
        short[] shortArray17 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray17, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray17);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray10, shortArray17);
        java.lang.Short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray22);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray23, (short) (byte) 0);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.add(shortArray25, (short) 0);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray25);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(shortArray25, (short) -1);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.add(shortArray25, (short) 100);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[1, 1, 10, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[-1, 10, 0, 10, 1, 10, 0, 0, 100]");
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
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
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray19);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray22);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray22, (int) (short) 1, (int) ' ');
        java.lang.Short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray26);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 10, 1, 10, 0, 10, -1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0, 10, 1, 10, 0, 10, -1]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, 10, 1, 10, 0, 10, -1]");
        org.junit.Assert.assertNotNull(shortArray27);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) -1 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) -1);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(shortArray4, (short) 10);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) (byte) 10);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray8, (short) (byte) 0);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray8);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray11);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.add(shortArray11, 65, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 65, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[-1]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1]");
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray0, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 28, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("10.01.0", "truetruetruefalse               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) (short) 1);
        long[] longArray14 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.add(longArray14, (long) (short) 1);
        long[] longArray20 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(longArray20, (long) ' ');
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray16, longArray20);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray20);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray20);
        long[] longArray31 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.add(longArray31, (long) (short) 1);
        long[] longArray37 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(longArray37, (long) ' ');
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray37);
        java.lang.Long[] longArray47 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray47);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.addAll(longArray40, longArray48);
        long[] longArray55 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.add(longArray55, (long) (short) 1);
        long[] longArray63 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.add(longArray63, (long) (short) 1);
        long[] longArray69 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.contains(longArray69, (long) ' ');
        long[] longArray72 = org.apache.commons.lang3.ArrayUtils.addAll(longArray65, longArray69);
        long[] longArray73 = org.apache.commons.lang3.ArrayUtils.addAll(longArray55, longArray69);
        int int76 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray55, (-1L), 4);
        long[] longArray77 = org.apache.commons.lang3.ArrayUtils.addAll(longArray48, longArray55);
        long[] longArray78 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray48);
        long[] longArray79 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray78);
        int int81 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray78, (long) 7);
        boolean boolean82 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray78);
        long[] longArray85 = org.apache.commons.lang3.ArrayUtils.subarray(longArray78, (int) (byte) 10, 64);
        long[] longArray87 = org.apache.commons.lang3.ArrayUtils.add(longArray85, (long) 42);
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
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[-1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[-1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(longArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray85), "[]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[42]");
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihi#..", "{{{100.0,1.0,100.0},{100.0,1.0,100.0},{100.0,1.0,100.0},{100.0,1.0,100.0},{100.0,1.0,100.0},{100.0,1.0,100.0}}}", (int) (byte) 100);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaahiaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa", "         AAa                ", 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaa                            aaaAAaa                           AAa                             aaaAAaa                            aaaAAaa" + "'", str3, "Aaa                            aaaAAaa                           AAa                             aaaAAaa                            aaaAAaa");
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) -1, 1, (double) 516);
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray3);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                              AAA                              {#,4}                                                              AAA                              {#,4}                                                              AAA                              ", 43, "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                              AAA                              {#,4}                                                              AAA                              {#,4}                                                              AAA                              " + "'", str3, "                                                              AAA                              {#,4}                                                              AAA                              {#,4}                                                              AAA                              ");
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
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
        java.lang.Long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toObject(longArray24);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.clone(longArray24);
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
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0]");
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 100.0d, (-1.0d), (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, (double) 21);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray9, (double) 10L, (double) 2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, -1.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, -1.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HIHIH                                                        aaa##################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.0a1.0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 28, (-1));
        java.lang.Integer[] intArray9 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9, 859);
        int[] intArray12 = new int[] {};
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.clone(intArray12);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.clone(intArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray11, intArray12);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(intArray12, 23);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0.0       0.0       0.0       0.0      ...", "-1AAA                            AAAA0AAA                            AAAA1AAA                            AAAA100AAA                            AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1AAA                            AAAA0AAA                            AAAA1AAA                            AAAA100AAA                            AAAA" + "'", str2, "-1AAA                            AAAA0AAA                            AAAA1AAA                            AAAA100AAA                            AAAA");
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", "                              HIHIH", "                                                       AAa                          0.0       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1" + "'", str3, "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                aaa", 305);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                aaa" + "'", str2, "                                aaa");
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray16 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.toObject(charArray16);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, '4');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray18);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray18);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, '#', (int) 'a');
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(charArray18, 'a');
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "### 1.0 ### 100.0 ### 10.0 ### 10.0 ### -1.0", charArray18);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "1      AAAA1      AAAA1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(floatArray3, (float) 99);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray3);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, (int) '#', 25);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.remove(floatArray12, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 74, Length: 0");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("10.01.0                            flse4flse4true4true4flse4true4flse                                         AAAA1      AAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "{0,-1,10,1,10,0,0}false0false0true0true0false0true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("      aaa", 209, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray8, true, 0);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray8, true);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaHIHIH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIH" + "'", str2, "HIHIH");
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray20);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21);
        boolean[] booleanArray30 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray35 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray35, false);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray37);
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray37);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray30, booleanArray37);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray30);
        boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.add(booleanArray30, (int) (short) 1, false);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray30, true);
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray30, true);
        java.lang.Boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray30);
        boolean[] booleanArray56 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray63 = new boolean[] { false, false, true, true, false, true };
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray56, booleanArray63);
        boolean[] booleanArray65 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray63);
        boolean[] booleanArray67 = org.apache.commons.lang3.ArrayUtils.add(booleanArray63, false);
        boolean[] booleanArray69 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray67, false);
        boolean[] booleanArray70 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray30, booleanArray67);
        boolean[] booleanArray71 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray24, booleanArray67);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, true, false, true]");
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[false, false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(booleanArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray65), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray67), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray69), "[false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray70), "[false, false, true, false, false, false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray71), "[false, false, true, true, false, true, false, false, true, true, false, true, false]");
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        java.lang.Long[] longArray21 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray14);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray27 = org.apache.commons.lang3.ArrayUtils.add(longArray24, 64, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 64, Length: 9");
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
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray8);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4]");
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("{444444444444444444444444444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi.H{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi..true,false}", "TRUE", "0.0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  HIHIH ", "{true,false,false,false,true,false}{true,false,false,false,true,false}{true,false,false,false,true,false}{true,false,false,false,tru-1{-1,-1,0}11{-1,-1,0}{-1,-1,0}1{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaa{true,false,false,false,true,false}{true,false,false,false,true,false}{true,false,false,false,true,false}{true,false,false,false,true", "10               HIHIH               1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HIHIH " + "'", str3, "  HIHIH ");
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
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
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, (float) 1);
        java.lang.Float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray23);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray23, (float) 445);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0, -1.0, 52.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ah  #h  ah  4h  4h  4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "1      aaaa1      aaaa10", (java.lang.CharSequence) "aaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1Aaa#aaaA0Aaa#aaaA1Aaa#aaaA100Aaa#aaaA1", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
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
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray27, (double) 9, (double) 98);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray27, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "{-1,10,10,1,10,0,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 55, (double) 142);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0.0A                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "1000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1000" + "'", str2, "1000");
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray17, 0);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray19);
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
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.remove(byteArray0, 73);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 73, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                 aAAAa                                                                                               aaaaaAeaaahfalse", "AAA4444444444-1A10A0A10...", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  aaahi   ", "                                        -152101-1521010                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "{-1}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("               HIHIH               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               HIHIH               " + "'", str1, "               HIHIH               ");
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                            AAAa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "             aaA001Aaaa                            aaA1Aaaa                            aaA0Aaaa           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("00000AAAH", "{-1,0,1,100,1}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000AAAH" + "'", str2, "00000AAAH");
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Aaa                            aaaAAaa                           AAa                             aaaAAaa                            aaaAAaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aAAaaahihi...aAAaaah...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        java.lang.Float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray12, 0.0f);
        java.lang.Float[] floatArray21 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray21, 1.0f);
        java.lang.Float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray23);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray14, floatArray23);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray14, (float) (byte) 0, 35);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        float[] floatArray6 = new float[] { (byte) -1, 100L, 100.0f, 100L, 1, 10.0f };
        float[] floatArray8 = new float[] { (byte) 10 };
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) (-1));
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, 0.0f, 100);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray8, (float) 0L);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray6, floatArray8);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray16, (float) (byte) 1);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) 4);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray16, (float) 93, 6);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray16, (float) 17);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0." + "'", str1, "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.");
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1.0a0.0                              HIHIH                                                      ...", 626);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 10, (-1));
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray7, 2, 35);
        java.lang.Byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray13);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.clone(byteArray13);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1 };
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray18, (byte) -1, (int) 'a');
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray18, (byte) 10);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray23);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray24);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(byteArray24, (byte) 1);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray15, byteArray24);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1]");
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih", "       AAA                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih");
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
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
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) intArray27);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aAa       .0 AAA 100.0 AAA 10.0 AAA 10.0 A", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, (double) (-1));
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray8, (double) 1);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 8, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray14);
        java.lang.Long[] longArray22 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray23);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, (long) (byte) 100);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray14, (long) 12, 115);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH", (int) (short) 1, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aa" + "'", str3, "aa");
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
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
        long[] longArray31 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.add(longArray31, (long) (short) 1);
        long[] longArray37 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(longArray37, (long) ' ');
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray37);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray33);
        java.lang.Float[] floatArray48 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray48, 1.0f);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray33, (java.lang.Object) floatArray48);
        java.lang.Float[] floatArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray48);
        java.lang.Float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray52);
        float[] floatArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray52, (float) (short) 100);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isNotEmpty((java.lang.Object[]) floatArray52);
        float[] floatArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray52);
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray57, (float) 25, 244);
        float[] floatArray62 = new float[] { (byte) 10 };
        float[] floatArray64 = org.apache.commons.lang3.ArrayUtils.add(floatArray62, (float) (-1));
        float[] floatArray66 = org.apache.commons.lang3.ArrayUtils.add(floatArray64, (float) '4');
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray66);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.contains(floatArray66, (float) 10);
        int int72 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray66, 10.0f, (int) (byte) 10);
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray57, floatArray66);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.contains(floatArray57, (float) 57);
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
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray66), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        java.lang.Double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 14);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("trueaaahaaaAhifalse", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        java.lang.Short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19, (short) (byte) 10);
        short[] shortArray28 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray28, (short) (byte) 0, (-1));
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.add(shortArray28, (short) (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray33);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.clone(shortArray33);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.clone(shortArray35);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray35, (short) (byte) 0);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray21, shortArray35);
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
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[-1, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[-1, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[-1, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[-1, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 10.0f);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, 100.0d);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, 0.0d, (double) (-1.0f));
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray11, (double) 94, (int) (short) 1, 0.0d);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray11, 0, 24);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray11, 0.0d);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray11);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray11, (double) 100.0f, (double) 106);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        char[] charArray9 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray9, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray9, ' ');
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!HI", charArray9);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, ' ');
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "{-1,-1,0}", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "{aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", charArray9);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
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
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 139, (double) (short) 1);
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
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaaaaaAAaa", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("{0.0,1.0,100.0,10.0,10.0,-1.0}", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{0.0,1.0,100.0,10.0,10.0,-1.0}" + "'", str3, "{0.0,1.0,100.0,10.0,10.0,-1.0}");
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAA1## AAAA1 ##1", 51, "0.1a0.01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA1## AAAA1 ##10.1a0.010.1a0.010.1a0.010.1a0.010." + "'", str3, "AAAA1## AAAA1 ##10.1a0.010.1a0.010.1a0.010.1a0.010.");
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { 100.0f, 0.0f, (-1.0f) };
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 100L);
        float[] floatArray8 = new float[] { (byte) 10 };
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) (-1));
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, 0.0f, 100);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray8, (float) 0L);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray15, 10, (int) (byte) 10);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray15, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray21, (float) (short) 10);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray6, floatArray23);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (float) 13);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(floatArray23, (float) 99);
        java.lang.String str30 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) floatArray23, "#####...");
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray23, 0.0f);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[13.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{}" + "'", str30, "{}");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-10110010");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("                       false4false4true4true4false4true4false", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("100.0                              HIHIH                                                        aaa0.0                              HIHIH                                                        aaa-1.0", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0.0                              HIHIH                                                        aaa-1.0" + "'", str2, "a0.0                              HIHIH                                                        aaa-1.0");
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray9 = org.apache.commons.lang3.ArrayUtils.remove(longArray5, 244);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 244, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#####################AAa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################AAa" + "'", str2, "#####################AAa");
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
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
        java.lang.Long[] longArray87 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray88 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray87);
        long[] longArray89 = org.apache.commons.lang3.ArrayUtils.clone(longArray88);
        java.lang.Long[] longArray90 = org.apache.commons.lang3.ArrayUtils.toObject(longArray89);
        long[] longArray91 = org.apache.commons.lang3.ArrayUtils.addAll(longArray80, longArray89);
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
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[-1, -1, 0, 100, 1, -1, 0, 1, 0, 100, 1, -1, 0, 1, 0]");
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
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
        java.lang.Long[] longArray65 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray64);
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray64);
        java.lang.Long[] longArray67 = org.apache.commons.lang3.ArrayUtils.toObject(longArray66);
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
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[]");
        org.junit.Assert.assertNotNull(longArray67);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray22 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray29 = new boolean[] { false, false, true, true, false, true };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray22, booleanArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray22);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray22, true, (int) '#');
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray22);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        java.lang.Boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        short[] shortArray45 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray45, (short) (byte) 0, (-1));
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.add(shortArray45, (short) (byte) -1);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.add(shortArray45, (short) (byte) 1);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray52, (short) (byte) 1);
        short[] shortArray55 = org.apache.commons.lang3.ArrayUtils.clone(shortArray54);
        java.lang.Short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray54);
        short[] shortArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray56);
        short[] shortArray64 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray64, (short) (byte) 0, (-1));
        short[] shortArray69 = org.apache.commons.lang3.ArrayUtils.add(shortArray64, (short) (byte) -1);
        short[] shortArray71 = org.apache.commons.lang3.ArrayUtils.add(shortArray64, (short) (byte) 1);
        short[] shortArray73 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray71, (short) (byte) 1);
        boolean boolean74 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray73);
        short[] shortArray75 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray73);
        short[] shortArray77 = org.apache.commons.lang3.ArrayUtils.add(shortArray73, (short) (byte) -1);
        short[] shortArray78 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray57, shortArray77);
        int int80 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray38, (java.lang.Object) shortArray78, 19);
        short[] shortArray82 = org.apache.commons.lang3.ArrayUtils.remove(shortArray78, 1);
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
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray55), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray75), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[0, 0, 10, 10, 0, 1, -1]");
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray78), "[0, 0, 10, 10, 0, 1, 0, 0, 10, 10, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray82), "[0, 10, 10, 0, 1, 0, 0, 10, 10, 0, 1, -1]");
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray5, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 33, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        java.lang.Byte[] byteArray6 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 0);
        java.lang.Byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10, (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("Aaa                            aaaA", (java.lang.Object[]) byteArray10);
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray10);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) 0);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.add(byteArray19, 19, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 19, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1" + "'", str14, "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 0, 1, 100, 1]");
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAa", " 1      aaaa1      aaaa1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hi!4hi! hi!ahi!ahi!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!4hi! hi!ahi!ahi!4" + "'", str1, "Hi!4hi! hi!ahi!ahi!4");
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray12);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(shortArray6, (short) 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) 0, 1);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.remove(shortArray6, 4);
        java.lang.Short[] shortArray21 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray21, (short) 1);
        short[] shortArray30 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray30, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray30);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray23, shortArray30);
        short[] shortArray42 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray42, (short) (byte) 0, (-1));
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray23, shortArray42);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray23);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray23, (short) (byte) 10);
        short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.remove(shortArray23, (int) (byte) 0);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray18, shortArray23);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray52, (short) (byte) 0, (int) (short) -1);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray52, (short) (byte) 100);
        java.lang.Short[] shortArray61 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray61, (short) (byte) 100);
        java.lang.Short[] shortArray66 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray66, (short) 1);
        short[] shortArray75 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int78 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray75, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray75);
        short[] shortArray80 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray68, shortArray75);
        java.lang.Short[] shortArray81 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray80);
        short[] shortArray83 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray81, (short) (byte) 0);
        short[] shortArray85 = org.apache.commons.lang3.ArrayUtils.add(shortArray83, (short) 0);
        short[] shortArray86 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray63, shortArray83);
        boolean boolean87 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray52, shortArray63);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0, 10, 1, 0]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[-1, 10, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[10]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[0, 0, 10, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray75), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray80), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray83), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray85), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray86), "[1, 1, 10, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(" Hihih 1 1HihihHihih 1", "                    ...", "001a0.0151a0.01271a0.01261a0.018001a0.0151a0.01271a0.01261a0.0181001a0.0151a0.01271a0.01261a0.018101a0.0151a0.01271a0.01261a0.0181001a0.0151a0.01271a0.01261a0.018001a0.0151a0.01271a0.01261a0.0181");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("... aaa", "{-1,52,10,1,0}", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 1, (int) (short) 10);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (int) (byte) 0, (byte) -1);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray9);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray9);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray9, (byte) 100);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray0, byteArray9);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray20);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray20);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray20);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray20);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray9);
        java.lang.Byte[] byteArray34 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray34);
        java.lang.Byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray34);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray34, (byte) -1);
        java.lang.Object[] objArray39 = null;
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray34, objArray39);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray34, (byte) 100);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray42, (byte) 0);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray42);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray42);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray42, (byte) -1);
        byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray42);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray54 = org.apache.commons.lang3.ArrayUtils.add(byteArray9, 244, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 244, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[10, 1, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAA...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa aaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        double[] doubleArray4 = new double[] { (byte) -1, 10, 28, 7 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        double[][] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toArray(doubleArray5);
        java.lang.Byte[] byteArray12 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray12);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.add(byteArray13, (byte) 0);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray13);
        java.lang.Byte[] byteArray22 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (byte) 0);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray25);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray16, byteArray25);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.clone(byteArray27);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray5, (java.lang.Object) byteArray27);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray27, (byte) 1, 96);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.remove(byteArray33, 871);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 871, Length: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 10.0, 28.0, 7.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        double[] doubleArray0 = null;
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (byte) -1, (double) 115);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", 37, "0.0 1.0 100.0 10.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str3, "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray8, (byte) -1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray8, (int) (short) -1, 0);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray13);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray8);
        java.lang.Boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray9);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9);
        boolean[] booleanArray18 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray25 = new boolean[] { false, false, true, true, false, true };
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray25);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray25);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray27, false, 93);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray27, true);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray27);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray27, 6, (int) (short) 100);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray36);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray36, false);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray36);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[]");
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray17, true, 100);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray17, true, 0);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray17, 64, 445);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "AAAA1      AAAA             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("###10110110110110110110110110110", "", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaa", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###10110110110110110110110110110" + "'", str4, "###10110110110110110110110110110");
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray16);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray16);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray18, true);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray18, (int) (short) 1);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray22);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.add(booleanArray23, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray23);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true, true, true, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, true, true, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, false, true, true, true, false, false]");
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray13, (short) (byte) 1, (int) ' ');
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray13, (short) 0);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(shortArray18, (short) (byte) 100);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, (short) 0);
        java.lang.Short[] shortArray25 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25, (short) 1);
        short[] shortArray34 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray34, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray34);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray34);
        short[] shortArray46 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray46, (short) (byte) 0, (-1));
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray46);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray22, shortArray50);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.contains(shortArray50, (short) (byte) 0);
        java.lang.String[] strArray56 = org.apache.commons.lang3.StringUtils.split("", '#');
        short[] shortArray63 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int66 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray63, (short) (byte) 0, (-1));
        short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.add(shortArray63, (short) (byte) -1);
        short[] shortArray70 = org.apache.commons.lang3.ArrayUtils.add(shortArray63, (short) (byte) 1);
        short[] shortArray72 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray70, (short) (byte) 1);
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray72);
        int int74 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray56, (java.lang.Object) shortArray72);
        short[] shortArray77 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray72, 99, (-1));
        short[] shortArray78 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray50, shortArray72);
        java.lang.Short[] shortArray79 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray50);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray82 = org.apache.commons.lang3.ArrayUtils.add(shortArray50, 93, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 93, Length: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0, 10, 1, 10, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[-1, 10, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray77), "[]");
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray78), "[-1, 10, 0, 0, 10, 1, 10, 0, 0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray79);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray23 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray23, (short) (byte) 0, (-1));
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray23);
        java.lang.Short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray28, (short) (byte) -1);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray30);
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
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) (byte) 100);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray12);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray16);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.remove(shortArray17, 209);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 209, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 0, 10, 1, 10, 0]");
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 28, (int) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 432, 0);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, 64, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("{100,1,-1,0,1,", "                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                 {0,10,1,1,0}                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{0,10,1,1,0}" + "'", str1, "{0,10,1,1,0}");
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("a1A10A0A0                                                                                                 ", 36, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
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
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray20);
        java.lang.String str22 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray20);
        java.lang.Integer[] intArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray20);
        java.lang.Integer[] intArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray20);
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
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.contains(longArray49, (long) 5);
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray49, (long) '4');
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) intArray20, (java.lang.Object) longArray49);
        int[] intArray56 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray20);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray24);
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444", 1000, "Aaa                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa        44444444444444444Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa         " + "'", str3, "Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa        44444444444444444Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa                     Aaa         ");
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18, false);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        java.lang.Boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray22, "44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray22);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray25, false);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse" + "'", str24, "true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!H", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!H" + "'", str3, "Hi!H");
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, false, 93);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Aaa 1.0 aaa 100.0 aaa 10.01.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0aaa 10.0 aaa -1.0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("true", "1.0A0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444AAA1.0A0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444AAA1.0A0.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray8, (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray10, (byte) 0, 1000);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4444444444444444444444444...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444..." + "'", str2, "4444444444444444444444444...");
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
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
        java.lang.Byte[] byteArray27 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray27);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.add(byteArray28, (byte) 0);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray28);
        java.lang.Byte[] byteArray37 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray37);
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.add(byteArray38, (byte) 0);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray40);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray31, byteArray40);
        java.lang.Byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray31);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray31);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray21, byteArray31);
        java.lang.Byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray21);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] {};
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray47, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray49);
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.subarray(intArray49, 28, (int) ' ');
        int[] intArray54 = new int[] {};
        int[] intArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray54, (int) (short) 1);
        int[] intArray58 = org.apache.commons.lang3.ArrayUtils.add(intArray56, 0);
        int[] intArray59 = org.apache.commons.lang3.ArrayUtils.clone(intArray58);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray49, intArray59);
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray49, 28);
        int int63 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray46, (java.lang.Object) intArray49);
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
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { 100.0f, 0.0f, (-1.0f) };
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 35);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) floatArray4, (java.lang.Object) floatArray7);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray7);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray9, (float) (byte) 1);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 10.0f, (int) '4');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (double) 100);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray14);
        java.lang.Double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.", "10.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-1.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa52.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa-1.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa100.044444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
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
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray34, 8, 516);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.add(booleanArray34, false);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray34, false);
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
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[false]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, false, true, false, false, true, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "040410414104");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        java.lang.Object[] objArray0 = null;
        int[] intArray1 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (-1));
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray1);
        int[] intArray13 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray14 = org.apache.commons.lang3.ArrayUtils.toObject(intArray13);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray14, (int) (byte) 0);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.addAll(intArray1, intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray18, (int) (byte) 0, 100);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray18);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.subarray(intArray18, 27, (int) (byte) 10);
        java.lang.Integer[] intArray26 = org.apache.commons.lang3.ArrayUtils.toObject(intArray25);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.addAll(intArray17, intArray25);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray27);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray0, (java.lang.Object) intArray28);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                {-1,10,10,1,10,0,0}                       ", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                {-1,10,10,1,10,0,0}                       " + "'", str3, "                {-1,10,10,1,10,0,0}                       ");
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray7);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 4);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray7, (float) 64);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(floatArray7, (float) 516);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1      aaaA1      aaaA10", 21, "10110010aa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1      aaaA1      aaaA10" + "'", str3, "1      aaaA1      aaaA10");
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray13);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.clone(charArray13);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray15, ' ', 8);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray15, '#');
        char[] charArray30 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.add(charArray30, 'a');
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.add(charArray30, ' ');
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray30);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray35, 'a', (int) (byte) 10);
        boolean boolean39 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaahi", charArray35);
        boolean boolean40 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10.0a1.0", charArray35);
        boolean boolean41 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", charArray35);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray15, charArray35);
        boolean boolean43 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           ", charArray15);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        char[] charArray2 = new char[] { 'a', '#' };
        char[][] charArray3 = new char[][] { charArray2 };
        char[] charArray6 = new char[] { 'a', '#' };
        char[][] charArray7 = new char[][] { charArray6 };
        char[][][] charArray8 = new char[][][] { charArray3, charArray7 };
        char[][][] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray8);
        char[][][] charArray10 = org.apache.commons.lang3.ArrayUtils.clone(charArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray10, "10.01.0                                                                                                   ", 9, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a, #]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("      AAAA1      AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA1      AAA" + "'", str1, "AAAA1      AAA");
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "1.0...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1      AAAA1      AAAA1", "{0,0,10,1,10,0}", (int) (short) 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("-,-,-", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) (short) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) 10);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) (-1));
        java.lang.Object obj12 = null;
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray9, obj12, 139);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 0.0]");
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (short) -1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.io.Serializable[] serializableArray10 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[]) strArray3, (java.io.Serializable) "");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAA                                                                                              ...", strArray11, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(serializableArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1Aaa#aaaA0Aaa#aaaA1Aaa#aaaA100Aaa#aaaA1" + "'", str16, "-1Aaa#aaaA0Aaa#aaaA1Aaa#aaaA100Aaa#aaaA1");
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
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
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray27);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray27, (long) (short) 0);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray27);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray38, (long) 432);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                            {tru93933393943  h                            ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI", "1001-1010");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("aaa 1.0 aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.0", " hi!4hi! hi!ahi!ahi!4", 139);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("1001-1010", strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("10.041.0", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("... aa-11001011000-11001011000-11001011000-11 aaahihi...  ", strArray3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 55, 0, (double) 16);
        java.lang.Double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("aaa", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aAA");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("AAA                                                                                               aaaA", strArray4, strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "hi!HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '4', 4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AAA                                                                                               aaaA" + "'", str8, "AAA                                                                                               aaaA");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        java.lang.Float[] floatArray7 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray7, 1.0f);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray7);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        java.lang.Float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        java.lang.Short[] shortArray16 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray16, (short) (byte) 100);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray16);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray16);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray12, (java.lang.Object) shortArray20);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray12, (float) 28);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.concatWith("   ", (java.lang.Object[]) floatArray12);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray12);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray25);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0.0   1.0   100.0   10.0   10.0   -1.0" + "'", str24, "0.0   1.0   100.0   10.0   10.0   -1.0");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0, 10.0, 10.0, 100.0, 1.0, 0.0]");
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "{-1,52,10,1}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("AAAH                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaah                                                                                                                                          " + "'", str1, "aaah                                                                                                                                          ");
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                              HIHIH", 11, "                      0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              HIHIH" + "'", str3, "                              HIHIH");
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 38, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "{true,false,false,false,true,false}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   " + "'", str1, "                                   ");
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) 2, (double) 0L);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 139);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray9, (double) 799);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 0.0]");
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("         AAa                ", "-11001011000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         AAa                " + "'", str2, "         AAa                ");
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("trueaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
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
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray29, (double) 23);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray36, 0.0d, 26);
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
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 10.0f);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, 100.0d);
        java.lang.Double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray11);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray11, (int) (byte) 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray16, (double) '4', (double) 28);
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaa1      aaaa            ", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa1      aaaa    ..." + "'", str2, "aaaa1      aaaa    ...");
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAA                                ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "false0false0true0true0false0truefalse0false0true0true0false0truefalse0HIHIH0H0aaa       10HIHIH0", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                               aaa                                                                                               aaa", "10hi1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (short) -1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                aaa                                 ", strArray3);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray21 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.add(longArray21, (long) (short) 1);
        long[] longArray27 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(longArray27, (long) ' ');
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray27);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.addAll(longArray13, longArray27);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray13);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray32);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray33);
        java.lang.Long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toObject(longArray33);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) longArray35, (int) (short) 100);
        int int38 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[] floatArray9 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[] floatArray14 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[][] floatArray15 = new java.lang.Float[][] { floatArray4, floatArray9, floatArray14 };
        java.lang.Float[] floatArray19 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray23 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray27 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray31 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray35 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[][] floatArray36 = new java.lang.Float[][] { floatArray19, floatArray23, floatArray27, floatArray31, floatArray35 };
        java.lang.Float[][] floatArray37 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray15, floatArray36);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) floatArray15);
        float[] floatArray43 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.add(floatArray43, (float) '#');
        java.lang.Float[] floatArray46 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray43);
        float[] floatArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray46, (float) 799);
        java.lang.Float[][] floatArray49 = org.apache.commons.lang3.ArrayUtils.add(floatArray15, 2, floatArray46);
        java.lang.Float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray46);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertNotNull(floatArray50);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray18, (short) (byte) 100, 99);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray18, (short) 100);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) 100);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("4444444444444444444444444444444444444444444", ".0a0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444");
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                AAA                                 ", 7, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                AAA                                 " + "'", str3, "                                                                AAA                                 ");
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("trueaaa                            aaaAtrueaaa                            aaaAtrueaaa                            aaaAfalse", "eslfiheurtiheurtiheurt");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray2);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, (int) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray2);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray2, (byte) 100);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        java.lang.Byte[] byteArray22 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22);
        java.lang.Byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray22);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray24, (byte) 0);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray26);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray27);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                      ", "hihi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444AAAA1-1.0AAAA1AAAA110.01AAAA1AAAA110.01AAAA1AAAA1100.01AAAA1AAAA11.01AAAA10.01", 1000, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444AAAA1-1.0AAAA1AAAA110.01AAAA1AAAA110.01AAAA1AAAA1100.01AAAA1AAAA11.01AAAA10.01" + "'", str3, "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,444444444444AAAA1-1.0AAAA1AAAA110.01AAAA1AAAA110.01AAAA1AAAA1100.01AAAA1AAAA11.01AAAA10.01");
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0.1A0.01                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.1A0.01" + "'", str1, "0.1A0.01");
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUE", "false0false0true0true0false0true");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUE" + "'", str2, "HihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUE");
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaIH!ih", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaIH!ih" + "'", str2, "aaaIH!ih");
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI..." + "'", str3, "AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...");
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{10.0}aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{10.0}aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{10.0}aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                              ");
        java.lang.Comparable<java.lang.String>[] strComparableArray4 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Comparable<java.lang.String>[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                      ", strArray1, strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strComparableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                      " + "'", str5, "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                      ");
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, (int) ' ', 10);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray8);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, 82);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, 18, 64);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(intArray8, 142);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) -1);
        short[] shortArray20 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray20);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(shortArray20, (short) 0);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray20);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray6, shortArray20);
        java.lang.Short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray20);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) int31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0, 0, 10, 1, 10, 0, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
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
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.clone(longArray53);
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.remove(longArray53, 0);
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.clone(longArray53);
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
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[100, 1, -1, 0, 1, 0, 97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[1, -1, 0, 1, 0, 97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[100, 1, -1, 0, 1, 0, 97, 1, 100, 0]");
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...ihihaaa 11-00011010011-00011010011-00011010011-", "-1aAa#######10aAa#######0aAa#######10aAa#######1aAa#######10aAa#######0aAa#######0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
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
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray61, (double) '#');
        int int66 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray61, (double) 1.0f, (double) 19);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray68 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray61, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 74, Length: 0");
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) (short) -1, 10, (double) 17);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0]");
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 33);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[33]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (short) -1);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        double[] doubleArray13 = null;
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray12, doubleArray13);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 0.0]");
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0", "AAA                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0" + "'", str2, "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0");
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                   ", (java.lang.CharSequence) "{1,1,10}");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "{1,1,10}" + "'", charSequence2, "{1,1,10}");
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("eaaahfalse trueaaahtru", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("false0false0true0true0false0truefalse0false0true0true0false0truefalse0HIHIH0H0aaa       10HIHIH0", "AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA{1,100,1,-1} aaaA                                                                                                                                                                                                                                                                                                              ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("}0,0,01,1,01,0,01,1-{4444444444444444444444444444444444444444444444444444444444444444444444444", "aaahi#######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}0,0,01,1,01,0,01,1-{4444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "}0,0,01,1,01,0,01,1-{4444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
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
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray19, 33, (-1));
        java.lang.Short[] shortArray27 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray27, (short) 1);
        short[] shortArray36 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray36, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray36);
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray29, shortArray36);
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.add(shortArray41, (short) 10);
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.add(shortArray43, (short) 100);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray43);
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.add(shortArray43, (short) 100);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray24, shortArray43);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray43, (short) 10);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.add(shortArray43, 9, (short) 1);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray54, (short) 1);
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
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 8 + "'", int51 == 8);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 1]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[-1, 10, 0, 10, 10, 0, 0, 10, 1]");
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.add(longArray0, 0L);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(longArray0, (long) 16);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        java.lang.Character[] charArray10 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10, '4');
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray12);
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.toObject(charArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH!ih", charArray12);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray12, 3, 'a');
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "       AAA", charArray12);
        java.lang.Character[] charArray21 = org.apache.commons.lang3.ArrayUtils.toObject(charArray12);
        java.lang.Character[] charArray29 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray29, '4');
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray31);
        java.lang.Character[] charArray33 = org.apache.commons.lang3.ArrayUtils.toObject(charArray31);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray31);
        int int35 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH!ih", charArray31);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray12, charArray31);
        boolean boolean37 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", charArray12);
        int int38 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "21001-10102.", charArray12);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a#aa444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a#aa444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, #, a, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("-1 0 1 100 1", "aaaA");
        java.lang.String[] strArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("aaa                  ...", strArray3);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1 0 1 100 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1 0 1 100 1]");
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaa1      aaaa           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa1      aaaa" + "'", str1, "aaaa1      aaaa");
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
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
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) objMapArray29, "true,true,false}");
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
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                             aaa                                 ", "1.0a0.0                              hihih                                                        aaa1.0a0.0                              hihih                                                        aaa1.0a0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             aaa                                 " + "'", str2, "                                             aaa                                 ");
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 2, 10);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 4, 13);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 516);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, (float) 99, (int) (short) 0);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.remove(floatArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        java.lang.Character[][] charArray0 = new java.lang.Character[][] {};
        java.lang.Character[][] charArray1 = new java.lang.Character[][] {};
        java.lang.Character[][][] charArray2 = new java.lang.Character[][][] { charArray0, charArray1 };
        java.lang.Character[][] charArray3 = new java.lang.Character[][] {};
        java.lang.Character[][] charArray4 = new java.lang.Character[][] {};
        java.lang.Character[][][] charArray5 = new java.lang.Character[][][] { charArray3, charArray4 };
        java.lang.Character[][][][] charArray6 = new java.lang.Character[][][][] { charArray2, charArray5 };
        java.lang.Character[][][][][] charArray7 = new java.lang.Character[][][][][] { charArray6 };
        java.lang.Character[][][][][][] charArray8 = new java.lang.Character[][][][][][] { charArray7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character[][][][][][] charArray10 = org.apache.commons.lang3.ArrayUtils.remove(charArray8, 871);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 871, Length: 1");
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
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "-1a1A10A0A052a1A10A0A010a1A10A0A01", (java.lang.CharSequence) "  4444444444444444444444444...   ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "-1a1A10A0A052a1A10A0A010a1A10A0A01" + "'", charSequence2, "-1a1A10A0A052a1A10A0A010a1A10A0A01");
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                                                                        ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ai!4ai! ai!aai!aai!4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("trueaaahtrueaaahtrueaaahfalse", "aaahihi...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        char[] charArray5 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("aaaA", charArray7);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, '#');
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0.044444444444444444444444444444                                AAA44444444hiaaaaaaaa1.0444444444444444...", charArray7);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, '4');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, '4', 1000);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#,  ]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, #,  , a]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        short[] shortArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray0, (short) 0, 226);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", "Trueaaah      aaaAhifalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0" + "'", str2, "                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0");
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray8, (byte) -1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray8, (int) (short) -1, 0);
        java.lang.Byte[] byteArray19 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray19);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray8, byteArray20);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray21);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 1, -1, 0, 1, 100, 1]");
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, 115, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 115, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("10.0a1.10.0a1.10.0a1.10.0a1.10hi...", (int) (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10.0a1.10.0a1.10.0a1.10.0a1.10hi..." + "'", str3, "10.0a1.10.0a1.10.0a1.10.0a1.10hi...");
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
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
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, 12);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) '#', (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray6);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.subarray(intArray6, 0, 209);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = org.apache.commons.lang3.ArrayUtils.add(intArray6, 17, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 17, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "  ", (java.lang.CharSequence) "eslafihaaaeurtihaaaeurtihaaaeurt");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "eslafihaaaeurtihaaaeurtihaaaeurt" + "'", charSequence2, "eslafihaaaeurtihaaaeurtihaaaeurt");
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) (-1L));
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray8);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) 14);
        float[] floatArray14 = new float[] { (byte) 10 };
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.add(floatArray14, (float) (-1));
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray14, 0.0f, 100);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray14, (float) 0L);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, 10, (int) (byte) 10);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, (int) (short) 10, 10);
        float[] floatArray31 = null;
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray21, floatArray31);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(floatArray32, 0.0f);
        float[] floatArray36 = new float[] { (byte) 10 };
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.add(floatArray36, (float) (-1));
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.add(floatArray38, (float) '4');
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray40);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.contains(floatArray40, (float) 10);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray40, 10.0f, (int) (byte) 10);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray40, (float) (short) 1, 0);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray40, (float) 99, 2);
        float[] floatArray54 = new float[] { (byte) 10 };
        float[] floatArray56 = org.apache.commons.lang3.ArrayUtils.add(floatArray54, (float) (-1));
        int int59 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray54, 0.0f, 100);
        float[] floatArray61 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray54, (float) 0L);
        float[] floatArray64 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray61, 10, (int) (byte) 10);
        float[] floatArray67 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray61, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray70 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray61, (int) (short) 10, 10);
        float[] floatArray71 = null;
        float[] floatArray72 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray61, floatArray71);
        float[] floatArray74 = new float[] { (byte) 10 };
        float[] floatArray76 = org.apache.commons.lang3.ArrayUtils.add(floatArray74, (float) (-1));
        float[] floatArray77 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray74);
        float[] floatArray80 = org.apache.commons.lang3.ArrayUtils.add(floatArray77, (int) (short) 0, (float) (short) -1);
        boolean boolean81 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray77);
        float[] floatArray82 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray61, floatArray77);
        float[] floatArray85 = org.apache.commons.lang3.ArrayUtils.add(floatArray77, 1, (float) 99);
        float[] floatArray86 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray40, floatArray85);
        float[] floatArray87 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray32, floatArray85);
        int int89 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray32, (float) 244);
        float[] floatArray90 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray32);
        float[] floatArray92 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray10, (float) ' ');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, -1.0, 52.0, -1.0, 14.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray56), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[]");
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[]");
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[]");
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray76), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray77), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray80), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(floatArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray82), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray85), "[10.0, 99.0]");
        org.junit.Assert.assertNotNull(floatArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray86), "[10.0, -1.0, 52.0, 10.0, 99.0]");
        org.junit.Assert.assertNotNull(floatArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray87), "[10.0, 10.0, 99.0]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(floatArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray90), "[10.0, -1.0, 52.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray92), "[10.0, -1.0, 52.0, -1.0]");
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaa                                                                                              ", 139);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA" + "'", str2, "AAA");
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = new double[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray3);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.add(doubleArray1, (double) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray1, 142);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 142, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        java.lang.Long[][][][] longArray0 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, (int) (byte) 1, 8);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray0, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#");
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) (byte) 0);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray4, 0.0f);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray11);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, 5, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 1");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAAA1-1.0 AAAA1 AAAA110.01 AAAA1 AAAA110.01 AAAA1 AAAA1100.01 AAAA1 AAAA11.01 AAAA1 0.01", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#", "     ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("true4true4true4false", 432, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true4true4true4false" + "'", str3, "true4true4true4false");
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA" + "'", str1, "AAA");
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
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
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(byteArray21, (byte) 10);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 1);
        java.lang.Byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray21);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 0, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray29);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                 AAA", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 AAA" + "'", str3, "                                                                                                 AAA");
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray14);
        java.lang.Long[] longArray22 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray23);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray23);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray28 = org.apache.commons.lang3.ArrayUtils.add(longArray25, 52, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 6");
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
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[100, 1, -1, 0, 1, 0]");
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("{a,#,a,4,4,4}", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aA", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aA" + "'", str3, "aA");
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray14);
        java.lang.Long[] longArray22 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray23);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, (long) (byte) 100);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray14);
        java.lang.Long[] longArray34 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray34);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray34, (java.lang.Object) (short) 100);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray34);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray14, longArray38);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray14);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray14);
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray14);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray42);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[0, -1, -1, 1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        java.lang.String[] strArray14 = org.apache.commons.lang3.ArrayUtils.subarray(strArray11, (int) 'a', (int) '4');
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("hi!HI", "                                                                 AAA                                                                                               aaa");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("       AAA", strArray11, strArray17);
        float[] floatArray24 = new float[] { (-1L), 1.0f, 0L, 1, '#' };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray24);
        java.lang.Float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray24);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray17, (java.lang.Object[]) floatArray26);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray26, (float) 3);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray26);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) intArray7, (java.lang.Object) floatArray30, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "       AAA" + "'", str18, "       AAA");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[-1.0, 1.0, 0.0, 1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, 1.0, 0.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0, 1.0, 0.0, 1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '#');
        short[] shortArray9 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 0, (-1));
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (short) (byte) -1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (short) (byte) 1);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray16, (short) (byte) 1);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray18);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray2, (java.lang.Object) shortArray18);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray18, 99, (-1));
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(shortArray23, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.remove(shortArray23, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 94, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray8);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray8, (byte) -1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray11, (byte) 0);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray13);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1]");
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "-1A1A10A0A0-1A1A10A0A00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 100);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) '4');
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = org.apache.commons.lang3.ArrayUtils.remove(intArray7, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 26, Length: 0");
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah", 2, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.04aaa41.04aaa4100.04aaa410.04aaa410.04aaa4-1.0" + "'", str3, "0.04aaa41.04aaa4100.04aaa410.04aaa410.04aaa4-1.0");
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                 AAA", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray6, (int) (byte) 0, 42);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, false, 516);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray6, 24, (int) (short) 10);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, false, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, false, false, false, true, false]");
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 10, (int) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray14, (float) (short) 100);
        java.lang.Float[] floatArray23 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray23, 1.0f);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray25);
        float[] floatArray28 = new float[] { (byte) 10 };
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.add(floatArray28, (float) (-1));
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray28);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, (int) (short) 0, (float) (short) -1);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray34, (float) (byte) -1);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray34);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray34, (float) 10L);
        float[] floatArray41 = new float[] { (byte) 10 };
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.add(floatArray41, (float) (-1));
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray41, 0.0f, 100);
        float[] floatArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray41, (float) 0L);
        float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray48, 10, (int) (byte) 10);
        float[] floatArray52 = org.apache.commons.lang3.ArrayUtils.clone(floatArray51);
        float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray34, floatArray52);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray25, floatArray53);
        java.lang.Float[] floatArray58 = new java.lang.Float[] { 100.0f, 0.0f, (-1.0f) };
        java.lang.Float[] floatArray59 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray58);
        float[] floatArray61 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray59, (float) 100L);
        float[] floatArray63 = new float[] { (byte) 10 };
        float[] floatArray65 = org.apache.commons.lang3.ArrayUtils.add(floatArray63, (float) (-1));
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray63, 0.0f, 100);
        float[] floatArray70 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray63, (float) 0L);
        float[] floatArray73 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray70, 10, (int) (byte) 10);
        float[] floatArray76 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray70, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray78 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray76, (float) (short) 10);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray61, floatArray78);
        float[] floatArray81 = org.apache.commons.lang3.ArrayUtils.add(floatArray78, (float) 13);
        float[] floatArray82 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray53, floatArray78);
        float[] floatArray83 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray78);
        float[] floatArray86 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, 0, 0);
        float[] floatArray87 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray14);
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
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray73), "[]");
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray76), "[]");
        org.junit.Assert.assertNotNull(floatArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray78), "[]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray81), "[13.0]");
        org.junit.Assert.assertNotNull(floatArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray82), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray83), "[]");
        org.junit.Assert.assertNotNull(floatArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray86), "[]");
        org.junit.Assert.assertNotNull(floatArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray87), "[]");
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
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
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.add(doubleArray31, 0.0d);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray35);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray35, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 10.0, 35.0, 24.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 10.0, 35.0, 24.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("4444", "", 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray15);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, true, (int) (byte) 0);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, true, 42);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, false);
        boolean[] booleanArray31 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray38 = new boolean[] { false, false, true, true, false, true };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray31, booleanArray38);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray31);
        boolean[] booleanArray47 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray54 = new boolean[] { false, false, true, true, false, true };
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray47, booleanArray54);
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray54);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray54);
        boolean[] booleanArray58 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray31, booleanArray54);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray15, booleanArray31);
        boolean[] booleanArray61 = org.apache.commons.lang3.ArrayUtils.add(booleanArray59, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray64 = org.apache.commons.lang3.ArrayUtils.add(booleanArray61, 142, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 142, Length: 16");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true, false, false, false, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[false, false, true, false, false, true, true, true, false, true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray61), "[false, false, true, false, false, true, true, true, false, true, false, false, false, true, false, false]");
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
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
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray26, (long) ' ');
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray28);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(longArray29, (long) 25);
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
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        java.lang.Character[] charArray8 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8, '4');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray10, '4');
        java.lang.Character[] charArray20 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray20, '4');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray22);
        java.lang.Character[] charArray24 = org.apache.commons.lang3.ArrayUtils.toObject(charArray22);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray13, charArray22);
        java.lang.Character[] charArray26 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        char[] charArray33 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.add(charArray33, 'a');
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.add(charArray33, ' ');
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray33);
        char[] charArray42 = new char[] { '4', ' ', ' ' };
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.addAll(charArray33, charArray42);
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.add(charArray43, ' ');
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.addAll(charArray13, charArray43);
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.subarray(charArray43, 106, 139);
        boolean boolean50 = org.apache.commons.lang3.StringUtils.containsAny("Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi{-1,52,10,1,0}Hi", charArray49);
        boolean boolean51 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...{1,1,10}HIHI...", charArray49);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#a4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#a4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, a, 4, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "a#a4444a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "a#a4444a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[a, #, a, 4, 4, 4, 4, a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[ , 4,  , a, a, 4, 4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), " 4 aa44   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), " 4 aa44   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[ , 4,  , a, a, 4, 4,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "a#a4444 4 aa44  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "a#a4444 4 aa44  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[a, #, a, 4, 4, 4, 4,  , 4,  , a, a, 4, 4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray12);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray23 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.add(charArray23, 'a');
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.remove(charArray23, 5);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray23, '4');
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray12, charArray23);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " 4 aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " 4 aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ , 4,  , a, a]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        int[] intArray0 = new int[] {};
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray4 = new int[] {};
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, (int) (short) 1);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, (-1));
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 27);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray4);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray12);
        java.lang.Integer[] intArray14 = org.apache.commons.lang3.ArrayUtils.toObject(intArray13);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray14);
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
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
        long[] longArray70 = org.apache.commons.lang3.ArrayUtils.remove(longArray62, (int) (byte) 0);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray62);
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
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray6, (java.lang.Object) (short) 100);
        java.lang.Long[] longArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray10);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray10, 100L);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray13);
        long[] longArray20 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray20, (long) (short) 1);
        long[] longArray26 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(longArray26, (long) ' ');
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.addAll(longArray22, longArray26);
        java.lang.Long[] longArray36 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray36);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray37);
        long[] longArray44 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.add(longArray44, (long) (short) 1);
        long[] longArray52 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.add(longArray52, (long) (short) 1);
        long[] longArray58 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.contains(longArray58, (long) ' ');
        long[] longArray61 = org.apache.commons.lang3.ArrayUtils.addAll(longArray54, longArray58);
        long[] longArray62 = org.apache.commons.lang3.ArrayUtils.addAll(longArray44, longArray58);
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray44, (-1L), 4);
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.addAll(longArray37, longArray44);
        long[] longArray68 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray66, (long) 0);
        long[] longArray69 = org.apache.commons.lang3.ArrayUtils.clone(longArray66);
        long[] longArray70 = org.apache.commons.lang3.ArrayUtils.addAll(longArray13, longArray66);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[100, 1, -1, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[100, 1, -1, 0, 1, 0, 100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        java.lang.Long[] longArray25 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray25);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray25, (java.lang.Object) (short) 100);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray25);
        long[] longArray35 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.add(longArray35, (long) (short) 1);
        long[] longArray41 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.contains(longArray41, (long) ' ');
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.addAll(longArray37, longArray41);
        java.lang.Long[] longArray51 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray51);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray44, longArray52);
        long[] longArray59 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray61 = org.apache.commons.lang3.ArrayUtils.add(longArray59, (long) (short) 1);
        long[] longArray67 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray69 = org.apache.commons.lang3.ArrayUtils.add(longArray67, (long) (short) 1);
        long[] longArray73 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.contains(longArray73, (long) ' ');
        long[] longArray76 = org.apache.commons.lang3.ArrayUtils.addAll(longArray69, longArray73);
        long[] longArray77 = org.apache.commons.lang3.ArrayUtils.addAll(longArray59, longArray73);
        int int80 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray59, (-1L), 4);
        long[] longArray81 = org.apache.commons.lang3.ArrayUtils.addAll(longArray52, longArray59);
        long[] longArray83 = org.apache.commons.lang3.ArrayUtils.add(longArray81, (long) (byte) 0);
        long[] longArray84 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray81);
        int int85 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray18, (java.lang.Object) longArray81);
        java.lang.Short[] shortArray86 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray18);
        java.lang.Integer[] intArray87 = new java.lang.Integer[] {};
        int[] intArray89 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray87, 35);
        java.lang.Integer[] intArray90 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray87);
        java.lang.Integer[] intArray91 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray87);
        java.lang.Integer[] intArray92 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray91);
        int[] intArray93 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray92);
        int[] intArray94 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray92);
        java.lang.Integer[] intArray95 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray92);
        boolean boolean96 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) shortArray86, (java.lang.Object[]) intArray92);
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
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(longArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray81), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0, 0]");
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[100, 1, -1, 0, 1, 0, 100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[]");
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray11, 'a');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray11, '4');
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , a, 4, a]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , a, a, 4, a]");
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        java.lang.Byte[] byteArray26 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray26);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (byte) 0);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray27);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray27);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray20, byteArray27);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray32, (byte) 0);
        java.lang.Byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray32);
        java.lang.String str36 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray35);
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
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{-1,0,1,100,1,-1,0,1,100,1,0,-1,0,1,100,1}" + "'", str36, "{-1,0,1,100,1,-1,0,1,100,1,0,-1,0,1,100,1}");
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "           ...           ...           ...           ...           ...           ...           ...", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444aaa444444444444444444444444444444", '#');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("true", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "atrueaaahitrueaaahitrueaaahifalse#trueaaahitrueaaahitrueaaahifalseatrueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4trueaaahitrueaaahitrueaaahifalse4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = new double[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 'a', 35, (double) 28);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) 10.0f, 0.0d);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, 0.0d);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 35, (double) 7);
        double[] doubleArray17 = new double[] {};
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, (double) 3, (double) 1L);
        double[] doubleArray21 = new double[] {};
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray21, (double) '4', (double) (byte) -1);
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray21, doubleArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray17, doubleArray29);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, (double) 7);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray17);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) (short) 1, 21);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA", "       AAa       ", 1000);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                       flse4flse4true4true4flse4true4flse", "       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("       AAA       ", "aaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       AAA       " + "'", str2, "       AAA       ");
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) '#', 0);
        int[] intArray12 = new int[] { (-1), '4', (byte) 10, 1 };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray12, (int) (short) 100, 100);
        int[] intArray16 = new int[] {};
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray16, (int) (short) 1);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.subarray(intArray16, (int) (short) 0, (int) (short) -1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray12, intArray16);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.add(intArray12, 0);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, (int) 'a', 0);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, (int) (byte) 0, 2);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray12);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaa4444444444-1a10a0a10a1a10a0a0", "44444444444444444444444444444AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0.0--------------------0.0       0.0--------------------0.0       0.0--------------------0.0       110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "0.0--------------------0.0       ", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, false);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray17);
        java.lang.Boolean[] booleanArray23 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray23, false);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray25);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray25);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray25);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray25);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray17, booleanArray25);
        boolean[] booleanArray31 = null;
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray17, booleanArray31);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray31, true, 19);
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
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...UETRUETRUETRUETRUETRUETRUETRUETRUETRUE", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "...     aAA       aAA       aAA       a...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAA                                ", (int) ' ', "44444444444444444444444444444AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAA                                " + "'", str3, "AAA                                ");
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                             {}                                              ", "#####################AAa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(floatArray4, 0.0f);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(floatArray4, (float) '#');
        float[] floatArray13 = new float[] { (byte) 10 };
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray13, (float) (-1));
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray15, (float) '4');
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray17);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (float) (-1L));
        float[] floatArray22 = new float[] { (byte) 10 };
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray22, (float) (-1));
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray24);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray24);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.remove(floatArray24, (int) (byte) 0);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray24);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray24, (float) 93);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                ...", "                                AAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        org.apache.commons.lang3.StringUtils[] stringUtilsArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.StringUtils[] stringUtilsArray2 = org.apache.commons.lang3.ArrayUtils.remove(stringUtilsArray0, 516);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 516, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3, (double) 0L);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) 100L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 1.0]");
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
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
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray28, (long) (byte) 0, 2);
        java.lang.Class<?> wildcardClass41 = longArray28.getClass();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
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
        boolean boolean81 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray75);
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
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...", "aaaA", 99);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("aaahihi...", strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("1      aaaA1      aaaA1", strArray7);
        java.lang.Long[] longArray16 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray16, (java.lang.Object) (short) 100);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16);
        long[] longArray26 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.add(longArray26, (long) (short) 1);
        long[] longArray32 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(longArray32, (long) ' ');
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.addAll(longArray28, longArray32);
        java.lang.Long[] longArray42 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray42);
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.addAll(longArray35, longArray43);
        long[] longArray50 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.add(longArray50, (long) (short) 1);
        long[] longArray58 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.add(longArray58, (long) (short) 1);
        long[] longArray64 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.contains(longArray64, (long) ' ');
        long[] longArray67 = org.apache.commons.lang3.ArrayUtils.addAll(longArray60, longArray64);
        long[] longArray68 = org.apache.commons.lang3.ArrayUtils.addAll(longArray50, longArray64);
        int int71 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray50, (-1L), 4);
        long[] longArray72 = org.apache.commons.lang3.ArrayUtils.addAll(longArray43, longArray50);
        long[] longArray74 = org.apache.commons.lang3.ArrayUtils.add(longArray72, (long) (byte) 0);
        long[] longArray75 = org.apache.commons.lang3.ArrayUtils.addAll(longArray20, longArray72);
        int int78 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray72, (long) 7, (int) 'a');
        long[] longArray80 = org.apache.commons.lang3.ArrayUtils.remove(longArray72, (int) (byte) 0);
        int int81 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray7, (java.lang.Object) (byte) 0);
        boolean boolean82 = org.apache.commons.lang3.StringUtils.endsWithAny("a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAaa", strArray7);
        java.lang.String[] strArray84 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0aaa                                10aaa                                1aaa                                1aaa                                0");
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray7, (java.lang.Object) strArray84);
        java.lang.String[] strArray88 = org.apache.commons.lang3.StringUtils.split("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1");
        java.lang.String[] strArray89 = null;
        java.lang.String str90 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HIHIH", strArray88, strArray89);
        java.lang.String[] strArray92 = org.apache.commons.lang3.StringUtils.stripAll(strArray88, "-1...ihihaaa 11-00011010011-00011010011-00011010011--1...ihihaaa 11-00011010011-00011010011-00011010011-0...ihihaaa 11-00011010011-00011010011-00011010011--1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str93 = org.apache.commons.lang3.StringUtils.replaceEach("... AA-11001011000-11001011000-11001011000-11 AAAHIHI...", strArray84, strArray88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 13 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0, 0]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[100, 1, -1, 0, 1, 0, 100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[1, -1, 0, 1, 0, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "HIHIH" + "'", str90, "HIHIH");
        org.junit.Assert.assertNotNull(strArray92);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        java.lang.String[] strArray5 = new java.lang.String[] { "0.0A                                                                AAA                          ", "aaaA1110aaaA1110aaaA1110aaaA", "{100,1,-1,0,1,0}", "                                                                                                 aaa", "   " };
        java.lang.String[] strArray11 = new java.lang.String[] { "0.0A                                                                AAA                          ", "aaaA1110aaaA1110aaaA1110aaaA", "{100,1,-1,0,1,0}", "                                                                                                 aaa", "   " };
        java.lang.String[] strArray17 = new java.lang.String[] { "0.0A                                                                AAA                          ", "aaaA1110aaaA1110aaaA1110aaaA", "{100,1,-1,0,1,0}", "                                                                                                 aaa", "   " };
        java.lang.String[] strArray23 = new java.lang.String[] { "0.0A                                                                AAA                          ", "aaaA1110aaaA1110aaaA1110aaaA", "{100,1,-1,0,1,0}", "                                                                                                 aaa", "   " };
        java.lang.String[] strArray29 = new java.lang.String[] { "0.0A                                                                AAA                          ", "aaaA1110aaaA1110aaaA1110aaaA", "{100,1,-1,0,1,0}", "                                                                                                 aaa", "   " };
        java.lang.String[] strArray35 = new java.lang.String[] { "0.0A                                                                AAA                          ", "aaaA1110aaaA1110aaaA1110aaaA", "{100,1,-1,0,1,0}", "                                                                                                 aaa", "   " };
        java.lang.Comparable[][] comparableArray37 = new java.lang.Comparable[6][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray38 = (java.lang.Comparable<java.lang.String>[][]) comparableArray37;
        strComparableArray38[0] = strArray5;
        strComparableArray38[1] = strArray11;
        strComparableArray38[2] = strArray17;
        strComparableArray38[3] = strArray23;
        strComparableArray38[4] = strArray29;
        strComparableArray38[5] = strArray35;
        java.lang.String[] strArray55 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.lang.String[] strArray56 = org.apache.commons.lang3.StringUtils.stripAll(strArray55);
        java.lang.String[] strArray59 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray59, 'a');
        java.lang.String str62 = org.apache.commons.lang3.StringUtils.replaceEach("{100,1,-1,0,1,0}", strArray55, strArray59);
        java.lang.Comparable<java.lang.String>[][] strComparableArray63 = org.apache.commons.lang3.ArrayUtils.add(strComparableArray38, 4, (java.lang.Comparable<java.lang.String>[]) strArray59);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(strComparableArray38);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(comparableArray37);
        org.junit.Assert.assertNotNull(strComparableArray38);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "aaa" + "'", str61, "aaa");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "{100,1,-1,0,1,0}" + "'", str62, "{100,1,-1,0,1,0}");
        org.junit.Assert.assertNotNull(strComparableArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#", 626, "                                aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                              " + "'", str3, "#                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                                aaa                              ");
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         1A10A0A0", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "{444444444444444444444444444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi.H{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi..true,false}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ah  #h  ah  4h  4h  4", "0.1-444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.01444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.01444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.001444444444444444444444444444444444aaa44444444444444444444444444444444444444444444444444444444444444440.1444444444444444444444444444444444aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray6, 516, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 516, Length: 1");
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 165);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("true true true false", "1.0a0.0                              HIHIH                                                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        double[] doubleArray5 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (-1.0d));
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (byte) 1, 100);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) 100L);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray13, (double) 21, 1.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 100.0, -1.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "0000000000000000000", 24, 52);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 3, (double) 1L);
        double[] doubleArray4 = new double[] {};
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) '4', (double) (byte) -1);
        double[] doubleArray12 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray12);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray12, 3);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray12, 69, 37);
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
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray7);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, (float) '#');
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (byte) 10, 27);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray12, (float) 1L, 26);
        java.lang.Float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray12);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray19);
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("       AAa       ", "                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       AAa       " + "'", str2, "       AAa       ");
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", " 1      AAAA1      AAAA1                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("############################100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0", "###                                                                                                ", "      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0" + "'", str3, "############################100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0");
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
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
        java.lang.Byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        java.lang.Character[] charArray31 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray31, '4');
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray33);
        java.lang.Character[] charArray35 = org.apache.commons.lang3.ArrayUtils.toObject(charArray33);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray33);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray33, ' ', (int) (short) -1);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.add(charArray33, ' ');
        char[] charArray42 = null;
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.addAll(charArray33, charArray42);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray24, (java.lang.Object) charArray43, 7);
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray24, '4', 12, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "a#a444 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "a#a444 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[a, #, a, 4, 4, 4,  ]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aAa       .0 AAA 100.0 AAA 10.0 AAA 10.0 A", "...ihihaaa 11-00011010011-00011010011-00011010011-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
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
        long[] longArray31 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.add(longArray31, (long) (short) 1);
        long[] longArray37 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(longArray37, (long) ' ');
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray37);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray33);
        java.lang.Float[] floatArray48 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray48, 1.0f);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray33, (java.lang.Object) floatArray48);
        float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray48, (float) 8);
        float[] floatArray55 = new float[] { (byte) 10 };
        float[] floatArray57 = org.apache.commons.lang3.ArrayUtils.add(floatArray55, (float) (-1));
        float[] floatArray58 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray55);
        float[] floatArray61 = org.apache.commons.lang3.ArrayUtils.add(floatArray58, (int) (short) 0, (float) (short) -1);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.contains(floatArray58, 0.0f);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray53, floatArray58);
        java.lang.Float[] floatArray65 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray53);
        float[] floatArray66 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray53);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray69 = org.apache.commons.lang3.ArrayUtils.add(floatArray66, 244, (float) 405);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 244, Length: 6");
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
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray66), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray7);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 4);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray7, (float) 64);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, 0.0f);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray19 = new float[] { (byte) 10 };
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray19, (float) (-1));
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray19);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray17, floatArray22);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  A                                                                      AAA                                                                                                     A               A A                                 A A                                 A   A                                 A ", 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  A                                                                      AAA                                                                                                     A               A A                                 A A                                 A   A                                 A " + "'", str3, "  A                                                                      AAA                                                                                                     A               A A                                 A A                                 A   A                                 A ");
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0.1A0.01", "AAa       ", 432);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("{97,00.0A100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1{97,0,1,100,0} 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 {97,00.0A100,0}-1" + "'", str2, "1{97,0,1,100,0} 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 {97,00.0A100,0}-1");
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "10hi1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("-1{-1,-1,0}11{-1,-1,0}{-1,-1,0}1{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaa", "10.0a1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "##                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("{true,true,true,fhi!4hi! hi!ahi!ahi!4lse}", "Aaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                            aaaAAaa                       ", 97);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AA", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA" + "'", str2, "AA");
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", "           ...           ...           ...           ...           ...           ...           ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{", "-1A1A10A0A0-1A1A10A0A00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray8, (double) ' ');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray12, (double) 3);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.add(doubleArray12, (double) 11);
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
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 10.0, 35.0, 11.0]");
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaHIHIH#########################################################################################################################################################################################################", "AAAA1-1.0AAAA1AAAA1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaHIHIH#########################################################################################################################################################################################################" + "'", str2, "aaaHIHIH#########################################################################################################################################################################################################");
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray15 = new char[] { '4', ' ', ' ' };
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray15);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray15);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray15, ' ');
        java.lang.Character[] charArray20 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray15, 'a');
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4, 4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ,  ]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444444444444444444444A1A10A0A0444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444A1A10A0A0444444444444444444444" + "'", str2, "444444444444444444444A1A10A0A0444444444444444444444");
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{1", 10, "1.0a0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{1" + "'", str3, "10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{1");
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        java.lang.Boolean[][][] booleanArray0 = new java.lang.Boolean[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean[][][] booleanArray2 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 69, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi", "1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
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
        java.lang.Long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toObject(longArray28);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray29);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray30);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray34 = org.apache.commons.lang3.ArrayUtils.add(longArray30, 42, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42, Length: 0");
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray0, 859, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 859, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                            HIHIH                                                        aaa                                                                                                                                                                                                                                                                                                                                                                                               ", "                       flse4flse4true4true4flse4true4flse", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  10110010AA                                                                                    ", (int) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  10110010AA                                                                                    " + "'", str3, "  10110010AA                                                                                    ");
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("{-1.0,10.0}", 165, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                          {-1.0,10.0}" + "'", str3, "                                                                                                                                                          {-1.0,10.0}");
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.", "{-1.0,1.0,0.0,1.0,35.0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1." + "'", str2, "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.");
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0.0 1.0 100.0 hi!H0.0 1.0 100.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0 1.0 100.0 hi!H0.0 1.0 100.0" + "'", str1, "0.0 1.0 100.0 hi!H0.0 1.0 100.0");
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    ..." + "'", str1, "                    ...");
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("#######################", "hiaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
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
        java.lang.Short[] shortArray46 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray46, (short) 1);
        short[] shortArray55 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray55, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray55);
        short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray48, shortArray55);
        java.lang.Short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray60);
        short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray61, (short) (byte) 0);
        short[] shortArray65 = org.apache.commons.lang3.ArrayUtils.add(shortArray63, (short) 0);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray6, shortArray63);
        int int69 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray63, (short) -1, 142);
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
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray55), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("{100,1,-1,0,1,0}", "aaa                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 347);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("       AAA     HIHIH     HIHIH     HIHIH  ", "{tru93933393943  h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, ' ', 168, 64);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAA                                                                                               aaa", 5, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAA                                                                                               aaa" + "'", str3, "AAA                                                                                               aaa");
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("#################################################################################################", "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("h   ", "0.041.04100.0410.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                      {97,0,1,100,0}", "10.01.0#############################################################################################################################################################", 164);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 879);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("AaaaaaAAaaaaaAAatrueaaaaAAaaaaaAAaa", "                                AAA44444444hi", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("-1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih-1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih-1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih-1" + "'", str1, "-1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih-1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih-1");
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa1.0aaa100.0aaa10.0aaa10.0aaa-1.0" + "'", str2, "aa1.0aaa100.0aaa10.0aaa10.0aaa-1.0");
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray20);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[true, false, true, true, false, false]");
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) longArray13);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray13);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(longArray19);
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaa                  ...aaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaa                  ...aaaaaa" + "'", str1, "aaaaaaaa                  ...aaaaaa");
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AAAA10.0-------------------------------------------------.0 AAAA1 AAAA110.01 AAAA1 AAAA110.01 AAAA1 AAAA1100.01 AAAA1 AAAA11.01 AAAA1 0.01", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "       aAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) '#', 19, (double) 'a');
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, (double) 100, (double) 3);
        double[] doubleArray18 = new double[] {};
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) '4', (double) (byte) -1);
        double[] doubleArray26 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray18, doubleArray26);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) 10.0f, (int) '4');
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray18, (double) (byte) -1);
        double[] doubleArray34 = new double[] { 1.0f };
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray34);
        double[] doubleArray36 = new double[] {};
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray34, doubleArray36);
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.add(doubleArray34, (double) (short) -1);
        double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray18, doubleArray34);
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.add(doubleArray34, (double) 3);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray42, 10, (int) (byte) 10);
        double[] doubleArray46 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray8, doubleArray45);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, 516, (double) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 516, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, -1.0, 10.0, 35.0]");
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        int[] intArray4 = new int[] { (byte) 100, 1, 35, (short) 10 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, 0, 33);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) intArray3, '4', 305, 226);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray6);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray9);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray9);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray11);
        java.lang.Byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray11, (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiAAA                                                                                               aaaAhihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi1      aaaA1      aaaA10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaa                                                                                               aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi1      aaaa1      aaaa10" + "'", str1, "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaa                                                                                               aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi1      aaaa1      aaaa10");
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("{-1}");
        java.lang.Object[] objArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("aAA", "{97,0,1,100,0}", 25);
        double[] doubleArray9 = new double[] { 1.0f };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray9);
        double[] doubleArray11 = new double[] {};
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray11);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, (double) (short) -1);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) (byte) 1, 1);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray9);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) 4);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) int20, (-1));
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA", strArray2, strArray7);
        java.lang.String str25 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) str23, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[{-1}]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[{-1}]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA" + "'", str23, "444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA" + "'", str25, "444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray8, (float) 6);
        float[] floatArray15 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray15, (float) '#');
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray17);
        float[] floatArray20 = new float[] { (byte) 10 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (-1));
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray20);
        float[] floatArray25 = new float[] { (-1L) };
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (float) 100);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray20, floatArray25);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray18, floatArray28);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0, 2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0, 2.0, 52.0, -1.0, 35.0, 10.0, -1.0]");
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 65);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray1, 100, (int) (short) 10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(floatArray14, (float) 73);
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
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray18, 'a');
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) 0);
        short[] shortArray31 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray31, (short) (byte) 0, (-1));
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.add(shortArray31, (short) (byte) 1);
        short[] shortArray43 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray43, (short) (byte) 0, (-1));
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray31, shortArray43);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray31, (short) 1);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray24, shortArray31);
        short[] shortArray53 = new short[] { (short) -1, (byte) 0 };
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray53, (short) (byte) 100);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray31, shortArray53);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1a10a0a10a1a10a0a0" + "'", str21, "-1a10a0a10a1a10a0a0");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[0, 0, 10, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[0, 0, 10, 1, 10, 0, -1, 0]");
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
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
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) longArray25);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray25, '#', 52, 38);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1-10" + "'", str28, "-1-10");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray15 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray15);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray17, '4');
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray17);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) ' ', 4);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray6);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.clone(charArray6);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 6, '#');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray28);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.add(charArray28, ' ');
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray28, '#');
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4 aa4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4 aa4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4,  , a, a, 4, #]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 aa4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 aa4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, a, 4, #]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " 4 aa4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " 4 aa4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , 4,  , a, a, 4, #,  ]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray16 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.toObject(charArray16);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, '4');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray18);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.subarray(charArray7, (int) ' ', 4);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray7);
        java.lang.Character[] charArray26 = org.apache.commons.lang3.ArrayUtils.toObject(charArray7);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaahihi...", charArray7);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, 'a');
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
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, 4]");
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaahi######################", "                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi", "HihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUE", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444aaa...aaa...aaa...aaa...aaa.aaa...aaa...aaa...aaa...aaa" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444aaa...aaa...aaa...aaa...aaa.aaa...aaa...aaa...aaa...aaa");
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray22 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray29 = new boolean[] { false, false, true, true, false, true };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray22, booleanArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray22);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray22, true, (int) '#');
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray22);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray22, true);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray37, true);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray37);
        boolean[] booleanArray47 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray54 = new boolean[] { false, false, true, true, false, true };
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray47, booleanArray54);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray54, false);
        int int60 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray54, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray61 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray54);
        boolean[] booleanArray63 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray54, false);
        java.lang.Boolean[] booleanArray64 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray63);
        boolean[] booleanArray65 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray40, booleanArray63);
        boolean[] booleanArray67 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray63, false);
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
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray64);
        org.junit.Assert.assertNotNull(booleanArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray65), "[false, false, false, true, false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray67), "[true, true, false, true]");
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAA10.0-------------------------------------------------.0 AAAA1 AAAA110.01 AAAA1 AAAA110.01 AAAA1 AAAA1100.01 AAAA1 AAAA11.01 AAAA1 0.01", " aaahihi... ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA10.0-------------------------------------------------.0 AAAA1 AAAA110.01 AAAA1 AAAA110.01 AAAA1 AAAA1100.01 AAAA1 AAAA11.01 AAAA1 0.01" + "'", str2, "AAAA10.0-------------------------------------------------.0 AAAA1 AAAA110.01 AAAA1 AAAA110.01 AAAA1 AAAA1100.01 AAAA1 AAAA11.01 AAAA1 0.01");
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray9 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray9, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray9, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.subarray(charArray14, (int) ' ', 0);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, 'a');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray19);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray19);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray19);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray19, '4', 200);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "10110010", charArray19);
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("1      AAAA1      AAAA10", "{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444444444444444444444444444444{44,44,4}{44,44,4}{44,44444{44,44,4}{44,44,4}{44,44", "  10110010AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444{44,44,4}{44,44,4}{44,44444{44,44,4}{44,44,4}{44,44" + "'", str2, "444444444444444444444444444444444444444444{44,44,4}{44,44,4}{44,44444{44,44,4}{44,44,4}{44,44");
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
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
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray22, (float) 57, (int) '#');
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
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) charArray0);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, ' ');
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("           ...", "{-1}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        float[] floatArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) 23, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) intArray6);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) '#', 0);
        int[] intArray12 = new int[] { (-1), '4', (byte) 10, 1 };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray12, (int) (short) 100, 100);
        int[] intArray16 = new int[] {};
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray16, (int) (short) 1);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.subarray(intArray16, (int) (short) 0, (int) (short) -1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray12, intArray16);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.add(intArray12, 0);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, (int) 'a', 0);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, (int) (byte) 0, 2);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray12);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.clone(intArray31);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.clone(intArray32);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 52, 10, 1]");
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("... AA-11001011000-11001011000-11001011000-11 AAAHIHI...  ", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "011000-11 AAAHIHI...  " + "'", str2, "011000-11 AAAHIHI...  ");
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        short[] shortArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray13, false);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray23, true);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[true, false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, true, false, true]");
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", "aa####10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (short) -1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                aaa                                 ", strArray3);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray21 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.add(longArray21, (long) (short) 1);
        long[] longArray27 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(longArray27, (long) ' ');
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray27);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.addAll(longArray13, longArray27);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray13);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray32);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray33);
        java.lang.Long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toObject(longArray33);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) longArray35, (int) (short) 100);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray35, (long) 6);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray39);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0]");
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaahi######################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahi######################" + "'", str2, "aaahi######################");
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1      AAAA1      AAAA10", "AAAA1      AAAA");
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aAa       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray15, 35, (int) (short) -1);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, false, (int) '#');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray15);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, false, 2);
        boolean[] booleanArray31 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray36 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray36, false);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray38);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray38);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray31, booleanArray38);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray31);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.add(booleanArray31, (int) (short) 1, false);
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray15, booleanArray45);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, false, (int) (short) 1);
        boolean[] booleanArray50 = null;
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray15, booleanArray50);
        boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, false);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray53, true);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[false, false, true, true, false, true, false, false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray53), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray5 = null;
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray1, floatArray5);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.clone(floatArray5);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0]");
        org.junit.Assert.assertNull(floatArray7);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) (short) 0, (int) (short) -1);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 3);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[3]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "{0,0,10,1,10,0}");
        boolean[] booleanArray11 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray18 = new boolean[] { false, false, true, true, false, true };
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray11, booleanArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray18, false);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray18, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray18);
        java.lang.Boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray25);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray26, "0");
        java.lang.Boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray26);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray29, false);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray2, (java.lang.Object[]) booleanArray29);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "false0false0true0true0false0true" + "'", str28, "false0false0true0true0false0true");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        java.lang.Float[][][][] floatArray0 = new java.lang.Float[][][][] {};
        java.lang.Float[][][][][] floatArray1 = new java.lang.Float[][][][][] { floatArray0 };
        java.lang.Float[][][][][] floatArray2 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) (short) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray5);
        double[] doubleArray9 = new double[] {};
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) '4', (double) (byte) -1);
        double[] doubleArray17 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 100, (double) 100);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray9, 0, 0);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) 1L);
        double[] doubleArray27 = new double[] {};
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) '4', (double) (byte) -1);
        double[] doubleArray35 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray27, doubleArray35);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) 100, (double) 100);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray9, doubleArray27);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray27, (double) (-1L));
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) (short) 10, 0);
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray5, (java.lang.Object) doubleArray27);
        java.lang.Float[][][][][] floatArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray2, (java.lang.Object) int46);
        java.lang.Float[][][][] floatArray48 = new java.lang.Float[][][][] {};
        java.lang.Float[][][][][] floatArray49 = new java.lang.Float[][][][][] { floatArray48 };
        java.lang.Float[][][][][] floatArray50 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray49);
        java.lang.String[] strArray53 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray53, (java.lang.Object) (short) -1);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray53);
        double[] doubleArray57 = new double[] {};
        int int60 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray57, (double) '4', (double) (byte) -1);
        double[] doubleArray65 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray57, doubleArray65);
        int int69 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray57, (double) 100, (double) 100);
        double[] doubleArray72 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray57, 0, 0);
        int int74 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray57, (double) 1L);
        double[] doubleArray75 = new double[] {};
        int int78 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray75, (double) '4', (double) (byte) -1);
        double[] doubleArray83 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean84 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray75, doubleArray83);
        int int87 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray75, (double) 100, (double) 100);
        boolean boolean88 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray57, doubleArray75);
        boolean boolean90 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray75, (double) (-1L));
        int int93 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray75, (double) (short) 10, 0);
        int int94 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray53, (java.lang.Object) doubleArray75);
        java.lang.Float[][][][][] floatArray95 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray50, (java.lang.Object) int94);
        java.lang.Float[][][][][] floatArray96 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray47, floatArray95);
        java.lang.String str98 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray95, "0404104141040");
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertNotNull(floatArray95);
        org.junit.Assert.assertNotNull(floatArray96);
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        char[] charArray0 = null;
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1A10A0A10A1A10A0A0", charArray13);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray13);
        char[] charArray20 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray21 = org.apache.commons.lang3.ArrayUtils.toObject(charArray20);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.clone(charArray20);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI                        ", charArray22);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray22);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray22, '#');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray22);
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
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4,  ]");
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0" + "'", str1, "0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0");
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("Aaa444444444444444444444444444...", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0.0 1.0 100.0 10.0 10.0 -1.0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                AAA", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (byte) 0, (double) 10L);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (short) -1, (double) 10L);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) 115);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray13, false);
        java.lang.Boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray22);
        java.lang.Boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray23);
        java.lang.Boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray23);
        java.lang.Boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray26);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Aaa444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "{-1.0,1.0,0.0,1.0,35.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a" + "'", str1, "0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a");
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                       AAa                          0.0       ", "                              HIHIH", 26);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18, false);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        java.lang.Boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray22, "44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray22);
        java.lang.Object[] objArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) booleanArray22);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray22, false);
        java.lang.Boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray22);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray29, "aaaaaaaaih44444444AAA                                44444444444444444444444444444");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse" + "'", str24, "true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[true, true, true, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "trueaaaaaaaaih44444444AAA                                44444444444444444444444444444trueaaaaaaaaih44444444AAA                                44444444444444444444444444444trueaaaaaaaaih44444444AAA                                44444444444444444444444444444false" + "'", str31, "trueaaaaaaaaih44444444AAA                                44444444444444444444444444444trueaaaaaaaaih44444444AAA                                44444444444444444444444444444trueaaaaaaaaih44444444AAA                                44444444444444444444444444444false");
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH!ih", "                                                                                              aaa", 4);
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) -1, (int) 'a');
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 10);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, (int) (short) -1, 0);
        java.lang.Byte[] byteArray23 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray23);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray24);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) byteArray24, 24);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.add(byteArray24, (byte) 100);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray24, 12, 5);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray24, (byte) 0);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray24, (byte) 100);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray39, (byte) -1, (int) 'a');
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray39);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.clone(byteArray39);
        java.lang.Byte[] byteArray50 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray50);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.add(byteArray51, (byte) 0);
        byte[] byteArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray51);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.contains(byteArray51, (byte) -1);
        byte[] byteArray58 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray51, (byte) 0);
        byte[] byteArray59 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray44, byteArray58);
        byte[] byteArray60 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray24, byteArray44);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1, -1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0, 1, 100, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 0, 1, 1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[10, 1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[-1, 0, 1, 100, 1, 10, 1]");
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                              HIHIH", "                                                                                              aaa{true,false,false,f   h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              HIHIH" + "'", str2, "                              HIHIH");
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("1TRUE   HI", " 0.001 0.1 0.0H!ih 0.001 0.1 0.0", 74, 28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1TRUE   HI 0.001 0.1 0.0H!ih 0.001 0.1 0.0" + "'", str4, "1TRUE   HI 0.001 0.1 0.0H!ih 0.001 0.1 0.0");
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0a0.0a100.0", "true                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0true                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0true                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0false");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray6);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray6, 8, 115);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[]");
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = org.apache.commons.lang3.ArrayUtils.add(intArray3, 168, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 168, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("######A######A", "               aaahihi#..", "AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######A######A" + "'", str3, "######A######A");
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("#####...", "{{ ,#},{ ,#},{ ,#},{ ,#}}                 ", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray15, 35, (int) (short) -1);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, false, (int) '#');
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, true, 21);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
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
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray27, (double) 9, (double) 98);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, 0.0d);
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.add(doubleArray32, (double) 100);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.add(doubleArray32, (double) 0);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0]");
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) (byte) 0);
        float[] floatArray11 = new float[] { (byte) 10 };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray14, (int) (short) 0, (float) (short) -1);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray17, (float) 1L);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray17);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray20, (float) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray20);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray20);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray20, 516, (int) 'a');
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
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("         AAa                ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "###,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,aaaaaaaaaaaaa", 244);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         AAa                " + "'", str4, "         AAa                ");
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4, 164);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        java.lang.Byte[] byteArray26 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray26);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (byte) 0);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray27);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray27);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray20, byteArray27);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray32, (byte) 0);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray32, (int) (byte) 100, (-1));
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray32);
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
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
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
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray21, (float) (byte) -1);
        java.lang.Float[] floatArray31 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray31, 1.0f);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray33);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray24, floatArray33);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.add(floatArray33, (float) 5);
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
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0, 5.0]");
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        java.lang.Float[] floatArray16 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16, 1.0f);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16);
        java.lang.Float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray16);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray16);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray3, floatArray21);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, 25, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 25, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[2.0, 52.0, -1.0, 0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "{1  ,1,-1, ,1, ,97, ,1,1  , }");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                aaa", "aaaaahiaaa", "                      hi!4hi! hi!ahi!ahi!4                      ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0.044444444444444444444444444444                                AAA44444444hiaaaaaaaa1.0444444444444444...", "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("truetruetruefalse", "{-1.0,10.0,35.0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "truetruetruefalse" + "'", str2, "truetruetruefalse");
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                 AAAAA                                                                                               AAAAAA", "00.0..0....0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 AAAAA                                                                                               AAAAAA" + "'", str2, "                                                                 AAAAA                                                                                               AAAAAA");
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("1.0a0.0                              hihih                                                        aaa1.0a0.0                              hihih                                                itrueaaah");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0a0.0                              hihih                                                        aaa1.0a0.0                              hihih                                                itrueaaah" + "'", str1, "1.0a0.0                              hihih                                                        aaa1.0a0.0                              hihih                                                itrueaaah");
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray13, (short) (byte) 1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.clone(shortArray13);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray16, (short) 100);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray16, (short) -1, (int) (byte) 1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 10, (int) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (short) 10, 10);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.clone(floatArray8);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 24, 1000);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray21, (float) (short) 100);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(floatArray21, (float) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        java.lang.Character[] charArray7 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, ' ');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, 'a');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.add(charArray12, '#');
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1110", charArray14);
        char[] charArray23 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.add(charArray23, 'a');
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray23, '#');
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.subarray(charArray23, (int) 'a', 35);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                aaa", charArray23);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray14, charArray23);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "{-1,10,0,10,1,10,0,0}", charArray23);
        char[] charArray42 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.add(charArray42, 'a');
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.add(charArray42, ' ');
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray42);
        int int48 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray47);
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.clone(charArray47);
        int int50 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa...ihihaaa", charArray49);
        int int51 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) charArray49);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.contains(charArray49, 'a');
        java.lang.Character[] charArray62 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray62, '4');
        boolean boolean65 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0.0                                                                AAA                                 1.0                                                                AAA                                 100.0                                                                AAA                                 10.0                                                                AAA                                 10.0                                                                AAA                                 -1.0", charArray64);
        boolean boolean66 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-,-,-", charArray64);
        char[] charArray67 = org.apache.commons.lang3.ArrayUtils.addAll(charArray49, charArray64);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray23, charArray49);
        int int70 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray23, ' ');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "##4a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "##4a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, 4, a, #, #]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 7 + "'", int50 == 7);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 6 + "'", int51 == 6);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), " 4 aa4a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), " 4 aa4a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[ , 4,  , a, a, 4, a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
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
        java.lang.String str82 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) longArray75, "{97,0,1,100,0}");
        org.apache.commons.lang3.ArrayUtils.reverse(longArray75);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[0, 1, 0, -1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[0, -1, -1, 1, 0, 100, 1, 0, 97, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 4 + "'", int79 == 4);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[-1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "{100,1,-1,0,1,0}" + "'", str82, "{100,1,-1,0,1,0}");
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        short[] shortArray25 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray25, (short) (byte) 0, (-1));
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.add(shortArray25, (short) (byte) -1);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.add(shortArray25, (short) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray25);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.clone(shortArray25);
        java.lang.Short[] shortArray37 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray37, (short) 1);
        short[] shortArray46 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray46, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray46);
        short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray39, shortArray46);
        java.lang.Short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray51);
        java.lang.Short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray52);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray53);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.add(shortArray54, (short) 0);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray54);
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray34, shortArray54);
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.add(shortArray58, (int) (byte) 0, (short) (byte) 100);
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray58, (short) 0);
        short[] shortArray65 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray58, (short) (byte) 1);
        short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.add(shortArray58, (int) (short) 0, (short) 1);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray18, shortArray68);
        short[] shortArray71 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray18, (short) (byte) 1);
        short[] shortArray78 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int81 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray78, (short) (byte) 0, (-1));
        short[] shortArray83 = org.apache.commons.lang3.ArrayUtils.add(shortArray78, (short) (byte) -1);
        short[] shortArray85 = org.apache.commons.lang3.ArrayUtils.add(shortArray78, (short) (byte) 1);
        short[] shortArray87 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray85, (short) (byte) 1);
        short[] shortArray88 = org.apache.commons.lang3.ArrayUtils.clone(shortArray87);
        short[] shortArray89 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray71, shortArray87);
        short[] shortArray91 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray89, (short) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[100, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 13 + "'", int63 == 13);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[0, 10, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[1, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray78), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray83), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray85), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray87), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray88), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray89), "[-1, 10, 0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray91), "[-1, 10, 0, 10, 10, 0, 1]");
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-1011001", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-1011001" + "'", str2, "-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-10110010-1011001-1011001-1011001");
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 1.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        java.lang.Float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray10, (float) (byte) 100);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray10);
        java.lang.Float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray15);
        java.lang.Float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray15);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray17);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray18, (float) (short) 100);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444{-1,10,0,10,1,10,0,0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("################################################################################################", "  4444444444444444444444444...   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "      aaaA");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaa                                ", strArray4);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "100.00.0-1.0");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a", " hi!4hi! hi!ahi!ahi!4");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("      AAAA1      A", strArray4, strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi]");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "      AAAA1      A" + "'", str12, "      AAAA1      A");
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("100 1TRUE   HI", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                            AAAa", "10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{1", "falseAAHIfalseAAHItrueAAHIfalseAAHIfalse");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ih44444444AAA                                44444444444444444444444444444", (int) (short) -1, "......");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih44444444AAA                                44444444444444444444444444444" + "'", str3, "ih44444444AAA                                44444444444444444444444444444");
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
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
        boolean[] booleanArray43 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray48 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray48, false);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray50);
        boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray50);
        boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray43, booleanArray50);
        java.lang.Boolean[] booleanArray54 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray53);
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray54);
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray54);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray37, (java.lang.Object) booleanArray56);
        java.lang.Object[] objArray58 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) charArray37);
        java.lang.String[] strArray62 = org.apache.commons.lang3.StringUtils.split("       AAA                  ", "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrAAArrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", 25);
        int int64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray37, (java.lang.Object) "       AAA                  ", 7);
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
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray53), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "falsefalsetruefalsefalsetruetruetruefalse" + "'", str55, "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[[ , #], [ , #], [ , #], [ , #], [ , 4,  , a, a, 4]]");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("{0.0,1.0,100.0,10.0,10.0,-1.0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{0.0,1.0,100.0,10.0,10.0,-1.0" + "'", str1, "{0.0,1.0,100.0,10.0,10.0,-1.0");
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAA                                ", "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrAAArrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray20 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) (byte) 0, (-1));
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) (byte) -1);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray20);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.clone(shortArray20);
        java.lang.Short[] shortArray32 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray32, (short) 1);
        short[] shortArray41 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray41, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray41);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray34, shortArray41);
        java.lang.Short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray46);
        java.lang.Short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray47);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray48);
        short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.add(shortArray49, (short) 0);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray49);
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray29, shortArray49);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.add(shortArray53, (int) (byte) 0, (short) (byte) 100);
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray53, (short) 0);
        short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray6, shortArray53);
        short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[100, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 13 + "'", int58 == 13);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[0, 0, 10, 1, 10, 0, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "", 142);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("{true,true,true,fhi!4hi! hi!ahi!ahi!4lse}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{true,true,true,fhi!4hi! hi!ahi!ahi!4lse}" + "'", str1, "{true,true,true,fhi!4hi! hi!ahi!ahi!4lse}");
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "{1  ,1,-1, ,1, ,97, ,1,1  , ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{1  ,1,-1, ,1, ,97, ,1,1  , " + "'", str1, "{1  ,1,-1, ,1, ,97, ,1,1  , ");
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray13, (short) (byte) 1, (int) ' ');
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray13);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray17, 106, 1);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[]");
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
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
        long[] longArray31 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.add(longArray31, (long) (short) 1);
        long[] longArray37 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(longArray37, (long) ' ');
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray37);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray33);
        long[] longArray47 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.add(longArray47, (long) (short) 1);
        long[] longArray55 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.add(longArray55, (long) (short) 1);
        long[] longArray61 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.contains(longArray61, (long) ' ');
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.addAll(longArray57, longArray61);
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.addAll(longArray47, longArray61);
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray47);
        long[] longArray67 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray66);
        long[] longArray70 = org.apache.commons.lang3.ArrayUtils.subarray(longArray67, (int) (short) -1, 0);
        long[] longArray71 = org.apache.commons.lang3.ArrayUtils.addAll(longArray41, longArray67);
        long[] longArray73 = org.apache.commons.lang3.ArrayUtils.add(longArray41, (long) '#');
        long[] longArray74 = null;
        long[] longArray80 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray82 = org.apache.commons.lang3.ArrayUtils.add(longArray80, (long) (short) 1);
        long[] longArray86 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean88 = org.apache.commons.lang3.ArrayUtils.contains(longArray86, (long) ' ');
        long[] longArray89 = org.apache.commons.lang3.ArrayUtils.addAll(longArray82, longArray86);
        long[] longArray90 = org.apache.commons.lang3.ArrayUtils.addAll(longArray74, longArray82);
        long[] longArray91 = org.apache.commons.lang3.ArrayUtils.addAll(longArray73, longArray82);
        java.lang.Class<?> wildcardClass92 = longArray73.getClass();
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
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1, 35]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1, 35, 97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray11, (short) 100);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray18);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 10, 1, 10, 0, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = new double[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray3);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) 5, (double) (short) 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 18);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0);
        int[] intArray17 = new int[] {};
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray17, (int) (short) 1);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray17, 100);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray17, (int) '#', 0);
        int[] intArray29 = new int[] { (-1), '4', (byte) 10, 1 };
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray29, (int) (short) 100, 100);
        int[] intArray33 = new int[] {};
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray33, (int) (short) 1);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.subarray(intArray33, (int) (short) 0, (int) (short) -1);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray29, intArray33);
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.add(intArray29, 0);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray29, (int) 'a', 0);
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.addAll(intArray17, intArray29);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray16, intArray17);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray16);
        java.lang.String str49 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray16, "                                                                AAA                                 ");
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.add(intArray16, (int) (byte) 0, 28);
        java.lang.Integer[] intArray53 = org.apache.commons.lang3.ArrayUtils.toObject(intArray16);
        int[] intArray54 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray53);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray53);
        int[] intArray57 = org.apache.commons.lang3.ArrayUtils.add(intArray55, 626);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "{-1,52,10,1,0}" + "'", str49, "{-1,52,10,1,0}");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[28, -1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, 52, 10, 1, 0, 626]");
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " aaahihi... ", "AAAA1      AAAA             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,", 22, "aaahihi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1," + "'", str3, "444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,");
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
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
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray9);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray22, (byte) 10);
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.04444444", ",4,4,4}a,#,a{", 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "", (java.lang.CharSequence) "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0" + "'", charSequence2, "                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray2, (byte) 100);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, 1, (byte) 0);
        java.lang.Byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray12);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.clone(byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray14, (byte) 100);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray14);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 0, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) charArray9);
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray13, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAA10.0a1.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ihAAAAAAAAAAAAA", 626, 74);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " 4 aa4a" + "'", str12, " 4 aa4a");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("a#a444 4 aa4a", "1{97,0,1,100,0} 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 1{97,0,1,100,0}-1 100 1 0 {97,00.0A100,0}-1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("-1-110010110000-110010110001-11001011000100-110010110001", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1-110010110000-110010110001-11001011000100-110010110001" + "'", str2, "-1-110010110000-110010110001-11001011000100-110010110001");
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "1.0a0.0                              HIHIH                                                      ...", (java.lang.CharSequence) "{-1}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("00101100", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(",4,4,4}a,#,a{", 871);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ",4,4,4}a,#,a{" + "'", str2, ",4,4,4}a,#,a{");
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAH                                                                                                                                          ", "      AAAA1      AAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        boolean[] booleanArray2 = new boolean[] { true, false };
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.add(booleanArray2, 8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, false]");
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
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
        long[] longArray42 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.add(longArray42, (long) (short) 1);
        long[] longArray48 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.contains(longArray48, (long) ' ');
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.addAll(longArray44, longArray48);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.addAll(longArray34, longArray48);
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray34, 0L);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray34);
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray34);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray59 = org.apache.commons.lang3.ArrayUtils.add(longArray25, (-1), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
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
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0]");
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("{0.0,1.0,100.0,10.0,10.0,-1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{0.0,1.0,100.0,10.0,10.0,-1.0" + "'", str1, "{0.0,1.0,100.0,10.0,10.0,-1.0");
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray16 = new char[] { '4', ' ', ' ' };
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.addAll(charArray7, charArray16);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      a444#a       ", charArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, ' ', 36);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4,  , a, a, 4, 4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!HI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        long[] longArray2 = new long[] { 10, 93 };
        long[][] longArray3 = new long[][] { longArray2 };
        long[] longArray6 = new long[] { 10, 93 };
        long[][] longArray7 = new long[][] { longArray6 };
        long[] longArray10 = new long[] { 10, 93 };
        long[][] longArray11 = new long[][] { longArray10 };
        long[] longArray14 = new long[] { 10, 93 };
        long[][] longArray15 = new long[][] { longArray14 };
        long[][][] longArray16 = new long[][][] { longArray3, longArray7, longArray11, longArray15 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray16);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, 93]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10, 93]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[10, 93]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[10, 93]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", "ESLAFHAAAEAAAAAA                                                                                               AAAAA                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray13, (java.lang.Object) (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) longArray13);
        java.lang.Long[] longArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray13);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray13);
        java.lang.Long[] longArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) longArray20);
        java.lang.Long[] longArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray20);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray22, (long) 13);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, 1, 0, -1, 1, 100]");
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("         1A10A0A0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1A10A0A0" + "'", str1, "1A10A0A0");
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        java.lang.Short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19, (short) (byte) 10);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray22, (short) 1, (int) (short) 10);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray22);
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
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.remove(charArray6, 5);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.clone(charArray6);
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray12, "hi!");
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " hi!4hi! hi!ahi!ahi!4" + "'", str14, " hi!4hi! hi!ahi!ahi!4");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4]");
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
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
        long[] longArray31 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.add(longArray31, (long) (short) 1);
        long[] longArray37 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(longArray37, (long) ' ');
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray37);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray33);
        long[] longArray47 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.add(longArray47, (long) (short) 1);
        long[] longArray55 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.add(longArray55, (long) (short) 1);
        long[] longArray61 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.contains(longArray61, (long) ' ');
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.addAll(longArray57, longArray61);
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.addAll(longArray47, longArray61);
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray47);
        long[] longArray67 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray66);
        long[] longArray70 = org.apache.commons.lang3.ArrayUtils.subarray(longArray67, (int) (short) -1, 0);
        long[] longArray71 = org.apache.commons.lang3.ArrayUtils.addAll(longArray41, longArray67);
        int int73 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray41, (long) 24);
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray41, (long) 32);
        int int77 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray41, (long) 55);
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
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[97, 0, 1, 100, 0, 97, 0, 1, 100, 0, 1, 97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "##1      AAAA1      AAAA1####1      AAAA1      AAAA1####1      AAAA1      AAAA1##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##1      AAAA1      AAAA1####1      AAAA1      AAAA1####1      AAAA1      AAAA1##" + "'", str1, "##1      AAAA1      AAAA1####1      AAAA1      AAAA1####1      AAAA1      AAAA1##");
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "a                                                                      aaa                                                                                                     a               a a                                 a a                                 a   a                                 a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a                                                                      aaa                                                                                                     a               a a                                 a a                                 a   a                                 a" + "'", str1, "a                                                                      aaa                                                                                                     a               a a                                 a a                                 a   a                                 a");
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0.0 1.0 100.0 hi!H0.0 1.0 100.0 ", 165, 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0 1.0 100.0 hi!H0.0 1.0 100.0 " + "'", str3, "0.0 1.0 100.0 hi!H0.0 1.0 100.0 ");
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA", " hi!4hi! hi!ahi!ahi!4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA" + "'", str2, "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA");
    }
}

