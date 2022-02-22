import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest82 {

    public static boolean debug = false;

    @Test
    public void test41001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41001");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41002");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41003");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("AAAAAAAAAAA4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           AAAAAAAAAAA", "444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41004");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test41005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41005");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444                                      100.0                                                     aaaa444444444444444444444", "     A    ", 266);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test41006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41006");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
    }

    @Test
    public void test41007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41007");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 43 + "'", int14 == 43);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test41008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                             ...                           ", 146, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41009");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(".7900.1-eurt0444444444444444444444444444444444444444444444    A   ...", "4444444###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41010");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "44444444444444444444444444444444444444444440true-1.0097.", 93);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("044444444444444444444", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test41011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41011");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 721, "                             ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                 " + "'", str3, "                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                 ");
    }

    @Test
    public void test41012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41012");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444");
    }

    @Test
    public void test41013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A" + "'", str1, "0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A");
    }

    @Test
    public void test41014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41014");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790", "                                                                                10000#####10000###", "                                                                                     4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790" + "'", str3, "a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790");
    }

    @Test
    public void test41015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41015");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.044", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test41016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41016");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440", 61);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0aaaa 0aaaa 0aaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test41017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41017");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41018");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41019");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(277L, 44L, (long) 541);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 541L + "'", long3 == 541L);
    }

    @Test
    public void test41020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41020");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970hhhhhhhhhhhhhhhh", "##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     ", 416, 329);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970hhhhhhhhhhhhhhhh" + "'", str4, "hhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970hhhhhhhhhhhhhhhh");
    }

    @Test
    public void test41021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41021");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("###################################################################################################...######################a######################################################", "TRUE-1.0097.00TRUE-1....");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444a444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444");
    }

    @Test
    public void test41024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41024");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "0true-1.0097.0aaaa0aaaaa", (java.lang.CharSequence) "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0true-1.0097.0aaaa0aaaaa" + "'", charSequence2, "0true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test41025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41025");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 734, 73L, (long) 65);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 734L + "'", long3 == 734L);
    }

    @Test
    public void test41026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4444444...4444444...4444444...4...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444...4444444...4444444...4...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ..." + "'", str2, "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...");
    }

    @Test
    public void test41029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("97.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0" + "'", str2, "97.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0");
    }

    @Test
    public void test41030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41030");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(668L, 116L, (long) 86);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 86L + "'", long3 == 86L);
    }

    @Test
    public void test41031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41031");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...40true-1.0097.04444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41032");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                      100.0                                                     aaaa", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA                                                                                                         ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test41033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41033");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   #################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41034");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                           aaaa0aaaaa                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444...4444444...4444444...4");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test41036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41036");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "a4a4aaaaaaaaaaaaaaaaaaa4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.4....444444444tr...aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA       ..." + "'", str1, "AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA       ...");
    }

    @Test
    public void test41038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                          #...#4#A#", "04440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41039");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4", "97...#############################################################################################", "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", 101);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4" + "'", str4, ".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4");
    }

    @Test
    public void test41040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41040");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaa0aaaa0.7900.1-eurt04444444444444444...HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", "44444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444...44444444444444444444444444444...4444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test41041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41041");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                      100.0                                                     ", (java.lang.CharSequence) "AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!.aaaaaa0aaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41042");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 650 + "'", int2 == 650);
    }

    @Test
    public void test41043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41043");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test41044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41044");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...t0444444444444444444444444444.....#...#...", "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444", "A                                    A   hi!hi!...       A   hi!hi!...   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...t0444444444444444444444444444.....#...#..." + "'", str3, "...t0444444444444444444444444444.....#...#...");
    }

    @Test
    public void test41045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41045");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("##################                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test41046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41046");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0444444444444444444444444444444444444444444", 69, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41047");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 721.0f, 0.0d, (double) 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 721.0d + "'", double3 == 721.0d);
    }

    @Test
    public void test41048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41048");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                  44444444444444444440true-1.0097", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test41049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097         000", 250, "                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a4000                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                          aaaa0aaaaa                                   aaaa0aaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097         000                          aaaa0aaaaa                                   aaaa0aaa" + "'", str3, "                          aaaa0aaaaa                                   aaaa0aaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097         000                          aaaa0aaaaa                                   aaaa0aaa");
    }

    @Test
    public void test41050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                        " + "'", str1, "                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                        ");
    }

    @Test
    public void test41051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("... a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a", 28, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a" + "'", str3, "... a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
    }

    @Test
    public void test41052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41052");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                97.0", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..", ".....4444444444444444444444444444...4444444444...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41053");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0.001                                               ", "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################", "444##444440true-1.0097...4444444444444444444440true-1#0097###44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) ".0097.00tr          ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".0097.00tr          ..." + "'", str1, ".0097.00tr          ...");
    }

    @Test
    public void test41056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41056");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "A   hi!hi!...truea   hi!hi!...-a   hi!hi!...a   hi!hi!...a   hi!hi!...97a   hi!hi!...a   hi!hi!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41057");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double21 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
    }

    @Test
    public void test41058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41058");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                        ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test41059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!" + "'", str1, "#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!...#######    a   HI!HI!");
    }

    @Test
    public void test41060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A", ".7900.1-eurt0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41061");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  4                   ", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41062");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444444444444444444444444444444444444444 !", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test41063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41063");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...IH");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                            0         aaa                        ", "0TRUE-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            0         aaa                        " + "'", str2, "                                                            0         aaa                        ");
    }

    @Test
    public void test41065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444AA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "A0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444AA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test41066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41066");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "0true-1.0097.0");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray15);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.split("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.stripAll(strArray26);
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray27, strArray30);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray27);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray27);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEach("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray22, strArray27);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (java.lang.Object[]) strArray27);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440TRUE-1.0097.0", strArray15, strArray27);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("TRUE-1.0097.0", strArray11, strArray27);
        java.lang.Class<?> wildcardClass38 = strArray27.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0" + "'", str8, "100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0true-1.0097.0" + "'", str10, "0true-1.0097.0");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "    A     " + "'", str16, "    A     ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "    A     " + "'", str17, "    A     ");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "100.0" + "'", str31, "100.0");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str34, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.0" + "'", str36, "44444444444444444444444444444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "TRUE-1.0097.0" + "'", str37, "TRUE-1.0097.0");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test41067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41067");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0ATRUEA-A1A.A0097A.A0");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("04444444444444444444444444444444444444444444", strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test41068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41068");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                     0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test41069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41069");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41070");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41071");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 850, 4.0f, (float) 68L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.0f + "'", float3 == 4.0f);
    }

    @Test
    public void test41072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41072");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0444444444       44444A   hi!hi!0444444444       44444", "    4A4         4A4                                                     41004.404    4A4         4A4         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41073");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                     0         ", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test41074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41074");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test41075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0true-1.0097.044444444444444444444444444 ...a                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.044444444444444444444444444...a" + "'", str1, "0true-1.0097.044444444444444444444444444...a");
    }

    @Test
    public void test41076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41076");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("97 true-1.", (float) 27L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 27.0f + "'", float2 == 27.0f);
    }

    @Test
    public void test41077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41077");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                     aaaa0aaaaa              ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test41078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41078");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", "...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0...0ue-1.0097...444444444444444444444444########################################################################################100.", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa" + "'", str3, "aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa4tr44444aaaa4aaaaa");
    }

    @Test
    public void test41079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41079");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                        ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("00#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######0", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41080");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuu", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41081");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 277, (double) 109, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test41082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41083");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!" + "'", str3, "hi!hi!hi!");
    }

    @Test
    public void test41084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41084");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("A0true-1.0097.00true-1.0097.00true-1.0097.00tr", "444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444   00       0                 ...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str3, "A0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test41085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str2, "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test41086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41086");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0444...44444444444444444444444444444444440TRUE-1.0097...44");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41087");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                   .0097.00tr          ...", 797);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 797 + "'", int2 == 797);
    }

    @Test
    public void test41088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41088");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                 444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ...44444444444444444444444444444444440true-1.0097...44444", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 113);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                 444444444444444444444444444444444444444444" + "'", str4, "                 444444444444444444444444444444444444444444");
    }

    @Test
    public void test41089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41089");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1.0097.0", (int) (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0097.0" + "'", str3, "-1.0097.0");
    }

    @Test
    public void test41090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41090");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "1000    A         A", (java.lang.CharSequence) "TRUE-1.0aaaaA44444...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "1000    A         A" + "'", charSequence2, "1000    A         A");
    }

    @Test
    public void test41091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41091");
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
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test41092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41092");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt", "                                                                                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1A009AAA                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaa                              0                     ", 557);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaAaaaaaaaaaaaAaaa                              0                     " + "'", str2, "aaaaaaaAaaaaaaaaaaaAaaa                              0                     ");
    }

    @Test
    public void test41094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41094");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#######################", " TRUE - 1 . 97 . ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", 817, "4444444444444444444444444444444444444444444#true-1.##97.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444" + "'", str3, "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444444444444444444444444444444444444#true-1.##97.4444444444");
    }

    @Test
    public void test41096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                ", "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test41097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41097");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test41098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41098");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test41099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41099");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444444444444444444444444444444444444 true - 1 . 97 . 444444444444444444444444444                                         ...                                                     4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444 true - 1 . 97 . 444444444444444444444444444 ... 4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444 true - 1 . 97 . 444444444444444444444444444 ... 4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test41100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41100");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                               4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ", "AAAAAAAAAAAAAAAAAAAAAAAAA...", 102);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "                                                                                                 ", (int) (short) 4);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "0true-1.0097.0");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("###########################################true-1.97.############################################", strArray10, strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, 'a');
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...........................................................................................................................................................................", strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAAAAAAAAAAAA       ...", strArray4, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "    A     " + "'", str14, "    A     ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "###########################################true-1.97.############################################" + "'", str15, "###########################################true-1.97.############################################");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "    A     " + "'", str17, "    A     ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test41101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0##RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0", "...44444444444444444444444444444444440TRUE-1.0097...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0##RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0" + "'", str2, "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0##RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0");
    }

    @Test
    public void test41102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("            ...4...4444444...4444444...4444444                                                                                                                          0                                                                                  ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            ...4...4444444...4444444...4444444                                                                                                                          0                                                                                  " + "'", str2, "            ...4...4444444...4444444...4444444                                                                                                                          0                                                                                  ");
    }

    @Test
    public void test41103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41103");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 788, 144L, 650L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 144L + "'", long3 == 144L);
    }

    @Test
    public void test41104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41104");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...A..");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41105");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                     aaaa0aaaaa           ", "...7900...7900...7900...7900", 841);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...44444...true-1.4444444...97.4444444...4444444444444...                  4", "true-1.00                                           true-1.97.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444...true-1.4444444...97.4444444...4444444444444...                  4" + "'", str2, "...44444...true-1.4444444...97.4444444...4444444444444...                  4");
    }

    @Test
    public void test41107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41107");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", "                                                   ", 253);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr", "...4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097....", (-1));
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach(" . 97 . 4444444444444444444444444444444444444444444", strArray4, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " . 97 . 4444444444444444444444444444444444444444444" + "'", str9, " . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444" + "'", str10, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444");
    }

    @Test
    public void test41108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41108");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                         000                                                    ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test41109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 444444444444444444444444444444444444444444", "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 444444444444444444444444444444444444444444" + "'", str2, "79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 444444444444444444444444444444444444444444");
    }

    @Test
    public void test41110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41110");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("        a                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     a        " + "'", str1, "                     a        ");
    }

    @Test
    public void test41111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41111");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
    }

    @Test
    public void test41112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                        ...44444444444...", 403, "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4                                                                                                                                                        ...44444444444..." + "'", str3, "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4                                                                                                                                                        ...44444444444...");
    }

    @Test
    public void test41113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41113");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaa0aaaaa", "0true-1.0097.0", (int) (byte) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                        ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "444444444444444444444444444444444444444", 797, 521);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaaa0aaaaa" + "'", str10, "aaaa0aaaaa");
    }

    @Test
    public void test41114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41114");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##100.0###", ".001", 658);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41115");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...44444...true-1.4444444...97.4444444...4444444444444...", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("444440true-1.0097.0100.0", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a0000000000", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".7900.1-eurt0444444444444444444444444444444444444444444444    A   ...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test41116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt", "444...44444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt" + "'", str2, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
    }

    @Test
    public void test41117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41117");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "0 true - 1 . ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                      rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                                                                                                                                                      ", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str4, "0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str5, "0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test41118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41118");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", (java.lang.CharSequence) "a0aaaaa##############0true-1.0097.0444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41119");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(82, 4444444, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4444444 + "'", int3 == 4444444);
    }

    @Test
    public void test41120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a", "444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.4444444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a" + "'", str2, "            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a");
    }

    @Test
    public void test41121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41121");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444       4444444440");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test41122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                           0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                           0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0" + "'", str3, "                                                                                                                                           0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
    }

    @Test
    public void test41123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("00       000       000       00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00       000       000       00" + "'", str1, "00       000       000       00");
    }

    @Test
    public void test41124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41124");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...", "...4a444hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "##############################true-1.97.############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str2, "...0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test41126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41126");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                       444                       ", (java.lang.CharSequence) "A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                       444                       " + "'", charSequence2, "                       444                       ");
    }

    @Test
    public void test41127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41127");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                            100.0");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 12, 0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                0.001                                               ", "     a    ", 56);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#a#44444444444444444444#...#444444444444444444444444444444444444444444444", strArray2, strArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                0.001                                               " + "'", str12, "                                                0.001                                               ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#a#44444444444444444444#...#444444444444444444444444444444444444444444444" + "'", str13, "#a#44444444444444444444#...#444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                0.001                                               " + "'", str14, "                                                0.001                                               ");
    }

    @Test
    public void test41128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41128");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41129");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A44444444444444444444...444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test41130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41130");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("..             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..             " + "'", str1, "..             ");
    }

    @Test
    public void test41131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41131");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str1, "444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
    }

    @Test
    public void test41132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41132");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("     a    ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test41133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41133");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41134");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("######################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41135");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444404444444440444444444044444444404444444440444444444044444444404444444a         a    0001                                                     a         a", 578);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                   ...                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41137");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("############################################# # #############################################", 125);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 125 + "'", int2 == 125);
    }

    @Test
    public void test41138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               4444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaa" + "'", str2, "aaaaaaaaaaa");
    }

    @Test
    public void test41139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41139");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0tr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41140");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 4, (short) (byte) 0, (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
    }

    @Test
    public void test41141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                ...........................................................................................................................................................................                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41142");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", "                     aaaa0aaaaa              ", (int) (short) 10);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0.001#0.001#0.001#0.001#0.001#0.001#0.001#0.001#0.001#0.001#0.001#0true-1.0097.00true-1.0097.00true-1.0097.00trA#0.001#0.001#0.001#0.001#0.001#0.001#0.001#0.001#0.001#0.001#0.001", strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 178 + "'", int5 == 178);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test41143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 68, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test41144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41144");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41145");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444444444444444444444", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 43 + "'", int16 == 43);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test41146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41146");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...00true-1.0097.00true-1.0097.00tr");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...00true-1.0097.00true-1.0097.00tr" + "'", str2, "...00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...00true-1.0097.00true-1.0097.00tr" + "'", str3, "...00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...00true-1.0097.00true-1.0097.00tr" + "'", str4, "...00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test41147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("a a a a", "    a                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a a a a" + "'", str2, "a a a a");
    }

    @Test
    public void test41148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41148");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444", "aaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", 172);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41149");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                         aaaa0aaaaa   ", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41150");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(120, 229, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 229 + "'", int3 == 229);
    }

    @Test
    public void test41151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41151");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                             Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0                                                                                                                                                                              ", 850, 188);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41152");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "44444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444...44444444444444444444444444444...4444444444444444444444444444", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4000", "A A A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4000" + "'", str2, "4000");
    }

    @Test
    public void test41154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41154");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41155");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", 134);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 134 + "'", int2 == 134);
    }

    @Test
    public void test41156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41156");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 448 + "'", int2 == 448);
    }

    @Test
    public void test41157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097", "           rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###" + "'", str3, "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
    }

    @Test
    public void test41158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41158");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(".00", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Aaaaaaaaaa", "                       a44444444444444444444...4444                       a44444444444444444444...4444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41160");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny(".....4444444444444444444444444444...444444440true-10aaaa00970aaaa0..4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test41161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41161");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                       4true4-4449744                                        ", "                                                                                                                                                                                                                                                            ", 265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             " + "'", str2, "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             ");
    }

    @Test
    public void test41164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41164");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                          100.0                                                ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0097.00T44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test41165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41165");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444", "444");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47", strArray2, strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47" + "'", str8, "4A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test41166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41166");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                      aaaa 0 aaaaa               ", "A0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41167");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                       0aaa                        ", "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41168");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                         rue-1.0097.0                                                                                                                                                                                                                                                               ", 132, 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                                                                                                                                                                                                                                                 A A A A A", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test41170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41170");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test41171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41171");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                         41004.404                                                    ", (float) 551);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41004.402f + "'", float2 == 41004.402f);
    }

    @Test
    public void test41172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41172");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41173");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 37, (double) 141, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test41174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41174");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(". 97 . 4444444444444444444444444444444444444444444", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("...44                            ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test41175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       " + "'", str1, "       ");
    }

    @Test
    public void test41176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41176");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097", "Aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41177");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444.79.1-eur        A         A  A         A         A    ", "444...44444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41178");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double21 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
    }

    @Test
    public void test41179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41179");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4444444...44444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444...44444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41181");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(330L, (long) 788, (long) 400);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 788L + "'", long3 == 788L);
    }

    @Test
    public void test41182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                           TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR                            ", "0true-1.00-1.0097.0444444444444444444444444444444......           0     44444444444444444444444444444444444444444440true-1.0097.0    0     44444444444444444444444444444444444444444440true-1.0097.0    0     44444444444444444444444444444444444444444440true-1.0097.0    0     4444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR                            " + "'", str2, "                           TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR                            ");
    }

    @Test
    public void test41183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41183");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444", 999, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444");
    }

    @Test
    public void test41184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41184");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41185");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0                     ", "                                                                                                                                                                                                                                                                                                    ", 329);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test41186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41186");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 t97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 t", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test41187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41187");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444" + "'", str3, "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444");
    }

    @Test
    public void test41188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41188");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("......", "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41189");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test41190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", "a                   TRUE-1.0097.0                       a                                                                                                                                                                                                                                                                                                                                                                                          ", "                          44444444444444444444444a");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41191");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("AAAAAAAAAA", "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A                                                                                                                                                                                                                                                                                                                                                                                                              ", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41192");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("    4444444444444444444444444444   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "1aaaaaaaaaaa4444444...4444444...4444444...4    aaaaa0aaaa                                                                             aaaaa0aaaa                                                                             aaaaa0aaaa                                                                             aaaaa0aaaa                                                                             aaaaa0aaaa                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41194");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41195");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                               !hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", (java.lang.CharSequence) "A   hi!hi!...truea   hi!hi!...-a   hi!hi!...a   hi!hi!...a   hi!hi!...97a   hi!hi!...a   hi!hi!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41196");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                 ", "4444444true-1.00                                           true-1.97.");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00                                                                                  0    -1.0097.00    -1.0097.00  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test41197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41197");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa", "A A A        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41198");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "44444444444444444444444444444440true0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...", (java.lang.CharSequence) "        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44444444444444444444444444444440true0true-1.0097.00true-1.0097.00true-1.0097.00trA0t..." + "'", charSequence2, "44444444444444444444444444444440true0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...");
    }

    @Test
    public void test41199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41199");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                    true4-4449744                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true4-4449744" + "'", str1, "true4-4449744");
    }

    @Test
    public void test41200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47" + "'", str1, "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47");
    }

    @Test
    public void test41201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41201");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", ".44444444444444444444444444444444A    4", ".ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41202");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 668);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41204");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                    4true4444444444true4444444444true4444444444trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 4true4444444444true4444444444true4444444444true4444444444true4444444444true4444444444true4444444444true4444444444true4444444444true444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    4true4444444444true4444444444true4444444444trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 4true4444444444true4444444444true4444444444true4444444444true4444444444true4444444444true4444444444true4444444444true4444444444true444444444" + "'", str1, "                    4true4444444444true4444444444true4444444444trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 4true4444444444true4444444444true4444444444true4444444444true4444444444true4444444444true4444444444true4444444444true4444444444true444444444");
    }

    @Test
    public void test41205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                            aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                             aaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                            ", 400, 134);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41208");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444..", "4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41209");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     0.7900.1-EURT0AAAAAAAAAAAAAAAAA", "                                         000                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("a444444444444444444444444", "aaaaaaaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a444444444444444444444444" + "'", str2, "a444444444444444444444444");
    }

    @Test
    public void test41211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41211");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...", 205);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..." + "'", str2, "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
    }

    @Test
    public void test41212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41212");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aA44444A44a44444", (java.lang.CharSequence) "         a                                          ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aA44444A44a44444" + "'", charSequence2, "aA44444A44a44444");
    }

    @Test
    public void test41213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41213");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                      100.0                ...                                                                       ", "true4-4449744                                       ", 449);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41214");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440aaaaa4a4A4A4A4A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 538);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41215");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ", "444444444444444440true-1.0097...a0aaaaa0true-1.0097.0444100.0", 35);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41216");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", 632);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41217");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test41218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41218");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                              44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                               ", "...4a444hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41219");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0aaaaaaaaaart00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41220");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444", 130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41221");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "0", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 4444444, 42);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("aahaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444" + "'", str6, "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444" + "'", str13, "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test41222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41222");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a    ", 38, 608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41223");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444440true-1.0097.444444444444444444444444", "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test41224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41224");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 468, 0.0f, (float) 237);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 468.0f + "'", float3 == 468.0f);
    }

    @Test
    public void test41225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...44444444444...                 aaaaaaaaaaa", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444...                 aaaaaaaaaaa" + "'", str2, "...44444444444...                 aaaaaaaaaaa");
    }

    @Test
    public void test41226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41226");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                         ", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444440097...#############################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41227");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", "4444444###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test41228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41228");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444...", "41004.404", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test41229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41229");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("#a######################...##############################################", "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41230");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR009744444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0", "aaaaa0aaaaaaaaa0a");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                   ", 73, 30);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test41231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...         aaaa0aaaaa", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...         aaaa0aaaaa" + "'", str2, "...         aaaa0aaaaa");
    }

    @Test
    public void test41232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41232");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                     444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("A0000000000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "aA44444A44a44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0000000000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "A0000000000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test41234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41234");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray6, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray6);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444                                                                ", strArray6);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.endsWithAny(" A", strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str12, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test41235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41235");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!", "A 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-14444a44444                                                                                                                                           A 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test41236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41236");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("         aaaa0aaaaa    ", 33, 169);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         aaaa0aaaaa    " + "'", str3, "         aaaa0aaaaa    ");
    }

    @Test
    public void test41237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("###################################    a   HI!HI!", 418, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################    a   HI!HI!" + "'", str3, "###################################    a   HI!HI!");
    }

    @Test
    public void test41238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRa0T...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRa0T...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test41239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41239");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...                                                                                                                                 ", "                       0aaa                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "          aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          aaaa" + "'", str1, "          aaaa");
    }

    @Test
    public void test41241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41241");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444400       0444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41242");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44444444444444444440TRUE-1.0097.                                                                      ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41243");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444", 449, 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41244");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!......", "4444444444444a00a.a1a-atruea0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test41247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41247");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0", "4444444444444444444444444444444444444444444444444444444444444444444444 !", "Aaaa                                                     0.001                            A      A  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0" + "'", str3, "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
    }

    @Test
    public void test41248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                                     ...                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41249");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                   ...                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41250");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...44                            ", "A A A A ", 623, 449);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...44                            A A A A " + "'", str4, "...44                            A A A A ");
    }

    @Test
    public void test41251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41251");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41252");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", "0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "     A44444      Aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 0 4444a44444" + "'", str1, "0 0 4444a44444");
    }

    @Test
    public void test41255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41255");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!hi!hi!1hi!hi!hi!.hi!hi!hi!0097hi!hi!hi!...hi!hi!hi!44", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test41256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41256");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...44444444444...                 aaaaaaaaaaa", 848);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41257");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h####################################################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue4-4449744", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41258");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a4444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 17);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h####################################################################################################", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test41259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41259");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...                                                                                                                                             ", 625L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 625L + "'", long2 == 625L);
    }

    @Test
    public void test41260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41260");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test41261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41261");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("ue-144444444444444444444444444444444########################################################################################1444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test41262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41262");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444true-1....4444497....444444444444444444444444444444444444444444444444", (double) 625L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 625.0d + "'", double2 == 625.0d);
    }

    @Test
    public void test41263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41263");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00", "0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41265");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                    true4-4449744                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41266");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!H                                                                                                           ...      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!H                                                                                                           ..." + "'", str1, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!H                                                                                                           ...");
    }

    @Test
    public void test41267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41267");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr A", "0true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41268");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                         ", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         " + "'", str2, "                         ");
    }

    @Test
    public void test41270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41270");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.0", "444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444444444444444444444444444444444444", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                ...44444");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaaaaaaaaaaaaaaA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0true-1.0097.0" + "'", str6, "0true-1.0097.0");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test41271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41271");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 657, 545);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41272");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!H", 615, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41273");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444.444444444.4444444444444444444444444444444444444444444444444444410004444.444444444.444444444             AAAA0AAAAA                 AAAA0AAAAA                 AAAA0AAAAA                 AAAA0AAAAA  ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41274");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                   ", "00       0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41275");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...AAAAAAAAAAAAAAAAAAAAAAAAA");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4447404444444444444444444444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41276");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41277");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41278");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iH", "....4444444444444444444444444444...");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test41279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("1AAAAAAAAAAA4444444...4444444...4444444...4", "true-1. 97.  true-1. 97.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1AAAAAAAAAAA4444444...4444444...4444444...4" + "'", str2, "1AAAAAAAAAAA4444444...4444444...4444444...4");
    }

    @Test
    public void test41280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41280");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(".97.                                                                                       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41281");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("  ##                                          #     ####  ##                          ", "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#aRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0", "0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  ##                                          #     ####  ##                          " + "'", str3, "  ##                                          #     ####  ##                          ");
    }

    @Test
    public void test41282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41282");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 667L, (double) 51L, 8.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.0d + "'", double3 == 8.0d);
    }

    @Test
    public void test41283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001", "                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001" + "'", str2, "1                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001");
    }

    @Test
    public void test41284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41284");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 96L, (long) 541);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test41285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41285");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("44444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41286");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("a444444444444444444444444...44444444444444444444444444444444440true-1.009...44444...true-1.4444444...97.4444444...4444444444444...4a444444444444444444444444...44444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a444444444444444444444444...44444444444444444444444444444444440true-1.009...44444...true-1.4444444...97.4444444...4444444444444...4a444444444444444444444444...44444444444444444444444444444444440true-1.0097" + "'", str1, "a444444444444444444444444...44444444444444444444444444444444440true-1.009...44444...true-1.4444444...97.4444444...4444444444444...4a444444444444444444444444...44444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test41287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41287");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("##########################################################################################################################################################################################################################################################################", "0TRUE-1.0097.04444444444444444444444444440AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41288");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41289");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("...1-eurt00.7900.1-eurt");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41290");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0097..###############################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test41291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                             100.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100." + "'", str1, "100.");
    }

    @Test
    public void test41292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "100.0                                                     4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41293");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "AA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 434);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41294");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("a44444a444444a444444444444444444a44444a", 368);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...", "               true                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097..." + "'", str2, "0TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...40000TRUE-1.0097...");
    }

    @Test
    public void test41296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41296");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "#######04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 #######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41297");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR a", "", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR a" + "'", str3, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR a");
    }

    @Test
    public void test41298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("rt00.7900.1-eurt0", "                      aaaa 0 aaaaa               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      aaaa 0 aaaaa               " + "'", str2, "                      aaaa 0 aaaaa               ");
    }

    @Test
    public void test41299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41299");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-44497");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-44497" + "'", str1, "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-44497");
    }

    @Test
    public void test41300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA0.7900.1-EURT04444444444444444444444444444444444444444444AAAAA0AAAA    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 49, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test41302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444...aaaaaaaaa44444444444444444444444444444444444444444", "                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A", "0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444...aaaaaaaaa44444444444444444444444444444444444444444" + "'", str3, "4444444...aaaaaaaaa44444444444444444444444444444444444444444");
    }

    @Test
    public void test41303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41303");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                                      44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444                                                                                                                                                                                                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41304");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test41305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41305");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test41306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa                              ", "AAAAAA0AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa                              " + "'", str2, "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa                              ");
    }

    @Test
    public void test41307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.00", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41309");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444", ".1-eurt00.7900.1-eurt");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41310");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(188, 539, 170);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
    }

    @Test
    public void test41311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41311");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4    4A4     404true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004t");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test41312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41312");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split(".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr", "0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 187);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("      aaaa..", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "      aaaa.." + "'", str7, "      aaaa..");
    }

    @Test
    public void test41313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41313");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                              4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41314");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41315");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                         aaaa0aaaaa    ", "...44444444444444444444444444444444440TRUE-1.0097...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test41316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41316");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaTRUE-1.  97.aa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41317");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0      A         A         A         A         A         A         A         A         A         A         A         A         A         A", 169);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41318");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41319");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!.....", "00       000       000       0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41320");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41321");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                     4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test41323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41323");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A", ".............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................79...1-eurt", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 14, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444" + "'", str3, "44444444444444");
    }

    @Test
    public void test41325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41325");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...", 445);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                     0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 110, "44444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097      A    4444444444444444444444444444444444444444444440TRUE-1 0097 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                     0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str3, "                                                                                                     0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test41327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41327");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 172, (float) 41L, (float) 895);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 895.0f + "'", float3 == 895.0f);
    }

    @Test
    public void test41328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41328");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444...7900.1-eurt044444444444444444", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("...........................................................................................................................................................................", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A         A", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...00true-1.0097.00tru...", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444a.........a....0001.....................................................a.........a", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test41329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41329");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 22L, 48.0f, (float) 570L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 570.0f + "'", float3 == 570.0f);
    }

    @Test
    public void test41330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A   114");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41331");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a4true4-44497");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790                    ", "...A .....44444...true-1.4444444...97.4444444...4444444444444...                  4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790                    " + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790                    ");
    }

    @Test
    public void test41333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41333");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41334");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...hi!", 159, 191);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41335");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("44444444444444444444444444444444444444444444444444...TRUE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444...true" + "'", str1, "44444444444444444444444444444444444444444444444444...true");
    }

    @Test
    public void test41336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41336");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41337");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "0true-1.0                                               41004.404");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41338");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.0", "     A    ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "0                                                                                                                                                                                                                                                                          ", 550, (int) (short) -1);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("4 ", strArray6);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "444 100.0 aaaa444444444444444444444", 650, 77);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..", strArray6, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 797");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test41339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41339");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                               4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test41340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41340");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaatrue0aaaa0.aaatruaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaatrue0aaaa0.aaatruaaa" + "'", str1, "aaaaatrue0aaaa0.aaatruaaa");
    }

    @Test
    public void test41341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa", 424);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa                                                                                                                                                                                                                                                  " + "'", str2, "aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test41342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "a a a a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41343");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     a...", 78, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41344");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 153);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("      a                                                                                                                    ", "Arrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi...rrrrAArrrhi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41346");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 10, (double) 11, (double) 60);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test41347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41347");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                         0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "44444444444444444444444444444444444444444AAAAAAAAA...4444444   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0444444444       444444444444444444", 664);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                          0444444444       444444444444444444                                                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                                                                          0444444444       444444444444444444                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test41349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41349");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                      100.0                                                     ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 17, (int) (short) -1);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444", strArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test41350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...44                            ", "                                      100.0                                                     aaaa100100.0                                                     aaaa.100.0                                                     aaaa0100.0                                                     aaaa                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44                            " + "'", str2, "...44                            ");
    }

    @Test
    public void test41351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41351");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("    A         A                                                     100.0    A         A         ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test41352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41352");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                              ", "4444444...", "... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa", 557);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                              " + "'", str4, "                                                                                              ");
    }

    @Test
    public void test41353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           ", "truetruetruetruetruetruetruetruetrue");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("rue-1.0097.00trA0t");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rue-1.0097.00trA0t" + "'", str1, "rue-1.0097.00trA0t");
    }

    @Test
    public void test41355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41355");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh###############################################################################", "                                                                                                                                                                                                                                                                                                                                            !IH                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41356");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(265L, 0L, (long) 159);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 265L + "'", long3 == 265L);
    }

    @Test
    public void test41357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41357");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("true-1.00                                           true-1.97.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true-1.00                                           true-1.97." + "'", str1, "true-1.00                                           true-1.97.");
    }

    @Test
    public void test41359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41360");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) ".0097.00true-1.0097.00true-1.0097.00tr4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", (java.lang.CharSequence) "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...##################################################################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + ".0097.00true-1.0097.00true-1.0097.00tr4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa" + "'", charSequence2, ".0097.00true-1.0097.00true-1.0097.00tr4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
    }

    @Test
    public void test41361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41361");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...444444440tr...", "aaaaaaaaa...44444444444444444444444444444444hi4!aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test41362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41362");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaa", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                           aaaaaaaaaaaaaaaaa                                                            " + "'", str2, "                                                           aaaaaaaaaaaaaaaaa                                                            ");
    }

    @Test
    public void test41364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41364");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444...4444                       44444444444444444444...4444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41365");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.", "true-1.  97");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test41366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41366");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!I!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!I", "                                                                                    0.001                                                            44444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44444444444444444444444444444444440true-140097", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444440true-140097" + "'", str2, "44444444444444444444444444444444440true-140097");
    }

    @Test
    public void test41368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41368");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0aaaa 0aaaa 0aaaa", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0aaaaa0aaaaa0aaaa" + "'", str3, "0aaaaa0aaaaa0aaaa");
    }

    @Test
    public void test41369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41369");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test41370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41370");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 671, 842L, (long) 400);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 400L + "'", long3 == 400L);
    }

    @Test
    public void test41371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41371");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                                                                                       true-1....97true-1....97                                                                                                                                                                                                                                                                                                        ", 95, 229);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                        true-1....97true-1....97     " + "'", str3, "                                                                                                                                                                                                        true-1....97true-1....97     ");
    }

    @Test
    public void test41372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41372");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (int) (byte) -1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444" + "'", str6, "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444");
    }

    @Test
    public void test41373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41373");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("1AAAAAAAAAAA4444444...4444444...4444444...4    AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1AAAAAAAAAAA4444444...4444444...4444444...4    AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA" + "'", str1, "1AAAAAAAAAAA4444444...4444444...4444444...4    AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA                                                                             AAAAA0AAAA");
    }

    @Test
    public void test41374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41374");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 891.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test41375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("A A ", "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A A " + "'", str2, "A A ");
    }

    @Test
    public void test41376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", "100.0                                                     aaaa..AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT" + "'", str2, "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
    }

    @Test
    public void test41377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41377");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "              ", 45);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                      a                                                     ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "A A ", 628, 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test41378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41378");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0aaaa a 0aaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                0097.                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                0097.                                                 " + "'", str1, "                                                0097.                                                 ");
    }

    @Test
    public void test41380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41380");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "               ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test41381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41381");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("TRUEa97aTRUEa97");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41382");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "true44TRUE-1.  97.", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test41383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444...                            ", "                                                                                                                                                                                                                                                                                                                                                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...                            " + "'", str2, "4444444...                            ");
    }

    @Test
    public void test41384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41384");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("4444", "4444444444444a00a.a1a-atruea0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41385");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...                                                               ...", "...aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41386");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444                                      100.0                                                     aaaa444444444444444444444", "44444444444444444444444A444444444444444444444444", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!I!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41388");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    A         A                                                     100.0    A         A     ..", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh", 615);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test41389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41389");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 441, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test41390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41390");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                       4a4444444444444444444444...4444444444444444444444444444444444444444444444", (java.lang.CharSequence) "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 527 + "'", int2 == 527);
    }

    @Test
    public void test41391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41391");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4444444444440true-1.0097.", "... a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41392");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str1, "A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test41394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41394");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(" 44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0", "44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str3, " 44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test41395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 539);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("            ...4...4444444...4444444...4444444                                                                                                                          0                                                                                  ", 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            ...4...4444444...4444444...4444444                                                       " + "'", str2, "            ...4...4444444...4444444...4444444                                                       ");
    }

    @Test
    public void test41397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                     AAAA0AAAAA                     ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     AAAA0AAAAA                     ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "                     AAAA0AAAAA                     ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test41398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097" + "'", str1, "TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097");
    }

    @Test
    public void test41399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41399");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "AHI!HI!HI!HI!HI!HI!HI!HI!HI!H", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test41400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41400");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(33.0d, (double) 63, (double) 630L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 630.0d + "'", double3 == 630.0d);
    }

    @Test
    public void test41401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41401");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 368, "0                        0true-1.00-1.0097.0444444444444444444444444444444...                                                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0                        0true-1.00-1.0097.0444444444444444444444444444444...                                                                                      0                    0                        0true-1.00-1.0097.0444444444444444444444444444444...                                                                                      0                    " + "'", str3, "0                        0true-1.00-1.0097.0444444444444444444444444444444...                                                                                      0                    0                        0true-1.00-1.0097.0444444444444444444444444444444...                                                                                      0                    ");
    }

    @Test
    public void test41402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...444###################################################44444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444###################################################44444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str3, "...444###################################################44444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test41403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41403");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ...444###################################################44444444444444444444444              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ...444###################################################44444444444444444444444              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41404");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.0444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.0");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("100.0aaaa", strArray1, strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0aaaa" + "'", str5, "100.0aaaa");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test41405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41405");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test41406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41406");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 52);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("444440true-1.0097.0100.0", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0", strArray4, strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str9, "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0" + "'", str10, "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str11, "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test41407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "   4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41408");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0AAA", 665L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 665L + "'", long2 == 665L);
    }

    @Test
    public void test41409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41409");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 465, 253.0d, (double) 253.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 465.0d + "'", double3 == 465.0d);
    }

    @Test
    public void test41410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa" + "'", str1, "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
    }

    @Test
    public void test41411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41411");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("###################################################################################################################################################################################################################################################################################################################################################################################################...44444444444444444444444444444444444444444444444444444...###################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test41412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41413");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 891L, 0.0f, (float) 30);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test41414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41414");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                         ...      ", "...A ..", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41415");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41416");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       000       000       00a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       000       000       00a" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       000       000       00a");
    }

    @Test
    public void test41417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41417");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                      41004.404                                                ", (int) (byte) -1, 951);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41418");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("97.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", (long) 156);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 156L + "'", long2 == 156L);
    }

    @Test
    public void test41419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41419");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ", 544, "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444aHI!HI!..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444");
    }

    @Test
    public void test41420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41420");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("ue-1.0097...444444444444444444444444                                                                                        100.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "                                                                                                                                                                                            0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A                                 100.0                                                     aaaa..                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test41422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41422");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 132, (long) 3, (long) 93);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
    }

    @Test
    public void test41423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                ", "44444444444444444444444444444444444444444AAAAAAAAA...4444444                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test41424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41424");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                   ", "True-1.00                                           true-1.97.", "444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tra0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41425");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa", 608);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 608 + "'", int2 == 608);
    }

    @Test
    public void test41426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41426");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                              0                     ", "                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              0                     " + "'", str2, "                              0                     ");
    }

    @Test
    public void test41428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41428");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test41429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41429");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("......................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......................" + "'", str1, "......................");
    }

    @Test
    public void test41430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41430");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("          TRUE  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE" + "'", str1, "TRUE");
    }

    @Test
    public void test41431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41431");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444400       0true00       0-00       000       000       09700       000       04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test41432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41432");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444444444444444", ".7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test41433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaa0aaaa0.7900.1-eurt04444444444444444... 44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", ".....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa0aaaa0.7900.1-eurt04444444444444444... 44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "aaaaaa0aaaa0.7900.1-eurt04444444444444444... 44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test41434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", "...a ..");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test41435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41435");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       " + "'", str1, "      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
    }

    @Test
    public void test41436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00  ", "           ", "44444444444true444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test41437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41437");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                         aaaa0aaaaa    ", "aaaa44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41438");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      a         a         a         a         a                                                                                                                                      ", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test41439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41439");
        float[] floatArray4 = new float[] { 49.0f, 0.0f, 42, 3.0f };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[49.0, 0.0, 42.0, 3.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 49.0f + "'", float7 == 49.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 49.0f + "'", float9 == 49.0f);
    }

    @Test
    public void test41440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0440097...40097...4444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ", "0444444444       44444A   hi!hi!0444444444       44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0440097...40097...4444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             " + "'", str2, "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0440097...40097...4444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
    }

    @Test
    public void test41441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41441");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                       ", 363, "tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.009                                       tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.009" + "'", str3, "tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.009                                       tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00trtr.009");
    }

    @Test
    public void test41442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41442");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0" + "'", str3, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
    }

    @Test
    public void test41443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41443");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                             100.0", "aaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41444");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                          44444444444444444440true-1.009");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test41445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41445");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", "                                                                                     0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41446");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("....414-4eurt40", "                                                     ", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41447");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0       00", 655, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41448");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                         0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "44444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa", "                                                                                                                                                                                                                                                                                                                                                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str3, "                                         0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test41449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41449");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0097.", "", 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097." + "'", str3, "0097.");
    }

    @Test
    public void test41450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41450");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0       000       00790       000       000       00-0       00eurt0       00");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41451");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ue-1.0097...444444444444444444444444                                                                                        100.", 141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41452");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a                                  ...4444444...444444444...", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a                                  ...4444444...444444444..." + "'", charSequence2, "...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a                                  ...4444444...444444444...");
    }

    @Test
    public void test41453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41454");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       0", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-0040004000409700400040" + "'", str4, "0040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-00400040004097004000400040true0040-0040004000409700400040");
    }

    @Test
    public void test41455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".44444444444444444444444444444444A    4", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".44444444444444444444444444444444A    4" + "'", str2, ".44444444444444444444444444444444A    4");
    }

    @Test
    public void test41456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41456");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("##############################true-1.97.############################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test41457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41457");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...44hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...444", 416, "a0aaaaa##############0true-1.0097.044");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...44hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...444" + "'", str3, "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...44hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...444");
    }

    @Test
    public void test41458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41458");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test41459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41459");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("1aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4...4444444...4444444...4444444aaaaaaaaaaa1" + "'", str1, "4...4444444...4444444...4444444aaaaaaaaaaa1");
    }

    @Test
    public void test41461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                 A A A A A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test41462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test41463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41463");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("          aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa" + "'", str1, "aaaa");
    }

    @Test
    public void test41464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41464");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.", "444444...                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41465");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaa", "0true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test41466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41466");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444" + "'", str1, "4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444");
    }

    @Test
    public void test41468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41468");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A       44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A                       A        ", 17, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test41469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("..             ", ".0097.00true-1.00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..             " + "'", str2, "..             ");
    }

    @Test
    public void test41470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41470");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41471");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("..44440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444HI HI HI HI HI HI HI HI HI HI...4444a44444444", "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41472");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h####################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444000true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41473");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(71, 0, 544);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 544 + "'", int3 == 544);
    }

    @Test
    public void test41474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41474");
        char[] charArray19 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray19);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray19);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray19);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray19);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray19);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray19);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...", charArray19);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", charArray19);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray19);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ", charArray19);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray19);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.00", charArray19);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.044", charArray19);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0       000       00790       000       000       00-0       00eurt0       0", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 45 + "'", int23 == 45);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test41475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41475");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                    ", "A         A                  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41476");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '4', 107, 110);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test41477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41477");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test41478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41478");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444440true-1009744");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test41479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41479");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0TRUE-1 0097 0", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0TRUE-1 0097 0" + "'", str3, "0TRUE-1 0097 0");
    }

    @Test
    public void test41480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41480");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", (java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "HI!", 56, 47);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concatWith("  ...", (java.lang.Object[]) strArray7);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097", strArray7, strArray19);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.split(" aaaa0aaaaa    ");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(".001", strArray7, strArray23);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str20, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097" + "'", str21, "44444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ".001" + "'", str24, ".001");
    }

    @Test
    public void test41481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "4A444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4A444444444444444444" + "'", str1, "4A444444444444444444");
    }

    @Test
    public void test41482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41482");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                      hI!HI!HI!HI!HI!HI!HI!HI!Htrue-1.00                                           true-1.97.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                      hI!HI!HI!HI!HI!HI!HI!HI!Htrue-1.00                                           true-1.97.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41483");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                       444...44444444444444444444444444444444440true-1.0097################################################################################################################################################################################", (java.lang.CharSequence) "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41484");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(104, 539, 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 73 + "'", int3 == 73);
    }

    @Test
    public void test41485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41485");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097", "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat", 444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test41486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41486");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                     a   hi!hi!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                     a   hi!hi!..." + "'", str1, "                                                                                     a   hi!hi!...");
    }

    @Test
    public void test41487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41487");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0097.00true-1.00");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"097.00true-1.00\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr", 170);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test41489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41489");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "h", (java.lang.CharSequence) "aaaaa0aaaa                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "A00       000       000       0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test41491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41491");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "######################################044444444444444444444444444", "     ...##                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41492");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("TRUE-1.00TRUE", "44444444444444444444444444444444444444444440 true-1.0 97.0 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41493");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                         0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "####                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41494");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41495");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################", 116, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################" + "'", str3, "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################");
    }

    @Test
    public void test41496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "...###################################################", "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.A44444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A44444444!hi!hi!hi...A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A44444444444444444444444444444444444444444440true-1A0097A04444444444444444444444444444444444444444444" + "'", str3, "A44444444444444444444444444444444444444444440true-1A0097A04444444444444444444444444444444444444444444");
    }

    @Test
    public void test41497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                 444...44444444444444444444444444444444440true-1.0097...44                                        ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                 444...44444444444444444444444444444444440true-1.0097...44                                        " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                 444...44444444444444444444444444444444440true-1.0097...44                                        ");
    }

    @Test
    public void test41498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41498");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("A0A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00", "444440true-1.0097.0100.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test41500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest82.test41500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                      100.0                                                     ", 84, 76);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            " + "'", str3, "            ");
    }
}

