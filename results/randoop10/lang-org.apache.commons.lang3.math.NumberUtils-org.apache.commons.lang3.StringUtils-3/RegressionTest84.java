import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest84 {

    public static boolean debug = false;

    @Test
    public void test42001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42001");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    }

    @Test
    public void test42002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42002");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "                                 ...4444444...444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42003");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             ...0TRUE-1.0097...                             ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42004");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4 .44444444444444444444444444444444A", "   !    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 448);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                           00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                           00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr                                                                                                                                                                                            ");
    }

    @Test
    public void test42007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42007");
        float[] floatArray6 = new float[] { (short) 1, 9, 100.0f, 86, (byte) -1, (byte) 0 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
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
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
    }

    @Test
    public void test42008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42008");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("  4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", (short) 4);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 4 + "'", short2 == (short) 4);
    }

    @Test
    public void test42009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42009");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(".044444444444444444444444444", "...444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", 615);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".044444444444444444444444444" + "'", str4, ".044444444444444444444444444");
    }

    @Test
    public void test42010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                  ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444                                                                                   ", "rt00.7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rt00.7900.1-eurt0" + "'", str2, "rt00.7900.1-eurt0");
    }

    @Test
    public void test42011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42011");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", "######################################044444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42012");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...                                                                             ......                                                                             ......                                                                             ......                                                                             ......                                                                             ......      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                                                             ......                                                                             ......                                                                             ......                                                                             ......                                                                             ......" + "'", str1, "...                                                                             ......                                                                             ......                                                                             ......                                                                             ......                                                                             ......");
    }

    @Test
    public void test42013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42013");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!...1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", 52, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!...1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str3, "1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!...1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test42014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42014");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.04 4                                                                                              0097..0true-1.0097.040true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42015");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.", "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0TRUE-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "97 true-1.", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa                              ", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa                              " + "'", str8, "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa                              ");
    }

    @Test
    public void test42016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 657, "ahi!hi!hi!haaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42017");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa", 104, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 121 + "'", int3 == 121);
    }

    @Test
    public void test42018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "4444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444a         a    0001                                                     a         a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42019");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAA0AAAAA AAAA0AAAAA AAAA0AAAAA AAAA0AAAAA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test42020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test42021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42021");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("..    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ", 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test42022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42022");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("################################################################0TRUE-1.04444444...4444444...444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################################################0TRUE-1.04444444...4444444...444" + "'", str1, "################################################################0TRUE-1.04444444...4444444...444");
    }

    @Test
    public void test42024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!.....", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A                                                                                     a ..." + "'", str2, "A                                                                                     a ...");
    }

    @Test
    public void test42025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42025");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                     aaaa0aaaaa   ", " 0044444440004444444000                         00444444400044444440004", 957);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "##############################################################4true4-4449744########################################");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test42026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaa0a4444444...                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00" + "'", str2, "00");
    }

    @Test
    public void test42027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...", "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!..." + "'", str2, "true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
    }

    @Test
    public void test42028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42028");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0true-1 0097 044444444444444444444444444 4", "", "                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444                  ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test42029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42029");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42030");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...44444444444444444444a", "A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test42031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                                                  44444444444444444440true-1.0097", 465);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                  44444444444444444440true-1.0097" + "'", str2, "                                                                                                                                                                                                                  44444444444444444440true-1.0097");
    }

    @Test
    public void test42032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42032");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0", "#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42033");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAA", "..................................");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42034");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA", "", 34);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test42035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42035");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                  ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444                                                                                                                                                         A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440trueaaaaaaaaaaaaaaa", "a...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test42037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                                                 ###0.001##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test42038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42038");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(72.0f, (float) 56L, 16.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 72.0f + "'", float3 == 72.0f);
    }

    @Test
    public void test42039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42039");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0097...0097...0097...0097...", "A A A A ", 826);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                        ", "aaaaa0aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                        " + "'", str2, "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                        ");
    }

    @Test
    public void test42041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42041");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "44444444444444444444444444444444444444444AAAAAAAAA...4444444   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444AAAAAAAAA...4444444   " + "'", str1, "44444444444444444444444444444444444444444AAAAAAAAA...4444444   ");
    }

    @Test
    public void test42042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42042");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...44444444444444444444444                 ...                                                     ", "44444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097 ", 449);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42043");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 173.0f, (double) 667.0f, 252.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 667.0d + "'", double3 == 667.0d);
    }

    @Test
    public void test42044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42044");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0       00");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test42045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42045");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                      a         a         a         a         a      ", "                                                                                                                          4444444...4444444...4444444...4...", 548);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42046");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test42047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("   1000    .         .         ", "#0true-1.0097.0##########################################0true-1.0097.0############################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   1000    .         .         " + "'", str2, "   1000    .         .         ");
    }

    @Test
    public void test42048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42048");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0true-1.0097.00tr");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42049");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("     ...44                                 ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test42050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                       a                             ", "0 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       a                             " + "'", str2, "                       a                             ");
    }

    @Test
    public void test42051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42051");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000" + "'", str1, "000");
    }

    @Test
    public void test42052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42052");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42053");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                          ", (double) 58L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58.0d + "'", double2 == 58.0d);
    }

    @Test
    public void test42054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42054");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".0097.00true-1.00", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 72, 741);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 72");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1", 250, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA1" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA1");
    }

    @Test
    public void test42056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0      A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0      a         a         a         a         a         a         a         a         a         a         a         a         a         a" + "'", str1, "art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0      a         a         a         a         a         a         a         a         a         a         a         a         a         a");
    }

    @Test
    public void test42057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42057");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...44444444444444444444444444444444440true-A...44444444444444444444444444444444440true-", 110, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444444444444444444444444440true-A...44444444444444444444444444444444440true-44444444444444444444444" + "'", str3, "...44444444444444444444444444444444440true-A...44444444444444444444444444444444440true-44444444444444444444444");
    }

    @Test
    public void test42058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42058");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                     0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42059");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa" + "'", str4, "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test42060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42060");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("AAA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1 0097   AA", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test42061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42061");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("            444444444444444  444444444444444             ..", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42063");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42064");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                               ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42065");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                      ", "  ...", 45);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                      " + "'", str4, "                                                      ");
    }

    @Test
    public void test42066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42067");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test42068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...            ...            ...            ...            ...            ...            ...         ...4#444hi!hi!hi!h############################...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "########################################################################################################################################################################################################################################################################################################################################################################TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR########################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test42070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42070");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444...aaaaaaaaa44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test42071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42071");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("900.1-EURT0444444444444444444444444444", "                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1..9.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1..9.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42072");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "...                                                   ...                                                   ...                                                   ...                                                   ...                                      ###    a   HI!HI!....                                                   ...                                                   ...                                                   ...                                                   ...                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test42073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42073");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                                                                  ", "0TRUE-1.009", 721);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...A ..", 448);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                            ...A ..                                                                                                                                                                                                                             " + "'", str2, "                                                                                                                                                                                                                            ...A ..                                                                                                                                                                                                                             ");
    }

    @Test
    public void test42075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42075");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444 44444 4444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42076");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42077");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444444444444444444444444444444 !", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                                                                                                                                         rue-1.0097.0                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rue-1.0097.0" + "'", str1, "rue-1.0097.0");
    }

    @Test
    public void test42079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42079");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       ", 190);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...aaaaaaaaaaaaaaa...", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaaa...           " + "'", str2, "...aaaaaaaaaaaaaaa...           ");
    }

    @Test
    public void test42081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("A0", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      A0" + "'", str2, "                                                      A0");
    }

    @Test
    public void test42082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42082");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444444444444", 113);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42083");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42084");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0TRUE-1.009...", "TR.0097.00TR.0097.00TR.0097.00TR.0097.00TR.0097.00TR", "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " a UE-1       " + "'", str3, " a UE-1       ");
    }

    @Test
    public void test42085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42085");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test42086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42086");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                          ", "0TRUE-1.00-1.0097.04444444444444444444444444444444AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42087");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                            0097.                                                 ", "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44", "...####################################..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                            0097.                                                 " + "'", str3, "                                                                            0097.                                                 ");
    }

    @Test
    public void test42088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42088");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4777777777777777777777aaaa0aaaaa777777777777777777777777777777777777777777aaaa0aaaaa777777777777777777777777777777777777777777aaaa0aaaaa7777777...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test42089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                  ", 734);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42090");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444 ", "                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42091");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                    44444444444444444440true-1.009", " . 97 . 4444444444444444444444444444444444444444444", 179);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42092");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa" + "'", str1, "aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa");
    }

    @Test
    public void test42093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42093");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...", 0, "                                                            0aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ..." + "'", str3, "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...");
    }

    @Test
    public void test42094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAAAAA0AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42095");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                       #A#44444444444444444444#...#44444444444444444444444444444444444444...", 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42096");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42097");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42098");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0true-1 0097 044444444444444444444444444 4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42099");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...444444440tr...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...444444440tr..." + "'", str1, "...444444440tr...");
    }

    @Test
    public void test42100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "           aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42102");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...", (double) 136L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 136.0d + "'", double2 == 136.0d);
    }

    @Test
    public void test42103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaa 44444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa 44444" + "'", str2, "aaaaa 44444");
    }

    @Test
    public void test42104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42104");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("AAAAAAAAAAAAAAAAAA       TRUE       TRUE       TRUE ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAA       TRUE       TRUE       TRUE \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42105");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42106");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                              ", "444444444444444444444444...4444444444444444444444444444444444A         A                                  TRUE-1.A         A                                  A         A                                  97...444444444444444444444444", "                     AAAAAA0AAAAAAA              ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test42107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                 I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test42108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42108");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "a444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test42109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42110");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaa", (java.lang.CharSequence) "                                                                                             100.                                                                                             100.                                                                                         rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                             100.                                                                                             100.                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    0true-1.00-1.0097.04444444444444444444444444444444444444444444", 734);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    0true-1.00-1.0097.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    0true-1.00-1.0097.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test42112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42112");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                       ...4...4444444...4444444...4444444                                                                                                                          0                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...44444444444...                                                                                                                                                                                                       ", "444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A    A00 000 0", 445);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A    A00 000 0                                                                                                                                                                   " + "'", str2, "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A    A00 000 0                                                                                                                                                                   ");
    }

    @Test
    public void test42115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42115");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...", "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444440true-1.00###########################################################################################################################################################################################################################", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH", "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42117");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(267.0f, (float) 2L, (float) 98L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test42118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42118");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...IH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444...Aa4a4a4a444444444444444444444444", "4444A44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444...Aa4a4a4a444444444444444444444444" + "'", str2, "0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444...Aa4a4a4a444444444444444444444444");
    }

    @Test
    public void test42120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42120");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0atruea-a1a.a00aaaa4444444444444", "4444444...                            ", 4444444);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "...A ..");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 848, 461);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test42121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                      100.0                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42122");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'a', 671, 121);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test42123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42123");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                       a                             ", "44...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", 188);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "aaaa0a4444444...                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42125");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i44444444444444444444444444444444444444444444TRUE-10497044444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i44444444444444444444444444444444444444444444TRUE-10497044444444444444444444444444444444444444444444" + "'", str1, "i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i44444444444444444444444444444444444444444444TRUE-10497044444444444444444444444444444444444444444444");
    }

    @Test
    public void test42126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42126");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("########################################44444444444444444440TRUE-1.0097.", '4');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaA", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test42127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42127");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaa0aaaaa                                             aaaa0a                                                                                                                                                                                                                                                                                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     aaaaaaaaaaaaaaaaaaaaaaaaa...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42128");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     ...0TRUE-1.0097...", "                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                                                                                                                                                     ", 252);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444444444true444444444444444444444444444444444444444", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444true444444444444444444444444444444444444444" + "'", str2, "44444444444true444444444444444444444444444444444444444");
    }

    @Test
    public void test42130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                                                                                                                                                                  aaaaaaaaaa                                                                                                                                                                                                                                                                                                                   ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                   a                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                   a                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test42131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("att-------ttt-------ttt-------t", 125, "                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 aaaaaaaaaaaaaaatt-------ttt-------ttt-------t                                 aaaaaaaaaaaaaa" + "'", str3, "                                 aaaaaaaaaaaaaaatt-------ttt-------ttt-------t                                 aaaaaaaaaaaaaa");
    }

    @Test
    public void test42132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42132");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "0", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "            1000    a         a");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444" + "'", str6, "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test42133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...4444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42134");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                           true 1.  97                                                                                                                                                                                                                                                                            4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42136");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(951, (int) (short) 4, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test42137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42137");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97", 546.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 546.0f + "'", float2 == 546.0f);
    }

    @Test
    public void test42138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..444444" + "'", str1, "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..444444");
    }

    @Test
    public void test42139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42139");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi..444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test42140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42140");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("7.44444444444444444444444444444444A    4", 445, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "1aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "44444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test42142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42142");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("A     0true-1.0097.00true-1.0097.00true-1.0097.00t", 957, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", " true 1.  97.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097." + "'", str2, "444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test42144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0097...4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0097...4" + "'", str1, "0097...4");
    }

    @Test
    public void test42145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42145");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      ...                                                    ", "true4-4449744");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 570, 186);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test42146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42146");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 44.0f, (double) 21.0f, (double) 92L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21.0d + "'", double3 == 21.0d);
    }

    @Test
    public void test42147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42147");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "A A A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42148");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test42150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" true-1.  97. ", 0, 202);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " true-1.  97. " + "'", str3, " true-1.  97. ");
    }

    @Test
    public void test42151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42152");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0       00", "...aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42153");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("044444444444444444444444444                                                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!", 11, 650);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42154");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...40TRUE-1.0097.04444444444444444444444444444444444...a a a a", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42155");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("h", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                             00       0                 ", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                              0097..", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                     4444444444444444444444444444444444444444444a.79a.1-eurta44444444444444444444444444444444444", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 14 + "'", int16 == 14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 94 + "'", int17 == 94);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 23 + "'", int19 == 23);
    }

    @Test
    public void test42156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42156");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                           !IH                                                                                                                                                                                                                                                                                                                                            ", 139);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42158");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("7.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42159");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a    ", "0true-1.0097.0aaaa0aaaaa", 109);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42160");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A", "1000", 665);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("a0aaaaa0true-1.0097.0444", "04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0aaaaa0true-1.0097.0444" + "'", str2, "a0aaaaa0true-1.0097.0444");
    }

    @Test
    public void test42162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42162");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42163");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE97TRUE97aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "ue-144444444444444444444444444444444########################################################################################144444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ue-144444444444444444444444444444444########################################################################################144444444444444444444444444444444444444444444444444444" + "'", str1, "Ue-144444444444444444444444444444444########################################################################################144444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test42165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42165");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("e7.04444ee444ee7.04444ee444ee7.04444ee444ee7. A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42166");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("AAAA", "", 660);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test42167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42167");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444", "                                                                                                                                                                                                                 100.0                                                                                                                                                                                                                  ", "                     AAAA0AAAAA              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444" + "'", str3, "a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
    }

    @Test
    public void test42168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!", "                     aaaa0aaaaa                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!" + "'", str2, "hi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
    }

    @Test
    public void test42169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42169");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                 4A4                                                ", 435);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42170");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "  a    ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.aa97.a44444444444444444444444444a.............................................###a.aa1##.............................................aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42171");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42172");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "        a                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42173");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                             0                                                                                                                          4444444...4444444...4444444...4...                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444794444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444eurt4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                             0                                                                                                                          4444444...4444444...4444444...4...                       " + "'", str3, "                                                                                                                                                                                                                                             0                                                                                                                          4444444...4444444...4444444...4...                       ");
    }

    @Test
    public void test42174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42174");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(13L, (long) 625, (long) 461);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 13L + "'", long3 == 13L);
    }

    @Test
    public void test42175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAhI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!#######################" + "'", str1, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!################################Hi!#######################");
    }

    @Test
    public void test42176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0 tru...ue-1.0097.044444444444444444444444444444444...4444", 618);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 tru...ue-1.0097.044444444444444444444444444444444...4444" + "'", str2, "0 tru...ue-1.0097.044444444444444444444444444444444...4444");
    }

    @Test
    public void test42177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42177");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test42178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                       ###0.001##       ", 133);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                       ###0.001##       " + "'", str2, "                                                       ###0.001##       ");
    }

    @Test
    public void test42179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42179");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "000", "0000000000000000000000000000000000000000000", 441);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42180");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("rue-1.0097.00true-1.0097.0", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rue-1.0097.00true-1.0097.0" + "'", str3, "rue-1.0097.00true-1.0097.0");
    }

    @Test
    public void test42181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42182");
        float[] floatArray6 = new float[] { (short) 1, 9, 100.0f, 86, (byte) -1, (byte) 0 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 9.0, 100.0, 86.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test42183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("hI", "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI" + "'", str2, "hI");
    }

    @Test
    public void test42184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(".1-eurt00.7900.1-eurt                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".1-eurt00.7900.1-eurt                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str3, ".1-eurt00.7900.1-eurt                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test42185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42185");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("###0.001##", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444", 145, 535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
    }

    @Test
    public void test42186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42186");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAA0AAAA0.7900.1-EURT04444444444444444...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##############################################0097.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 638);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444                                      100.0                                                     aaaa444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00.0                                                     aaaa" + "'", str2, "00.0                                                     aaaa");
    }

    @Test
    public void test42188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("         aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#########.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########." + "'", str1, "#########.");
    }

    @Test
    public void test42190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42190");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...aaaaaaaaaaaaaaa...           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42191");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0atruea-a1a.a00aaaa4444444444444", "4444444...                            ", 4444444);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str8, "aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test42192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42192");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a   HI!HI!...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test42193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42193");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0aaaa", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 116, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0aaaa" + "'", str8, "0aaaa");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0aaaa" + "'", str9, "0aaaa");
    }

    @Test
    public void test42194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42194");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444440TRUE-    ...AAAA0AAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE");
    }

    @Test
    public void test42196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42196");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4true4", "                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("a         a                                                     1000    a         a", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a         a                                                     1000    a         a" + "'", str2, "a         a                                                     1000    a         a");
    }

    @Test
    public void test42198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "0true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test42199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42199");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("   44444AAAAAAAAAAAAAAAAAAAAAAAAA......", "                                                                                                                             10000#####10000###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444" + "'", str1, "444444444444444");
    }

    @Test
    public void test42201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42201");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', 277, 202);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test42202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42202");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(".0097.00true-1.000true-1.0                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444a44444                                                                                                                                                                                                                                                                ", "                                                         100.                                                          ", "                                                                                                                                 0                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444a44444                                                                                                                                                                                                                                                                " + "'", str3, "4444a44444                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test42204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42204");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42205");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "                                                                                    .001                                                                                                                                                                                  ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                        ", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                        " + "'", str3, "                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                        ");
    }

    @Test
    public void test42207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42207");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("            AAAA0AAAAA0AAAA0AAAAA0AAAA0AAAAA0AAAA0A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ", "00.0                                                     aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", 554, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str3, "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test42210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42210");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 788L, 21.0f, 17.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 788.0f + "'", float3 == 788.0f);
    }

    @Test
    public void test42211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42211");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("444444A44444444", "100.0###", 895);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42212");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                    ...aaaaaaaaaaaaaaaaaaaaaaaaa", "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                          a                                 a   HI!HI!...    a   HI!HI!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42213");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                       ##44444444444444444444#...#44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##44444444444444444444#...#44444444444444444444444444444444444444444444" + "'", str1, "##44444444444444444444#...#44444444444444444444444444444444444444444444");
    }

    @Test
    public void test42214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi       ", " true 1.  97.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42215");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("TRUE-1.##97.HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42216");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", "#", "", 840);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    " + "'", str4, "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ");
    }

    @Test
    public void test42217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42217");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                        ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("###################################    a   HI!HI!...", "04440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################    a   HI!HI!..." + "'", str2, "###################################    a   HI!HI!...");
    }

    @Test
    public void test42219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42219");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                     aaaa0aaaaa                     ", 468.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 468.0f + "'", float2 == 468.0f);
    }

    @Test
    public void test42220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0a.a7900a.a1a-aeurta0#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0a.a7900a.a1a-aeurta0#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "0a.a7900a.a1a-aeurta0#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test42221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42221");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42222");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 0, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42224");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0TRUE4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaUE-1.0097.00TR4444a444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test42225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42225");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a4000                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42227");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00..", 191);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test42228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42228");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(102L, (long) 548, 36L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 36L + "'", long3 == 36L);
    }

    @Test
    public void test42229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42229");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                     aaaa0aaaaa              ", 61, 368);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test42230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42230");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                      41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444", "h", 168);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42231");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                      ...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test42232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42232");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444.444444444.4444444444444444444444444444444444444444444444444444410004444.444444444.444444444", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E", "                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444 444444444 44444444444444444444444444444444444444444444444444444    4444 444444444 444444444" + "'", str3, "4444 444444444 44444444444444444444444444444444444444444444444444444    4444 444444444 444444444");
    }

    @Test
    public void test42233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42233");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444444444444444444a...atruea-a1a.a4444444a...a97a.a4444444a...a4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444a...atruea-a1a.a4444444a...a97a.a4444444a...a4444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444a...atruea-a1a.a4444444a...a97a.a4444444a...a4444444444444444444444444444444444444444444");
    }

    @Test
    public void test42234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42234");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 4, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test42235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  Etrue-1.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E97.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42236");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("    A         A                                                     1000    A         A         ", "...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ", 35);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("###################################    a   hi!hi!...######000###################################    a   hi!hi!...######", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test42237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444440true-1.0097...444444444444444444444444", "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0atrue 1.  97.a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aa", "44444444444true444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444");
    }

    @Test
    public void test42238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42238");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", 841);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "A", 5);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                  0aaaa                                                                                                                                  ", strArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                      ...", strArray4, strArray10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                      ..." + "'", str14, "                                                      ...");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str15, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
    }

    @Test
    public void test42239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42239");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444", 537, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444");
    }

    @Test
    public void test42240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42240");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...                                                                                               a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!...", "true                                         TRUE-1                                                                                                  44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A444", " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test42241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42241");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                     ...                                     aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa   ", "aaaaa0aaaa", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42242");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00  ", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 655);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                                                                                              #    ##########    ##########    ##########   A #    ##########    ##########    ##########  " + "'", str5, "                                                                                                                                                                              #    ##########    ##########    ##########   A #    ##########    ##########    ##########  ");
    }

    @Test
    public void test42243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42243");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42246");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", "           00#######000#######000#######0011                    ", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test42247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...00.7900.1-eurt00.7900.1-eurt0", "..00.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...00.7900.1-eurt00.7900.1-eurt0" + "'", str2, "...00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test42248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", "..7900                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42249");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("04440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "04440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444" + "'", str1, "04440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444");
    }

    @Test
    public void test42250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42250");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "TRUETRUE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 159, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aa" + "'", str3, "aa");
    }

    @Test
    public void test42252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42252");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("####################################                                         AAAA0AAAAA###################################", ".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4                                                                                                                                                                                                                                                                                                                                                                                                              ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("a...", "aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a..." + "'", str2, "a...");
    }

    @Test
    public void test42254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42254");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAhI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42255");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A   114");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444444444444444444444444444", "                                                                                                                                  0AAAA                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                  0AAAA                                                                                                                                  " + "'", str2, "                                                                                                                                  0AAAA                                                                                                                                  ");
    }

    @Test
    public void test42257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42257");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...44444444444444444444444444444444440TRUE-    A     ...44444444444444444444444444444444440TRUE-", "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42258");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                      100.0                                                      ", "...444444440tr...", 841);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("97.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                         0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test42259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-EURT0Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 290);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-EURT0Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "a4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-EURT0Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42260");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44...7900.1-eurt04444444444444444444444444444444444...444", "                                   0         aaa                                                           0         aaa                                                           0         aaa                                                           0         aaa                                                           0         aaa                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                          ...####################################..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42262");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("a0000000000", "                                                                                                                                                                                                                                          44444444444444444440true-1.0097HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ", 638);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42263");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("..####################################...", "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E", 463);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42264");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#######    a   HI!HI!...", "0       000       00790       000       000       00-0       00EURT0       00", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test42265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0true-1.0097...", 106);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097..." + "'", str2, "0true-1.0097...");
    }

    @Test
    public void test42266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42266");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaa...    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaa...    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaa...    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!");
    }

    @Test
    public void test42267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42267");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                              ...0true-1.0097...                                                                 ", 45, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              ...0true-1.0097...                                                                 " + "'", str3, "                                              ...0true-1.0097...                                                                 ");
    }

    @Test
    public void test42268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42268");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44", "AAA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1 0097   AA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42269");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444440true-1.009", "                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                   ", 957);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42271");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(424, 77, 535);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 535 + "'", int3 == 535);
    }

    @Test
    public void test42272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444", "AAA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1 0097   AA                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444");
    }

    @Test
    public void test42273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaa0aaaa0.790", 721);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaa0aaaa0.790                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                             AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaa0aaaa0.790                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test42274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42274");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                          0.79                                                                                                                                                                                                                                                                          0.1-eurt                                                                                                                                                                                                                                                                          04444444444444444444444444444444444444444444", "1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42275");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("        ", "0true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 451);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42276");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...7.044444444444444444444444444...", 205, "                                                                                 ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                 ... ...7.044444444444444444444444444...                                                                                 ... " + "'", str3, "                                                                                 ... ...7.044444444444444444444444444...                                                                                 ... ");
    }

    @Test
    public void test42277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42277");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42278");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test42279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42279");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42280");
        java.lang.String[] strArray6 = new java.lang.String[] { "a", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", strArray6, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "       444444444444444444", 623, 384);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str9, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test42281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42281");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi4!", "                                                                                                                                  0aaaa                                                                  4ue-1.0097...444444444444444444444444########################################################################################100.44                                                                                                                                  0aaaa                                                                   ", 314);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42282");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "ahi!hi!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42283");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...", "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42285");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790                    ", 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test42286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42286");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("           aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"           aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa           \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42287");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("    A         A                                                     100.0    A         A         ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A         A                                                     100.0    A         A         " + "'", str2, "    A         A                                                     100.0    A         A         ");
    }

    @Test
    public void test42288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                0.001                                      ...", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                0.001                                      ..." + "'", str2, "                                                0.001                                      ...");
    }

    @Test
    public void test42289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42289");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 'a', (float) 97L, (float) 670);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 670.0f + "'", float3 == 670.0f);
    }

    @Test
    public void test42290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42290");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("###    a   HI!HI!..", "                                                  0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42291");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 127L, (float) 150, (float) 250);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 250.0f + "'", float3 == 250.0f);
    }

    @Test
    public void test42292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                    ", 48, "           a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                    " + "'", str3, "4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                    ");
    }

    @Test
    public void test42293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42293");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       " + "'", str1, "      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
    }

    @Test
    public void test42294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test42295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42295");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(138, 269, 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 269 + "'", int3 == 269);
    }

    @Test
    public void test42296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42296");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE", "                                                                                    0.001                                                            44444444444444444440true-1.0097.", 277);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE");
    }

    @Test
    public void test42297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("A A A        ", "0true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A A A        " + "'", str2, "A A A        ");
    }

    @Test
    public void test42298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42298");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440true-1.0097                                                                                                                                                                                          " + "'", str1, "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440true-1.0097                                                                                                                                                                                          ");
    }

    @Test
    public void test42299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42299");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ih444444444444444444........4444444444...4444444440444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440100444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih444444444444444444........4444444444...4444444440444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440100444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440" + "'", str2, "ih444444444444444444........4444444444...4444444440444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440100444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440");
    }

    @Test
    public void test42301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440010444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440444444444...4444444444........444444444444444444hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440010444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440444444444...4444444444........444444444444444444hi" + "'", str1, "0444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440010444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440444444444...4444444444........444444444444444444hi");
    }

    @Test
    public void test42302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42302");
        java.lang.CharSequence charSequence9 = null;
        char[] charArray16 = new char[] { '4', '4', ' ' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence9, charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444...", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Aaaaaaaaa", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                 aaaa0aaaaa", charArray16);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a    44", charArray16);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                       a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ", charArray16);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...###################################################", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test42303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42303");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0aaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42304");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                      ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                      " + "'", str3, "                                                      ");
    }

    @Test
    public void test42305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42305");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test42306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42306");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                   ", 47);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", (java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str5, "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str6, "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test42307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42307");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("true                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           " + "'", str1, "TRUE                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           ");
    }

    @Test
    public void test42308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                               !hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA         A         A        ...", "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                               !hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    " + "'", str3, "                                                               !hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ");
    }

    @Test
    public void test42309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42309");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaa      a         a         a         a         aaaaaaaa", "...t0444444444444444444444444444...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", '#');
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("hi", "                                ", 7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("                                         ...444444440tr...                                          ", strArray9, strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444", strArray9);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...a ..", strArray4, strArray17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                         ...444444440tr...                                          " + "'", str14, "                                         ...444444440tr...                                          ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "...a .." + "'", str18, "...a ..");
    }

    @Test
    public void test42310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42310");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0", (java.lang.CharSequence) "####################################...####################################...####################################...####################################...                                     100.0                                                     aaaa                                     ####################################...####################################...####################################...####################################...                                 1000    .         .             1000    .         .          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 368 + "'", int2 == 368);
    }

    @Test
    public void test42311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42311");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, 660, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test42312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42312");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("######################################################HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA ", 349L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 349L + "'", long2 == 349L);
    }

    @Test
    public void test42313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42313");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(25.0f, (float) 77L, (float) 16L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
    }

    @Test
    public void test42314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42314");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                        ...0TRUE-1.0097...                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42315");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("974444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                           true 1.  97                                                                                                                                                                                                                                                                            444444444", "...44444444444444444444444         000", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "            444444444444444  444444444444444             ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42317");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               ", charArray14);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 260 + "'", int23 == 260);
    }

    @Test
    public void test42318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42319");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                                                                                  ###########################################################################################################################################################################################################################00.1-eurt0                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                   0true-1.00###########################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                  " + "'", str1, "                                                                                                                                                                                                                                                                                                                   0true-1.00###########################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test42320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42320");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "        art           tra                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################00   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42321");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0 true - 1");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                          0.79                                                                                                                                                                                                                                                                          0.1-eurt                                                                                                                                                                                                                                                                          04444444444444444444444444444444444444444444", 150);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444                                                                                                        ..." + "'", str2, "4444444444444444444444444444444444444444444                                                                                                        ...");
    }

    @Test
    public void test42323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42323");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("a0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42324");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 146, (long) 533, 127L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 533L + "'", long3 == 533L);
    }

    @Test
    public void test42325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42325");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444444 ...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                    4                                                 100.0                                                                             aaaa0aaaaa       ...                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444 ..." + "'", str3, "444444444 ...");
    }

    @Test
    public void test42326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42326");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                             9EURT79EURT                                                                                                                                                                                                                                                                                                                             ", "a         a                                                     1000    a         a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42327");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("..0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", (double) 623.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 623.0d + "'", double2 == 623.0d);
    }

    @Test
    public void test42328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42328");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a.7900.1-eurt0444444444444444444444444444444444444444444444a.7900.1-eurt04444444444444444444a.7900.1-eurt04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test42329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42329");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test42330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "                     0         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test42331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42331");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 7900 1-EURT04444444444444444444444444444444444444444444", "                                                                                                                                                                                                                            ...A ..                                                                                                                                                                                                                             ", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42332");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42333");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...........................................................................................................................................................................", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("A         A                                                     100.0    A         A0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a4444444444444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test42334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42334");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                                                  44444444444444444440true-1.0097");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                                                                                                                                                   44444444444444444440true-1.0097 is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42335");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "      A         A         A         A         A", 260);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42336");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-eurt04444444444444444444444444444444444...444", 463, "..7900");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-eurt04444444444444444444444444444444444...444..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900" + "'", str3, "..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-eurt04444444444444444444444444444444444...444..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900");
    }

    @Test
    public void test42337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", "44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
    }

    @Test
    public void test42338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42338");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0000000444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000", " aaaa0aaaaa    ", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42339");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "0                                                                                                                                                                                                                                                                          0                                                               A A A A A0                                                                                                                                                                                                                                                                          0                                                               ", (java.lang.CharSequence) "                     aaaaaa0aaaaaaa              ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0                                                                                                                                                                                                                                                                          0                                                               A A A A A0                                                                                                                                                                                                                                                                          0                                                               " + "'", charSequence2, "0                                                                                                                                                                                                                                                                          0                                                               A A A A A0                                                                                                                                                                                                                                                                          0                                                               ");
    }

    @Test
    public void test42340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42340");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42341");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "      aaaa..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     A" + "'", str2, "     A");
    }

    @Test
    public void test42343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42343");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("....4444444444444444444444444444...aaaaaaa7.44444444444444444444444444444444A    4aaaaaa....4444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42344");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42345");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 128, (float) 62, 671.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 671.0f + "'", float3 == 671.0f);
    }

    @Test
    public void test42346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 46, "                                         AAAA0AAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test42347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444...4444444...4444444...4...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A0T", 537, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A0T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "aaaaaaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A0T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test42349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", "0TRUE-1.00-1.0097.0444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa" + "'", str2, "aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
    }

    @Test
    public void test42350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42350");
        int[] intArray6 = new int[] { (short) 10, 'a', 266, 32, 24, (short) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 266, 32, 24, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 266 + "'", int12 == 266);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test42351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42351");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaa0aaaaa");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", "0 true - 1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097." + "'", str2, "444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test42353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa      ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42354");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "...0TRUE-1.0097...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42355");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("         ...", (short) 4);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 4 + "'", short2 == (short) 4);
    }

    @Test
    public void test42356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h##########################################hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h###########################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("a A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444", 95, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444" + "'", str3, "a A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444");
    }

    @Test
    public void test42358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("a0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 149, ".0097.00TRUE-1.0097.00TRUE-1.0097.00TR                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".0097.00TRUE-1.0097.00TRUE-1.0097.00TR             a0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR.0097.00TRUE-1.0097.00TRUE-1.0097.00TR              " + "'", str3, ".0097.00TRUE-1.0097.00TRUE-1.0097.00TR             a0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR.0097.00TRUE-1.0097.00TRUE-1.0097.00TR              ");
    }

    @Test
    public void test42359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42359");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("      a         a         a         a         a", (double) 138);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 138.0d + "'", double2 == 138.0d);
    }

    @Test
    public void test42360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42360");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                         AAAA0AAAA", "                                                                                                                                                                                            0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A                                 100.0                                                     aaaa..                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("######################################################################################################################################################################################################################################################################################################################################################################################################################Ue-1.0097...444444444444444444444444########################################################################################100.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                              a                        A A A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42362");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "a0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42363");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("...t0444444444444444444444444444...", 44.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test42364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42364");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test42366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42366");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", 652, 243);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42367");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("0097..###############################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0097..##############################################################################################################################################" + "'", str1, "0097..##############################################################################################################################################");
    }

    @Test
    public void test42368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42368");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444440true-140097");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "..........................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42370");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42371");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(468.0f, (float) 535, (float) 550L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 550.0f + "'", float3 == 550.0f);
    }

    @Test
    public void test42372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42372");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A0true-1.0097.00true-1.0097.00true-1.0097.00tr", "    a   HI!HI!..", 19);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str6, "A0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test42373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42373");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A0T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                     ", "4true4-4449744");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test42374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42374");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42375");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                             ", (short) 4);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 4 + "'", short2 == (short) 4);
    }

    @Test
    public void test42376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "RT00 7900 1-EURT00 7900 1-EURT00 7900 1-EURT0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test42377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42377");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0aaaaa4a4A4A4A4A", "                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42378");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444444444444...true");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test42379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42379");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaa", "444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 7);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A                                 100.0                                                     aaaa..", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 267 + "'", int5 == 267);
    }

    @Test
    public void test42380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42380");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a######################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42381");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42382");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 615);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42383");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray5, strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray5);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444a444444444444444444444444", strArray5);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               ");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str11, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test42384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42384");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42385");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue444...44444444444444444444444444444444440TRUE-1.0097...44", "    a  ", 187);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42386");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...", "True-1.  97");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42387");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(8.0d, (double) 167.0f, (double) 19L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.0d + "'", double3 == 8.0d);
    }

    @Test
    public void test42388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaa4true-1.4497.4444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42389");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....!", (java.lang.CharSequence) "-");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....!" + "'", charSequence2, "HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....!");
    }

    @Test
    public void test42390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42390");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42391");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04", 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42392");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test42393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4444444444444444444444444444444                                                   4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42394");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("000         ih!ih!ih!ih!ih!ih!ih!ih!ih A4 444444444444444444444444440 7900 1-eurt0!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A", "0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42395");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "TRUE-1.0097.0", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...44444...4444444...4...aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 14 + "'", int17 == 14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test42396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42396");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444400       0444444", "4444444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", 48);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42397");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAA", "                                                                                                                                                                                  100.                                                                                    ", "0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test42398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42398");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                     ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...a     ..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test42399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42399");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test42400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42400");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("0097..###############################################################################################################################################", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42401");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                             0                  ", "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("  A      A                            100.0                                                     AAAA", 164);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  A      A                            100.0                                                     AAAA" + "'", str2, "  A      A                            100.0                                                     AAAA");
    }

    @Test
    public void test42403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42403");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                                                                         aaaaaaaaaaaaaaaaaaa                 ...                                                     444444444444444440true-1.0097...444444444444444444444444aaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                         aaaaaaaaaaaaaaaaaaa                 ...                                                     444444444444444440true-1.0097...444444444444444444444444aaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                          " + "'", str1, "                                                                                                                                                                                                         aaaaaaaaaaaaaaaaaaa                 ...                                                     444444444444444440true-1.0097...444444444444444444444444aaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                          ");
    }

    @Test
    public void test42404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42404");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", "", 820);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test42405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42405");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...........................................................................................0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAA0.7900.1-EURT0..........................................................................................." + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAA0.7900.1-EURT0...........................................................................................");
    }

    @Test
    public void test42406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42406");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ih444444444444444444........4444444444...4444444440444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440100444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440", 262, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      ih444444444444444444........4444444444...4444444440444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440100444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440      " + "'", str3, "      ih444444444444444444........4444444444...4444444440444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440100444444444444444444........4444444444...444444444.444444444444444444........4444444444...4444444440      ");
    }

    @Test
    public void test42407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A    A00 000 0                                                                                                                                                                   ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test42408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444440true-1.0097...44444aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                      ", "0true-1.0097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444440true-1.0097...44444aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                      " + "'", str2, "444440true-1.0097...44444aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                      ");
    }

    @Test
    public void test42409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4444444...aaaaaaaaa44444444444444444444444444444444444444444", "                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr a 0true-1.0097.00true-1.0097.00true-1.0097.00tr", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444...aaaaaaaaa44444444444444444444444444444444444444444" + "'", str3, "4444444...aaaaaaaaa44444444444444444444444444444444444444444");
    }

    @Test
    public void test42410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42410");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("100.0                ...");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42411");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "#######...#######...#######...#######...#######...#######...#######...#######...######           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42412");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                                                                           00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr                                                                                                                                                                                            ", "Hi4!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42413");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test42414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42414");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "4444444...4444444...44a1a4444444...4444444...44...a1     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444...4444444...44a1a4444444...4444444...44...a1     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "4444444...4444444...44a1a4444444...4444444...44...a1     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test42416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42416");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "TRUE-1.  97.", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                        ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("444440true-1.0097.0100.0", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4aaaaaaaaaaa44444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa4444444444444444444444444444444444444444", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test42417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42417");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444                                                   44444444444444444444444444444444444444444444444444444444444444444444444444444", "0 tru...ue-1.0097.044444444444444444444444444444444...4444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42418");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "                                                                                         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42419");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                             ", "                           aaaa0aaaaa                  ", 175);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                                        ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test42420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42420");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0true-100970", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444...44a1a4444444...4444444...44...a144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42421");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                               ", "0097...40097...4", "A0", 419);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                               " + "'", str4, "                                                                                                                                                                               ");
    }

    @Test
    public void test42422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42422");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaa.");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42423");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("A44");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test42424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42424");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A  ", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A  " + "'", str2, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A  ");
    }

    @Test
    public void test42426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...4444444...4444444...4444444...4444444...---------------------------------------444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...0077.00...t744444444444444444..4444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test42427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42427");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42428");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0true-1.0097.044444444444444444444444444..");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0true-1.0097.044444444444444444444444444..\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                               100.0                                                ", "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               100.0                                                " + "'", str2, "                                               100.0                                                ");
    }

    @Test
    public void test42430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42430");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("####", "                                                                                                                             10000#####10000###", 840);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####" + "'", str3, "####");
    }

    @Test
    public void test42431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...44444...4444444...4...aaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42432");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42433");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A", "           00#######000#######000#######0011           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("         aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa          ", "aaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa          " + "'", str2, "         aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa          ");
    }

    @Test
    public void test42435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42435");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...            ...            ...            ...            ...            ...            ...         ...4#444hi!hi!hi!h############################...4", 625, 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42436");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444440true-1009744");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test42437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42437");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                       0aaa                        ", "rutrutrutrutrutrutrutrutrut... a   ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42438");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(".044444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test42439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42439");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", "HI");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444" + "'", str4, "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test42440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42440");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                AAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test42441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42441");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440true-1.0097                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42442");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                 ...                                                     444444444444444440true-1.0097...444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42444");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test42445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "1000    A         A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42446");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...", 959);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42447");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444", "", 216);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("44444444440.7900.1-EURT0", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444440.7900.1-EURT0" + "'", str2, "44444444440.7900.1-EURT0");
    }

    @Test
    public void test42449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42449");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", "                                                                                                                                              0TRUE-1 0097 0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test42450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0TRUE-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "    a   HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42451");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ahi!", 104, 202);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test42452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42452");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 267 + "'", int10 == 267);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 267 + "'", int11 == 267);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 267 + "'", int12 == 267);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 267 + "'", int13 == 267);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test42453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                              ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42454");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("true            ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test42455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42455");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444...4444444...4444444...4", 143);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("..                          ...", 982, 651);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test42457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...444444440tr...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...444444440tr..." + "'", str2, "...444444440tr...");
    }

    @Test
    public void test42458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42458");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "#########################################################################################################################################################                                                                                                                                  0AAAA                                                                                                                                  #########################################################################################################################################################", (java.lang.CharSequence) "    a0a                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 549 + "'", int2 == 549);
    }

    @Test
    public void test42459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42459");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444444444444444444444444440TRUE-1 0097      A    444444444444444444444444444444444444444444444444444440TRUE-1 0097      A    44444444444", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test42460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42460");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     #################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444444444440true-1.0097", 236);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          44444444444444444444444444444444444444444440true-1.0097                                                                                           " + "'", str2, "                                                                                          44444444444444444444444444444444444444444440true-1.0097                                                                                           ");
    }

    @Test
    public void test42462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42462");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ue", 73, "                            ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            ...    ue                            ...     " + "'", str3, "                            ...    ue                            ...     ");
    }

    @Test
    public void test42463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42463");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.00", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test42464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444" + "'", str2, "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444");
    }

    @Test
    public void test42465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42465");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                      ", "                                                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42466");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444", "00       000       000       0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test42467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42467");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0aaa", "...........#######################################################################################", 252);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42468");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAAAAAAAAAAA...", (java.lang.CharSequence) "                                                                                                                                                                      ....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 635 + "'", int2 == 635);
    }

    @Test
    public void test42469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42469");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 533, (float) 259, (float) 69L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 69.0f + "'", float3 == 69.0f);
    }

    @Test
    public void test42470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                0097.                                                 ", "...t0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                0097.                                                 " + "'", str2, "                                                0097.                                                 ");
    }

    @Test
    public void test42471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970hhhhhhhhhhhhhhhh", 116);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970hhhhhhhhhhhhhhhh" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970hhhhhhhhhhhhhhhh");
    }

    @Test
    public void test42472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42472");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44444444444444444444444444444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test42473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42473");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E", (java.lang.CharSequence) "A   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42474");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 549, 266);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42475");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("A 0true-1.0097.00true-1.00AAAAA 0true-1.0097.00true-1.009", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42476");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "444...4444Aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("444444444444444444...true-1.4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444...true-1.4444444" + "'", str1, "444444444444444444...true-1.4444444");
    }

    @Test
    public void test42478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAA0AAAA0.7900.1-EURT04444444444444444...", "                  4                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAA0AAAA0.7900.1-EURT04444444444444444..." + "'", str2, "AAAAA0AAAA0.7900.1-EURT04444444444444444...");
    }

    @Test
    public void test42479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42479");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("           aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa           ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test42480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444", 734, "AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test42481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42481");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444 ", (java.lang.CharSequence) "                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42482");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A A", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42483");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444", "                                      a                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42484");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                0.001                                               ", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0.001", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                   AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                   hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test42485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42485");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("    1000    .         .             1000    .         .          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    1000    .         .             1000    .         .          " + "'", str1, "    1000    .         .             1000    .         .          ");
    }

    @Test
    public void test42486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42487");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("    4444444444444444444444444444   aaaaaaa", 45, 253);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test42489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42489");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42490");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...1-eurt00.7900.1-eurt", "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", 188);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.00", 444, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.00" + "'", str3, "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.00");
    }

    @Test
    public void test42492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42492");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42493");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("TRUE4-4449744                                       ", "####################################...", 75);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test42494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42494");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("a440true-1.0097.044444444444444444444444444aa", 535, 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test42495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42495");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaa444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###44aaaaaaaaaaa", 133);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test42496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42496");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 40, (long) 608, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 608L + "'", long3 == 608L);
    }

    @Test
    public void test42497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42497");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0true-1.00                           aaaa0aaaaa                                             aaaa0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                  44444444444444444440true-1.0097", "444440444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                  44444444444444444440true-1.0097" + "'", str2, "                                                                                                                                                                                                                  44444444444444444440true-1.0097");
    }

    @Test
    public void test42499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.0" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.04 40TRUE-1.0097.0");
    }

    @Test
    public void test42500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest84.test42500");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...aaaaaaaaaaaaaaaaaaaaaaaaa                                 ", 224, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

