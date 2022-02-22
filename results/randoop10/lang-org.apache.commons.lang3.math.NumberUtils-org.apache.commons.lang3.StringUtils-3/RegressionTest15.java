import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                      ...", "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.", 444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...", "4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!", "Ahi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaaaaaaaaaa", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str1, "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(".", "    .         .                                                     1000    .         .         ", "0       00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "true4-4449744");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("           a", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.00..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.04444444444444444444444444440aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str1, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa", "...44                             ", "0true-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("   ", "     a    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  a    " + "'", str2, "  a    ");
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444" + "'", str2, "44444444444444");
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                            100.0                                                     aaaa..", 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a         a                                                     1000    a         a", "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", "..", 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0TRUE-1.0097.00T..0TRUE-1.0097.00T" + "'", str3, "0TRUE-1.0097.00T..0TRUE-1.0097.00T");
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...", "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                      ...                                                     ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "..", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 38 + "'", int11 == 38);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                     AAAA0AAAAA              ", "AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str2, "A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                            100.0                                                     aaaa..", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.00..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            100.0                                                     aaaa.." + "'", str2, "                            100.0                                                     aaaa..");
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 49L, (double) 45, (double) 116);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 116.0d + "'", double3 == 116.0d);
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0444...44444444444444444444444444444444440TRUE-1.0097...44", "                                                                                                                                  0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                    ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...", 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "", 91, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444" + "'", str4, "44444444444444444444444444");
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 841, (long) 86, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", "true-1.  97.", "aaaaa0aaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str2, "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("......4444444...4444444...4444444.....");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 156, 57);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "", 181, 181);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......4444444...4444444...4444444....." + "'", str2, "......4444444...4444444...4444444.....");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("A44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.0", "     A    ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444...44444444444444444444444444444444440true-1.0097...44");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               ", "00       000       000       00A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", (int) (byte) 100, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa" + "'", str3, "aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa");
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("A00       000       000       00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A00       000       000       0" + "'", str1, "A00       000       000       0");
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(20.0d, (double) 444, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 45, (long) 10, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                      100.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0" + "'", str1, "100.0");
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0true-1.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (double) 56);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.0d + "'", double2 == 56.0d);
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 10, 0L, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 94, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 94");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..." + "'", str1, "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 93.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 93.0d + "'", double2 == 93.0d);
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        char[] charArray7 = new char[] { '4', '4', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("h", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "              ", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 267L, (float) 44L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 47L, (double) (byte) -1, (double) 24);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 47.0d + "'", double3 == 47.0d);
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4444444...aaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("......4444444...4444444...4444444.....", "a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......4444444...4444444...4444444....." + "'", str2, "......4444444...4444444...4444444.....");
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A" + "'", str2, "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                               A44444                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("    A         A                                                     100.0    A         A         ", "A44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 156);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "44444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "-1.0097.04444444444444444444444444444444444444444444", "...                          ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", 156, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097." + "'", str3, "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(12L, 24L, 895L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 895L + "'", long3 == 895L);
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 100 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 100]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt04444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...    0true-1.0097.00true-1.0097.00true-1.0097.00tr", 35, 841);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.00tr" + "'", str3, "0true-1.0097.00tr");
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str2, "...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a440true-1.0097.044444444444444444444444444aa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0010000000474974513d, (double) 49, 4444444.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4444444.0d + "'", double3 == 4444444.0d);
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny(".....4444444444444444444444444444...4444444444...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", 127);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "0true-100970");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-100970" + "'", str1, "0true-100970");
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...4444444...4444444...4444444...4444444...                                       444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444", "    aaaaa0aaaa                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444");
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str2, "    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) ".", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, (double) 35, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" true-1.  97. ", "   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 25, (float) 41, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 41.0f + "'", float3 == 41.0f);
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0097...#############################################################################################", 44, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0" + "'", str2, " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       444...44444444444444444444444444444444440TRUE-1.0097" + "'", str2, "                                       444...44444444444444444444444444444444440TRUE-1.0097");
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", 9);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("true-97", 842, 49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ..." + "'", str1, "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...");
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str2, "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "4444..4444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("a         a                                                     1000    a         a", (int) '4', 625);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            1000    a         a" + "'", str3, "            1000    a         a");
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0aaaa", "a         a                                                     1000    a         a", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("-1.0097.04444444444444444444444444444444444444444444", ".044444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                            100.0", "    a0a                 0true-1.0A A A A            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            100.0" + "'", str2, "                                            100.0");
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00.." + "'", str1, "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..");
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...........................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("rue-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rue-1.0097.00tr" + "'", str1, "rue-1.0097.00tr");
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "0#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444" + "'", charSequence2, "0#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444");
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444", "     A    ", 156);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("100.0", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, " true-1.  97. ");
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("97.0", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444" + "'", str8, "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (short) 4);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 4 + "'", short2 == (short) 4);
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "4444444440097...#############################################################################################", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...    0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str1, "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "a0aaaaa              0true-1.0097.0444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa" + "'", str1, "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa");
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("h", 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0true-1.0AAAAa44444...", 4444444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...44444444444444444444444444444444440TRUE-1.0097...", "...4444444444444444444444444440t...");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a00       000       000       00", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "A44444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444" + "'", str8, "aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444");
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                      ...                                                    ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...", "0.0010.0hi", "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("###########################################true-1.97.############################################", "...                aaaaa0aaaa                     ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("AAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("     A    ", "...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     A    " + "'", str2, "     A    ");
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("IH", 98, 292);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH" + "'", str3, "IH");
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str2, "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "  A    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               ", "....4444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA A" + "'", str1, "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA A");
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str1, "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 93, 841);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str4, "4444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0097...", "  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097..." + "'", str2, "0097...");
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaa0aaaa0.7900.1-eurt04444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaa0aaaa0.7900.1-eurt04444444444444444..." + "'", str1, "aaaaa0aaaa0.7900.1-eurt04444444444444444...");
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0true-10aaaa00970aaaa0", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (double) 266L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 266.0d + "'", double2 == 266.0d);
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", "                                                                                                                                      a         a         a         a         a      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444444440 true-1.0 97.0 4444444444444444444444444444444444444444444", "                                                                                            A    44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAAAAAAAAAAAA", "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                              ", 7, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              " + "'", str3, "                                                                                              ");
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0true-1.0097.0444444444444444444444444444444444444444444", 266, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                100.0aaaa                 ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                100.0aaaa                 " + "'", str2, "                100.0aaaa                 ");
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444", (java.lang.CharSequence) "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 548 + "'", int2 == 548);
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                           true-1.97.                                                                                   ", "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                     aaaa0aaaaa           ", "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("0                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("                                            100.0", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("a00       000       000       00", 47, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a00       000       000       00" + "'", str3, "a00       000       000       00");
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...aaaaaaaaaaaaaaaaaaaaaaaaa", "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "444444444444444440true-1.0097...444444444444444444444444", 7);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("                                      100.0                                                     ", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     A    44", ".............................................");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...444444440tr...", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0..." + "'", str1, "aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...");
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4             ", "44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("A         A                                                     1000    A         A", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A         A                                                     1000    A         A" + "'", str2, "A         A                                                     1000    A         A");
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", 957, "4444444440097...#############################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a" + "'", str3, "4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a");
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0true-1.0A A A A                        a44444...", (float) 841);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 841.0f + "'", float2 == 841.0f);
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                ", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            " + "'", str2, "            ");
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ", "##100.0###", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", 842);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0097.", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097." + "'", str2, "0097.");
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               ", "0true-1.0097.0444444444444444444444444444444444444444444", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444444440 true-1.0 97.0 4444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444440 true-1.0 97.0 4444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 6.0f, (double) 216, (double) 20);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.0d + "'", double3 == 6.0d);
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "0true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("    4444444444444444444444444444   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(216, 95, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 39 + "'", int3 == 39);
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(20L, (long) 14, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 20L + "'", long3 == 20L);
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("A         A                                                     1000    A         A", (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("00       0true00       0-00       000       000       09700       000       0", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444", 51, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", "                                                                                                                                                            ", 58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                   0         aaa                        ", "    A         A                                                     1000    A         A         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   0         aaa                        " + "'", str2, "                                   0         aaa                        ");
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "00.1-eurt044444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("..", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".." + "'", str2, "..");
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                            A    44", (java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "4             ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0                                                                                                                                                                                                                                                                          " + "'", str1, "0                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         ", "                                                      ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa" + "'", str1, "0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa");
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444A44444", "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                      0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.", "0TRUE-", 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 179 + "'", int3 == 179);
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("    ", "0TRUE-1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("97.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0a", "444444a444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                                                                                                               4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ", "    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                 ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", "0aaa", "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr" + "'", str3, "                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!hi!hi!", "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!" + "'", str2, "hi!hi!hi!");
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444440TRUE-1.0097.0", strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0" + "'", str8, "100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0true-1.0097.0" + "'", str10, "0true-1.0097.0");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...", 73, "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0..." + "'", str3, "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaa", "0.0010.0hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0010.0hi" + "'", str2, "0.0010.0hi");
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "                                                                ...444444", 625);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa", "IH", "                                                                                                    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(550.0f, (float) 92, (float) 7L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 7.0f + "'", float3 == 7.0f);
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "rue-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", (int) (short) 0, "4 0true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "   ", (java.lang.CharSequence) "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", charSequence2, "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa", 92, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...00.7900.1-eurt00.7900.1-eurt0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...00.7900.1-eurt00.7900.1-eurt0" + "'", str2, "...00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10.0f, (double) 47.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("...    0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(7L, (long) 548, (long) 279);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 7L + "'", long3 == 7L);
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0true-1.0097.04444444444444444444444444440aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.04444444444444444444444444440aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0" + "'", str1, "0true-1.0097.04444444444444444444444444440aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0");
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0097...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                          ", 64, "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                          " + "'", str3, "                                                                                                                                          ");
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 546, (double) 47, (double) 895L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 47.0d + "'", double3 == 47.0d);
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  " + "'", str1, "  ");
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444444", "    a   hi!hi!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444...44444444444444444444444444444444440true-1.0097...44                                        ", "HI", (int) 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444440true-1.0097.", "0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444440true-1.0097.0100.0", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("9744", "                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9744" + "'", str2, "9744");
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                            100.0                                                     aaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444..4444", "4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("true4-4449744                                       ", "4444404444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                      ...                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...                          ...", 5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...", "...444444440tr...", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 12L, (float) 94);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 94.0f + "'", float3 == 94.0f);
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                            100.0", "", "0true-1.0097.04444444444444444444444444440aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            100.0" + "'", str3, "                                            100.0");
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                               100.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "44444444444444444444444a444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                  0aaaa                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                  aaaa0                                                                                                                                  " + "'", str1, "                                                                                                                                  aaaa0                                                                                                                                  ");
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("00       0true00       0-00       000       000       09700       000       0", "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0TRUE-1.0097.044444444444444444444444444...0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00       0true00       0-00       000       000       09700       000       0" + "'", str2, "00       0true00       0-00       000       000       09700       000       0");
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", 17, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str3, "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t");
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444", "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "    A         A                                                     1000    A         A         ", "a0aaaaa              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.00..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str2, "A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...44444...true-1.4444444...97.4444444...4444444444444...", "    a   hi!hi!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444...true-1.4444444...97.4444444...4444444444444..." + "'", str2, "...44444...true-1.4444444...97.4444444...4444444444444...");
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 138);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("444444A444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444A444444444444444444" + "'", str1, "444444A444444444444444444");
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("  ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                            100.0", "                       a                   TRUE-1.0097.0                       a                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0true-100970", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                  4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444" + "'", str1, "4444444444");
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444444444", "......4444444...4444444...4444444.....", 47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444" + "'", str3, "444444444444");
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0.001                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".001                                               \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", "444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", (int) '#', 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00..." + "'", str4, "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...");
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1L, 0.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0", 149, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...900.1-EURT04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        " + "'", str2, "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ");
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "      a         a         a         a         a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("              ", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                         ...444444440tr...                                          ", "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", 39, 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                       a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   " + "'", str4, "                                       a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ");
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                                                                          44444444444444444440true-1.0097.", "                                      0.001                                               ", 181);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                    0.001                                                            44444444444444444440true-1.0097." + "'", str3, "                                                                                    0.001                                                            44444444444444444440true-1.0097.");
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr", 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str3, "0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("    a   hi!hi!...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                      a         a         a         a         a      ", "                                      41004.404                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "44444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444440true-1.0097." + "'", str1, "44444444444444444440true-1.0097.");
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                      100.0                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0097...0097...0097...0097...", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097...0097...0097...0097..." + "'", str2, "0097...0097...0097...0097...");
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444444444444444444444444444444444444444440");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "04444444444444444444444444444444444444444444" + "'", str1, "04444444444444444444444444444444444444444444");
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("    A         A                                                     100.0    A         A         ", (int) (short) 1, 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   A         " + "'", str3, "   A         ");
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 43, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################" + "'", str3, "###########################################");
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 4, 156, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 156 + "'", int3 == 156);
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("00       000       000       00a", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            100.0", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                            A    44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 850, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                ...444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444440TRUE-1.009...", "44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                     0         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.0", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(".0097.00tr", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr" + "'", str2, ".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr");
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(125, 216, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 216 + "'", int3 == 216);
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    a0a                 ", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                     aaaa0aaaaa                     ", "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0.0010.0hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 34, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str1, "00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) (byte) 100, (long) 49);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(".............................................", "0true-1.0097.044444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.044444444444444444444444444..." + "'", str2, "0true-1.0097.044444444444444444444444444...");
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", ".............................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444a44444", 149);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444a44444                                                                                                                                           " + "'", str2, "4444a44444                                                                                                                                           ");
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                      0.001                                               ", "0TRUE-1.0097.044444444444444444444444444...", "444...44444444444444444444444444444444440TRUE-1.0097...44", 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                      0.001                                               " + "'", str4, "                                      0.001                                               ");
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444444444444444444444440T");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444440T" + "'", str1, "4444444444444444444444444444440T");
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", 550, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ", "4 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444440true-1.0097...444444444444444444444444", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "....4444444444444444444444444444...", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaa0aaaa0.7900.1-eurt04444444444444444...", "...4444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", 149);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("    a0a                 ", "4444444...                            ", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                     0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "hI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...00.7900.1-eurt00.7900.1-eurt0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("true4-4449744                                       ", 267, 138);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444");
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "0", (int) 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0" + "'", str7, "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", "a         a                                                     1000    a         a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("444444444444444444444444444444444444444444", (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0       00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("true-1.  97", "                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr", "                                                                                               100.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1.  97" + "'", str3, "true-1.  97");
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                      ...", "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00..", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("......4444444...4444444...4444444.....", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 14, 267.0f, (float) 841);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 841.0f + "'", float3 == 841.0f);
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                            " + "'", str1, "                                                                                                                                                            ");
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                      100.0                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("           a", "", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(".....4444444444444444444444444444...444444440true-10aaaa00970aaaa0..4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444...4444444444........4444444444444444444444444444." + "'", str2, "444444...4444444444........4444444444444444444444444444.");
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "A    4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4444..4444", "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa" + "'", str2, "a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa");
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 " + "'", str2, "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', 20, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 891, (float) 20L, 895.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 895.0f + "'", float3 == 895.0f);
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "true-1.  97.", (java.lang.CharSequence) ".0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                        \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0true-10aaaa00970aaaa0", 149);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                 ...                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!hi!hi!", "...44444...true-1.4444444...97.4444444...4444444444444...4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!" + "'", str2, "hi!hi!hi!");
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", "                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..." + "'", str2, "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h", '#');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("    A     ", (java.lang.Object[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "00       000       000       00A");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "A44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                              ", strArray3, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str9, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                  ", "444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444a44444                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0", (double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444444444444444440true-1.0097.", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097." + "'", str3, "44444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("4                                                   ", "0true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                                                   " + "'", str2, "4                                                   ");
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                aaaa", 444, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa");
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("         ", "                       a                   TRUE-1.0097.0                       a                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(91, 56, 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 116 + "'", int3 == 116);
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0", (int) '#', 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-EURT04444" + "'", str3, "-EURT04444");
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                     ...                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444a444444444444444444444444", "0.001");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0097..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("true4-4449744");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true4-4449744" + "'", str1, "true4-4449744");
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                               true  ", "                                                                                     a   hi!hi!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 55, 35L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 55L + "'", long3 == 55L);
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                              ", "hi4!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              " + "'", str2, "                                                                                              ");
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                        ", "                                                     ...                                      ", "                                      0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa                                        " + "'", str3, "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa                                        ");
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", "                     AAAA0AAAAA              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     AAAA0AAAAA              " + "'", str2, "                     AAAA0AAAAA              ");
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0#####100.0###" + "'", str2, "100.0#####100.0###");
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a         a                                                     1000    a         a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("true-1.  97", "...aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1.  97" + "'", str2, "true-1.  97");
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...0true-1.0097...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "                                         AAAA0AAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.", "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("444444444444444444444440.7900.1-eurt0aaaa                                                     0.001");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                      100.0                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "44444444444444444444444444444444444444444440 true-1.0 97.0 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 102 + "'", int1 == 102);
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (long) 94);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 94L + "'", long2 == 94L);
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "h", 100);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     A    ", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0true-1.0097.044444444444444444444444444444444444444444", strArray4, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0true-1.0097.044444444444444444444444444444444444444444" + "'", str8, "0true-1.0097.044444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                          rue-1.0097.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          rue-1.0097.0" + "'", str1, "                          rue-1.0097.0");
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "00.1-eurt044444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00.1-eurt044444444444444444444444444444" + "'", str1, "00.1-eurt044444444444444444444444444444");
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaa0a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0TRUE-1.0097.0", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.0" + "'", str2, "0TRUE-1.0097.0");
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "h", 100);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00       0", "444444444444444440true-1.0097...444444444444444444444444");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444...", "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444..." + "'", str2, "444444444...");
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                     AAAA0AAAAA           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                            100.0                                                     aaaa..", "                                                                                                aaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "    a   hi!hi!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, 18, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                       #A#44444444444444444444#...#444444444444444444444444444444444444444444444", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                     aaaaa0aaaa                     ", "                                                                               ...0...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     aaaaa0aaaa                     " + "'", str2, "                     aaaaa0aaaa                     ");
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "    a   hi!hi!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                               ", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                               ...0...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0..." + "'", str1, "...0...");
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444A44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444A44444" + "'", str1, "4444A44444");
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 100, (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(".0097.00true-1.0097.00true-1.0097.00tr", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                               ", "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                               ");
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 191L, (double) (byte) 100, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 191.0d + "'", double3 == 191.0d);
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 41, (long) 841, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 841L + "'", long3 == 841L);
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444" + "'", str2, "4444");
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(".001", "                     AAAA0AAAAA              ", "A44444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...." + "'", str1, "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi....");
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0true-1.0097.0444444444444444444444444444444444444444444", 625);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                      41004.404                                                ", "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      41004.404                                                " + "'", str2, "                                      41004.404                                                ");
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("1", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("###########################################true-1.97.############################################", "                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################################true-1.97.############################################" + "'", str2, "###########################################true-1.97.############################################");
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                         ...                                                     ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(56.0f, (float) (-1L), (float) 32L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 56.0f + "'", float3 == 56.0f);
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("rue-1.0097.0", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                      100.0                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     a    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444" + "'", str1, "     a    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444..4444", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444..4444" + "'", str2, "4444..4444");
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...A     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...A     ..." + "'", str1, "...A     ...");
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                       0aaa                        ", (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        char[] charArray6 = new char[] { '4', ' ', ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("..", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0TRUE-1.04444444444444444444444444444444444444444444", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  ,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 86 + "'", int7 == 86);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", "...44444444444444444444444444444444440TRUE-1.0097", "0true-1.0097.00true-1.0097.00true-1.0097.00tr a 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A" + "'", str3, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 116, 55L, (long) 24);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 24L + "'", long3 == 24L);
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444..." + "'", str5, "4444444...");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("444444444444444444444444...7900.1-EURT04444444444444444444444444444444444...444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100, (double) 44.0f, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("444440true-1.0097.0100.0", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444");
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("......4444444...4444444...4444444.....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray5, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4');
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("              ", strArray8);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByCharacterType("    A         A                                                     100.0    A         A         ");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  ", strArray8, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0" + "'", str9, "100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0true-1.0097.0" + "'", str11, "0true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "    A         A                                                     100.0    A         A         " + "'", str15, "    A         A                                                     100.0    A         A         ");
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "444444444444444444444444...7900.1-EURT04444444444444444444444444444444444...444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                                  0aaaa                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                               A44444                                               ", 45, 25);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444444444444444444444444444444444440TRUE-1.0097.0", "a0a", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", charArray13);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("    4444444444444444444444444444   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(266L, (long) 99, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 266L + "'", long3 == 266L);
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("          ", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "100.0                                                     aaaa0true-1.0097.044444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                ...444444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                ..." + "'", str2, "                                                                ...");
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                         ...                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10L, 57.0d, (double) 51L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0aaa", (int) (short) 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444");
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "1aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    ", "A44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("    A         A                                                     1000    A         A         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    A \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("444444A444444444444444444", "                                         ...444444440tr...                                          ", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, 58, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 58 + "'", int3 == 58);
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("00       000       000       00a", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00       000       000       00" + "'", str2, "00       000       000       00");
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "a00       000       000       00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                 aaaa0aaaaa    ", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 aaaa0aaaaa    " + "'", str2, "                 aaaa0aaaaa    ");
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("A         A                                                     1000    A         A", 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(".044444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".044444444444444444444444444" + "'", str1, ".044444444444444444444444444");
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", "                                      0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 111);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa" + "'", str3, "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0");
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("00       000       000       00a", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 216, "                     AAAA0AAAAA           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "h", 100);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     A    ", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0true-1.0097.044444444444444444444444444444444444444444", strArray4, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444", 0, 179);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0true-1.0097.044444444444444444444444444444444444444444" + "'", str8, "0true-1.0097.044444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444A44444");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 73, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444A44444" + "'", str3, "4444A44444");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", 179, 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...a", 8, "0true-1.0AAAAa44444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...a" + "'", str3, "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...a");
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444" + "'", str2, "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444");
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                     0         ", (long) 55);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55L + "'", long2 == 55L);
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a        ", 0, 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              " + "'", str3, "              ");
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444" + "'", str1, "444444444444");
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ue-1.0097...444444444444444444444444                                                                                        100.", "444444444444444444444440.7900.1-eurt0aaaa                                                     0.001");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) ".0097.00true-1.0097.00true-1.0097.00tr", (java.lang.CharSequence) "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.", 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097." + "'", str2, "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.");
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0.001", "                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.001" + "'", str2, "0.001");
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444440TRUE-1.009...", "", 957);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 57 + "'", int3 == 57);
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 5, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str3, "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }
}

