import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest103 {

    public static boolean debug = false;

    @Test
    public void test51501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("TRUE-1.0aaaaA44444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE-1.0aaaaA44444..." + "'", str1, "TRUE-1.0aaaaA44444...");
    }

    @Test
    public void test51502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!", 172, "                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!" + "'", str3, "Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
    }

    @Test
    public void test51503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0", 551, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                               A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                                                                                                                                                                                          " + "'", str3, "                                                                                                                                                                                               A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                                                                                                                                                                                          ");
    }

    @Test
    public void test51504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51504");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(224, 726, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test51505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444444444...4444444444........444444444444444444", "0true-1.0A A A A                        a44444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444...4444444444........444444444444444444" + "'", str2, "444444444...4444444444........444444444444444444");
    }

    @Test
    public void test51506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444", "4444444444444444444444444444444444444444444 true - 1 . 97 . 444444444444444444444444444 ... 4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test51507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                   ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51508");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     a    ", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4true-1.4497.4444444444444444444444444444", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A    ", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("...4444444444444444true444444444444444444444444444444444444444444444444444444444true444444444...", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test51509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51509");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                      4444400       0444444                                      ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test51510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                       aaaaaaa      a         a         a         a         aaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       aaaaaaa      a         a         a         a         aaaaaaa" + "'", str2, "                                       aaaaaaa      a         a         a         a         aaaaaaa");
    }

    @Test
    public void test51511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51511");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  4                   ", "a                             ###    A   hi!hi!...###    A   hi!hi!...###", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                  Hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51513");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test51514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51514");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 959);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AHI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str1, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test51516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51516");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0 TRU...UE-1.0097.044444444444444444444444444444444...4444", "0TRUE-1.00-1.0097.0                                           ", 854);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51517");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("     ...         aaaa0aaaaa44444", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test51518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "...A     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...A     ..." + "'", str1, "...A     ...");
    }

    @Test
    public void test51519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51519");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (double) 549L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 549.0d + "'", double2 == 549.0d);
    }

    @Test
    public void test51520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51520");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                     a0000000000");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test51521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51521");
        char[] charArray9 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0AAAAa44444...", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test51522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51522");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                         ", "4444444...AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                         ");
    }

    @Test
    public void test51524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51524");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4444.444444444.4444444444444444444444444444444444444444444444444444410004444.444444444.444444444             AAAA0AAAAA                 AAAA0AAAAA                 AAAA0AAAAA                 AAAA0AAAAA  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA   hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA   hi!hi!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA   hi!hi!");
    }

    @Test
    public void test51526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51526");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444a  A      A                            100.0                                                     AAAA", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51527");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     AAAAAA0AAAAAAAAAAAAA444444...                                                                                                                                                                                                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                               TRUE  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAA0AAAAAAAAAAAAA444444...                                                                                                                                                                                                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                               TRUE" + "'", str1, "AAAAAA0AAAAAAAAAAAAA444444...                                                                                                                                                                                                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                               TRUE");
    }

    @Test
    public void test51529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51529");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaa...44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51530");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hihihihihihihihihihi...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51531");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA       ...", "44444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51532");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...4444444...4444444...4444444...44444...", "                                                                               aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51533");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51534");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                       A0                                                                                                           ", "...T0444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51535");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                   aaaaa0aaaa                                                                         ", "####################################################################################################################################################################################################################################################...t0...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa", "              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa");
    }

    @Test
    public void test51537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA     ", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA..." + "'", str2, "AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA...");
    }

    @Test
    public void test51538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0TRUE-1.0aaaaA44444...", "    4444444444444444444444444444   aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    4444444444444444444444444444   aaaaaaa" + "'", str2, "    4444444444444444444444444444   aaaaaaa");
    }

    @Test
    public void test51539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51539");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!hi!hi!hi!hi!hi!hi!hi!hi!hi...A", 111, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51540");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(61, 39, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test51541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51541");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ", "AAAAAAAAAAAA0TRUE-1.0097.     A    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097.     A    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097.     A    AAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51542");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                     0         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAA", "4444444444444...4444                       44444444444444444444...4444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444att-------ttt-------ttt-------t", 132);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444att-------ttt-------ttt-------t" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444att-------ttt-------ttt-------t");
    }

    @Test
    public void test51545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51545");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                       true  ", "4444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51546");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("......4444444...4444444...4444444.....", "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "......4444444...4444444...4444444....." + "'", str4, "......4444444...4444444...4444444.....");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test51547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51547");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0true-1.0097.044444444444444444444444444...a");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51548");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "A    4444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-10097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################", 86, 833);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################" + "'", str3, "                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################");
    }

    @Test
    public void test51550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51550");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("          aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           ", "  A    ", 750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 448);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                            !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                            !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test51552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-E" + "'", str1, "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
    }

    @Test
    public void test51553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51553");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.0", (int) (byte) 100);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("h!ih!h!ih!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test51554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(" . 97 . 4444444444444444444444444444444444444444444", "...0aAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " . 97 . 4444444444444444444444444444444444444444444" + "'", str2, " . 97 . 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test51555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51555");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00       000       000       00", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 173);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                 aaaa0aaaaa    ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test51556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51556");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0000400004...                  4...4...97.4...true-1.4...", "41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51557");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!7.44444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51558");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("    a   HI!HI!..", (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test51559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51559");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ", "a004444444000444444400044444440");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test51560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51560");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(106, 188, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void test51561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51561");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 833, 329L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test51562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51562");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       ", 387, 56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...444444444444444444444444444444");
    }

    @Test
    public void test51564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51564");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", (java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "HI!", 56, 47);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concatWith("  ...", (java.lang.Object[]) strArray6);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa", strArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test51565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("00       0true00       0-00       000                                                       ", "A    44444444444444444444444444444444444444444440true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                            a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                            a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                            a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51567");
        int[] intArray6 = new int[] { (short) 10, 'a', 266, 32, 24, (short) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 266, 32, 24, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 266 + "'", int8 == 266);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 266 + "'", int11 == 266);
    }

    @Test
    public void test51568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51568");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 3, 589);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51569");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(".7900.1-eu", "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51570");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 86, 173L, (long) 7);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 7L + "'", long3 == 7L);
    }

    @Test
    public void test51571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51571");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51572");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.000    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.000    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                               ...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51573");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("...0...4444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test51574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444794444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444eurt4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444", 721);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444794444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444eurt4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444794444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444eurt4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444");
    }

    @Test
    public void test51575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51575");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("44444444444444444444444444444444444444444AAAAAAAAA...4444444                                                                                                                                                                                                                                                                                                                                                                            ", "                       a44444444444444444444...4444                       a44444444444444444444...444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51576");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AHI!HI!...TRUEAHI!HI!...-AHI!HI!...AHI!HI!...AHI!HI!...97AHI!HI!...AHI!HI!...", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51577");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                      aaaa 0 aaaaa               ", (java.lang.CharSequence) "44444aaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                      aaaa 0 aaaaa               " + "'", charSequence2, "                      aaaa 0 aaaaa               ");
    }

    @Test
    public void test51578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44444aaaaa0aaaa         ...     ", ".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.00", 665);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444aaaaa0aaaa         ...     " + "'", str3, "44444aaaaa0aaaa         ...     ");
    }

    @Test
    public void test51579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51579");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...t0444444444444444444444444444.....#...#4#a#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test51580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51580");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aa100.0aaaa", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("         a        ", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test51581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51581");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444097.0                       a                    ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444097.0                       a                    " + "'", charSequence2, "0true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444097.0                       a                    ");
    }

    @Test
    public void test51582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       aaaaa0aaaa                                          aaaaa0aaaa                                          aaaaa0aaaa                     44                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str1, "...       aaaaa0aaaa                                          aaaaa0aaaa                                          aaaaa0aaaa                     44                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test51583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51583");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.044444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                               0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51585");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaa0AAAA", 38, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa0AAAA444444444" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa0AAAA444444444");
    }

    @Test
    public void test51586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51586");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", "                                                                                                aaaa");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray9, strArray12);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     A    44", strArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("                                         AAAA0AAAA", strArray4, strArray9);
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0", strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0" + "'", str13, "100.0");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                         AAAA0AAAA" + "'", str17, "                                         AAAA0AAAA");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test51587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51587");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     a    ", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 44 + "'", int17 == 44);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test51588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51588");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0AAAAaTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaaTR4444A44444aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaa", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAhI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 821 + "'", int2 == 821);
    }

    @Test
    public void test51589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51589");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...00.7900.1-eurt00.79......aaaa", "                                           444444444444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "########...aaaa0aaaaa44444#########", 541, 133);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test51590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51590");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0##RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0", (java.lang.CharSequence) "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("A00       000       000       0", "                                                                                                                          4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A00       000       000       0" + "'", str2, "A00       000       000       0");
    }

    @Test
    public void test51592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51592");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa", "        0aaaa         ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa" + "'", str3, "0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa");
    }

    @Test
    public void test51593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51593");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51594");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                    100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                ", "4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     a    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     a    aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51595");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("-1.0097.0", 817, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51596");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "...A..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51597");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51598");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", "!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaa", 371);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("..7900                                                                                              ", 444);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                        ..7900                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                        ..7900                                                                                              ");
    }

    @Test
    public void test51600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51600");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51601");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test51603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51603");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "..", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444..444444444444..444444444444..444444444444..444444444444..444444444444..444444444444444", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "true4-4449744                                       ", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("...                 ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test51604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51604");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...##############################################...", "rue-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ", 41);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51605");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!hi!hi!hi!hi!hi!hi!hi!hi!hi...A", "                       #a######################...##############################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test51606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA..." + "'", str1, "AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA...");
    }

    @Test
    public void test51607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                         0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                                                                         ", "                                            100.01aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...4444444...4444444...41aaaaaaaaaaa4444444...444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51608");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test51609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "                                                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test51610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51610");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("A444444               a   hi!hi!...A444444               a   hi!hi!...A444444               a   hi!hi!......", "                                  ", (int) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 314, 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test51611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51611");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...44444...true-1.4444444...97.4444444...4444444444444...4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444...true-1.4444444...97.4444444...4444444444444...4" + "'", str1, "...44444...true-1.4444444...97.4444444...4444444444444...4");
    }

    @Test
    public void test51612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!", "TRUE4-4449744");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!" + "'", str2, "#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!");
    }

    @Test
    public void test51613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                           0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.790...", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.790..." + "'", str3, "                                           0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.790...");
    }

    @Test
    public void test51614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA", 456);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA");
    }

    @Test
    public void test51615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                            4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44", "AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44" + "'", str2, "                                                                                            4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44");
    }

    @Test
    public void test51616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51616");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("rue-1.0097.00trA0t", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51617");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test51618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51618");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH A                                       74.4004true4-414.400974.4004tr4 4A4 44444444444444444444444444444444444444444444444444474.4004true4-414.400974.4004tr4 4A4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                    ", "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                    " + "'", str3, "                                                    ");
    }

    @Test
    public void test51620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51620");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "1                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51621");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", '#');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("hi", "                                ", 7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("                                         ...444444440tr...                                          ", strArray5, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444", strArray5);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("                     ", strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "", 182, 668);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                         ...444444440tr...                                          " + "'", str10, "                                         ...444444440tr...                                          ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444" + "'", str15, "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
    }

    @Test
    public void test51622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("###########################################################################################################################################################################################################################0true-1.0097############################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########################################################################################################################################################################################################################0true-1.0097############################################################################################################################################################################################################################" + "'", str1, "###########################################################################################################################################################################################################################0true-1.0097############################################################################################################################################################################################################################");
    }

    @Test
    public void test51623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51623");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                             10000#####10000###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10000#####10000###" + "'", str1, "10000#####10000###");
    }

    @Test
    public void test51624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51624");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51625");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("true -   97  ", "###################################    a   hi!hi!...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51626");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test51627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                 4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", 387);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                  4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                                                  " + "'", str2, "                                                                                                                  4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                                                  ");
    }

    @Test
    public void test51628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51628");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444true-1....4444497....444444444444444444444444444444444444444444444444", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test51630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                               hI!                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaa" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaa");
    }

    @Test
    public void test51631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAAA", ".0097.00true-1.00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAA" + "'", str2, "AAAAA");
    }

    @Test
    public void test51632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A", "#######################################4true4-4449744########################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51633");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    a   HI!HI!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51634");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                      A         A         A         A         A      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51635");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...aaaaaaaaaaa", "###    a   HI!HI!..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51636");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 465, 0L, (long) 45);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 465L + "'", long3 == 465L);
    }

    @Test
    public void test51637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.0097.", 534, "         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.0097." + "'", str3, "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.0097.");
    }

    @Test
    public void test51638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51638");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("true-1971                                                                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51639");
        char[] charArray18 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray18);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray18);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray18);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray18);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray18);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray18);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...", charArray18);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", charArray18);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray18);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                       0aaa                        ", charArray18);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaa", charArray18);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.00-1.0097.04444444444444444444444444444444444444444444", charArray18);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.00true-1.97.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 45 + "'", int22 == 45);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19 + "'", int30 == 19);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test51640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51640");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51641");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...44444444444...                                                                                                                                                                                                     ...", 468, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51642");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("          ...........................................          ........................................................................................... 4    4 4 4 4    4 4  4    4 4 4 4    4 4  4    4 4 4 4    4 4  4  4.4A4........ 4    4 4 4 4    4 4  4    4 4 4 4    4 4  4    4 4 4 4    4 4  4  4.4A4........ 4    4 4 4 4    4 4  4    4 4 4 4    4 4  4    4 4 4 4    4 4  4  4.4A4........ 4    4 4 4 4    4 4  4    4 4 4 4    4 4  4    4 4 4 4    4 4  4  4.4A4........ 4    4 4 4 4    4 4  4    4 4 4 4    4 4  4    4 4 4 4    4 4  4  4.4A4........ 4    4 4 4 4    4 4  4    4 4 4 4    4 4  4    4 4 4 4    4 4  4  4.4A4........ 4    4 4 4 4 ", "0TRUE-1.0097.04444444444444444444444444440AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0", 463);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51643");
        short[] shortArray6 = new short[] { (byte) 100, (short) -1, (byte) -1, (short) 100, (byte) 10, (short) 10 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, -1, -1, 100, 10, 10]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
    }

    @Test
    public void test51644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4444444...AAAAAAAAA44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51645");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("    a   hi!hi!...", "##################                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51646");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                   ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test51647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51647");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       000       000       00a", 651);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str1, "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test51649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51649");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444444444444444444440TRUE-    ...AAAA0AAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0TRUE-1.0097.0444444444444444444444444444444444444444444", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0TRUE-1.0097.0##########################################" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0TRUE-1.0097.0##########################################");
    }

    @Test
    public void test51651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51651");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa", (int) (byte) 10);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray10, strArray15);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean19 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444a444444444444444444444444", strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("... ... ... ... ... ... ... ...4#444hi!hi!hi!h############################...44", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str16, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test51652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51652");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                      41004.404                                                ", "A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51653");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test51654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51654");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(975L, (long) 12, (long) 463);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
    }

    @Test
    public void test51655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("true-1....97true-1....97####################################################################################################################################################################", 260, "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                                                                                                                                                                                                                44444444444444444440true-1.0097");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1....97true-1....97####################################################################################################################################################################Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                " + "'", str3, "true-1....97true-1....97####################################################################################################################################################################Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                ");
    }

    @Test
    public void test51656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51656");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray14 = new char[] { '4', '4', ' ' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence7, charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " A", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                          0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ", charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0000400004...                  4...4...97.4...true-1.4...", charArray14);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("                                                   aaaaa0aaaa                                                                         ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test51657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51657");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0444444444444444444444444444444444444444444", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0444444444444444444444444444444444444444444" + "'", str3, "0444444444444444444444444444444444444444444");
    }

    @Test
    public void test51658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51658");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                          aaaa0aaaaa         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                          aaaa0aaaaa         \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51659");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###########################################################...44444444444......############################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44                             ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51660");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", (java.lang.CharSequence) "4444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51661");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Arrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAA", " true 1.  97.                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA" + "'", str2, "AAAA");
    }

    @Test
    public void test51663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("..    0TRUE-1.00.00TRUE-1.00.00TRUE-1.00.00TR    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   a        " + "'", str2, "   a        ");
    }

    @Test
    public void test51664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51664");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", 456, 926);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097." + "'", str3, "440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test51665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "###############################################################################################################################################################################################################################                                                                                                                                                                        ###############################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.a   HI!HI!...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0", "4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.a   HI!HI!...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0" + "'", str2, "0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.a   HI!HI!...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0");
    }

    @Test
    public void test51667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51667");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#A#44444444444444444444#...#44444444444444444444444444444444444444444444", 19, "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaaaaaaaaaaaaaaaaaaaaa                                 444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#A#44444444444444444444#...#44444444444444444444444444444444444444444444" + "'", str3, "#A#44444444444444444444#...#44444444444444444444444444444444444444444444");
    }

    @Test
    public void test51668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51668");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI4uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                 ", 141, 554);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51669");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(98L, 608L, (long) 669);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 669L + "'", long3 == 669L);
    }

    @Test
    public void test51670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0true-1.0097...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 368);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test51671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                      AAAAAAAAAAAAAAAAAAAAAAAA", "          h!ih!h!ih!HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                      AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test51672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51672");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...aaaa...44444444444444444true-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hitrue-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hitrue-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hitrue-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hitrue-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hitrue-97true-97true-97true-97true-9");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51673");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa                                                                                                                                                                                     ", "                                                                                  ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!7.44444444444444444444444444444444444444444444                                                                                   ", "                                                                                                                                                               0TRUE-1 0097 0                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa                                                                                                                                                                                     " + "'", str3, "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa                                                                                                                                                                                     ");
    }

    @Test
    public void test51674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################", "   !    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test51675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51675");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "004444444000444444400044444440011");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51676");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                      hI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444TRUE-1.497.44444444444444444444444444444444444444444444 ", "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444TRUE-1.497.44444444444444444444444444444444444444444444 " + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444TRUE-1.497.44444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test51678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51678");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatt-------ttt-------ttt-------taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51680");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test51681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51681");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test51682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51682");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444440TRUE-1.0097.4444444444444444444444444444444444444444444440TRUE-1.0097.4444444444444444444444444444444444444444444440TRUE-1.0097.4444444444444444444444444444444444444444444440TRUE-1.0097.4444444444444444444444444444    A   hi!hi!..                                                                                                                                                                                                                                                                                                                                                                                                                 ", "                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ", 77);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51683");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0##RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0##RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0" + "'", charSequence2, "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0##RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0");
    }

    @Test
    public void test51684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51684");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51685");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                                                                                                                                                                                                                            !IH                                                                                                                                                                                                                                                                                                                                            ", "AAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51686");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaa..." + "'", str1, "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaa...");
    }

    @Test
    public void test51687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51687");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444444444444444444true4444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444true4444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444tru" + "'", str1, "444444444444444444true4444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444true444444444444444444444444444444444444444444444444444444444tru");
    }

    @Test
    public void test51688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                     0.001                            a      a  444440444                                                     0.001                            a      a  444440444                                                     0.001                            a      a  444440444                                                     0.001                            a      a  444440444                                                     0.001                            a      a  444440444                                                     0.001                            a      a  444440444                                                     0.001                            a      a  ", "AAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test51689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51689");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...                       ...", "            ...4...4444444...4444444...4444444                                                                                                                          0                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51690");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test51691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51691");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51692");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                      0.001                                                                                     0.", " 497.4true-1.4I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 958);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51693");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100.0#####100.0##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51694");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(".0097.00TRUE-1.0097.00TRUE-1.0097.00TR.0097.00TRUE-1.0097.00TRUE-1.0097.00TR.0097.00TRUE-1.0097.00TRUE-1.0097.00TR.0097.00TRUE-1.0097.00T0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test51695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51695");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                      100.0                                                ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test51696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51696");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0TRUE-1.00-1.0097.0                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test51697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51697");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ", "...a..", 98);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.", strArray3, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 164, 434);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 164");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097." + "'", str8, "44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.");
    }

    @Test
    public void test51698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51698");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444                                           " + "'", str1, "4444                                           ");
    }

    @Test
    public void test51699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     4" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     4");
    }

    @Test
    public void test51700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51700");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "true                                         TRUE-1                                                                                                  ", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51702");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4.0f, (double) 465L, (double) 667L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test51703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51703");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0TRUE-1a0097a0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0TRUE-1a0097a0" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0TRUE-1a0097a0");
    }

    @Test
    public void test51704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51704");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 467, 589.0d, (double) 750);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 467.0d + "'", double3 == 467.0d);
    }

    @Test
    public void test51705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51705");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 117, 402);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444", "                                                                                                     0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test51707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51707");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iH", "", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 57 + "'", int3 == 57);
    }

    @Test
    public void test51708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51708");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                    ...aaaaaaaaaaaaaaaaaaaaaaaa", "100.0aaaa100100.0aaaa.100.0aaaa0100.0", 346);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51709");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444       4444444440", 111, 498);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51710");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...44444...true-1.4444444...97.4444444...4444444444444...", '#');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaa0aaaaa", "A", 48);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                       a", strArray3, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaa0aaaa", 62, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                       a" + "'", str8, "                       a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "...44444...true-1.4444444...97.4444444...4444444444444..." + "'", str13, "...44444...true-1.4444444...97.4444444...4444444444444...");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test51711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51711");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str1, "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test51712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51712");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", 638);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51713");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51714");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ahi!hi!hi!haaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi#!#hi#!#hi#!#haaaaaaaaaaaaaaa#44444#aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "ahi#!#hi#!#hi#!#haaaaaaaaaaaaaaa#44444#aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test51715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51715");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", "Hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.444444444444444444444444444444444444444", 842, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.444444444444444444444444444444444444444" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.444444444444444444444444444444444444444");
    }

    @Test
    public void test51717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("100.0 0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t 100.0 100.0 100.0", "                                                                                         ", "#########.                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0 0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t 100.0 100.0 100.0" + "'", str3, "100.0 0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t 100.0 100.0 100.0");
    }

    @Test
    public void test51718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51718");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ue-1.0097...444444444", 41, 539);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51719");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "...aaaaaaaaaaaaaaa...                                   ", 181);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440tru" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440tru");
    }

    @Test
    public void test51721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH                                                                          44444                                                                        44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51722");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 4, (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test51723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51723");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            ", "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAA" + "'", str1, "aAAAA");
    }

    @Test
    public void test51725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51725");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444TRUE44444444444444444444444444444444444", 957, 959);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  a    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test51727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51727");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", (java.lang.CharSequence) "444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A..." + "'", charSequence2, "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
    }

    @Test
    public void test51728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444" + "'", str2, "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
    }

    @Test
    public void test51729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51729");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test51730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("true-1.00                                           true-1.97.true-1.00                                           true-1.97.true-1.00                                           true-1.97.4444444...444444           AAAAAAAAAAA", 267);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1.00                                           true-1.97.true-1.00                                           true-1.97.true-1.00                                           true-1.97.4444444...444444           AAAAAAAAAAA" + "'", str2, "true-1.00                                           true-1.97.true-1.00                                           true-1.97.true-1.00                                           true-1.97.4444444...444444           AAAAAAAAAAA");
    }

    @Test
    public void test51731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51731");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0AAA079001-EURT00AAA079001-EURT00AAA079001-EURT00AAA079001-EURT00AAA079001-EURT0", 111, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51732");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 107, 150);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51733");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################", 99, 812);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################################################" + "'", str3, "#################################################################################################################################");
    }

    @Test
    public void test51734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51734");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("aaaa0aaaaa", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test51735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51735");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...A..", 150);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51736");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAA", "", 850);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "0                        0true-1.00-1.0097.0444444444444444444444444444444...                                                                                      0                    0                        0true-1.00-1.0097.0444444444444444444444444444444...                                                                                      0                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0                        0true-1.00-1.0097.0444444444444444444444444444444...                                                                                      0                    0                        0true-1.00-1.0097.0444444444444444444444444444444...                                                                                      0                    " + "'", str1, "0                        0true-1.00-1.0097.0444444444444444444444444444444...                                                                                      0                    0                        0true-1.00-1.0097.0444444444444444444444444444444...                                                                                      0                    ");
    }

    @Test
    public void test51738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                       ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test51739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51739");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(371, 125, 996);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 125 + "'", int3 == 125);
    }

    @Test
    public void test51740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51740");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                     aaah                     aaa44444444444444444444", "a   HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     aaah                     aaa44444444444444444444" + "'", str2, "                     aaah                     aaa44444444444444444444");
    }

    @Test
    public void test51742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51742");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                            100.0                                                     AAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test51743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51743");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "         aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51744");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51745");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str1, "TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test51746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51746");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                     AAAA0AAAAA   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("A444444               a   hi!hi!...A444444               a   hi!hi!...A444444               a   hi!hi!......", "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A444444               a   hi!hi!...A444444               a   hi!hi!...A444444               a   hi!hi!......" + "'", str2, "A444444               a   hi!hi!...A444444               a   hi!hi!...A444444               a   hi!hi!......");
    }

    @Test
    public void test51748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ", "AAAAAAAAAAAAAAA                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    " + "'", str2, "A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ");
    }

    @Test
    public void test51749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51749");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("     a    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("aaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 107, 544);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 107");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444" + "'", str4, "aaaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test51750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51750");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("40true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", 817, 657);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04", "              ", "                                                                      0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test51752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444", "tr...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51753");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 ", (java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tre-1.0097.00tru...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA", "              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA" + "'", str2, "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA");
    }

    @Test
    public void test51756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51756");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("00       0", "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", 444);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 72, 854);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 72");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51757");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aa0                                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "       AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAA", (java.lang.CharSequence) "00000e0000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51759");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaa0aaaaaaaaaaaaa444444...                                                                ", "AAAAAAAAAAAA!hi!h!hi!hA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test51760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51760");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 42);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test51761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51761");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                             100.0", "", 330);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "...A ..");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test51762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51762");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("    00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00", (long) 554);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 554L + "'", long2 == 554L);
    }

    @Test
    public void test51763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                    ", "                                             a                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                    " + "'", str2, "                                                                                                                                    ");
    }

    @Test
    public void test51764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   ", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                                                                  " + "'", str2, "a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                                                                  ");
    }

    @Test
    public void test51765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test51766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51766");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT", " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 229);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 533);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51768");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###0.001##");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("0097..##################################....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..0097..##################################", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test51769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51769");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("       TRUE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE" + "'", str1, "TRUE");
    }

    @Test
    public void test51770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51770");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                   rt00.7900.                   ", "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                            a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51771");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...444444444444444444444444444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444", "00 0", 34);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...444444444444444444444444444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...79HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     .1-eurtHHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     44444444444444444..4444444" + "'", str5, "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...444444444444444444444444444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...79HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     .1-eurtHHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     44444444444444444..4444444");
    }

    @Test
    public void test51772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                             A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51773");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(12, 26, 252);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 252 + "'", int3 == 252);
    }

    @Test
    public void test51774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                            100.0                                                     aaaa..", 95, 107);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51775");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "  4444444444444444444444444 true - 1 . 97 . 44444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51776");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("    a   HI!HI!..    a   HI!HI!..    a   HI!HI!..", "...4444444...4444444...4444444...4444444...                                       444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444....");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51777");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR A 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", (java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test51778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51778");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444TRUE-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test51779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51779");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444...AAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...##100.0###aaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "aaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...##100.0###aaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test51781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51781");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 135, (double) 253.0f, (double) 650L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 650.0d + "'", double3 == 650.0d);
    }

    @Test
    public void test51782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51782");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                    97atrue-1.", "", 245);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a", "T00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a" + "'", str2, "a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a");
    }

    @Test
    public void test51784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51784");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("######################################################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#################################################################################################################################################################################################################################################################################################################################################################################################", "aaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test51785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51785");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51786");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00#######000#######000#######0011", 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", "                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("A   hi!hi!", strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("...40true-1.0097.04444444444", strArray11);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("                                 ...", strArray4, strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00#######000#######000#######0011" + "'", str5, "00#######000#######000#######0011");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ..." + "'", str14, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ..." + "'", str15, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                 ..." + "'", str17, "                                 ...");
    }

    @Test
    public void test51787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51787");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    " + "'", str2, "    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ");
    }

    @Test
    public void test51788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51788");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...4444                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51790");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################00   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 668, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################00   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################00   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51792");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray14 = new char[] { '4', '4', ' ' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence7, charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444...", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Aaaaaaaaa", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0aaa", charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "7.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test51793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51793");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aaaaaa0aaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test51794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51794");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                     AAAA0AAAAA                     ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaAAAA0AAAAAaaaaaaaaaaaaaaaaaaaaa...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaAAAA0AAAAAaaaaaaaaaaaaaaaaaaaaa...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test51795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51795");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "E  I00I00TRUE  I00I00TRUE  I00I00TR    A     0TRUE  I00I00TRUE  I00I00TRUE  I00I00TR");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 84 + "'", int1 == 84);
    }

    @Test
    public void test51796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51796");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    ", "1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...", "####################################################################################################################################################################################################################################################...t0444444444444444444444444444...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test51797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51797");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51798");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 267 + "'", int5 == 267);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 267 + "'", int6 == 267);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 267 + "'", int7 == 267);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 267 + "'", int10 == 267);
    }

    @Test
    public void test51799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                         ", 0, 69);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                         " + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                         ");
    }

    @Test
    public void test51800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51800");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                           aaaa0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "           a", 275);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test51801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51801");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test51802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51802");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) (short) 100, (float) 36L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test51803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51803");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("        0aaaa         ", "                                                                                                    ", 202);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "        0aaaa         " + "'", str5, "        0aaaa         ");
    }

    @Test
    public void test51804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51804");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("a   HI!HI!HI!HI!HI!H", "... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51805");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aE444444444444444444444", "                                                                                                                                                         444444...4444444444........4444444444444444444444444444.#######################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51806");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                                                                    4                                                 100.0                                                                             aaaa0aaaaa       ...                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 100.0 aaaa0aaaaa ..." + "'", str1, "4 100.0 aaaa0aaaaa ...");
    }

    @Test
    public void test51807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51807");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" ...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA0.001...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA4                                                                                                                                                                                                                                                                                                            0TRUE-1.0097.0", "04444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51808");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test51809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51809");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                                                                                                     ###    a   HI!HI                                                                                                                                                                                                                                                                                                                                      ", "                                              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 325 + "'", int2 == 325);
    }

    @Test
    public void test51810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51810");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("           A         A         A         A         A         A         A         A         A         A         A         A         A         A ..", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51811");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test51812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51812");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUETRUE    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!HI!HI!HI!HI!HI!H    a   HI!H", "...00true-1.0097.00tru...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...4444444...444444444...", 31, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             0TRUE-1 0097 0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444...444444444...      " + "'", str3, "...4444444...444444444...      ");
    }

    @Test
    public void test51814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("a   HI!HI!HI!HI!HI!H", "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444000true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a   HI!HI!HI!HI!HI!H" + "'", str2, "a   HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test51815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51815");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("7900.1-eurt0444100.0", '4');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                           TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR                            ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void test51816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51816");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", 550, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51817");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaa", "0                                                                                                                                                                                                                                                                         ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aaaaaaaaa" + "'", str4, "Aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Aaaaaaaaa" + "'", str6, "Aaaaaaaaa");
    }

    @Test
    public void test51818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51818");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 147, 24L, (long) 128);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 24L + "'", long3 == 24L);
    }

    @Test
    public void test51819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51819");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0TRUE-1.0097.00T..0TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 750);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51820");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 58, (double) 71, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test51821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...000     ...                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51822");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444440true-1.0097.                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444440true-1.0097." + "'", str1, "44444444444444444440true-1.0097.");
    }

    @Test
    public void test51823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" . 97 . 4444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".97.4444444444444444444444444444444444444444444" + "'", str2, ".97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test51824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51824");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(403.0f, (float) 527, (float) 375);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 375.0f + "'", float3 == 375.0f);
    }

    @Test
    public void test51825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51825");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 17, 632);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaa44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                              " + "'", str3, "aaaaaaaaaaaaaa44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                              ");
    }

    @Test
    public void test51826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "true-1. 97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51827");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                     aaaa0aaaaa                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaa0aaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51828");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                              44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51829");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444", "    a                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test51830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIH!HHIIH!I!IHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII........III", "                        ...ue-1.0097.044444444444444444444444444444444...                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "Aaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa..." + "'", str1, "aaa...");
    }

    @Test
    public void test51832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51832");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(441.0d, 28.0d, (double) 111.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 441.0d + "'", double3 == 441.0d);
    }

    @Test
    public void test51833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51833");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "UE-1.0097...44                                        ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test51834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51834");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI!", 384, 279);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51835");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0true-1044440097044440                                                                                                                                       A    4444444444444", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test51836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51836");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!..." + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
    }

    @Test
    public void test51837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi..444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51838");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                ####################################...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test51839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("100.0aaaa100100.0aaaa.100.0aaaa0100.0", "...44                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0aaaa100100.0aaaa.100.0aaaa0100.0" + "'", str2, "100.0aaaa100100.0aaaa.100.0aaaa0100.0");
    }

    @Test
    public void test51840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51841");
        char[] charArray18 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray18);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray18);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray18);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray18);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray18);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray18);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...", charArray18);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", charArray18);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray18);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ", charArray18);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray18);
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A    44444444444444444444444444444444444444444440true-1.0097.0", charArray18);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "TRUE444...44444444444444444444444444444444440true-1.0097...44                                                                                        ", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 45 + "'", int22 == 45);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test51842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...AAAAAA0AAAAAAAAA0AAA...0...                   ...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...AAAAAA0AAAAAAAAA0AAA...0...                   ..." + "'", str2, "...AAAAAA0AAAAAAAAA0AAA...0...                   ...");
    }

    @Test
    public void test51843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444440T                                                                                               ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444440T                                                                                               " + "'", str2, "4444444444444444444444444444440T                                                                                               ");
    }

    @Test
    public void test51844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51844");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test51845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51845");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(".0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-", 11, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444444444                  44444a4444                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-" + "'", str3, ".0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-");
    }

    @Test
    public void test51846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#############################################################################################...7900", "A0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################################################################...7900" + "'", str2, "#############################################################################################...7900");
    }

    @Test
    public void test51847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("TRUE                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUE                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           " + "'", str2, "TRUE                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           ");
    }

    @Test
    public void test51848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51848");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                       4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                       ", "                                                                                              a                        A A A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "...aaaa...44444444444444444true-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hitrue-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hitrue-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hitrue-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hitrue-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hitrue-97true-97true-97true-97true-9");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                       4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                                                                                                                       4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test51849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51849");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("...                                                                                              0aaaa                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test51850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51850");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "            ...                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            ...                                   " + "'", str1, "            ...                                   ");
    }

    @Test
    public void test51852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51852");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51853");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("a44444", "44444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test51854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51854");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51855");
        char[] charArray18 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray18);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray18);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray18);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray18);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray18);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray18);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...", charArray18);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", charArray18);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray18);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ", charArray18);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray18);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ", charArray18);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 45 + "'", int22 == 45);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test51856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51856");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444TRUE-1.97 1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444...4444444...4444444...4   1aaaaaaaaaaa4444444..");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51857");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa", "    a0a                 ", 645);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test51858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51858");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(92.0f, (float) 6, (float) 734L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 734.0f + "'", float3 == 734.0f);
    }

    @Test
    public void test51859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51859");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 6, (float) 229L, (float) 359);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 6.0f + "'", float3 == 6.0f);
    }

    @Test
    public void test51860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51860");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...44444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444444444444444444444444444444444440true-1.044444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51861");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "                                   ...                                   ", 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51862");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
    }

    @Test
    public void test51863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51863");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "4true4-4449744");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test51864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51864");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA Aa         a                                                     1000    a         aa         a                                                     1000    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA Aa         a                                                     1000    a         aa         a                                                     1000    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA Aa         a                                                     1000    a         aa         a                                                     1000    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51865");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 4, "0true-1.00                                           true-1.97.                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "0true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51866");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                             ", "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.", 542);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51867");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4                                                                                                                                                        ...44444444444...", "41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51868");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AAAAAAAAAAAAAAAAAAAAA100.", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("a A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444", "0TRUE-1.0097.044444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444" + "'", str2, "a A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444");
    }

    @Test
    public void test51870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51870");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                             A                                                 ", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51871");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("    a   hi!hi", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51872");
        int[] intArray5 = new int[] { 57, 267, (byte) -1, 9, 5 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[57, 267, -1, 9, 5]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 267 + "'", int7 == 267);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 267 + "'", int9 == 267);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 267 + "'", int10 == 267);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 267 + "'", int11 == 267);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 267 + "'", int12 == 267);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 267 + "'", int14 == 267);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 267 + "'", int15 == 267);
    }

    @Test
    public void test51873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51873");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                ", "#############################################################################################################################################################################################################################################################4ue-1.0097...444444444444444444444444########################################################################################100.44##############################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51874");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...!hi!hi!hi!hi!hi!hi!", 359, 854);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                    ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444TRUE-1.97");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444TRUE-1.97" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444TRUE-1.97");
    }

    @Test
    public void test51877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51877");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51878");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51879");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                    444444444..", 216);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                       a44444444444444444444...4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0                                                                                                                                                                                                                                                                          ", "AAAAA0AAAA0.7900.1-EURT04444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0                                                                                                                                                                                                                                                                          " + "'", str2, "0                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test51882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51882");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double21 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
    }

    @Test
    public void test51883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51883");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr", "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", 145);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("###    a   HI!HI!...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test51884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51884");
        int[] intArray5 = new int[] { 57, 267, (byte) -1, 9, 5 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[57, 267, -1, 9, 5]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 267 + "'", int14 == 267);
    }

    @Test
    public void test51885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51885");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " true-1.  97. ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444a44444", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAA...", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("                            100.0                                                     aaaa..", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test51886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51886");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" true-1.  97. ", '#');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                ...44444", "a0a0true-1.0AAAA", 136);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" 4444444444444444444444444444444444444444444TRUE..4444444444444444444444444444444444444444444", strArray4, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################atruea-a1a.a97a.a", strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 4444444444444444444444444444444444444444444TRUE..4444444444444444444444444444444444444444444" + "'", str9, " 4444444444444444444444444444444444444444444TRUE..4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test51887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51887");
        int[] intArray6 = new int[] { (short) 10, 'a', 266, 32, 24, (short) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 266, 32, 24, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 266 + "'", int10 == 266);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 266 + "'", int12 == 266);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test51888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51889");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 561L, (float) 135, (float) 45);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 45.0f + "'", float3 == 45.0f);
    }

    @Test
    public void test51890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51890");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                         aaaa0aaaaa    ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51891");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr...                                                                ...                                                                ...                                                                ...                                                                A...                                                                ...                                                                ...                                                                ...                                                                ...                                                                0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR...                                                                ...                                                                ...                                                                ...                                                                a...                                                                ...                                                                ...                                                                ...                                                                ...                                                                0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T" + "'", str1, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR...                                                                ...                                                                ...                                                                ...                                                                a...                                                                ...                                                                ...                                                                ...                                                                ...                                                                0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
    }

    @Test
    public void test51892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                             A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A                                                                             ", 618);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                             A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A                                                                             " + "'", str2, "                                                                             A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A                                                                             ");
    }

    @Test
    public void test51893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51893");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51894");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test51895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51895");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaa0aaaa                                                                                          ", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test51896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51896");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                       0aaa                        ", "44444444  EURT          44444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test51897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A A A        ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A A A        " + "'", str3, "A A A        ");
    }

    @Test
    public void test51898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaa0                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa0" + "'", str1, "aaa0");
    }

    @Test
    public void test51899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51899");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
    }

    @Test
    public void test51900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51900");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.00true-1.97.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51901");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                   ...                           ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test51902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51902");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...444                                                   ", "0TRUE-1.00-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test51903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51903");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51904");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("A      A                            100.0                                                     aaaa", 4444444);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4444444 + "'", int2 == 4444444);
    }

    @Test
    public void test51905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51905");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444794444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444eurt4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444####################################################################################################################################################################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test51906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51906");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("444444444444444444444444...444444444444444444444444444444444404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444TRUE-1.044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044497...444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444...444444444444444444444444444444444404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444TRUE-1.044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044497...444444444444444444444444" + "'", str1, "444444444444444444444444...444444444444444444444444444444444404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444TRUE-1.044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044497...444444444444444444444444");
    }

    @Test
    public void test51907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51907");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test51908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...4444...                       a                       a                       a                       a                       a                       a  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444...                       a                       a                       a                       a                       a                       a" + "'", str1, "...4444...                       a                       a                       a                       a                       a                       a");
    }

    @Test
    public void test51909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                             ...", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test51910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51910");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                      ...                                                     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4 0true-1.0097.044444444444444444444444444", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...444                                                   ", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                  0AAAA                                                                                                                                  ", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 130 + "'", int18 == 130);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test51911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51911");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test51912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51912");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 149, (float) 926, 181.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 926.0f + "'", float3 == 926.0f);
    }

    @Test
    public void test51913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51913");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("                                                0.001                                               ", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test51914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51915");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("a         a    0001", 599, 541);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#########...##########........###########", "!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########...##########........###########" + "'", str2, "#########...##########........###########");
    }

    @Test
    public void test51917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51917");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                          44444444444444444444444444444444444444444440true-1.0097                                                                                           ", "", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test51918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51918");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test51919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51919");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("iAi irti00i!i!900i!i1i-ieurti00i!i!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii iAi irti00i!i!900i!i1i-ieurti00i!i!                                       A HIhHIhHIhHAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51920");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444440true-1.0097...444444444444444444444444#####################################################################################################################################################################################", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51921");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4                       ", "4444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test51922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAA...", "a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test51923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51923");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0000400004...                  4...4...97.4...true-1.4...", 826, 652);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi  ", 256, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi  " + "'", str3, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi  ");
    }

    @Test
    public void test51925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ", "44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   " + "'", str2, "...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
    }

    @Test
    public void test51926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444  444444444444444", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444  444444444444444                                              " + "'", str2, "444444444444444  444444444444444                                              ");
    }

    @Test
    public void test51927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("a a a ...40TRUE-1.0097.04444444444444444444444444444444444...a", "#################################################################################################################################################A444444               a   hi!hi!...A444444               a   hi!hi!...A444444               a   hi!hi!......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a a a ...40TRUE-1.0097.04444444444444444444444444444444444...a" + "'", str2, "a a a ...40TRUE-1.0097.04444444444444444444444444444444444...a");
    }

    @Test
    public void test51928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "...00.7900.1-eurt00.79......aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...00.7900.1-eurt00.79......aaaa" + "'", str2, "...00.7900.1-eurt00.79......aaaa");
    }

    @Test
    public void test51929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51929");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test51930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51930");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51931");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444444444444444444444444444444444444444444444444", strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("...44444444444...                 aaaaaaaaaaa aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                    ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str5, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test51932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51932");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(848, 537, 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 118 + "'", int3 == 118);
    }

    @Test
    public void test51933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51933");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          ###    A   hi!hi!.           ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0097...40097...4", "1000                                                     aaaa", 359);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097...40097...4" + "'", str3, "0097...40097...4");
    }

    @Test
    public void test51935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                                                                                                                                                                                                                                                                                a   hi!hi!...                                                                                                                                                                                                                                                                                            ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440AAAAA    4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a   hi!hi!...                                                                                                                                                                                                                                                                                            " + "'", str2, "a   hi!hi!...                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test51936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51936");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("IH  ", "a A 1000 A A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51937");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.00true-1.97.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51938");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test51939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51939");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                          44444444444444444440true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51940");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "", 37);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51941");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "AaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaa...", 31);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51942");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51943");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4444444444444444444444444444440true-1.0097.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444440true-1.0097.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51944");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0atruea-a1a.a0097a.a0", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0true-1.0097.044444444444444444444444444..", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51945");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51946");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 4, (short) -1, (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
    }

    @Test
    public void test51947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51947");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test51948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51948");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444...4444444.79...4444444.1-eurt...44444444444444444444444444444444444444444444444444T00.790", (double) 84);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 84.0d + "'", double2 == 84.0d);
    }

    @Test
    public void test51949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51949");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 36L, (double) 31, (double) 25.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 36.0d + "'", double3 == 36.0d);
    }

    @Test
    public void test51950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51950");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...4444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51951");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  0000000000000000000000000000000000000000000", "...44444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("    00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0079000000000-000eurt00000000079000000000-000eurt00000000079000000000-000eurt00000000079000000000-000eurt00000000079000000000-000eurt00000000079000000000-000eurt000" + "'", str1, "0079000000000-000eurt00000000079000000000-000eurt00000000079000000000-000eurt00000000079000000000-000eurt00000000079000000000-000eurt00000000079000000000-000eurt000");
    }

    @Test
    public void test51953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444", "44444444          TRUE  44444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaa");
    }

    @Test
    public void test51955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51955");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ##########aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444", "                      100.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("444444444444444444444444444444444444440true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00t44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444440true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00t44444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444440true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00t44444444444444444444444444444444444444");
    }

    @Test
    public void test51957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51957");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51958");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "    .         .                                                     1000    .         .         ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                    444...44444444444444444444444444444444440TRUE-1.0097...44                                        ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                       444...44444444444444444444444444444444440true-1.0097################################################################################################################################################################################", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test51959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51959");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00       000       000       00a", "00aaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test51960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444...                            ", 121);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51961");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                 ", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test51962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51962");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                  4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                                                  ", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                  4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                                                  " + "'", str3, "                                                                                                                  4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                                                  ");
    }

    @Test
    public void test51963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51963");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                      100.0                                                      ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4A4 4rt4004.47                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444A4 4rt4004.479", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("a.a7900a.a1a-aeurta0#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    A         A                                                     100.0    A         A         ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 38 + "'", int15 == 38);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test51964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51964");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51965");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!H                                                                                                           ...      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test51966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51966");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..", (int) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!.." + "'", str3, "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..");
    }

    @Test
    public void test51967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51967");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                  0                                                                                                                                 ", "...         ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51968");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 10);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray4, strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str9, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test51969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51969");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                               100.0                                                                                                                                                                                                                                                                                                                                               ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51970");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                         0true-1.0097.044444444444444444444444444...                                                                            ", "974", 757);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51971");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("   444444444444444444444444...44444   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    0true-1.00-1.0097.04444444444444444444444444444444444444444444", "4true4", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.0...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test51972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00" + "'", str2, "                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00");
    }

    @Test
    public void test51973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.97.444444444444444444444444444444444444444444", "Aa00aa000aa000aa00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.97.444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.97.444444444444444444444444444444444444444444");
    }

    @Test
    public void test51974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51974");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("     a    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("aaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444" + "'", str5, "aaaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test51975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51975");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("   44444   TRUE-1 4444444   97 4444444   4444444444444   ..................4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0" + "'", str2, "4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0");
    }

    @Test
    public void test51977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51977");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51978");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0TRUE-1.0097.0##########################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str5, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test51979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0097...", 170);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097..." + "'", str2, "0097...");
    }

    @Test
    public void test51981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("true-1....97true-1....9", "                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1....97true-1....9" + "'", str2, "true-1....97true-1....9");
    }

    @Test
    public void test51982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51982");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa", "...444444444444444444444444444444444444444444444444444444444440true-1.009744444444444444444444444...44444...4444444...4...AAAAAA...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51983");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("             aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa" + "'", str1, "aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa");
    }

    @Test
    public void test51984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...");
    }

    @Test
    public void test51985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51985");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0true-1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51986");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (java.lang.CharSequence) "                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 132 + "'", int2 == 132);
    }

    @Test
    public void test51987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51987");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("         .");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51988");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("true-1....97true-1....97");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test51989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51989");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970hhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaa0a4444444...                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0a4444444...                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaa0a4444444...                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("#######################################################################################################################################################################################################################################################################################################################################################################################################################4444444TRUE-1.00TRUE-1.97.#######################################################################################################################################################################################################################################################################################################################################################################################################################", 51, 419);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################################################################################################################################################################################################################################################################################4444444TRUE-1.00TRUE-1.97.#####################################" + "'", str3, "####################################################################################################################################################################################################################################################################################################################################################################4444444TRUE-1.00TRUE-1.97.#####################################");
    }

    @Test
    public void test51992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51992");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray7, strArray10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("0TRUE-1.0097.0", strArray7);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ", (int) 'a', 44);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", strArray2, strArray7);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0" + "'", str11, "100.0");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h" + "'", str18, "    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test51993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51993");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void test51994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51994");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                     ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test51996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51996");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...44a44444                       ...", 403, 542);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test51999");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################", 4444444);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test52000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest103.test52000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...      0aaaa               ...", "aaTRUE-1.  97.aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0aaaa               ..." + "'", str2, "0aaaa               ...");
    }
}

