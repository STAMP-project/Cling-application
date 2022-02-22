import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest99 {

    public static boolean debug = false;

    @Test
    public void test49501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49501");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("A A ###################################", "444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", "   4444444...AAAAAAAAA4444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A A ###################################" + "'", str3, "A A ###################################");
    }

    @Test
    public void test49502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...", "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00trA0t..." + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...");
    }

    @Test
    public void test49503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44444..4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444..4444" + "'", str1, "44444..4444");
    }

    @Test
    public void test49504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49504");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("444444444444444444444444444444444444444444444444444444444444E10ttttttttt0000TRttttAttttt0TRUE10000TRUE10000TRUE10000TR", "!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaa", "                                                                                                            00true-1...0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test49505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49505");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test49506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49506");
        float[] floatArray6 = new float[] { (short) 1, 9, 100.0f, 86, (byte) -1, (byte) 0 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 9.0, 100.0, 86.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test49507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49507");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi." + "'", str1, "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
    }

    @Test
    public void test49508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49508");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0" + "'", str1, "00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0");
    }

    @Test
    public void test49509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49509");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                       ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!hi!h!hi!hA0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                               aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(".0097.00true-1.000true-1.0                                    ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".0097.00true-1.000true-1.0                                    " + "'", str2, ".0097.00true-1.000true-1.0                                    ");
    }

    @Test
    public void test49512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49512");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444440TRUE-1.0097.0");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.0" + "'", str2, "44444444444444444444444444444444444444444440TRUE-1.0097.0");
    }

    @Test
    public void test49513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49513");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", "A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49514");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1 0097   AA                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49515");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAA0TRUE-1.0097.     A    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097.     A    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097.     A    AAAAAAAAAAAAAAAAAAAAAA", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49516");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 656);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49518");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... ...true-1. ...97. ... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ...", "4444444...444444           AAAAAAAAAAA", 430);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49519");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444...44444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 39, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444...44444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "4444...44444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test49520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaa0aaaa                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49521");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.                                  aaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49522");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaa0aaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " true-1.  97. ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444...                       a                       a                       a                       a                       a                       a  ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...A     ...", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A    ", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4                                                 100.0                                                                             AAAA0AAAAA       ...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test49523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49523");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test49524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49524");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "                                   ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...444444440tr...");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("1aaaaaaaaaaa4444444...4444444...4444444...4", strArray5, strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a", '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi", strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1aaaaaaaaaaa4444444...4444444...4444444...4" + "'", str9, "1aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test49525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49525");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444440true-1.00###########################################################################################################################################################################################################################", 237, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                true-1.4444444...97", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    true-1.4444444...97" + "'", str2, "                                    true-1.4444444...97");
    }

    @Test
    public void test49527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49527");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#######...#######...#######...#######...#######...#######...#######...#######...######           " + "'", str4, "#######...#######...#######...#######...#######...#######...#######...#######...######           ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test49528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49528");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "...   #a#4444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", 656);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test49529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49529");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444444444444444444444444444444444444444444444444444444", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test49530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49530");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                    ", "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0097...#############################################################################################", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097...#############################################################################################" + "'", str2, "0097...#############################################################################################");
    }

    @Test
    public void test49532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                     a   HI!HI!...truea   HI!HI!...-a   HI!HI!...a   HI!HI!...a   HI!HI!...97a   HI!HI!...a   HI!HI!...                                                                      ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                     a   HI!HI!...truea   HI!HI!...-a   HI!HI!...a   HI!HI!...a   HI!HI!...97a   HI!HI!...a   HI!HI!...                                                                      " + "'", str2, "                                                                     a   HI!HI!...truea   HI!HI!...-a   HI!HI!...a   HI!HI!...a   HI!HI!...97a   HI!HI!...a   HI!HI!...                                                                      ");
    }

    @Test
    public void test49533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49533");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 571, (double) 625L, (double) 59.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 59.0d + "'", double3 == 59.0d);
    }

    @Test
    public void test49534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49534");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49535");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.0", "444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444");
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444444444444444444444444444444444444", strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "                                                                ...44444");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "aaaaaaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("        a                     ", strArray4, strArray10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny("44444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa", strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44444444444444444444444444" + "'", str6, "44444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0true-1.0097.0" + "'", str13, "0true-1.0097.0");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "        a                     " + "'", str16, "        a                     ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0true-1.0097.0" + "'", str17, "0true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test49536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444TRUE-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str1, "4444444444TRUE-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test49537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49537");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#################                                                                                                                                                                                                       ", (long) 608);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 608L + "'", long2 == 608L);
    }

    @Test
    public void test49538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...                       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                       ..." + "'", str1, "...                       ...");
    }

    @Test
    public void test49539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49539");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                     4444444444444444444444444444444444444444444A.79A.1-EURTA44444444444444444444444444444444444", 384);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 384 + "'", int2 == 384);
    }

    @Test
    public void test49540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49540");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444", "                                                                                                                                                                                                                                                                                                                                           !IH                                                                                                                                                                                                                                                                                                                                            ", 52);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0true-1.00-1.0097.0444444444444444444444444444444...... aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444" + "'", str5, "0true-1.00-1.0097.0444444444444444444444444444444...... aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444");
    }

    @Test
    public void test49541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49541");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("0true-1.00                                           true-1.97.                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.00                                           true-1.97.                                                                                  " + "'", str1, "0true-1.00                                           true-1.97.                                                                                  ");
    }

    @Test
    public void test49542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49542");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                     aaaa0aaaaa              ", "44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                     aaaa aaaaa              " + "'", str5, "                     aaaa aaaaa              ");
    }

    @Test
    public void test49543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                             a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                              ", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                             a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                              " + "'", str3, "                                                             a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                              ");
    }

    @Test
    public void test49544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49544");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 4, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
    }

    @Test
    public void test49545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49545");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 59, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                           " + "'", str3, "                                                           ");
    }

    @Test
    public void test49546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A    4", 275, "tr...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr..A    4" + "'", str3, "tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr..A    4");
    }

    @Test
    public void test49547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ...4#444hi!hi!hi!h############################...44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444", "##############################################0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr####A#####0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4444444444444444444444444444444444444444444.79.1-eurt444444444444444444444444444444444444444444", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                     " + "'", str2, "                                                                     ");
    }

    @Test
    public void test49550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49550");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!...", (java.lang.CharSequence) "AaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49551");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test49552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                     4444444444                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                      4444444444                                                                                     " + "'", str1, "                                                                                      4444444444                                                                                     ");
    }

    @Test
    public void test49553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49553");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(".1-eurt00.7900.1-eurt", "                     aaaa0aaaaa           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test49554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("a   HI!HI!..    a   HI!HI!..    a   HI!HI!.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a   HI!HI!..    a   HI!HI!..    a   HI!HI!." + "'", str1, "a   HI!HI!..    a   HI!HI!..    a   HI!HI!.");
    }

    @Test
    public void test49555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49555");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.0", "     A    ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "0                                                                                                                                                                                                                                                                          ", 550, (int) (short) -1);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("4 ", strArray8);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444", "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 24);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray8, strArray17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", (java.lang.Object[]) strArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray17);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "0true-1.0097.00true-1.0097.00true-1.0097.00tr A");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  A      A                            100.0                                                     AAAA");
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                         ...444444440tr...                                          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", 9);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray26, strArray30);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray30);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                          44444444444444444440true-1.009", strArray17, strArray30);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "444444444444444444444444444444444444444444" + "'", str18, "444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str19, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "444444444444444444444444444444444444444444" + "'", str20, "444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "                                         ...444444440tr...                                          " + "'", str32, "                                         ...444444440tr...                                          ");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "                                                                                                                                                                                                                                          44444444444444444440true-1.009" + "'", str33, "                                                                                                                                                                                                                                          44444444444444444440true-1.009");
    }

    @Test
    public void test49556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49556");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################1aaaaaaaaaaa4444444...4444444...44...aaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...44############################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49557");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaa", "                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 261 + "'", int2 == 261);
    }

    @Test
    public void test49558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("ue-144444444444444444444444444444444########################################################################################1444444444444444444444444444444444444444444444444444444", "0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0......true-1....97....0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...", 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ue-144444444444444444444444444444444########################################################################################1444444444444444444444444444444444444444444444444444444" + "'", str3, "ue-144444444444444444444444444444444########################################################################################1444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test49559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("###########################################################################################################################################################################################################################################################################################################00       000       000       00A###########################################################################################################################################################################################################################################################################################################", "                                                                                                                          4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################################################################################################################################################################################################################################################################################################00       000       000       00A###########################################################################################################################################################################################################################################################################################################" + "'", str2, "###########################################################################################################################################################################################################################################################################################################00       000       000       00A###########################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test49560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49560");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("aaaa0aaaaa", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0true-1.0097.044444444444444444444444444...a", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test49561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49561");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                100.0aaaa                 ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAA       TRUE       TRUE       TRUE ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49562");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...a     ..", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49563");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...", "A A 1000 A A");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr" + "'", str1, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr");
    }

    @Test
    public void test49565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0                       A                                 true                       A                                 -                       A                                 1                       A                                 .                       A                                 0097                       A                                 .                       A                                 0", 523, "         aaaa0aaaaa                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0                       A                                 true                       A                                 -                       A                                 1                       A                                 .                       A                                 0097                       A                                 .                       A                                 0         aaaa0aaaaa                                                                             aaaa0aaaaa    " + "'", str3, "0                       A                                 true                       A                                 -                       A                                 1                       A                                 .                       A                                 0097                       A                                 .                       A                                 0         aaaa0aaaaa                                                                             aaaa0aaaaa    ");
    }

    @Test
    public void test49566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49566");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "True - 97");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test49567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49567");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("############################################0H!IH!H!IH!.H!IH!H!IH!0010H!IH!H!IH!.H!IH!H!IH!0H!IH!H!IH!HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.7900.1-eurt0444444444444444444444444444444444444444444444    A   ...", 314);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49568");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444444444444444444444444444444444444444444441004.4044444444444444444444444444444444444444444444444", (java.lang.CharSequence) "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test49569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a                                                                                                                                                                      ", 557, 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test49570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49570");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                              0                     ", "                                                                                                                                                                                                                                                                                                                      00       000       000       00                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              0                     " + "'", str2, "                              0                     ");
    }

    @Test
    public void test49572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49572");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 670.0f, 668.0d, (double) 456L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 670.0d + "'", double3 == 670.0d);
    }

    @Test
    public void test49573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49573");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test49574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49574");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", charSequence2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test49575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49575");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097", "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test49577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49577");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test49578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49578");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                            4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44", "#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    a   hi!hi!...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test49579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49579");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("4444444444444444444444444444444444444444444RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  Etrue-1.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E97.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  Etrue-1.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E97.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  Etrue-1.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E97.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E4444444444444444444444444444444444444444444");
    }

    @Test
    public void test49580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49580");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", charSequence2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test49581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444440true-1.0097", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444440true-1.0097" + "'", str3, "444444440true-1.0097");
    }

    @Test
    public void test49582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49582");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 44, (short) (byte) 10, (short) 44);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 44 + "'", short3 == (short) 44);
    }

    @Test
    public void test49583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49583");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaa", 840, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49584");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                      41004.404                                                ", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 39 + "'", int17 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test49585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49585");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             ", "H!ih!h!ih!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             " + "'", str2, "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             ");
    }

    @Test
    public void test49587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49587");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4444444444444444444aaaaaaaaaaaaaaaaaa", "a                             ###    a   HI!HI!...###    a   HI!HI!...###", 138);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("044444444444444444444444444444444444444444", "0AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "044444444444444444444444444444444444444444" + "'", str2, "044444444444444444444444444444444444444444");
    }

    @Test
    public void test49589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49589");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaa0aaaaa ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                                                                                                                                                              #    ##########    ##########    ##########   A #    ##########    ##########    ##########  ", " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a######################", 28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaa0aaaaa ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str4, "aaaa0aaaaa ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test49590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49590");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################atruea-a1a.a97a.a", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test49591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444A44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444A44444" + "'", str1, "4444A44444");
    }

    @Test
    public void test49592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  .79  .1-EURT  .79  .1-EURT  .79  .1-EURT ", "0true-1.0097.  a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097                 ...                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49593");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0aaaa                                                                                                                                  A                                                                                                                                  0aaaa", "a HI!#######...#######...#######...#######...#######...#######...#######...#######...######           ", 234);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test49594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49594");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                     \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49595");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 750, 632);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test49596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49596");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444440true-1.0097.4A444444444444444444440true-1.0097.4A44444444444444444444444444444444444444444444440true-1.0097.4A444444444", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49597");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa                                                                                                                                                                                                                                                  ", "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 819);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 744, 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test49599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49599");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence3, charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("true4-4449744", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0true-1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test49600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49600");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 23, 201);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test49601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                      100.0                                                     aaaa", "                       a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0                                                     aaaa" + "'", str2, "100.0                                                     aaaa");
    }

    @Test
    public void test49602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49602");
        long[] longArray5 = new long[] { (byte) 1, (byte) 10, (short) -1, (byte) 10, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 10, -1, 10, 10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test49603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("rue-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ", "                                                                                                                                                                                                                                                                                                                                                                                a   hi!hi!...                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49604");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("       ", "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test49605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49605");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...          ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49606");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("TRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaaTR4444A44444aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"TRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaaTR4444A44444aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                            100.0                                                     AAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 98, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                            100.0                                                     AAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                            100.0                                                     AAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test49608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49608");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 100, (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test49609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49609");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440aaaaa    4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test49610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49610");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaa", 167);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test49611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49611");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "      a                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test49612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                    4                                                 100.0                                                                             aaaa0aaaaa       ...                                                                                                                                                     ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                    4                                                 100.0                                                                             aaaa0aaaaa       ...                                                                                                                                                     " + "'", str2, "                                                                                                                                                    4                                                 100.0                                                                             aaaa0aaaaa       ...                                                                                                                                                     ");
    }

    @Test
    public void test49613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444440TRUE-    A     ...A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", 30, "0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444440TRUE-    A     ...A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A" + "'", str3, "444444444444444444440TRUE-    A     ...A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
    }

    @Test
    public void test49614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49614");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test49615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa", "                                                              ", "ue-144444444444444444444444444444444########################################################################################144444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa" + "'", str3, "aaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
    }

    @Test
    public void test49616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                             ", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test49617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAAAAA   A                                 A         AAAA   A         0   A         AAAAA   A                       A         AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 4, 232);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAA   A                                 A         AAAA   A         0   A         AAAAA   A                       A         AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAA   A                                 A         AAAA   A         0   A         AAAAA   A                       A         AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test49618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49618");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                  000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444", "TRUE-1.0097.00TRUE-1....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444" + "'", str2, "100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444");
    }

    @Test
    public void test49620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                 4A4                                                ", 182);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", "   444444444444444444444444...44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
    }

    @Test
    public void test49622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49622");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################aHI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAA", "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test49623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                         aaaa0aaaaa    ", "                                         ...                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         aaaa0aaaaa    " + "'", str2, "                                                                         aaaa0aaaaa    ");
    }

    @Test
    public void test49624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", 384, 498);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097." + "'", str3, "...4444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test49625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49625");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test49626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49626");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!......7900.1-EURT0", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                     44                                                                                                                                                                                                                                                                                                                                                                                                               a0a                                          a0a                                          a0a...       ", "                                 aaaaaaaaaaaaaaatt-------ttt-------ttt-------t                                 aaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 518");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test49627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49627");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(907.0f, (float) 245, (float) (short) 44);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 907.0f + "'", float3 == 907.0f);
    }

    @Test
    public void test49628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49628");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################", 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################" + "'", str5, "                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test49629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49629");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       ", "a   HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test49630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49630");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "######################################################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#################################################################################################################################################################################################################################################################################################################################################################################################", "0000000444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test49631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("###################################       hi!hi!", 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("4444444...", "4444444...");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("4444A44444", strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0" + "'", str12, "    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0");
    }

    @Test
    public void test49632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49632");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("#############################################################################################################################################################################################################################################################4ue-1.0097...444444444444444444444444########################################################################################100.44##############################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test49633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49633");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444A44444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444A44444" + "'", str3, "4444A44444");
    }

    @Test
    public void test49634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49634");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 46L, 17.0f, 817.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 17.0f + "'", float3 == 17.0f);
    }

    @Test
    public void test49635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49635");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("    A     ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", 266, 156);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
    }

    @Test
    public void test49636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("    .         .                                                     1000    .         .         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444", 23, 975);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test49638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49638");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..", "...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaa", 236);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           ", "444...44444444444444444444444444444444440true-1.0097...44");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "             ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4', 445, 191);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                           " + "'", str9, "                                           ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str14, "                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test49639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49639");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", "                     aaaa0aaaaa              ", (int) (short) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test49640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49640");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A", "A    4", 907);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test49641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49641");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "4444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test49642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tre-1.0097.00tru...", "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tre-1.0097.00tru..." + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tre-1.0097.00tru...");
    }

    @Test
    public void test49643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49643");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4.44440448E8f, (double) 28, 252.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 28.0d + "'", double3 == 28.0d);
    }

    @Test
    public void test49644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49644");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("rue-1 AA   AAtrue-1 AA   AAtrue-1 AA   AAtr");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test49645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49645");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A...A");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("a                   TRUE-1.0097.0                       a", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49646");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "100.0 AAAA0TRUE-1.0097.044444444444444444444444", "UE-1.0097...44                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49647");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4", 348, 797);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49648");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                   0true-1.00###########################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                  ", "##44444444444444444444#...#44444444444444444444444444444444444444444444", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49649");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" 4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47", "AA                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...         ...", "    A      40.. 47eurt.                                                 A      40.. 47eurt.                       A   40.. 47eurt.                                           ", "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test49651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49651");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4A hi!hi!hi!hi!hi!hi!hi!hi!hi         000");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("                                                                                               100.0", "444444444444");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "aaaaaaaaa");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("                     aaaaa0aaaa                     ", strArray7, strArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("... aaaa0aaaaa##################################################################################################################################################################################################################", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 971 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str11, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                     aaaaa0aaaa                     " + "'", str12, "                     aaaaa0aaaa                     ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str14, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
    }

    @Test
    public void test49652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49652");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444TRUE-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "4...7900");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test49653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49653");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097...AA                                                                                            a    44                                                                                            a    44                                                                                            a    44                                                                                            a    44                                                                                            a    44                                                                                            a    44", 55, 527);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AA                                                                                            a    44                                                                                            a    44                                                                                            a    44                                                                                            a    44                                                                                            a    44                        ..." + "'", str3, "...AA                                                                                            a    44                                                                                            a    44                                                                                            a    44                                                                                            a    44                                                                                            a    44                        ...");
    }

    @Test
    public void test49654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49654");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      100.0                                                     ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("444...44444444444444444444444444444444440true-1.0097...44                                        ", strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", strArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444TRUE-1.00TRUE-1.97.", strArray5);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("44444...", '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, 'a', 330, 234);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("4 ", strArray5, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 92 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test49655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("rue-1.0097.0", "4444444444444444444444444444440T                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rue-1.0097.0" + "'", str2, "rue-1.0097.0");
    }

    @Test
    public void test49656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49656");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097", "aaa...                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49657");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44444444444444444440true-1.009", "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 101);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444440true-1.009" + "'", str3, "44444444444444444440true-1.009");
    }

    @Test
    public void test49658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49658");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444aaaaa", "00.0                                                     aaaa0true-1.0097.044444444444444444444444", 368);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49659");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0                                               41004.404", " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49660");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                      4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test49661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49661");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!", 817);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 817 + "'", int2 == 817);
    }

    @Test
    public void test49662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49662");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaa0aaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " true-1.  97. ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444...                       a                       a                       a                       a                       a                       a  ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                   ", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444444444...", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                      100.0                                                ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test49663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49663");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) Float.POSITIVE_INFINITY, (double) 463, (double) 187);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 187.0d + "'", double3 == 187.0d);
    }

    @Test
    public void test49664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49664");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0097...40097...4", "...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     a...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49665");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...a7900a...a7900a...a7900a...a7900", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49666");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test49667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49667");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "00.1-eurt044444444444444444444444444444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test49668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA a" + "'", str1, "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA a");
    }

    @Test
    public void test49669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49669");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("    a   HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("...0TRUE-1.0097...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    a   HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str4, "    a   HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test49670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaa..." + "'", str1, "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaa...");
    }

    @Test
    public void test49671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49671");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49672");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0TRUE-1.0", "...                                                                             ......                                                                             ......                                                                             ......                                                                             ......                                                                             ......", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0TRUE-10" + "'", str3, "0TRUE-10");
    }

    @Test
    public void test49673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49673");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49674");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100.0                                                     aaaa0true-1.0097.044444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0                                                     aaaa0true-1.0097.044444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49675");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "                                                                                                                                                                                               ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...                                                                             ......                                                                             ......                                                                             ......                                                                             ......                                                                             ......", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test49676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49676");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test49677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49677");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAA4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           AAAAAAAAAAA", 2, 498);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49678");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 80, 56.0d, 754.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 754.0d + "'", double3 == 754.0d);
    }

    @Test
    public void test49679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49679");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00true-1.0097.00true-1.0097.00tr A ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 842, 542);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test49680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49680");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A", "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49681");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AAA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                                                                                                  0aaaa                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAA" + "'", str3, "AAA");
    }

    @Test
    public void test49682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49682");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(".##################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################################." + "'", str1, "##################################################.");
    }

    @Test
    public void test49683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("a44444444444444444444...4444                       a44444444444444444444...444", 669);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a44444444444444444444...4444                       a44444444444444444444...444" + "'", str2, "a44444444444444444444...4444                       a44444444444444444444...444");
    }

    @Test
    public void test49684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "...                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49685");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444 97.0 true-1.0 44444444444444444444444444444444444444444440", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49686");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("true 1.  97.");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                                     100.0                                                     aaaa                                     ", "...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", 149);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("a444444444444444444444444                                                                                                               ", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test49687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49687");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "a0aaaaa              0true-1.0097.00true-1.0097.00trAaaaaaaaaaa4444444...4444444...4444444...4a0aaaaa              0true-1.0097.00true-1.0097.00tr", (java.lang.CharSequence) "4444444444444444444444444444   aaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test49688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44444444444", "         ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49689");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(4.4444446E27f, 638.0f, 98.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.4444446E27f + "'", float3 == 4.4444446E27f);
    }

    @Test
    public void test49690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAAAAAAAAAAAAAAAA...", "4A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47", 150);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAA..." + "'", str3, "AAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test49691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49691");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("0                                                                                                                                                                                                                                                                          ", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test49692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49692");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0044444440004aatrue-aaaa97aaatrue-aaaa97aaatrue-aaaa97aaatr044444440011", "                              ...44444...true-1.4444444...97.4444444...4444444444444...4                               ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49693");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444", 92);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "...4444                                                              ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test49694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                0444", "Aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49695");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test49696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444...A" + "'", str1, "0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444...A");
    }

    @Test
    public void test49697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49697");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                       rue-1.0097.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49698");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "..####0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaa...    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 830 + "'", int2 == 830);
    }

    @Test
    public void test49699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49699");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                       a                             ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...44444444444444444444444444444444", ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1.0097.04444444444444444444444444", strArray2, strArray7);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0097.04444444444444444444444444" + "'", str8, "1.0097.04444444444444444444444444");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test49700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49700");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444                  44444a4444                 ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                ", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 " + "'", str2, "                                                                 ");
    }

    @Test
    public void test49702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("rue-1.0097.00trA0t", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49703");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test49704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49704");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("    a   hi!hi", "4444444444444444444444444444444444444444444...4444444.79...444444hI!HI!HI!HI!HI!HI!HI!HI!HI!HI4444444444444444444444444444444444T00.7900");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("..    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 830);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49706");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("h", "true-1. 97.  true-1. 97.");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test49707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49707");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("...    0true-1.0097.00true-1.0097.00true-1.0097.00tr", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test49708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49708");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str1, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test49709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                ...444444", 181, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                 ...444444" + "'", str3, "...                 ...444444");
    }

    @Test
    public void test49710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49710");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                               #######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ", 76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test49711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0 TRU...UE-1.0097.044444444444444444444444444444444...4444", "0true-1.0aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " TRU...UE-1.0097.044444444444444444444444444444444...4444" + "'", str2, " TRU...UE-1.0097.044444444444444444444444444444444...4444");
    }

    @Test
    public void test49712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49712");
        char[] charArray17 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444...7900.1-eurt044444444444444444", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("...44444...true-1.4444444...97.4444444...4444444444444...", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                ..", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a44444444444444444444...444444444444444444444444444444444444444444444", charArray17);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444", charArray17);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi       ", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test49713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49713");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("A                                    A   hi!hi!...       A   hi!hi!...   ", 655, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                              ...0TRUE-1.0097...                                                                 ", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              ...0TRUE-1.0097...                                                                 " + "'", str2, "                                              ...0TRUE-1.0097...                                                                 ");
    }

    @Test
    public void test49715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49715");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                    444444444444444444444444444444444444444444", "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49716");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...aaaaaaaaaaaaaaaaaaaaaaaaa                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAA                                 " + "'", str1, "...AAAAAAAAAAAAAAAAAAAAAAAAA                                 ");
    }

    @Test
    public void test49717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49717");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440tru", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test49718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49718");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("00       0true00       0-00       000       000       09700       000       0", " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ", "...aaaa0aaaaa44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ");
    }

    @Test
    public void test49720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49720");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa...", (long) 41);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test49721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49721");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test49722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49722");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...44444444444...                                                                                                                                                                                                     ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49723");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...........................................................................................0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                      ...........................................................................................", "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49724");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444", "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", 895);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49725");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("A    44                                                                                            A    44", "###0a001##", "...44444...TRUE-1.4444444...97.4444444...4444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A    44                                                                                            A    44" + "'", str3, "A    44                                                                                            A    44");
    }

    @Test
    public void test49726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49726");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                    00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", (double) 91);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91.0d + "'", double2 == 91.0d);
    }

    @Test
    public void test49727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49727");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("rue-1.0097.0", "                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", 224);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("4true4-4449744", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaa" + "'", str7, "aaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test49728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49728");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                            ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49729");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 257L, 0.0f, (float) 4444404444L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.4444042E9f + "'", float3 == 4.4444042E9f);
    }

    @Test
    public void test49730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49730");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH ", "A         A                                                     100.0    A         A", (int) '#', 359);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                   A         A                                                     100.0    A         A                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH " + "'", str4, "                                   A         A                                                     100.0    A         A                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH ");
    }

    @Test
    public void test49731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49731");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 44, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 44 + "'", short3 == (short) 44);
    }

    @Test
    public void test49732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444" + "'", str2, "4444444444444444444444");
    }

    @Test
    public void test49733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49733");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(220, 47, 444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 444 + "'", int3 == 444);
    }

    @Test
    public void test49734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49734");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("-1.0097.0                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444                                                  44444444444444444444444444444444444444444444true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.0097.044444444444444444444444444444444444444444444true-1.497.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.497.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.497.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true" + "'", str1, "-1.0097.044444444444444444444444444444444444444444444true-1.497.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.497.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.497.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true");
    }

    @Test
    public void test49735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49735");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                          HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A                                                                                                                ", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49736");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("           4    4     ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test49737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49737");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4a4444444444444444444444...4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test49738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49738");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", "                                                                                10000#####10000##", 650);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test49739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49739");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa                                                                                                                                                                                     ", 146, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa                                                                                                                                                                                     " + "'", str3, "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa                                                                                                                                                                                     ");
    }

    @Test
    public void test49740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49740");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                      0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                      0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "                                      0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test49741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49741");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4444444                             ...444444           aaaaaaaaaaa", "                            ", 632);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49742");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49743");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                             ", "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test49744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49744");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...                                                                             ......                                                                             ......                                                                             ......                                                                             ......                                                                             ......      ", "           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test49745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49745");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                  0AAAA                                                                                                                                  ", (short) 44);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 44 + "'", short2 == (short) 44);
    }

    @Test
    public void test49746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49746");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A    A00 000 0", "                                                                                                                                                                          44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   a44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                               0true-1.0097.044444444444444444444444444..", 632);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test49747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                        ", "a4a4aaaaaaaaaaaaaaaaaaa4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.4....444444444tr...aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49748");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                  Hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...", "a A 1000 A A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49749");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                    1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 329 + "'", int1 == 329);
    }

    @Test
    public void test49750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49750");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0097.00T44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78 + "'", int2 == 78);
    }

    @Test
    public void test49751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444A44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444A44444" + "'", str1, "4444A44444");
    }

    @Test
    public void test49752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49752");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAA", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49753");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 213, 0.044444446f, (float) 119L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.044444446f + "'", float3 == 0.044444446f);
    }

    @Test
    public void test49754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49754");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaa", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test49755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                           ...                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                           ...                                                    " + "'", str1, "                           ...                                                    ");
    }

    @Test
    public void test49756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49756");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", 132, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444" + "'", str3, "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
    }

    @Test
    public void test49757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49757");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444447404444444444444444444444444444... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444447404444444444444444444444444444... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444" + "'", str1, "... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444447404444444444444444444444444444... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444");
    }

    @Test
    public void test49758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49758");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 527, 10L, (long) 260);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test49759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                           true 1.  97                                                                                                                                                                                                                                                                            4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...4444444...4444444...4444444...44444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49760");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444...7900.1-EURT04444444444444444444444444444444444...444", (long) 623);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 623L + "'", long2 == 623L);
    }

    @Test
    public void test49761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49761");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...##########hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h#####################...", 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("            444444444444444  444444444444444             ..44444444444444444444444                                      100.0                                                     aaaa444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                                                                                                        ", "HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                        " + "'", str2, "                                                                                                                                                                                                                        ");
    }

    @Test
    public void test49764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0 true - 1 .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 true - 1 ." + "'", str1, "0 true - 1 .");
    }

    @Test
    public void test49765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49765");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("a HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ... a", ".. A...444444444...", "00#######000#######000#######0011");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test49766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "   0000000000aaaaaaaaa00000000000000000000000000000000000000000                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49767");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAATRUE-1.A97.AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.79A.1-EURTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                 " + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.79A.1-EURTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                 ");
    }

    @Test
    public void test49769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49769");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49770");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                     ...                 7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt04444444444444444444    a  .7900.1-eurt0444444444444444444444444444444444444444444", (java.lang.CharSequence) "true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test49771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49771");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                 0aaa                           ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 545);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49772");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(424, 257, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test49773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49773");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097", (java.lang.CharSequence) "4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test49774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49774");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("  aa     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "                                                                                                                                                                                                                                                                                                                                      aahI!aa                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0true-1.0097.044444444444444444444444444 ...a                               ", "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440true-1.0097                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.044444444444444444444444444 ...a                               " + "'", str2, "0true-1.0097.044444444444444444444444444 ...a                               ");
    }

    @Test
    public void test49776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49776");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
    }

    @Test
    public void test49777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49777");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("004444a44444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test49778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0aaaaa0aaaaa0aaaa", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa0aaaa" + "'", str2, "aaaa0aaaa");
    }

    @Test
    public void test49779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49779");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444", "...aaaaaaaaaaaaaaa...    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("#######################################################################################################################################################################################################################################################################################################################################################################################################################4444444TRUE-1.00TRUE-1.97.#######################################################################################################################################################################################################################################################################################################################################################################################################################", "Aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################################################################################################################################################################################################################################################################################################################################################################################################4444444TRUE-1.00TRUE-1.97.#######################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "#######################################################################################################################################################################################################################################################################################################################################################################################################################4444444TRUE-1.00TRUE-1.97.#######################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test49781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49781");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4444444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49782");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...4444444...4...                                                   .#########..4444444...4...", 891L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 891L + "'", long2 == 891L);
    }

    @Test
    public void test49783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49783");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       a                   TRUE-1.0097.0                       a                                           a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...4444444444444", "                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A", 667);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test49784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49784");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "..7900");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49785");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test49786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49786");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0ue-1.0097...444444444444444444444444########################################################################################100.", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test49787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49787");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#################################################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                               0aaa                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49788");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                      ...........................................................................................");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                      ...........................................................................................\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0true-1.0              ...", "aaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0              ..." + "'", str2, "0true-1.0              ...");
    }

    @Test
    public void test49790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49790");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa", "4000                                                                                                                                                     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...         444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4000                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     " + "'", str2, "0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ");
    }

    @Test
    public void test49792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0TRUE-1.00-1.0097.0444444444444444", 13, "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a######################...##############################################      #a######################.                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0TRUE-1.00-1.0097.0444444444444444" + "'", str3, "0TRUE-1.00-1.0097.0444444444444444");
    }

    @Test
    public void test49793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49793");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(".0097.00true-1.0097.00trA0t...", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test49794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49794");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaa...44444", 841, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                             aaaaaa...44444                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                             aaaaaa...44444                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test49795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49795");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "E  I00I00TRUE  I00I00TRUE  I00I00TR    A     0TRUE  I00I00TRUE  I00I00TRUE  I00I00TR" + "'", str1, "E  I00I00TRUE  I00I00TRUE  I00I00TR    A     0TRUE  I00I00TRUE  I00I00TRUE  I00I00TR");
    }

    @Test
    public void test49796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49796");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("           A         A         A         A         A         A         A         A         A         A         A         A         A         A ...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str3, "A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test49797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49797");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test49798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("###################################################################################################################################################################################################################################################444444444444444444444440.7900.1-eurt0aaaa                                                     0.001###################################################################################################################################################################################################################################################", 9, 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################" + "'", str3, "###########################################################");
    }

    @Test
    public void test49799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0true-1.0097.4444444444444444444444444444444444444444444440true-1.0097", 260);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.4444444444444444444444444444444444444444444440true-1.0097" + "'", str2, "0true-1.0097.4444444444444444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test49800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49800");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                                                                                                                                                                                                                  4444444TRUE-1.00TRUE-1.97.                                                                                                                                                                                                                                                                                                                                   ", "                                                                                                                                                                                                                                                          ...7.044444444444444444444444444..                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test49801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49801");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test49802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49802");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("...00.7900.1-eurt00.7900.1-eurt0", "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa", strArray3, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa" + "'", str7, "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test49803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0TRUE-1.0097.0444444444444444444444444444444444444444444", 635);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0TRUE-1.0097.0444444444444444444444444444444444444444444" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0TRUE-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test49804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49804");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "T00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT", "44444444444444444444444a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49805");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444#true-1.##97.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49806");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                          444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .AAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49807");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA                                                                                                         ", 840);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49808");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("###0.001##", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                     0         ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aa", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test49809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49809");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "Aaaaaaa a a a a aaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa a a a a aaaaaaaa" + "'", str1, "aaaaaaa a a a a aaaaaaaa");
    }

    @Test
    public void test49810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49810");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    }

    @Test
    public void test49811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49811");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#a######################...##############################################", (double) 670L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 670.0d + "'", double2 == 670.0d);
    }

    @Test
    public void test49812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                           0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                          ", 551);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.790..." + "'", str2, "                                           0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.7900.1-EURT0                                                                                      0.790...");
    }

    @Test
    public void test49813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49813");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                     aaaa0aaaaa                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ", "..             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49814");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...HI!HI!HI!HI!HI!...", "                                                                                                                                                                                                                                                                                                                                  4444444TRUE-1.00TRUE-1.97.                                                                                                                                                                                                                                                                                                                                   ", 153);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...HI!HI!HI!HI!HI!..." + "'", str3, "...aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...HI!HI!HI!HI!HI!...");
    }

    @Test
    public void test49815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 741, "                 4444a44444                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444  " + "'", str3, "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444                                   4444a44444  ");
    }

    @Test
    public void test49816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49816");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49817");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("    a   HI!HI!HI!HI!HI!HI!H", 344);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49818");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "44444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49819");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", 826, "                                                                            ###    A   hi!hi!.                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                            ###    A   hi!hi!.                                                                                                                                                          ###    A   hi!hi!.                                                                                                                                                          ###    A   hi!hi!.                                                                                                                                                          ###    A   hi!hi!.                                                                                                                                                          ###    A   ...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44" + "'", str3, "                                                                            ###    A   hi!hi!.                                                                                                                                                          ###    A   hi!hi!.                                                                                                                                                          ###    A   hi!hi!.                                                                                                                                                          ###    A   hi!hi!.                                                                                                                                                          ###    A   ...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
    }

    @Test
    public void test49820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49820");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...44444444444444444444444444444444440true-1.0097...", "0true-1.0097.0");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "HI!");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("44444444444444444444444444444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097", (java.lang.Object[]) strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...44444444444444444444444444444444440true-1.0097..." + "'", str6, "...44444444444444444444444444444444440true-1.0097...");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "...44444444444444444444444444444444440true-1.0097..." + "'", str8, "...44444444444444444444444444444444440true-1.0097...");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...44444444444444444444444444444444440true-1.0097..." + "'", str10, "...44444444444444444444444444444444440true-1.0097...");
    }

    @Test
    public void test49821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49821");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(55, 125, 599);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 599 + "'", int3 == 599);
    }

    @Test
    public void test49822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49822");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("444444444444444444444444444444444444440true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00t44444444444444444444444444444444444444", "...444444444444444440true-1.0097...444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test49823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                 ", 107);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        ..." + "'", str2, "                                                                                                        ...");
    }

    @Test
    public void test49824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49824");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("44444444444444444440TRUE-1.0097.0", "                                                       true-1.00                                           true-1.97.                                                        ", 232, 66);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444440TRUE-1.0097.0                                                       true-1.00                                           true-1.97.                                                        " + "'", str4, "44444444444444444440TRUE-1.0097.0                                                       true-1.00                                           true-1.97.                                                        ");
    }

    @Test
    public void test49825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49825");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(534.0f, (float) 262, 150.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 534.0f + "'", float3 == 534.0f);
    }

    @Test
    public void test49826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49826");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(".7900.1-eu", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test49827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                          aaaa0aaaaa         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaa" + "'", str1, "aaaa0aaaaa");
    }

    @Test
    public void test49828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49828");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("AAAAA0AAAA0.7900.1-EURT04444444444444444...", "0                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49829");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("00       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       0", "a#4#...", "0true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test49830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49830");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    ", "...AA                                                                                            a    44                                                                                            a    44                                                                                            a    44                                                                                            a    44                                                                                            a    44                        ...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Aaaaaaaaaaa4444444...4444444...4444444...4", "############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaa4444444...4444444...4444444...4" + "'", str2, "Aaaaaaaaaaa4444444...4444444...4444444...4");
    }

    @Test
    public void test49832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49832");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444444444444444 ", 820, "A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444 A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A      A           " + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444 A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A      A           ");
    }

    @Test
    public void test49833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 58);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49834");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaa0aaaa                     ", "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", 456);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaa0aaaa                     " + "'", str4, "aaaaa0aaaa                     ");
    }

    @Test
    public void test49835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           " + "'", str2, "                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ");
    }

    @Test
    public void test49836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49836");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...aaaa...", "                                                                                                                                                                                                                            ...A ..                                                                                                                                                                                                                             ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49837");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440TRUE-1.0097...44444", 363, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440TRUE-1.0097...44444" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440TRUE-1.0097...44444");
    }

    @Test
    public void test49838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49838");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 6, 232.0d, (double) 234L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 234.0d + "'", double3 == 234.0d);
    }

    @Test
    public void test49839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49839");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49840");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970hhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49841");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str1, "0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test49842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49842");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...", "", "                                                                                                                                                                                                                                                                                                                                                                                                                 !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH                                                                                                                                                                                                                                                                                                                                                                                                                 ", 468);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!..." + "'", str4, "true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
    }

    @Test
    public void test49843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Aaaaaaaaaa", 523);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49844");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444                                      100.0                                                     aaaa444444444444444444444", "097.0                       a                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test49845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49845");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", 56, 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444" + "'", str3, "444444444444444444444444444444");
    }

    @Test
    public void test49846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49846");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49847");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444################################################################################################", "                                                                                               100.", 95);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "0                       A                                 true                       A                                 -                       A                                 1                       A                                 .                       A                                 0097                       A                                 .                       A                                 0", 449, 614);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test49848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49848");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test49849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hI!################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!################################" + "'", str1, "Hi!################################");
    }

    @Test
    public void test49850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("A    44444444444444444444444444444444444444444440true-1.0097.0", 385);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A    44444444444444444444444444444444444444444440true-1.0097.0" + "'", str2, "A    44444444444444444444444444444444444444444440true-1.0097.0");
    }

    @Test
    public void test49851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49851");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("444", strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test49852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                              aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                              aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa" + "'", str1, "                                                              aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa");
    }

    @Test
    public void test49853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49853");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0" + "'", str3, "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test49854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49854");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aa 100.0aaaa", "4444444444444444444444444444444444444444444 a A A A 97", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aa 100.0aaaa" + "'", str3, "aa 100.0aaaa");
    }

    @Test
    public void test49855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49855");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" 44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49856");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 4, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
    }

    @Test
    public void test49857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49857");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440true", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49858");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test49859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49859");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("...                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49860");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097 ", (java.lang.CharSequence) "4444444444444444444444444444440ta4444444444444444444444444444440t 4444444444444444444444444444440t44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test49861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49861");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A         A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.", "...      0aaaa               ...", 669);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test49862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49862");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
    }

    @Test
    public void test49863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49863");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0                                                                                                                                                                                                                                                                          0                                                               A A A A A0                                                                                                                                                                                                                                                                          0                                                               ", (java.lang.CharSequence) "0.7900.1-EURT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test49864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "######################################################################################################444444444444444440true-1.0097...444444444444444444444444                                                                                        100.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49865");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("a4a4a4a444444444444444444444444A44444444444444444444444...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAA", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49866");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "..             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49867");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0true-1.0097.04444444444444444444444444444444444444444444", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             a     ", 841);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49868");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 38, (float) 78);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 78.0f + "'", float3 == 78.0f);
    }

    @Test
    public void test49869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(".ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A" + "'", str2, ".ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A");
    }

    @Test
    public void test49870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49870");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-10aaaa00970aaaa0                                                                                                                                       A    aaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49871");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("    a   HI!HI!                                                                                      ", "########...aaaa0aaaaa44444#########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test49872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A     " + "'", str2, "    A     ");
    }

    @Test
    public void test49873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49873");
        char[] charArray7 = new char[] { '4', '4', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test49874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49874");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "##100.0###");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444...", strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444..." + "'", str6, "4444444...");
    }

    @Test
    public void test49875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49875");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444440true-1.0097...444444444444444444444444", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                      41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test49876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49876");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444             AAAA0AAAAA                 AAAA0AAAAA                 AAAA0AAAAA                 AAAA0AAAAA  ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
    }

    @Test
    public void test49877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ue-1.0097...444444444444444444444444########################################################################################100.", "4444 444444444 44444444444444444444444444444444444444444444444444444    4444 444444444 444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ue-1.0097...444444444444444444444444########################################################################################100." + "'", str2, "ue-1.0097...444444444444444444444444########################################################################################100.");
    }

    @Test
    public void test49878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49878");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test49879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49879");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
    }

    @Test
    public void test49880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49880");
        long[] longArray1 = new long[] { (short) 100 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test49881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", "......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h" + "'", str2, "           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
    }

    @Test
    public void test49882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a     0trae-1.0097.00trae-1.0097.00trae-1.0097.00trhiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahh", "                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49883");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH A                                       74.4004true4-414.400974.4004tr4 4A4 44444444444444444444444444444444444444444444444444474.4004true4-414.400974.4004tr4 4A4");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "...444###################################################44444444444444444444444", 216, 191);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test49884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49884");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 625L, 7.0d, (double) 78);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.0d + "'", double3 == 7.0d);
    }

    @Test
    public void test49885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49885");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                              4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test49886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49886");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0", "##############################true-1.97.############################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49887");
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                            ", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "97.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0a", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test49888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49888");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49889");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0true-1.0A A A A                        a44444...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test49890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aa", 669);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test49891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49891");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...40TRUE-1.0097.04444444444444444444444444444444444...", "444...44444444444444444444444444444444440TRUE-1.0097", 618);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49892");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "0true-1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test49893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49893");
        long[] longArray1 = new long[] { 99L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[99]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 99L + "'", long3 == 99L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
    }

    @Test
    public void test49894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                 ...                                                     444444444444444440true-1.0097...444444444444444444444444", 664, 599);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 ...                                                     444444444444444440true-1.0097...444444444444444444444444" + "'", str3, "                 ...                                                     444444444444444440true-1.0097...444444444444444444444444");
    }

    @Test
    public void test49895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49895");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("!hi!h!hi!h44444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49896");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(".001 444440true-1.0097...4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".001 444440true-1.0097...4" + "'", str1, ".001 444440true-1.0097...4");
    }

    @Test
    public void test49897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49897");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", ".............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................79...1-eurt", 732);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test49898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49898");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("A         ", 14.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test49899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49899");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                           ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!H4444404444HI!HI.A A A", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("A00       000       000       0", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaa000true000-00000000097000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       000       000       " + "'", str2, "       000       000       ");
    }

    @Test
    public void test49901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49901");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA 0true-1.00-1.0097.0444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aE444444444444444444444HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49902");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaa", "                                                                                                                                  aaaa0                                                                                                                                  ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97", 135);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaa" + "'", str4, "####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaaa...aaaaaa");
    }

    @Test
    public void test49903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49903");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                      ", "                                                                                                                                                                                                                                                                                                                                                        004444444000444444400044444440011                                                                                                                                                                                                                                                                                                                                                        ", 216);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444A44444", "0000000000000000000000000000000000000000000000000000000000000...000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000...000000000000000000000000000" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000...000000000000000000000000000");
    }

    @Test
    public void test49905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49905");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str3, "    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str4, "    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str5, "    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str6, "    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test49906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("A0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1." + "'", str2, "A0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.");
    }

    @Test
    public void test49907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49907");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test49908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49908");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test49909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "A.7ee444ee44440.7ee444ee44440.7ee444ee44440.7e");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49910");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49911");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(87, 179, 951);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 87 + "'", int3 == 87);
    }

    @Test
    public void test49912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A A A A A A A A A A A A A A A A A A A A A A A A 4479     000       000       09700       000       0", "", "a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A A A A A A A A A A A A A A A A A A A A A A A A 4479     000       000       09700       000       0" + "'", str3, "A A A A A A A A A A A A A A A A A A A A A A A A 4479     000       000       09700       000       0");
    }

    @Test
    public void test49913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49913");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               4444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               4444444444444444444" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               4444444444444444444");
    }

    @Test
    public void test49914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49914");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAATRUE97TRUE97AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...44444444444...                                                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A" + "'", str1, "00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A");
    }

    @Test
    public void test49916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49916");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A      A                            100.0                                                     aaaa", (short) 44);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 44 + "'", short2 == (short) 44);
    }

    @Test
    public void test49917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49917");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444aaaaa0aaaa         ...     ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH A                                       74.4004true4-414.400974.4004tr4 4A4 44444444444444444444444444444444444444444444444444474.4004true4-414.400974.4004tr4 4A4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 186 + "'", int2 == 186);
    }

    @Test
    public void test49918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "444444444444444440TRUE-1.0097...444444444444444444444444                                                                                        100.0TRUE-1.0aaaaA44444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49919");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444...4444444...4444444...4...", "444440true-1.0097.0100.0");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '#', 0, 0);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.0444444444444444444444444444", '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5, strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                           ", strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str14, "0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test49920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49920");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                       true  ", "0true-1.0097...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49921");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0", "...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49922");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A0T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49923");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test49924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49924");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444TRUE-1.497.44444444444444444444444444444444444444444444", 726);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test49925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49925");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test49926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49926");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aa                100.0aaaa                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aa                100.0aaaa                  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49927");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       ...      a         a         a         a         a0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49928");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                                   ...                                                                                                                                                                                                               ", "aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test49929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49929");
        char[] charArray7 = new char[] { '4', '4', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test49930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa", "...   #a#4444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa");
    }

    @Test
    public void test49931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49931");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", "            444444444444444  444444444444444             ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test49932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49932");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("        a                     44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test49933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49933");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097......44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097......44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097......44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097......44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("   4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   ", "a    44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   " + "'", str2, "   4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   ");
    }

    @Test
    public void test49935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49935");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "                                                                                                                hi4!                                                                                                                hi4!                                                                                                                hi4!                                                                                                                hi4!                       ##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49936");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                               tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr", "44444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "...4444444...444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444...444444444..." + "'", str1, "...4444444...444444444...");
    }

    @Test
    public void test49938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                             ...                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test49939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49939");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test49940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49940");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(134.0d, 0.04444444552063942d, 4.4444444444444445E42d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04444444552063942d + "'", double3 == 0.04444444552063942d);
    }

    @Test
    public void test49941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49941");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49942");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("...4...4444444..#########.                                                   ...4...4444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49943");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 650, 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49944");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("......4444444...4444444...4444444.....", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("#######04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 #######", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 234 + "'", int15 == 234);
    }

    @Test
    public void test49945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49945");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "true............44444444444444444444444444444444444444444440true-1.0097.a44444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097...", (java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49946");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                     4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49947");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "    a   HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49948");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa0HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa0HI!HI!HI" + "'", str1, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa0HI!HI!HI");
    }

    @Test
    public void test49949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49949");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                       444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49950");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test49951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49951");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                       !HI!HI!HI!HI!HI!HI!HI!HI!", "                    444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                     a        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     a        " + "'", str1, "                     a        ");
    }

    @Test
    public void test49953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49953");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...44440true-1.0097.00true-1.0097.00true-1.0097.00tr", "44444444", 589);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49954");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test49955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT" + "'", str1, "EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT");
    }

    @Test
    public void test49956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444A44444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444A44444444" + "'", str1, "444444A44444444");
    }

    @Test
    public void test49957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49957");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("444444TRUE-1.97.4444444444444444444444444444444444444444444", "                                   ...                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49958");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 135, 256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49959");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
    }

    @Test
    public void test49960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49960");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49961");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49962");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097", "44444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 37);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test49963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49963");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...44444...true-1.4444444...97.4444444...4444444444444...                  4", 656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49964");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...A..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49965");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a   HI!HI!...", "44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49966");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test49967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49967");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                       ", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("...44a44444                       ...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test49968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("true-1....97true-1....97", 188, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1....97true-1....97####################################################################################################################################################################" + "'", str3, "true-1....97true-1....97####################################################################################################################################################################");
    }

    @Test
    public void test49969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49969");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49970");
        double[] doubleArray6 = new double[] { 181.0f, 57L, 4.4444042E9f, 444, 50.0d, 25L };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[181.0, 57.0, 4.444404224E9, 444.0, 50.0, 25.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.444404224E9d + "'", double8 == 4.444404224E9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.444404224E9d + "'", double9 == 4.444404224E9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 25.0d + "'", double10 == 25.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 25.0d + "'", double12 == 25.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.444404224E9d + "'", double13 == 4.444404224E9d);
    }

    @Test
    public void test49971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49971");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     a    ", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4true-1.4497.4444444444444444444444444444", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A    ", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test49972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49972");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 149.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 149.0d + "'", double2 == 149.0d);
    }

    @Test
    public void test49973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49973");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test49974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         true-1        true-1        true-1        true-1        true-1        true-1        true-1      ", "...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         true-1        true-1        true-1        true-1        true-1        true-1        true-1      " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         true-1        true-1        true-1        true-1        true-1        true-1        true-1      ");
    }

    @Test
    public void test49975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
    }

    @Test
    public void test49976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49976");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                100.0aaaa                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49977");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaa", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa" + "'", str3, "aaaaaaa");
    }

    @Test
    public void test49978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49978");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 164, (double) 951);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 951.0d + "'", double3 == 951.0d);
    }

    @Test
    public void test49979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49979");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49980");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...........#######################################################################################", "      00", 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test49981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49981");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49982");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                   ", "0true-1.00                                           true-1.97.                                                                                   ", "97atrue-1.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                   " + "'", str3, "                                                                                                                   ");
    }

    @Test
    public void test49983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49983");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("AAAAAAA...", "                                                                                                                                       A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49984");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("....4444444444444444444444444444...", "true444...44444444444444444444444444444444440TRUE-1.0097...44");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49985");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" A 4479     000       000       09700       000       0", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test49986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "A         A                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test49987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUETRUE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUETRUE" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUETRUE");
    }

    @Test
    public void test49988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49988");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0444444444       44444A   hi!hi!0444444444       44444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49989");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("044444444444444444444444444", (double) 153);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444444444444444E25d + "'", double2 == 4.444444444444444E25d);
    }

    @Test
    public void test49990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49990");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                      ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test49991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49991");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49992");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test49993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49993");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("   !    ", 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test49994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49994");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49995");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test49996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49996");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test49997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49997");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaa4444444...4444444...4444444...4", "4444444...4444444...4444444...4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test49998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49998");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970hhhhhhhhhhhhhhhh", "...A ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test49999");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("...               A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...               A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest99.test50000");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                    true4-4449744                                                                                                           ", "                                                                                100.0#####100.0###                                                               0                                                                                 100.0#####100.0###     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

