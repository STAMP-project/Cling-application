import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest52 {

    public static boolean debug = false;

    @Test
    public void test26001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26001");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test26003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26003");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26004");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444", "a    44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26005");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26006");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                       a                             ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test26007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26007");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...", "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26008");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 25, (float) 84, (float) 277);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 277.0f + "'", float3 == 277.0f);
    }

    @Test
    public void test26009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26009");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("HI", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      00", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test26010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26010");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "                                                                               aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......", "...44444444444...                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("a444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a444444444444444444444444" + "'", str2, "a444444444444444444444444");
    }

    @Test
    public void test26012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26012");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test26013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test26014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26014");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(36.0f, (float) 3, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test26015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26015");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaa0aaaaa");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444440true-1.0097.", 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4', 850, 51);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa" + "'", str11, "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
    }

    @Test
    public void test26016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26016");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                           0true-1.0097.0", "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26017");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...   #a#4444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444", 172);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444");
    }

    @Test
    public void test26019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...4444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444444444444444444" + "'", str1, "...4444444444444444444444");
    }

    @Test
    public void test26020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26020");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444...", "A A A A                        a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26021");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26022");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100.0#####100.0###", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test26023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26023");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih0.0100.0", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26024");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("a0aaaaa              0true-1.0097.00true-1.0097.00trAaaaaaaaaaa4444444...4444444...4444444...4a0aaaaa              0true-1.0097.00true-1.0097.00tr", "                                   ", "0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test26025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26025");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                               #######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test26026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("      a         a         a         a         a", "444##444440true-1.0097...4444444444444444444440true-1#0097###44");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                       a44444444444444444444...4444                       a44444444444444444444...444", "A         A         A         A         A         A         A         A         A         A         A         A         A         A ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       a44444444444444444444...4444                       a44444444444444444444...444" + "'", str2, "                       a44444444444444444444...4444                       a44444444444444444444...444");
    }

    @Test
    public void test26028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26028");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("A ...", "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "AAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A ..." + "'", str3, "A ...");
    }

    @Test
    public void test26029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26029");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                   ", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 38, 502);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                      Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str4, "                                      Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test26030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26030");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444444444444440TRUE-1.0097.0");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444 true - 1 . 97 . 444444444444444444444444444                                         ...                                                     4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ", 982);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                        ", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 8 vs 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test26031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26031");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26032");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26033");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa", 463);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26034");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..." + "'", str1, "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
    }

    @Test
    public void test26035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26036");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                        A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   4444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26037");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097 ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26038");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                       a", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                 4444a44444                  ", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                97.0", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test26039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26040");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test26041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26041");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "   A         ", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444...44444444444444444444444444444...4444444444444444444444444444", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test26042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26042");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("h!ih!h!ih!", "                                         ...                                                     ", 444);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                               100.", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test26043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26043");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", 441, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444" + "'", str3, "####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
    }

    @Test
    public void test26044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26044");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                           ", "                                                                                                                                                                                                                                                                                                                                              hi!                                                                                                                                                                                                                                                                                                                                              ", 384);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           " + "'", str3, "                                                                                           ");
    }

    @Test
    public void test26045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("           a", "...44444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26047");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4444444444444444444...", "100.0                ...", 229);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26048");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                       0                                                                                                                                 ", (java.lang.CharSequence) "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test26049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26049");
        float[] floatArray6 = new float[] { (short) 1, 9, 100.0f, 86, (byte) -1, (byte) 0 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 9.0, 100.0, 86.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test26050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26050");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", 229.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 229.0d + "'", double2 == 229.0d);
    }

    @Test
    public void test26051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26051");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str3, "...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test26052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26052");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test26053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26053");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...44444...4444444...4...ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26054");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26055");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("97 true-1", (float) 164);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 164.0f + "'", float2 == 164.0f);
    }

    @Test
    public void test26056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26056");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test26057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26057");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 27, 170);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26058");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0true-1.0097.044444444444444444444444444 4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26059");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a        ", 557, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444 is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26061");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("      aaaaaaaaa...", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26062");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "#########################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26063");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a...", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test26064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26064");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(625L, 113L, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test26065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26065");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", (java.lang.CharSequence) "rue-1.0097.0                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26066");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 1, (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test26067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26067");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26068");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "4444444...4444444...44a1a4444444...4444444...44...a1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("a                   TRUE-1.0097.0                       a", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "         a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                                ...                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a                   TRUE-1.0097.0                       a" + "'", str3, "a                   TRUE-1.0097.0                       a");
    }

    @Test
    public void test26070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                       a                             ", "0097..###############################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       a                             " + "'", str2, "                       a                             ");
    }

    @Test
    public void test26071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26071");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26072");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test26073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A", "true444...44444444444444444444444444444444440TRUE-1.0097...44                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A" + "'", str2, "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A");
    }

    @Test
    public void test26074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26074");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", "####                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26075");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("########################4444444444444444444444440TRUE-1.009...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                            100.0                                                     aaaa..", "                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                             0                                                                                                                          4444444...4444444...4444444...4...                       " + "'", str2, "                                                                                                                                                                                                                                             0                                                                                                                          4444444...4444444...4444444...4...                       ");
    }

    @Test
    public void test26077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                             100.0", "                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...", "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test26078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26078");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "                                      4444400       0444444                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26079");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test26080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26080");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "true", (java.lang.CharSequence) "                                                           0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26081");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "....4444444444444444444444444444...");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                            A    44", "4444a44444", 96);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("    A         A                                                     100.0    A         A         ", strArray4, strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444...44444444444444444444444444444444440TRUE-1.0097...44");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.", strArray8, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "    A         A                                                     100.0    A         A         " + "'", str9, "    A         A                                                     100.0    A         A         ");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test26082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("true-1.97.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true-1.97.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26083");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                           ", "                                      ...                                                    ", "A44444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           " + "'", str3, "                                           ");
    }

    @Test
    public void test26084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26084");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444                                                                " + "'", str3, "4444444444444444444                                                                ");
    }

    @Test
    public void test26085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26085");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(8L, 734L, (long) 173);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 8L + "'", long3 == 8L);
    }

    @Test
    public void test26086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.a97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test26087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26087");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 545, (long) 667, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test26088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26088");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", 125);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 125 + "'", int2 == 125);
    }

    @Test
    public void test26089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26089");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          ###    A   hi!hi!.           ", "                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26090");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26091");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", 216, 56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26092");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 545, (double) (short) 1, 655.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 655.0d + "'", double3 == 655.0d);
    }

    @Test
    public void test26093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26093");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444a444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26094");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444", 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26095");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...4444444444444444444444");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test26096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26096");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                              0097..", 502, "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444                                                                                              0097..0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444" + "'", str3, "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444                                                                                              0097..0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444");
    }

    @Test
    public void test26097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26097");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "####################################                                         AAAA0AAAAA####################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444", 665);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444" + "'", str2, "0#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444");
    }

    @Test
    public void test26099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26099");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04" + "'", str1, "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04");
    }

    @Test
    public void test26100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26100");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                               ", "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26101");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26102");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) ".044444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26103");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                       a44444444444444444444...4444                       a44444444444444444444...4444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26104");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("########################4444444444444444444444440TRUE-1.009...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26105");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26106");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 623 + "'", int1 == 623);
    }

    @Test
    public void test26107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26107");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 100, 12, 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 168 + "'", int3 == 168);
    }

    @Test
    public void test26108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26108");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 76, 191);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 76");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..", "444...44444444444444444444444444444444440true-1.0097...44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00.." + "'", str2, "                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..");
    }

    @Test
    public void test26110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26110");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00tr A");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa" + "'", str2, "... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa");
    }

    @Test
    public void test26112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26112");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                       a", "", 907);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test26113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26113");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 6.0f, (double) 102L, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.0d + "'", double3 == 6.0d);
    }

    @Test
    public void test26114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26114");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("h!ih!h!ih!", 18, 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!h!ih!" + "'", str3, "h!ih!h!ih!");
    }

    @Test
    public void test26115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test26116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A", "0true-1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A" + "'", str2, "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A");
    }

    @Test
    public void test26117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26117");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                ", "                                      0.001                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr44A4" + "'", str1, "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr44A4");
    }

    @Test
    public void test26119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("true444...44444444444444444444444444444444440TRUE-1.0097...44                                                                                        ", 557, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26120");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...", "                                                                                                                                                                             Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0                                                                                                                                                                              ", 265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26121");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test26122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", 550);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      1..." + "'", str2, "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      1...");
    }

    @Test
    public void test26123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26123");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 2, "#########################################################################################################################################################                                                                                                                                  0AAAA                                                                                                                                  #########################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##" + "'", str3, "##");
    }

    @Test
    public void test26124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26124");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("          ###    A   hi!hi!.           ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26125");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444", "...44444444444444444444444444444444440true-1.0097...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0" + "'", str7, "97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test26126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26126");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test26127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26127");
        double[] doubleArray6 = new double[] { 181.0f, 57L, 4.4444042E9f, 444, 50.0d, 25L };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[181.0, 57.0, 4.444404224E9, 444.0, 50.0, 25.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 25.0d + "'", double7 == 25.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 25.0d + "'", double8 == 25.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 25.0d + "'", double9 == 25.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.444404224E9d + "'", double10 == 4.444404224E9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 25.0d + "'", double11 == 25.0d);
    }

    @Test
    public void test26128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26128");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("         aaaa0aaaaa    ", "                                                                               aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......" + "'", str2, "                                                                      aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......");
    }

    @Test
    public void test26130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26130");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 3L, (float) 330, 638.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 638.0f + "'", float3 == 638.0f);
    }

    @Test
    public void test26131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26131");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(".....4444444444444444444444444444...4444444444...", 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aahI!aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahI!aa" + "'", str1, "aahI!aa");
    }

    @Test
    public void test26133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26133");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26135");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                   0         aaa                        ", (java.lang.CharSequence) "0TRUE-1.0097.00T..0TRUE-1.0097.00T");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                   0         aaa                        " + "'", charSequence2, "                                   0         aaa                        ");
    }

    @Test
    public void test26136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26136");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444", 76, 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26137");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 608, "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26138");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444              is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26139");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("###############################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                                                               0aaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                       4true4-4449744                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26141");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test26142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26142");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                 ", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26143");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("   A        ", "hi", 479);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26144");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "A .7ee444ee44440.7ee444ee44440.7ee444ee44440.7e");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444" + "'", str4, "44444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test26145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26145");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", "444444444444444444444444...7900.1-eurt044444444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str5, "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test26146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "a         a         a         a         a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26147");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "#########...##########........###########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26148");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("A         A         A        ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test26149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26149");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "####################################...####################################...####################################...####################################...                                     100.0                                                     aaaa                                     ", "aaaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26150");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaatrue0aaaa0.aaatruaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26151");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26152");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                  444444444444444444444444...44444                                  ", 132);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26153");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 175, 403);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 175");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...44444444444...                 aaaaaaaaaaa", 44, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444...                 aaaaaaaaaaa" + "'", str3, "...44444444444...                 aaaaaaaaaaa");
    }

    @Test
    public void test26155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26155");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("444444444444444440true-1.0097...a0aaaaa              0true-1.0097.0444                                                            100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26156");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...44444444444444444444444444444444440true-1.0097...", "e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26157");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                               TRUE                                        41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444", "444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26158");
        long[] longArray1 = new long[] { 99L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[99]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 99L + "'", long3 == 99L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 99L + "'", long6 == 99L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 99L + "'", long7 == 99L);
    }

    @Test
    public void test26159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26159");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                hi4!", "                                                                                                                            ", 630);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26160");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(".97.                                                                                       ", "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26161");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ", "          aaaa", 69, 645);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    ...44444444444444444444444444444444440true-1.0097...A...444444444          aaaatrue-1.0097...A...44444444444444444444444444444444440true-1.0097...         " + "'", str4, "    ...44444444444444444444444444444444440true-1.0097...A...444444444          aaaatrue-1.0097...A...44444444444444444444444444444444440true-1.0097...         ");
    }

    @Test
    public void test26162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                        44...7900.1-eurt04444444444444444444444444444444444...444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44...7900.1-eurt04444444444444444444444444444444444...444" + "'", str1, "44...7900.1-eurt04444444444444444444444444444444444...444");
    }

    @Test
    public void test26163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26163");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaa000true000-00000000097000000", "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 82);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444" + "'", str4, "aaaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test26164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26164");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26165");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                   .0097.00tr                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26166");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0true-1.0097.00tr", "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26167");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...4444444...4444444...4444444...44444...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test26168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26168");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!...1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test26169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", 850, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", "                                                                           ...444444440tr...                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44" + "'", str2, "...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
    }

    @Test
    public void test26172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26172");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26173");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26174");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...4444...44....t..4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444...44....t..4444444444444444444444444444444444444444444" + "'", str1, "...4444...44....t..4444444444444444444444444444444444444444444");
    }

    @Test
    public void test26175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26175");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 30L, (float) 754, (float) 445);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 754.0f + "'", float3 == 754.0f);
    }

    @Test
    public void test26176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26176");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                      100.0", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26177");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a        ", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26178");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                                                                  ", 60, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                            4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44" + "'", str1, "4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44");
    }

    @Test
    public void test26180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444...", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444..." + "'", str2, "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444...");
    }

    @Test
    public void test26181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26181");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00trA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
    }

    @Test
    public void test26183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "...4444444444444444444444444440t...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("###    a   HI!HI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###    a   HI!HI" + "'", str2, "###    a   HI!HI");
    }

    @Test
    public void test26186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26186");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "0true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26187");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ", 116);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26188");
        double[] doubleArray5 = new double[] { 0, 53, 10.0d, 0.0f, 1.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 53.0, 10.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 53.0d + "'", double7 == 53.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test26189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26189");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Aaaaaaaaaaa4444444...4444444...4444444...4", "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ");
    }

    @Test
    public void test26191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA", 907);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test26192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...44444444444...                 aaaaaaaaaaa aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                    ", "A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "rT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26194");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26195");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26196");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("04444444444444444444444444", "4444...44444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26197");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                                   " + "'", str1, "...                                                   ");
    }

    @Test
    public void test26199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26199");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("######################################044444444444444444444444444", "A .7ee444ee44440.7ee444ee44440.7ee444ee44440.7e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################044444444444444444444444444" + "'", str2, "######################################044444444444444444444444444");
    }

    @Test
    public void test26201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26201");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("                                  444444444444444444444444...44444                                  ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test26202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26202");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("41004.404", (int) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444441004.4044444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444441004.4044444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26203");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444", "aaaa                                                     0.001                            A      A  ", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26204");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 97, 47.0d, 37.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 37.0d + "'", double3 == 37.0d);
    }

    @Test
    public void test26205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test26206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...44444444444444444444444444444444440true-1.0097...", "000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444444444444444444444444440true-1.0097..." + "'", str2, "...44444444444444444444444444444444440true-1.0097...");
    }

    @Test
    public void test26207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26207");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444                                                                                     ", 80, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "9744");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26209");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAA", 188, 256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0T...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str2, "4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test26211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26211");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(134, 173, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 173 + "'", int3 == 173);
    }

    @Test
    public void test26212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26212");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################atruea-a1a.a97a.a", (int) ' ', 330);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26213");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray1, strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(" . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ". 97 . 4444444444444444444444444444444444444444444" + "'", str1, ". 97 . 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test26215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26215");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       " + "'", str1, "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       ");
    }

    @Test
    public void test26216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26216");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray10, strArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray5, strArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", strArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444444444444444444444444444444444444440true-1.0097.0", strArray10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "a0a");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str17, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test26217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".97.                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".97.                                                                                       \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26218");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(".                                  aaaa.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".                                  aaaa." + "'", str1, ".                                  aaaa.");
    }

    @Test
    public void test26220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26220");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0aaaaaaaaaart00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26221");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       ", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       " + "'", str2, "                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       ");
    }

    @Test
    public void test26223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26223");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26224");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test26225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26225");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a004444444000444444400044444440", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test26226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26226");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 907, (long) 96, 98L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 907L + "'", long3 == 907L);
    }

    @Test
    public void test26227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26227");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...44444444444...                                                                                                                                                                                                       ", "0000000000000000000000000000000000000000000000000000000000000...000000000000000000000000000", 548);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26228");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                               0aaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa                                        ", "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa" + "'", str2, "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa");
    }

    @Test
    public void test26230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444TRUE-1.497.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444TRUE-1.497.44444444444444444444444444444444444444444444" + "'", str1, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444TRUE-1.497.44444444444444444444444444444444444444444444");
    }

    @Test
    public void test26231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1A009AAA", "444444444 ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26232");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa", "444444a444444444444444444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 56, (int) (short) 4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("0true-100970", strArray3);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test26233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26233");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(124, 236, 957);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 124 + "'", int3 == 124);
    }

    @Test
    public void test26234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("H!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26235");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444...790true-1.0097.0444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444.1-EURT0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26236");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("79 .1-EURT 444444440 TRUE - 1 . 44444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"79 .1-EURT 444444440 TRUE - 1 . 44444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0000000444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000", 279);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000" + "'", str2, "0000000444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000");
    }

    @Test
    public void test26239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26239");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26240");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...40true-1.0097.04444444444444444444444444444444444...", "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi....");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                 aaaa0aaaaa    ", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("97.0", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test26241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26241");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("...4...4444444...4444444...4444444                      0", 463);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 463 + "'", int2 == 463);
    }

    @Test
    public void test26242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...097.00tr.0097.00tr.0097.00tr             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26243");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...444444440tr...", (java.lang.CharSequence) "0TRUE-1.00-1.0097.0                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test26244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26244");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                                                                                                                                                                                                                                                                               hI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hI!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26245");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 257.0f, (double) 43L, (double) 4444444);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.0d + "'", double3 == 43.0d);
    }

    @Test
    public void test26246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("A A ", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A A " + "'", str2, "A A ");
    }

    @Test
    public void test26247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26247");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("00       000       000       00a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0       000       000       00a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("            444444444444444  444444444444444             ..", "        HI!H4444404444HI!HI.A A A ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26249");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                        ", "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26250");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test26251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26251");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(".97.                                                                                       ", "          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test26252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26252");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("444###44444444444444444444444444444444440true-1#0097###44", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test26253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26253");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "TRUE-1.  97.", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                                      aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test26254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0..." + "'", str1, "AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
    }

    @Test
    public void test26255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26255");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a0444444444444444444444444444444444444444444", "                       #A#44444444444444444444#...#444444444444444444444444444444444444444444444", 671);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                       A                             ", 721);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       A                             " + "'", str2, "                       A                             ");
    }

    @Test
    public void test26257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("A0", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaa0aaaa0.7900.1-eurt04444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                   ", 188);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                            ");
    }

    @Test
    public void test26259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                  4                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test26260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26260");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "         a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                                ...                                                    ", "a44", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test26261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 982);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test26263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26263");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("                          rue-1.0097.0", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("0TRUE-1.00-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444...4444444...4444444...4", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...      ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test26264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26264");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test26265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26265");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0097...#############################################################################################", "44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 4444444, 175);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test26266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26266");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.a97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.a97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.a97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26267");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00", "4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test26268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26268");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("####                                                                                                                                                                                                                    ", "...44                            ", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26269");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                  0aaaa                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 266 + "'", int1 == 266);
    }

    @Test
    public void test26270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26270");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(52.0d, (double) 664.0f, (double) 101L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 664.0d + "'", double3 == 664.0d);
    }

    @Test
    public void test26271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a", 149);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a" + "'", str2, "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a");
    }

    @Test
    public void test26272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26272");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444...4444Aaaaaaaaa", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444...4444Aaaaaaaaa" + "'", str3, "444...4444Aaaaaaaaa");
    }

    @Test
    public void test26273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26273");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 20, (double) 418, 548.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
    }

    @Test
    public void test26274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("      a         a         a         a         a                                                                                                                                      ", "                       0aaa                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26275");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(" rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ", "a     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hh", "0097.00T44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 " + "'", str3, " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ");
    }

    @Test
    public void test26276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26276");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 " + "'", str1, "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test26278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26278");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444444true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 141 + "'", int2 == 141);
    }

    @Test
    public void test26279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26279");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("TRUE-1.0097.0", "                                                                                              0097..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26280");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                                  0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A" + "'", str1, "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
    }

    @Test
    public void test26282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26282");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("  .79  .1-EURT  .79  .1-EURT  .79  .1-EURT ", "           A", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaa0aaaa0.7900.1-eurt04444444444444444...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaa0aaaa0.7900.1-eurt04444444444444444..." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaa0aaaa0.7900.1-eurt04444444444444444...");
    }

    @Test
    public void test26284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26285");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test26286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26286");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...", (double) 368);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 368.0d + "'", double2 == 368.0d);
    }

    @Test
    public void test26287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26287");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                            100.0                ...                            ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                      100.0                ...", "...44444444444444444444444444444444440TRUE-1.0097...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26291");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("######################################044444444444444444444444444", (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.0d + "'", double2 == 31.0d);
    }

    @Test
    public void test26292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26292");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "rue-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26293");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4             ", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa4444444...aaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 9);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26294");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(656, 232, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test26295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...ue-1.0097.044444444444444444444444444444444...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...ue-1.0097.044444444444444444444444444444444..." + "'", str2, "...ue-1.0097.044444444444444444444444444444444...");
    }

    @Test
    public void test26296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26296");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.00-1.0097.0444444444444444444444444444444......           0     44444444444444444444444444444444444444444440true-1.0097.0    0     44444444444444444444444444444444444444444440true-1.0097.0    0     44444444444444444444444444444444444444444440true-1.0097.0    0     4444444444444444444" + "'", str3, "0true-1.00-1.0097.0444444444444444444444444444444......           0     44444444444444444444444444444444444444444440true-1.0097.0    0     44444444444444444444444444444444444444444440true-1.0097.0    0     44444444444444444444444444444444444444444440true-1.0097.0    0     4444444444444444444");
    }

    @Test
    public void test26297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26297");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                          ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test26298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26298");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26299");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26300");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahi!hi!...", "                                                      ...", 149);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test26301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26301");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 49, (long) 149, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test26302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26302");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ", (java.lang.CharSequence) "444aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aaaaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa                         100.0                                                     aaaa444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 741 + "'", int2 == 741);
    }

    @Test
    public void test26303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26303");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ...", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26304");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("    A         A                                                     100.0    A         A         ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("...44444444444444444444444444444444440true-1.0097...", (java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A        ", strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         " + "'", str5, "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
    }

    @Test
    public void test26305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26305");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test26306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26306");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26307");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("114", (int) 'a', "A         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A         A         A         A         A         A         A         A         A         A   114" + "'", str3, "A         A         A         A         A         A         A         A         A         A   114");
    }

    @Test
    public void test26308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26308");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444" + "'", str1, "                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444");
    }

    @Test
    public void test26309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26309");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "       aaaa0aaaaa                     ...", 557);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                                                                                                                                       0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                       0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                                       0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test26311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26311");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("##############################################0097.", 445, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##############################################0097.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##############################################0097.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                              ...44444...true-1.4444444...97.4444444...4444444444444...4                               ", "A      A                            100.0                                                     AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              ...44444...true-1.4444444...97.4444444...4444444444444...4                               " + "'", str2, "                              ...44444...true-1.4444444...97.4444444...4444444444444...4                               ");
    }

    @Test
    public void test26314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26314");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                       !HI!HI!HI!HI!HI!HI!HI!HI!", "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.", "   !    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                       !HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "                                                                                                       !HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test26315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26315");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test26316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26316");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26317");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "a00       000       000       00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A00       000       000       00" + "'", str1, "A00       000       000       00");
    }

    @Test
    public void test26319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26319");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "TRUE", (java.lang.CharSequence) "Aaaa0aa00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "TRUE" + "'", charSequence2, "TRUE");
    }

    @Test
    public void test26320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A                                                                   ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A                                                                   " + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A                                                                   ");
    }

    @Test
    public void test26321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26321");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                             " + "'", str1, "                                                                                                                                                                             ");
    }

    @Test
    public void test26322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26322");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".0097.00TR", "0true-144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR009744444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0", 585);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T" + "'", str1, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
    }

    @Test
    public void test26324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26324");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 841L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 841.0f + "'", float2 == 841.0f);
    }

    @Test
    public void test26325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0444444444       444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444       4444444440" + "'", str1, "444444444444444444       4444444440");
    }

    @Test
    public void test26326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26326");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0097      a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26328");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           ", "", 570);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 111 + "'", int3 == 111);
    }

    @Test
    public void test26329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26329");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444");
    }

    @Test
    public void test26330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26330");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("AAAAAAAAAAAAAAA                                                                                                   ", (double) 895L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 895.0d + "'", double2 == 895.0d);
    }

    @Test
    public void test26331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26331");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                               4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ", "                                         AAAA0AAAA", 28);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(".79  .1-EURT44eurt", "0       00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26333");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-1.0                                               41004.404", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26334");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                          44444444444444444444444a", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26335");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A         A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.", "Aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26336");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(967, 667, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test26337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26337");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                          ...####################################..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                          ...####################################.." + "'", str1, "                                                          ...####################################..");
    }

    @Test
    public void test26338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26338");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                      41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444", "    .         .                                                     1000    .         .         ", 11);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test26339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26339");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", "Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26341");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray6, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '4');
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("              ", strArray9);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...0...", strArray9);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", '#');
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                     aaaa0aaaaa              ", 23);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("...    0true-1.0097.00true-1.0097.00true-1.0097.00tr", strArray19, strArray23);
        java.lang.String[] strArray28 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("         a                                          ", "aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0", 102);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEach("4444A44444", strArray23, strArray28);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("                                   ...                                   ", strArray9, strArray28);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0true-1.0097.0" + "'", str12, "0true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str24, "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4444A44444" + "'", str29, "4444A44444");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "                                   ...                                   " + "'", str30, "                                   ...                                   ");
    }

    @Test
    public void test26342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26342");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 262L, (double) 668L, (double) 34.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.0d + "'", double3 == 34.0d);
    }

    @Test
    public void test26343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444a0aaaaa       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444", "a0aaaaa##############0true-1.0097.0444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa                                                                                                         ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26344");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0" + "'", str1, "                    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
    }

    @Test
    public void test26345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26345");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                       A                             ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test26346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26346");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444497.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26347");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "1aaaaaaaaaaa", (java.lang.CharSequence) "true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("-1.0097.04444444444444444444444444444444444444444444", "!hi!hitttttti!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test26349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444          ", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444          " + "'", str2, "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444          ");
    }

    @Test
    public void test26350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26350");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 45, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str3, "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test26351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26351");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444444444444444444444444444444440true-1.0097.");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("    a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a    ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ahi!hi!hi!haaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26353");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ", 37, "        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           " + "'", str3, "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ");
    }

    @Test
    public void test26354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...44444...4444444...4...aaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444...4444444...4...AAAAAA..." + "'", str1, "...44444...4444444...4...AAAAAA...");
    }

    @Test
    public void test26355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26355");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...A     ...", "                      100.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26356");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test26357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26357");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                               ", (long) 625);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 625L + "'", long2 == 625L);
    }

    @Test
    public void test26358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26358");
        java.lang.String[] strArray7 = new java.lang.String[] { "a", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", strArray7, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '4');
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concatWith("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.Object[]) strArray14);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str10, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test26359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26359");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "", "                                      41004.404                                                ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test26360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A0444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A0444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26361");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.a   HI!HI!...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0", "#########.                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26362");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                          #...#4#a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", 623);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str2, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test26364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26364");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaa", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test26365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26365");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ", "0TRUE-1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26366");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26367");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                       a                       a                      ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       A                       A                      ..." + "'", str1, "                       A                       A                      ...");
    }

    @Test
    public void test26368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26368");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("aa                100.0aaaa                 ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26369");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444...4444444...44a1a4444444...4444444...44...a1", "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26370");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26371");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444444a444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26372");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "100.0###");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test26373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0true-1.0097.044444444444444444444444444 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26374");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444", "ue-1.0097...444444444444444444444444                                                                                        100.", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26375");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                         aaaaaaaaaaaaaaaaaaa                 ...                                                     444444444444444440true-1.0097...444444444444444444444444aaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                          ", "!hi!hiTTTTTTi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa...", 39, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa..." + "'", str3, "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa...");
    }

    @Test
    public void test26377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26377");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                       444...44444444444444444444444444444444440true-1.0097...44444...44444444444444", (double) 76);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 76.0d + "'", double2 == 76.0d);
    }

    @Test
    public void test26378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26378");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                                        0.0010.0hi                                                                                                                                                                                                                                                                                                                                         ", strArray3, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                                                                                                                                                                                                                                                        0.0010.0hi                                                                                                                                                                                                                                                                                                                                         " + "'", str5, "                                                                                                                                                                                                                                                                                                                                        0.0010.0hi                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test26379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAA...", "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAA..." + "'", str2, "AAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test26380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                                                                                                                                        ", "444...44444444444444444444444444444444440TRUE-1.0097...44                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                        " + "'", str2, "                                                                                                                                                                                                                        ");
    }

    @Test
    public void test26381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26381");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-EURT0Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444..a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-eurt0aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444..a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444..a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-eurt0aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaaaaaaaaa4444444...4444444...4444444..a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26382");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", (java.lang.CharSequence) "4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 245 + "'", int2 == 245);
    }

    @Test
    public void test26383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26383");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0TRUE-1.0097.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0TRUE-1.0097.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...44hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaaa00       000       000       00aa  A      A                            100.0                                                     aaaa", "444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26386");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 47L, 123.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test26387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4444444...444444           aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("..0true-1.0097.00true-1.0097.00true-1.0097.00tr", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "..0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test26389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26389");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26390");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 895 + "'", int1 == 895);
    }

    @Test
    public void test26391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26391");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444440.7900.1-eurt0aaaa                                                     0.001", "                       444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26392");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi4!", (java.lang.CharSequence) "a#a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################" + "'", str1, "444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################");
    }

    @Test
    public void test26394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26394");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(277.0f, 4.4444443E13f, (float) (short) 4);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.0f + "'", float3 == 4.0f);
    }

    @Test
    public void test26395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26395");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 16, 101L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test26396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...", "         a        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr..." + "'", str2, "1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...");
    }

    @Test
    public void test26397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26397");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...4444444444444", "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A         A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A         A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI." + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A         A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.");
    }

    @Test
    public void test26399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26399");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a                             ###    a   HI!HI!...###    a   HI!HI!...###");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a                             ###    a   HI!HI!...###    a   HI!HI!...###\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26400");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444", "", 265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test26401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26401");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("444...4444Aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26402");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26403");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 " + "'", str1, "                                                                                                 ");
    }

    @Test
    public void test26405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26405");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("a0a");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0a" + "'", str2, "a0a");
    }

    @Test
    public void test26406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26406");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("##############################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", "", 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test26407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26407");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                     100.0                                                     aaaa                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                     100.0                                                     AAAA                                     " + "'", str1, "                                     100.0                                                     AAAA                                     ");
    }

    @Test
    public void test26408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26408");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                           ", "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           " + "'", str2, "                                                                                           ");
    }

    @Test
    public void test26410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26410");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 418, (float) 269, (float) 28);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 418.0f + "'", float3 == 418.0f);
    }

    @Test
    public void test26411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26411");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 ", ".7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a", "...aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 " + "'", str3, "04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 ");
    }

    @Test
    public void test26412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26412");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                      100.0", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119 + "'", int18 == 119);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test26413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26413");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("97.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test26414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26414");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0097...0097...0097...0097...", 119, 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26415");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                  4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test26416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#########################################################################################################################################################", 84, "7.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################################################################################" + "'", str3, "#########################################################################################################################################################");
    }

    @Test
    public void test26417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26418");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 167, 969);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26419");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0true-1.0", "", (int) '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4                                                   ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach(".true-1...97..44444444444444444444444444444444444444444", strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test26420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26420");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("    A     .7900.1-eurt0444444444444444444...", "44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444 !", "                       a44444444444444444444...4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test26422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26422");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...      aaaa0a", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26423");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097." + "'", str1, "...         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.");
    }

    @Test
    public void test26424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26424");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test26425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26425");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                     aaaa0aaaaa              ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26426");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 60, (long) 645, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test26427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", "##############################################################4true4-4449744########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###" + "'", str2, "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
    }

    @Test
    public void test26428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26428");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tre-1.0097.00tru...", 25, 149);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26430");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test26431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26431");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("    A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", "                                                               a    TRUETRUETRUET                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26432");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...000     ...                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test26433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa", 841);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26434");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("         ......00.7900.1-eurt00.79......aaaa", "                                                                ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             ", 368);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...aaaaaaaaaaaaaaaaaaaaaaaaaa", "                  4                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26436");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440true-1.0097...44444", "IH", 79);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...4444444...4", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test26437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26437");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "0aaaaa    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26438");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr", 17, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26439");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                               A44444                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("H!ih!h!ih!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26441");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 754);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26442");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("A    ", 95, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             A                                                 " + "'", str3, "                                             A                                                 ");
    }

    @Test
    public void test26443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26443");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA444444444", 111, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", 104, "A A A        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...44444444444444444444444444444444hi4!", 615);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444444444444444444444444hi4!" + "'", str2, "...44444444444444444444444444444444hi4!");
    }

    @Test
    public void test26446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26446");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0097..###############################################################################################################################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test26447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("a a a a", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a a a a" + "'", str2, "a a a a");
    }

    @Test
    public void test26448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26448");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26449");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("100.0                                                     aaaa0true-1.0097.044444444444444444444444", "                                            AAAA", "444444444", 43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0                                                     aaaa0true-1.0097.044444444444444444444444" + "'", str4, "100.0                                                     aaaa0true-1.0097.044444444444444444444444");
    }

    @Test
    public void test26450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26450");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444444444444.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26451");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444", 667, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                      44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444                                                                                                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                                                                                                      44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test26452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26452");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", "     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0000000000" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0000000000");
    }

    @Test
    public void test26453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26453");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0097..###############################################################################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26454");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26455");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH000A...", "A         A                                                     1000    A         A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("true-1.       ...97true-1.       ...97", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1....97true-1....97" + "'", str2, "true-1....97true-1....97");
    }

    @Test
    public void test26457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaa");
    }

    @Test
    public void test26458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26458");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(20.0d, (double) 95L, 833.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 833.0d + "'", double3 == 833.0d);
    }

    @Test
    public void test26459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26459");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444...4444Aaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444...4444Aaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26460");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444444444444444444444444444440true0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test26461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 72, 329);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                 " + "'", str3, "                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test26462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26462");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 150, (long) 262, (long) 83);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 83L + "'", long3 == 83L);
    }

    @Test
    public void test26463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                                                                                                04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4                                                                                                                                                                                                                                                                                                                                                                                                 ", "H!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test26464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26464");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.00true-1.97.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "a4a4aaaaaaaaaaaaaaaaaaa4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.4....444444444tr...aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26465");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26466");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("4444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444");
    }

    @Test
    public void test26467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26467");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                                            ", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26468");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("A.7ee444ee44440.7ee444ee44440.7ee444ee44440.7e");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26469");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(".7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a" + "'", str1, ".7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
    }

    @Test
    public void test26470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26470");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444", 841, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26471");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("att-------ttt-------ttt-------t", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0 true - 1 . ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 true - 1 ." + "'", str1, "0 true - 1 .");
    }

    @Test
    public void test26473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26473");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4L, (float) 245, (float) 15L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 245.0f + "'", float3 == 245.0f);
    }

    @Test
    public void test26474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26474");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26475");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test26476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26476");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!", "4             ", 56);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("    ");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray14, strArray19);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean23 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray14);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray28 = org.apache.commons.lang3.StringUtils.stripAll(strArray26, "##100.0###");
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.stripAll(strArray28);
        boolean boolean30 = org.apache.commons.lang3.StringUtils.endsWithAny(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", strArray28);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("4", strArray14, strArray28);
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.stripAll(strArray28);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray28);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444...44444444444444444444444444444444440true-1.0097...44                                        ", strArray8, strArray28);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444", strArray5, strArray8);
        boolean boolean37 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str20, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4" + "'", str31, "4");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4444444" + "'", str33, "4444444");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str34, "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "    " + "'", str35, "    ");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444" + "'", str36, "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test26477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26477");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("        ", "                                                                                                                                                                                                                                                                                                                                                                                                                 !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26478");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("          TRUE  ", 424);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                     4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ", 550);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     " + "'", str2, "                                                                                     4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ");
    }

    @Test
    public void test26480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test26481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26481");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...aaaa...444444444", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test26482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04", "!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04" + "'", str2, "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04");
    }

    @Test
    public void test26483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26483");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "                  44444a4444                 ");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                       a44444444444444444444...4", "...44444444444444444444444444444444440TRUE-    A     ...A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", 625);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaa0aaaaaaaaaaaaa444444...                                                                ", strArray5, strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "aaaaaa0aaaaaaaaaaaaa444444...                                                                " + "'", str12, "aaaaaa0aaaaaaaaaaaaa444444...                                                                ");
    }

    @Test
    public void test26484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                               A44444                                               ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                0 true - 1 . ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               A44444                                               " + "'", str2, "                                               A44444                                               ");
    }

    @Test
    public void test26485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26485");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 2.0f, 22.0d, 445.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 445.0d + "'", double3 == 445.0d);
    }

    @Test
    public void test26486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26486");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(418.0f, (float) 36L, (float) 216L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 36.0f + "'", float3 == 36.0f);
    }

    @Test
    public void test26487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444444444444444444444444444444444444444444", "0aaaa 0aaaa 0aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26488");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("ue-1.0097...444444444444444444444444                                                                                        100.", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test26489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26489");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", 585, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444..." + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
    }

    @Test
    public void test26490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa" + "'", str1, "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26491");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                    is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26492");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "H!ih!h!ih!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26493");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444441004.4044444444444444444444444444444444444444444444444", "                       444                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26494");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test26495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26495");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26496");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0true-100970", (java.lang.CharSequence) "true-1.0097.00true-1.0097.00true-1.0097.00trA0t");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26497");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "    A      40.. 47eurt.                                                 A      40.. 47eurt.                       A   40.. 47eurt.                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26498");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4                                                 100.0                                                                             aaaa0aaaaa       ...", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26499");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a4000                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a", (float) 164);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 164.0f + "'", float2 == 164.0f);
    }

    @Test
    public void test26500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("           a", "44444444444444444440TRUE-1.0097.                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           a" + "'", str2, "           a");
    }
}

