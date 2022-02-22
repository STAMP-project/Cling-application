import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest102 {

    public static boolean debug = false;

    @Test
    public void test51001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51001");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test51002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51002");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                                                                         rue-1.0097.0                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51003");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444794444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444eurt4444444444444444444444444444444444444444444#.#79#.#1#-#eurt#4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                                          44444444444444444440true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444440true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat" + "'", str1, "44444444444444444440true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat");
    }

    @Test
    public void test51005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test51006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51006");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4" + "'", str1, "...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4");
    }

    @Test
    public void test51007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51007");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                         ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "...                      0TRUE-1.0  0true-1.0097.0aaaa0aaaaa...                      0TRUE-1.0  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51009");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hihihihihihihihihihi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51010");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##" + "'", str1, "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##");
    }

    @Test
    public void test51011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51011");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("ahi       TRUE!       TRUEhi       TRUE!       TRUEhi       TRUE!       TRUEhaaaaaaaaaaaaaaa       TRUE44444       TRUEaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test51012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51012");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                      a                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test51013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51013");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444440TRUE-1.0097...444444444444444444444444                                                                                        100.", "A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A...     A    -EURT04444444444444444444444444444444444...", 128);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0 0 4444a44444", "         a                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 664);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51016");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("a         a                                                     1000    a         a", "00       0true00       0-00       000                                                        ", 830);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaa0aaaa0.7900.1-eurt04444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51018");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("             ", "......................");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51019");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("..0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51020");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", "4444444444444444444444444444444444444444444444444444444444444444444444   !   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test51021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51021");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51022");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", (java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "HI!", 56, 47);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concatWith("  ...", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097", strArray6, strArray18);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str19, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097" + "'", str20, "44444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test51023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47", 732);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47" + "'", str2, "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47");
    }

    @Test
    public void test51024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51024");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "                  4                  ", "44...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51025");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!hi!h!hi!h44444444444440.7900.1-EURT04444444444444444444444444444444444444444444", "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", 170);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51026");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 135, (long) 538, (long) 29);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 538L + "'", long3 == 538L);
    }

    @Test
    public void test51027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51027");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...                             ", 86, 363);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                             " + "'", str3, "...                             ");
    }

    @Test
    public void test51028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51028");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################", (java.lang.CharSequence) "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 757 + "'", int2 == 757);
    }

    @Test
    public void test51029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                         ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         ..." + "'", str1, "                         ...");
    }

    @Test
    public void test51030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51030");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT" + "'", str1, "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
    }

    @Test
    public void test51031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A" + "'", str2, "A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A");
    }

    @Test
    public void test51032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test51033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51033");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...A .....44444...true-1.4444444...97.4444444...4444444444444...                  4", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...A4.....44444...true-1.4444444...97.4444444...4444444444444...4444444444444444444" + "'", str3, "...A4.....44444...true-1.4444444...97.4444444...4444444444444...4444444444444444444");
    }

    @Test
    public void test51034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51034");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ".001", 156);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "0true-1.0097.00true-1.0097.00true-1.0097.00tr Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAhI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51035");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 44, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 44 + "'", short3 == (short) 44);
    }

    @Test
    public void test51036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                ..", "                                                                                                                                                                                                                                                                                                                                                                                                                                                           4444a44444                                                                                                                                                                                                                          ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test51037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("44444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", "                                                                                     4444444444444444444444444444444444444444444a.79a.1-eurta44444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test51038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                                                               44444444444444444440true-1.0097", "4444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                               44444444444444444440true-1.00" + "'", str2, "                                                                                                                                                                                                               44444444444444444440true-1.00");
    }

    @Test
    public void test51039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51039");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#################                                                                                                                                                                                                       ", 27, 819);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51040");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00.0                                                     aaaa", "4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444", 968);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51041");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test51042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##100.0###44444444444.0097.00true-1.00", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##100.0###44444444444.0097.00true-1.00" + "'", str2, "##100.0###44444444444.0097.00true-1.00");
    }

    @Test
    public void test51043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51043");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                       a                             ###    a   HI!HI!...###    a   HI!HI!...###", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444...7900.1-eurt044444444444444444", "4444444444444444444444444444440ta4444444444444444444444444444440t 4444444444444444444A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444440ta4444444444444444444444444444440t 4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test51045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("####################################################################################################################################################################################################################################################...t0444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################################################################################################################################################################################################################...t0444444444444444444444444444..." + "'", str1, "####################################################################################################################################################################################################################################################...t0444444444444444444444444444...");
    }

    @Test
    public void test51046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51046");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA                                         41004.404                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51047");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444" + "'", str3, "444444444444");
    }

    @Test
    public void test51048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444440true-1.0097." + "'", str1, "44444444444444444440true-1.0097.");
    }

    @Test
    public void test51049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51049");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaa...44                             ", (java.lang.CharSequence) ".. A..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                      ...                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test51051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51051");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("100.0aaaa100100.0aaaa.100.0aaaa0100.0aaaa", "44444444444444", 104);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51052");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...44                            A A A A ", "                                               TRUE  ", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51053");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A    A00 000 0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51054");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test51055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51055");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"        \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test51057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51057");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test51058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51058");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("         ", "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999", 467);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "##100.0###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("00       000       000       0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51061");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(202.0f, 655.0f, (float) 618);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 202.0f + "'", float3 == 202.0f);
    }

    @Test
    public void test51062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4444444true-1.00                                           true-1.97.                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444true-1.00                                           true-1.97.                                                                                       " + "'", str1, "4444444true-1.00                                           true-1.97.                                                                                       ");
    }

    @Test
    public void test51063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51063");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaa", "......4444444...4444444...4444444.....", 887);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51064");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                        ...0TRUE-1.0097...                            ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51065");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.Object[]) strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("0", strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("     A    44", strArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("TRUE-1...444444444444444444444440TRUE-1 0097 0097...444444444444444444444440TRUE-1 0097 0", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test51066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51066");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("..7900                                                                                              ", "...44444...4444444...4...aaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 344);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                      ....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...                                                                                                                                                                       ", "aahI!aaAE444444444444444444444AE444444444444444444444AE44444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test51068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A ", "##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A " + "'", str2, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A ");
    }

    @Test
    public void test51069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51069");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...44444444444444444444a", (java.lang.CharSequence) "                                     100.0                                                     aaaa                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 170 + "'", int2 == 170);
    }

    @Test
    public void test51070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51070");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(109, 623, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 623 + "'", int3 == 623);
    }

    @Test
    public void test51071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444", "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444000true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a" + "'", str2, "A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a");
    }

    @Test
    public void test51072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51072");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#################################################################################aaaaaaaaaa##################################################################################", "", 660);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################aaaaaaaaaa##################################################################################" + "'", str3, "#################################################################################aaaaaaaaaa##################################################################################");
    }

    @Test
    public void test51074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("A         A                                                     100.0    A         A0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a4444444444444444444444444444444444444444", 190);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A         A                                                     100.0    A         A0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440" + "'", str2, "A         A                                                     100.0    A         A0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440");
    }

    @Test
    public void test51075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51075");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0.0010.0hi", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray14);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test51076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51076");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0aaaaa4a4A4A4A4A", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test51077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444", "4444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444" + "'", str2, "0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444");
    }

    @Test
    public void test51078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51078");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("444404444444440444444444044444444404444444440444444444044444444404444444a         a    0001                                                     a         a", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("100.0##", "                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51080");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                    4                                                 100.0                                                                             AAAA0AAAAA       ...                                                                                                                                                     ", (long) 124);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 124L + "'", long2 == 124L);
    }

    @Test
    public void test51081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...                   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                   " + "'", str2, "...                   ");
    }

    @Test
    public void test51082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51082");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa0.7900.1-eurt0aaa...4aaaaa0aaaa     ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test51083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51083");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaa...    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", "", 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 73 + "'", int3 == 73);
    }

    @Test
    public void test51084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "444444444444444444444444...444444444444444444444444444444444404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444TRUE-1.044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044497...444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51085");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    a   HI!HI!", "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440true");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51086");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIH!HHIIH!I!IHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII........III");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!HHIIH!I!IHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII........III" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!HHIIH!I!IHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII........III");
    }

    @Test
    public void test51087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51087");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                          0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ", "...AAAAAAAAAAAAAAAAAAAAAAAAA", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 387 + "'", int3 == 387);
    }

    @Test
    public void test51088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51088");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 76, (long) 56, (long) 449);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 449L + "'", long3 == 449L);
    }

    @Test
    public void test51089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51089");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test51090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51090");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 66, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 77 + "'", int3 == 77);
    }

    @Test
    public void test51091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51091");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                     a0000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a0000000000" + "'", str1, "a0000000000");
    }

    @Test
    public void test51092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51092");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"         \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51093");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51094");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(".############################################");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test51095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                              a                        A A A A                                                                 ", 744);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                  a                        A A A A                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                  a                        A A A A                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test51096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51096");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAA0AAAA0.7900.1-EURT04444444444444444...", "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...40TRUE-1.0097.04444444444444444444444444444444444...a a a a", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...40TRUE-1.0097.04444444444444444444444444444444444...a a a a" + "'", str3, "...40TRUE-1.0097.04444444444444444444444444444444444...a a a a");
    }

    @Test
    public void test51098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51098");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...4a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44" + "'", str1, "...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
    }

    @Test
    public void test51099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51099");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("a    4444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444", 93, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a    4444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444" + "'", str3, "a    4444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444");
    }

    @Test
    public void test51100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51100");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(220, 36, 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
    }

    @Test
    public void test51101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51101");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a#a", "444444444...", 833);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51102");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("...44", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test51103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51103");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440true-1.0097...44444");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("h", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test51104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       0970aaaaaa0aaaaaaaaaaaaa444444...", "...0TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       0970aaaaaa0aaaaaaaaaaaaa444444" + "'", str2, "aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       0970aaaaaa0aaaaaaaaaaaaa444444");
    }

    @Test
    public void test51105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("##############################true-1.97.############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################true-1.97.############################################" + "'", str1, "##############################true-1.97.############################################");
    }

    @Test
    public void test51106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51106");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                0.001                                               ", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                       444...44444444444444444444444444444444440TRUE-1.0097", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########################################################A0###########################################################", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUETRUEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test51107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00  ", "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00  " + "'", str2, "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00  ");
    }

    @Test
    public void test51108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-e" + "'", str1, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-e");
    }

    @Test
    public void test51109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("A         A         A        ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A         A         A        ...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51110");
        char[] charArray17 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444440true-1.0097...444444444444444444444444", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("00       000       000       00a", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0.001", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                        4444A44444                                                                                                                                                                                                                          ", charArray17);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...IH", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test51111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51111");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "44...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...", "9744");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ', 0, 55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str10, "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51112");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 400, 177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 400 + "'", int3 == 400);
    }

    @Test
    public void test51113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51113");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4444444                                                                                                                                                                                                                                                                                                                                                                                                               ", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                ...44444", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test51114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51114");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr", "...##########hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h#####################...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaa44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.aaaa" + "'", str1, "aaaa44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.aaaa");
    }

    @Test
    public void test51116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51116");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ", "#true-#.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51117");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0TRUE-1.0aaaaA44444...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51118");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaa...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51119");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                     aaaa0aaaaa   ", (java.lang.CharSequence) "                                                               AAAA0AAAA                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51120");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A A A A                        A                             ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51121");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 77L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 77L + "'", long2 == 77L);
    }

    @Test
    public void test51122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                  4                   ", "                                                                                                                                                                                                                        4444A44444                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51123");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...4444444...4444444...4...AAAAAAAAAAAAAAAAAAAAAAA", "0AAAAaTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaaTR4444A44444aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaa", "...4444444...4444aaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...................................................................................................................................................................................................................................................................................................................................................................................................       ...       ...       ... .........................." + "'", str3, "...................................................................................................................................................................................................................................................................................................................................................................................................       ...       ...       ... ..........................");
    }

    @Test
    public void test51124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaa0aaaaa ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaa ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "aaaa0aaaaa ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test51125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51125");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test51126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                               ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!7.44444444444444444444444444444444444444444444                                                                                   ", "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa", "44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!a.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!a.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test51127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51127");
        float[] floatArray6 = new float[] { (short) 1, 9, 100.0f, 86, (byte) -1, (byte) 0 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 9.0, 100.0, 86.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test51128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51128");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("974");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test51129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51129");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4     4     4     4     4     4     4     4     4     4     4     4     4 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 4 4 4 4 4 4 4 4 4 4 4 4" + "'", str1, "4 4 4 4 4 4 4 4 4 4 4 4 4");
    }

    @Test
    public void test51130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51130");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                      100.0                                                     aaaa", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hI!", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("444444444444.", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test51131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51131");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0aaaa" + "'", str1, "0aaaa");
    }

    @Test
    public void test51132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51132");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(61.0d, (double) 135, (double) 99L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 61.0d + "'", double3 == 61.0d);
    }

    @Test
    public void test51133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51133");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!", "                                                                                                                                                                                                                                                                                                                                                                                                                               hI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("            1000    a         a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51135");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("97..######################################97atrue-1.#########################################", 201);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0TRUE-1.00-1.0097.0                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51137");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                             100.0", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51138");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("        hi!h4444404444hi!hi.a a a ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51139");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444", "", 24);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4', 551, 60);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444" + "'", str7, "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444" + "'", str9, "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test51140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51140");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("A   0  00                                                                                                     ", "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", 32, (int) (short) 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A   a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.                                                                              " + "'", str4, "A   a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.                                                                              ");
    }

    @Test
    public void test51141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51141");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0true-1 0097 044444444444444444444444444 4", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT", 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1 0097 044444444444444444444444444 4" + "'", str3, "0true-1 0097 044444444444444444444444444 4");
    }

    @Test
    public void test51142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51142");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...#########################...#################0.001##...#########################...############## 0true-1.0097.044444444444444444444444444", "                                                                               ...0...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51143");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA                                         41004.404                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA                                         41004.404                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...AAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51145");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "0true-1.00", 47, 60);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi0true-1.00" + "'", str4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi0true-1.00");
    }

    @Test
    public void test51146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51146");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("true-1. 97");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51147");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   0444...44444444444444444444444444444444440TRUE-1.0097...4     A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51148");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("  4444444444444444444444444 true - 1 . 97 . 44444444444444..", (float) 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test51149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "a#4#...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test51150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51150");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 449);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test51152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51152");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("true-97", "100.0                                                     4444", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51153");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51154");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.0", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test51155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44444444444444444444444444444444444444444444444444a...atruea-a1a.a4444444a...a97a.a4444444a...a444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444a...atruea-a1a.a4444444a...a97a.a4444444a...a444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51156");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...A .....44444...true-1.4444444...97.4444444...4444444444444...                  4");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51157");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                 aaaaaaaaaaaaaaatt-------ttt-------ttt-------t                                 aaaaaaaaaaaaaa", (long) 99);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test51158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51158");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("   ", "44444444444444444444...40004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004", "a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 80);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   " + "'", str4, "   ");
    }

    @Test
    public void test51159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51159");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444att-------ttt-------ttt-------tt");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 657 + "'", int1 == 657);
    }

    @Test
    public void test51160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51160");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                       ##44444444444444444444#...#44444444HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test51161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                             ", "0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             " + "'", str2, "                                             ");
    }

    @Test
    public void test51162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("A   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A   " + "'", str1, "A   ");
    }

    @Test
    public void test51163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444" + "'", str2, "                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test51164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51164");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", "00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test51165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51165");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0aaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51166");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "        a                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51168");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test51169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51169");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444   !   ", "ue-1.0097...444444444444444444444444########################################################################################100.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       TRUEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 754);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       TRUEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       TRUEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test51171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
    }

    @Test
    public void test51173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51173");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(732, 551, 538);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 732 + "'", int3 == 732);
    }

    @Test
    public void test51174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51174");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 49);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("true-97", "", 548);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str9, "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test51175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51175");
        int[] intArray5 = new int[] { 57, 267, (byte) -1, 9, 5 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[57, 267, -1, 9, 5]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 267 + "'", int10 == 267);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 267 + "'", int11 == 267);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 267 + "'", int12 == 267);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 267 + "'", int13 == 267);
    }

    @Test
    public void test51176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51176");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444aaaaaa#########.                                                   ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test51177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("A         A                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a         a                                  " + "'", str1, "a         a                                  ");
    }

    @Test
    public void test51178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51178");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "    a   HI!HI!...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A", "000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A");
    }

    @Test
    public void test51180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51180");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!Hi!hi!hi!hi!hTRUETRUE", 156, 757);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51181");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi", 650);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51182");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test51183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51183");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              " + "'", str2, "                                              ");
    }

    @Test
    public void test51185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "...    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51186");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaa a a a a aaaaaaaa", "44444444444444444444444444444444444444444440TRUE-1 0097      A    444444444444444444444444444444444444444444444444444440TRUE-1 0097      A    44444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51187");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51188");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###########################################", (java.lang.CharSequence) "44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test51189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" . 1 - eurt 0", 274);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51191");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 842, 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 842 + "'", int3 == 842);
    }

    @Test
    public void test51192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51192");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray15);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaa0", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test51193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51193");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                     a0000000000", "                                                                                                                                                                                                                                                                                                                                                                     HI!                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51194");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "4             ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51195");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("a   HI!HI!...truea   HI!HI!...-a   HI!HI!...a   HI!HI!...a   HI!HI!...97a   HI!HI!...a   HI!HI!...", "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51196");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444440true-1.0097.0100.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444440true-1.0097.0100." + "'", str1, "444440true-1.0097.0100.");
    }

    @Test
    public void test51197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51197");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("true-1.00-1.0097.04444444444444444444444444444444a   hi!hi!hi!h############################...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "a0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                          0004a0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                          0004a0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                          " + "'", str1, "a0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                          0004a0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                                   aaaaa0aaaa                          ");
    }

    @Test
    public void test51199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51199");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(75, 44, 830);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 830 + "'", int3 == 830);
    }

    @Test
    public void test51200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51200");
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
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    }

    @Test
    public void test51201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51201");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00..", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test51202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                  ", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.0...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test51203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51203");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           ", "444...44444444444444444444444444444444440true-1.0097...44");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "             ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                           " + "'", str4, "                                           ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                           " + "'", str6, "                                           ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test51204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44444444444444...7900.1-eurt044444", "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 498);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444...7900.1-eurt044444" + "'", str3, "44444444444444...7900.1-eurt044444");
    }

    @Test
    public void test51205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51205");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(788, 50, (int) (short) 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
    }

    @Test
    public void test51206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51206");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                        ...ue-1.0097.044444444444444444444444444444444...                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00t", "A0true-1.0097.0", 274);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str3, "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00t");
    }

    @Test
    public void test51208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "...                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51210");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00.." + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..");
    }

    @Test
    public void test51211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51211");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0true-1.0097.0");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                      a         a         a         a         a      ", strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ...", strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444", 48, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 170 + "'", int6 == 170);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test51212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51212");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("7900.1-eurt0444100.0A00       000       000       0A00 ", 178);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 178 + "'", int2 == 178);
    }

    @Test
    public void test51213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47", 165);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47" + "'", str2, "A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47");
    }

    @Test
    public void test51214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("H!ih!h!ih!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!h!ih!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "H!ih!h!ih!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...", "ahi       TRUE!       TRUEhi       TRUE!       TRUEhi       TRUE!       TRUEhaaaaaaaaaaaaaaa       TRUE44444       TRUEaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4..." + "'", str2, "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...");
    }

    @Test
    public void test51216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a    4444444444444444444444444444444444444444444              4444444444444444444444444444444444444444444", "               true                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444hi!hi!hi!   hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi.....A....44444444444444444444444444444444444444444440true-1 0097 04444444444444444444444444444444444444444444444hi!hi!hi!   hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444hi!hi!hi!   hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi.....A....44444444444444444444444444444444444444444440true-1 0097 04444444444444444444444444444444444444444444444hi!hi!hi!   hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!" + "'", str1, "444hi!hi!hi!   hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi.....A....44444444444444444444444444444444444444444440true-1 0097 04444444444444444444444444444444444444444444444hi!hi!hi!   hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!");
    }

    @Test
    public void test51218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51218");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.79aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.1-eurtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA4444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaa", 359, "                                                                                                                                                                                                                                         4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.79aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.1-eurtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA4444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.79aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.1-eurtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA4444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51219");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                0097.                                                 ", 850, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51220");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(95, 0, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 95 + "'", int3 == 95);
    }

    @Test
    public void test51221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                    ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test51222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51222");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444440097...#############################################################################################", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444440097...#############################################################################################" + "'", str2, "4444444440097...#############################################################################################");
    }

    @Test
    public void test51224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0true-1.0097.0444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.0444444444444444444444444" + "'", str2, "0true-1.0097.0444444444444444444444444");
    }

    @Test
    public void test51225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51225");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "0444...44444444444444444444444444444444440TRUE-1.0097...4", (int) (short) 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51226");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 44, (short) 44, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test51227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51227");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 191, "... ... ... ... ... ... ... ...4#444hi!hi!hi!h############################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... ... ... ... ... ... ... ...4#444hi!hi!hi!h############################... ... ... ... ... .... ... ... ... ... ... ... ...4#444hi!hi!hi!h############################... ... ... ... ... .." + "'", str3, "... ... ... ... ... ... ... ...4#444hi!hi!hi!h############################... ... ... ... ... .... ... ... ... ... ... ... ...4#444hi!hi!hi!h############################... ... ... ... ... ..");
    }

    @Test
    public void test51228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAAAAAAAAA                                                                                                   ", 527);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51229");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 424L, 138.0f, (float) 277);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 424.0f + "'", float3 == 424.0f);
    }

    @Test
    public void test51230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51230");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("A A A A                        a                            ", 549, 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51231");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                   ", "Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!H...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51232");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            100.0", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAHI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test51233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444", 541);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444");
    }

    @Test
    public void test51234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51234");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4             ", " ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aahaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test51235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51235");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0TRUE-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test51236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51236");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a004444444000444444400044444440", "           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!hA");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, ".0097.00true-1.00");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test51237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51237");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    public void test51238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                ...444444..0true-1.0097.00true-1.0097.00true-1.0097.00tr", 638);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                ...444444..0true-1.0097.00true-1.0097.00true-1.0097.00tr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "                                                                ...444444..0true-1.0097.00true-1.0097.00true-1.0097.00tr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test51239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("444...44444444444444444444444444444444440TRUE-1.0097...44", 314);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444...44444444444444444444444444444444440TRUE-1.0097...44" + "'", str2, "444...44444444444444444444444444444444440TRUE-1.0097...44");
    }

    @Test
    public void test51240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test51241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51241");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0097...#############################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################################...7900" + "'", str1, "#############################################################################################...7900");
    }

    @Test
    public void test51242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51242");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", "                        ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", strArray3, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a    a   0444...44444444444444444444444444444444440true-1.0097...4     a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a    a   ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str7, "Aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444" + "'", str8, "44444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test51243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51243");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...4#444hi!hi!hi!h############################...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51244");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0true-1.0097.044444444444444444444444444 ...a                               ", "444440true-1.0097...4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0TRUE-1.00-1.0097.0", "                             ...0TRUE-1.0097...                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.00-1.0097.0" + "'", str2, "0TRUE-1.00-1.0097.0");
    }

    @Test
    public void test51246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51246");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                         0TRUE-1.0097.044444444444444444444444444..", "0ATRUEA-A1A.A0097A.A0", "44444444444444444444444444444444444444444444444444444444444444444......44444444444444", 202);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                         0TRUE-1.0097.044444444444444444444444444.." + "'", str4, "                                                                                                                                                                                                         0TRUE-1.0097.044444444444444444444444444..");
    }

    @Test
    public void test51247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51247");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                         aaaa0aaaaa    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51248");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(4.4444444444444444E52d, (double) 533.0f, (double) 119.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.4444444444444444E52d + "'", double3 == 4.4444444444444444E52d);
    }

    @Test
    public void test51249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51249");
        char[] charArray14 = new char[] { '4', '4', ' ' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444444444444444444444", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "              ", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "TRUE97TRUE97", charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444444444444...", charArray14);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 43 + "'", int19 == 43);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test51250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51250");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                      100.0", "079001-eurt0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51251");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test51252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444", "                                   ...                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444" + "'", str2, "444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444");
    }

    @Test
    public void test51253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51253");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaatrue                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...", "                                                                                                                                                                                                                                                                                                    ", 149);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                             ...                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                             ...                           " + "'", str1, "                                                             ...                           ");
    }

    @Test
    public void test51255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51255");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                               rt00.7900.                   A                   rt00.7900.                                          rt00.7900.                   44", "    aaaaa0aaaa                                                                         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51256");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#...#4#a#", ' ');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("    A     ", (java.lang.Object[]) strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("0TRUE-1.0097.0", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("                            100.0                                                     ", strArray3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str10, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test51257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51257");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(538, 172, 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 83 + "'", int3 == 83);
    }

    @Test
    public void test51258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444", 819);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444" + "'", str2, "1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444");
    }

    @Test
    public void test51259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("..7900");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..7900" + "'", str1, "..7900");
    }

    @Test
    public void test51260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51260");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(".001                                                                                             ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test51261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51261");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51262");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test51263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51263");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 608, (long) 290, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test51264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51264");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test51265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51265");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                     444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       ", 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...00true-1.0097.00true-1.0097.00tr...00true-1.009700#######000#######000#######0011...00true-1.0097.00true-1.0097.00tr...00true-1.0097.", 848, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...00true-1.0097.00true-1.0097.00tr...00true-1.009700#######000#######000#######0011...00true-1.0097.00true-1.0097.00tr...00true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...00true-1.0097.00true-1.0097.00tr...00true-1.009700#######000#######000#######0011...00true-1.0097.00true-1.0097.00tr...00true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...44444444444......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51268");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                      100.0                                                     ", "4", 57);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", "HI");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("TRUE-1.0097.0", strArray5, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "                     aaaaa0aaaa                     ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh", (java.lang.Object[]) strArray13);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TRUE-1.0097.0" + "'", str9, "TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444" + "'", str11, "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " true - 1 . 97 . " + "'", str14, " true - 1 . 97 . ");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test51269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51269");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 4, (short) (byte) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test51270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       000       000       00a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51271");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4", (java.lang.CharSequence) "                                               TRUE                                        41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 185 + "'", int2 == 185);
    }

    @Test
    public void test51272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51272");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0" + "'", str3, "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0");
    }

    @Test
    public void test51273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51273");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                       444                       ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444" + "'", str1, "a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444");
    }

    @Test
    public void test51275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51275");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 86);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test51276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51276");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("a004444444000444444400044444440a004444444000444444400044444440a004444444000444444400044444440a0044");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a004444444000444444400044444440a004444444000444444400044444440a004444444000444444400044444440a0044" + "'", str1, "a004444444000444444400044444440a004444444000444444400044444440a004444444000444444400044444440a0044");
    }

    @Test
    public void test51277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa", "AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51278");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("a a a a a", "4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444...4444444444444444444444444444444444444444444444444hi!", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...4444444444444444444444444444444444444444444444444hi!" + "'", str2, "4444444...4444444444444444444444444444444444444444444444444hi!");
    }

    @Test
    public void test51280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                              #    ##########    ##########    ##########   A #    ##########    ##########    ##########  ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                              #    ##########    ##########    ##########   A #    ##########    ##########    ##########  " + "'", str2, "                                                                                                                                                                              #    ##########    ##########    ##########   A #    ##########    ##########    ##########  ");
    }

    @Test
    public void test51281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51281");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                         aaaa0aaaaa   ", "     ...0TRUE-1.0097...", 848);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...                                                                             ......                                                                             ......                                                                             ......                                                                             ......                                                                             ......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51283");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                         aaaa0aaaaa    ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa0aaaaa" + "'", str3, "aaaa0aaaaa");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test51284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51284");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi                                                                                                                                  0aaaa", 502);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51285");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...t0444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51286");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51287");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                     AAAA0AAAAA   ", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     AAAA0AAAAA   " + "'", str3, "                     AAAA0AAAAA   ");
    }

    @Test
    public void test51288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51288");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444444444444444444444...7900.1-EURT04444444444444444444444444444444444...444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                        0.0010.0hi                                                                                                                                                                                                                                                                                                                                         ", 497, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                        0.0010.0hi                                                                                                                                                                                                                                                                                                                                         " + "'", str4, "                                                                                                                                                                                                                                                                                                                                        0.0010.0hi                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test51289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51289");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "TRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-1.00TRUETRUE-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51290");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test51291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51291");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444", 14, 140);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444");
    }

    @Test
    public void test51293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51293");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     a    40true-1.0097.     a    40true-1.0097.  a    4aaaaaaa!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaa    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a", 21, 848);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "97.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     a    40true-1.0097.     a    40true-1.0097.  a    4aaaaaaa!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaa    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a" + "'", str3, "97.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     a    40true-1.0097.     a    40true-1.0097.  a    4aaaaaaa!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaa    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a");
    }

    @Test
    public void test51294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51294");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51295");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(".         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.", "AAAAAAAAAAAAAAAAAAAAAAAAAAA                     AAAA0AAAAA           AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                                                                                        ...0TRUE-1.0097...                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0TRUE-1.0097..." + "'", str1, "...0TRUE-1.0097...");
    }

    @Test
    public void test51297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51297");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51298");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4             ", '4');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0tr", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("True-1.00                                           true-1.97.true-1.00                                           true-1.97.true-1.00                                           true-1.97.4444444...444444           AAAAAAAAAAA", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test51299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51299");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "               true                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               true                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str1, "               true                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test51300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "########################################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51301");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444449999999999999999999999999", "..!IH!IH   a    4444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51302");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 384L, (float) 93, (float) 41L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 384.0f + "'", float3 == 384.0f);
    }

    @Test
    public void test51303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51303");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...", "...aaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51304");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                            !IH                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51305");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ###    a   HI!HI!...", "4444444410004444.444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H0TRUE-1 0097 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H0TRUE-1 0097" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H0TRUE-1 0097");
    }

    @Test
    public void test51307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51307");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444...4444444444........444444444444444444", 40, "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444...4444444444........444444444444444444" + "'", str3, "444444444...4444444444........444444444444444444");
    }

    @Test
    public void test51308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51308");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".0097.00true-1.0097.00true-1.0097.00tr", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-EURT04444", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...T0444444444444444444444444444...", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test51309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 967);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aa..");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa..\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444#44444444444444444#TRUE-#97#44444444444444444444444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444#4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "                                                                                                                                                                                                                                                                                                                                       ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51313");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "A!hi!h!hi!hA A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51314");
        float[] floatArray6 = new float[] { (short) 1, 9, 100.0f, 86, (byte) -1, (byte) 0 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 9.0, 100.0, 86.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test51315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51315");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444...44a1a4444444...4444444...44...a144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444...44A1A4444444...4444444...44...A144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444...44A1A4444444...4444444...44...A144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test51316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51316");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("             aaaa0aaaaa    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51317");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                              4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51318");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "a HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ... a", (java.lang.CharSequence) "4444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test51319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                      ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      " + "'", str2, "                                      ");
    }

    @Test
    public void test51320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51320");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(144.0f, (float) 363, 833.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 833.0f + "'", float3 == 833.0f);
    }

    @Test
    public void test51321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51321");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", 465);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 465 + "'", int2 == 465);
    }

    @Test
    public void test51322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                                                                                 ...44444444444444444444444444444444440TRUE-1.0097...                                                                                                                                 ...44444444444444444444444444444444440TRUE-1.0097...                                                                                                                                 ...44444444444444444444444444444444440TRUE-1.0097...                                                                                                                                 ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51323");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 1, (float) 34L, (float) 83);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 83.0f + "'", float3 == 83.0f);
    }

    @Test
    public void test51324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51324");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H0TRUE-1 0097 0", (java.lang.CharSequence) "A A A A                        a                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51325");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("a440true-1.0097.044444444444444444444444444aa", "", 669, 467);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a440true-1.0097.044444444444444444444444444aa" + "'", str4, "a440true-1.0097.044444444444444444444444444aa");
    }

    @Test
    public void test51326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A", "                                                                                                                                      A         A         A         A         A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A" + "'", str2, "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
    }

    @Test
    public void test51327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51327");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444440true-1.0097.A44444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A44444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test51328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51328");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("       444444444444444444", 497, 950);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("true444...444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true444...444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("          ###    A   hi!hi!.           ", "4444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", "44444444444                                                                                                 44444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ###    A   hi!hi!.           " + "'", str3, "          ###    A   hi!hi!.           ");
    }

    @Test
    public void test51332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", 107);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str2, "444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test51333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51333");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("444...44444444444444444444444444444444440TRUE-1.0097...44097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", " . 97 . 4444444444444444444444444444444444444444444", "..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-eurt04444444444444444444444444444444444...444..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900..7900");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test51334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51334");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("rue-1.0097.0                                       ", (long) 138);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
    }

    @Test
    public void test51335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51335");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51336");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0       00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 15, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0       00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "0       00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51337");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.", "", 213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 571 + "'", int3 == 571);
    }

    @Test
    public void test51338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAAAAAAAAAAAAAAAAAAAAAAAAAA ...444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAA ...444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAA ...444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test51339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51339");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                  a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A a                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test51340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51340");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...0...4444444444444444444444444444444444444444444444444444444444444444444444...", "                     aaaa0aaaaa              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4...44444444444444444444a                        A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test51342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51342");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 817L, (float) 618, 741.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 618.0f + "'", float3 == 618.0f);
    }

    @Test
    public void test51343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51343");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a0a", "0true-1.0097.044444444444444444444444444444444444444444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "true");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test51344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51344");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                     aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A                ", 118);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A                " + "'", str2, ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A                ");
    }

    @Test
    public void test51346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51346");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test51347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51347");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aE444444444444444444444HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444...                            ", 96);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51348");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444444444444444444444444...", "#                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                     " + "'", str2, "#                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                     ");
    }

    @Test
    public void test51350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51350");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######000#######0true00#######0-00#######000#######000#######09700#######000#######0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00taaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00taaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa" + "'", str1, "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00taaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa");
    }

    @Test
    public void test51352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", "444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test51353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                         0true-1.0097.044444444444444444444444444...                                                                            ", 545);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                          0true-1.0097.044444444444444444444444444...                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                          0true-1.0097.044444444444444444444444444...                                                                            ");
    }

    @Test
    public void test51354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51354");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test51355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51355");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("             aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51356");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...            ...            ...            ...            ...            ...            ...         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51357");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  a    TRUETRUETRUET");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51358");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test51359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440aaaaa    4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ", "    4A4         4A4                                                     41004.404    4A4         4A4         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444          4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444          4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test51360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51360");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test51361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51361");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444", '#');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                            ###    A   hi!hi!.                                                                                                                                                          ###    A   hi!hi!.                                                                                                                                                          ###    A   hi!hi!.                                                                                                                                                          ###    A   hi!hi!.                                                                                                                                                          ###    A   ...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test51362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51362");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(371, 168, 261);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 371 + "'", int3 == 371);
    }

    @Test
    public void test51363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51363");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4...4444444...4444444...4444444aaaaaaaaaaa1", 156, 150);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51364");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 0, (float) 43, (float) 262);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 262.0f + "'", float3 == 262.0f);
    }

    @Test
    public void test51365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51365");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                        ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test51366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51366");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("       aaaa0aaaaa                     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51367");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.", 542);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 542 + "'", int2 == 542);
    }

    @Test
    public void test51368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51368");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                               A44444                                               ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test51369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51369");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51370");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test51371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51371");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444", "...44444444444444444444444444444444440true-1.0097...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                          ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test51372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51372");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test51373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51373");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51374");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0000000444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444...", "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0 ", "0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 " + "'", str2, "0 ");
    }

    @Test
    public void test51376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!H...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!H...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51377");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("00       000       000       00a", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444440true-1.0097", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                       A44444444444444444444...4444                       A44444444444444444444...444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 23 + "'", int17 == 23);
    }

    @Test
    public void test51378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51378");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.00" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.00");
    }

    @Test
    public void test51379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51379");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "            ...4...4444444...4444444...4444444                                                                                                                          0                                                                                  ", 635, 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444            ...4...4444444...4444444...4444444                                                                                                                          0                                                                                  " + "'", str4, "444            ...4...4444444...4444444...4444444                                                                                                                          0                                                                                  ");
    }

    @Test
    public void test51380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ", 657, 577);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    " + "'", str3, "...444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ");
    }

    @Test
    public void test51381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51381");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aA44444A44a44444", "", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aA44444A44a44444" + "'", str3, "aA44444A44a44444");
    }

    @Test
    public void test51382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51382");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test51383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51383");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                            100.0                                                     AAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aahaa.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........44444444444444444444444", 895);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahaa.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........44444444444444444444444" + "'", str2, "aahaa.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........44444444444444444444444");
    }

    @Test
    public void test51385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51385");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 651, (long) 107, (long) 907);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 107L + "'", long3 == 107L);
    }

    @Test
    public void test51386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51386");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, (float) 19L, 136.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 136.0f + "'", float3 == 136.0f);
    }

    @Test
    public void test51387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51387");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                           aaaa0aaaaa                  ", 314, 449);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                           aaaa0aaaaa                  " + "'", str3, "                           aaaa0aaaaa                  ");
    }

    @Test
    public void test51388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51388");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#########.", 734);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51389");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(375, 652, 891);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 375 + "'", int3 == 375);
    }

    @Test
    public void test51390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51390");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                 0                                                                                                                     ", "                                                     ...                 7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt04444444444444444444    a  .7900.1-eurt04444444444444444444444444444444444444444444                            ...                                                                      ...                                                                      ...                                                                      ...                 eurt");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                             ", 657, 656);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test51391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51391");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaa0aaaa", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51392");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a", 539, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test51393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51393");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test51394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(".. A..", "000                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".. A.." + "'", str2, ".. A..");
    }

    @Test
    public void test51395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                               TRUE                                        41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444", "                                                                                                                                                                                                                                                                     aaaaa0aaaa                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               TRUE                                        41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444" + "'", str2, "                                               TRUE                                        41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444");
    }

    @Test
    public void test51396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51396");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...40TRUE-1.0097.04444444444444444444444444444444444...a a a a", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51398");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test51399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51399");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                          100.0                                                ", 'a');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a4true4-44497                                                                                                          ", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..                                                                                ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test51400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51400");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                  ", 144, "444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "                                                  4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test51401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51401");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "4 0TRUE-1.0097.044444444444444444444444444", 4444444);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51402");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0TRUE-1.0097.00T..0TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAA       TRUE       TRUE       TRUE", 123);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    AAAAAAAAAAAAAAAAAA       TRUE       TRUE       TRUE                                    " + "'", str2, "                                    AAAAAAAAAAAAAAAAAA       TRUE       TRUE       TRUE                                    ");
    }

    @Test
    public void test51404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444", "44444..4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444");
    }

    @Test
    public void test51405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51405");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444", "...44444444444444444444444444444444440true-1.0097...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                      4444400       0444444                                     ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test51406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51406");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A.7900.1-eurt0444444444444444444...", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("          TRUE  ", "444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          TRUE  " + "'", str2, "          TRUE  ");
    }

    @Test
    public void test51408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51408");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 887L, (double) 134);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test51409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51409");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "                                        ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                                                                         aaaaaaaaaaaaaaaaaaa                 ...                                                     444444444444444440true-1.0097...444444444444444444444444aaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                          ", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test51410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51410");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                             100.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test51411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51411");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test51412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51412");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                 444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test51413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51413");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    public void test51414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51414");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444", 465, 213);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444" + "'", str3, "...444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444");
    }

    @Test
    public void test51415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("   0000000000aaaaaaaaa00000000000000000000000000000000000000000                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   0000000000aaaaaaaaa00000000000000000000000000000000000000000                                                                                                                                              " + "'", str1, "   0000000000aaaaaaaaa00000000000000000000000000000000000000000                                                                                                                                              ");
    }

    @Test
    public void test51416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51416");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                   ", "####################################################################################################################################################################################################################################################...t0444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test51417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51417");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test51418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...                                                                                                                               ...", "!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                                               ..." + "'", str2, "...                                                                                                                               ...");
    }

    @Test
    public void test51419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51419");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                 444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                 444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test51421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51421");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(133, 42, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test51422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51422");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(292, 434, 833);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 292 + "'", int3 == 292);
    }

    @Test
    public void test51423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51423");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0TRUE-1.0097.044444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51424");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4447404444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51425");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "4444A44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51426");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                     aaaa      a         a         a         a         aaaaaa    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                             4444A44444                                                                                                                                                                                                                          ", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444A44444                                                                                                                                                                                                                          " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444A44444                                                                                                                                                                                                                          ");
    }

    @Test
    public void test51428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51428");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                     0", "1aaaaaaaaaaa4444444...4444444...44...aaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...44                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "7900.1-eurt0444100.0A00       000       000       0A00       000                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51430");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                          100.0                                                ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAATRUE97TRUE97AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test51431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51431");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51432");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51433");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                         AAAA0", "##100.0###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test51434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51434");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("1aaaaaaaaaaa.........", 253, 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1aaaaaaaaaaa........." + "'", str3, "1aaaaaaaaaaa.........");
    }

    @Test
    public void test51435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51435");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(98, 19, 721);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 721 + "'", int3 == 721);
    }

    @Test
    public void test51436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51436");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "TRUE97TRUE9");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test51437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51437");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaTRUE-1.  97.aa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51438");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                             00       0                 ...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ", 64, 721);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51439");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("100.0", "44444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0" + "'", str2, "100.0");
    }

    @Test
    public void test51441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("    a0a                 0true-1.0A A A A            ", 658);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    a0a                 0true-1.0A A A A            " + "'", str2, "    a0a                 0true-1.0A A A A            ");
    }

    @Test
    public void test51442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("......4444444...4444444...4444444.....", "444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......4444444...4444444...4444444....." + "'", str2, "......4444444...4444444...4444444.....");
    }

    @Test
    public void test51443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51443");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#", "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test51444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "4 ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("                     aaaa0aaaaa   ", "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A ", 47);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaa", strArray3, strArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0true-1.0097.0" + "'", str4, "0true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0true-1.0097.0" + "'", str6, "0true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0true-1.0097.0" + "'", str8, "0true-1.0097.0");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaaaaaaaa" + "'", str13, "aaaaaaaaa");
    }

    @Test
    public void test51445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51445");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ", 274, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ");
    }

    @Test
    public void test51446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51446");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            100.0", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test51447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("..00.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 625);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..00.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "..00.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test51449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51449");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.                                  aaaa.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test51450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51450");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                                                                                                                                              0TRUE-1 0097 0                                                                                                                                              0TRUE-1 0097 0                                                                                                                                              0TRUE-1 0097 0                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt 0TRUE-1 0097 0 0TRUE-1 0097 0 0TRUE-1 0097 0" + "'", str1, "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt 0TRUE-1 0097 0 0TRUE-1 0097 0 0TRUE-1 0097 0");
    }

    @Test
    public void test51451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51451");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test51452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51452");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00taaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa", 260);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00taaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00taaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa");
    }

    @Test
    public void test51453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51453");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                     4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444                                                                                     ", "", 788);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 269 + "'", int3 == 269);
    }

    @Test
    public void test51454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51454");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 267 + "'", int5 == 267);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 267 + "'", int6 == 267);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 267 + "'", int7 == 267);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test51455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4             ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4             " + "'", str2, "4             ");
    }

    @Test
    public void test51456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51456");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str1, "44...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
    }

    @Test
    public void test51457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51457");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(506, 618, 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 618 + "'", int3 == 618);
    }

    @Test
    public void test51458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-E", 259);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-E" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
    }

    @Test
    public void test51459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51459");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 00", "A0a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test51460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51460");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test51461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...aaaa0aaaaa44444", "04440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444044404440444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaa0aaaaa44444" + "'", str2, "...aaaa0aaaaa44444");
    }

    @Test
    public void test51462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...4444....", "a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51463");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                      41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444", "        hi!h4444404444hi!hi.a a a ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test51464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51464");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...                                                                                                                               ...", " TRUE - 1 . 97 . ", "A A A ...", 506);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...                                                                                                                               ..." + "'", str4, "...                                                                                                                               ...");
    }

    @Test
    public void test51465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51465");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...44AAAAAAAAAAAAAAAAAAAAAAAA...", "!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...IH", "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test51466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaa", "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaa");
    }

    @Test
    public void test51467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51467");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("###############################################################################################", "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", (int) (short) 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###############################################################################################" + "'", str4, "###############################################################################################");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###############################################################################################" + "'", str5, "###############################################################################################");
    }

    @Test
    public void test51468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51468");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" 4444444444444444444444444444444444444444444TRUE..4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51469");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 957.0f, (double) 68L, (double) 178);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 68.0d + "'", double3 == 68.0d);
    }

    @Test
    public void test51470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51470");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA444aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa1AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444444...4444444...4444444...41AAAAAAAAAAA4444");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test51471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51471");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...A...444444444          aaaatrue-1.0097...A...44444444444444444444444444444444440true-1.0097...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("#a#44444444444444444444#...#444444444444444444444444444444444444444444444", "...00.7900.1-eurt00.79......aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#a#44444444444444444444#...#444444444444444444444444444444444444444444444" + "'", str2, "#a#44444444444444444444#...#444444444444444444444444444444444444444444444");
    }

    @Test
    public void test51473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51473");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 48, (long) 634, (long) 111);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 634L + "'", long3 == 634L);
    }

    @Test
    public void test51474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51474");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("         a                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test51475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51475");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     4", (java.lang.CharSequence) "0097      a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test51476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUETRUE", "##################                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test51477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA a" + "'", str1, "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA a");
    }

    @Test
    public void test51478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51478");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...44444444444444444444444444444444440TRUE-1.0097...", "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....", 48);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00  ", strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "                                                                                                                                    1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...                                                                                                                                     ");
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaatrue0aaaa0.aaatruaaa", strArray10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test51479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...444###################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...444###################################################" + "'", str1, "...444###################################################");
    }

    @Test
    public void test51480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51480");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0                                                                                                                                                                                                                                                                          0                                                               A A A A A0                                                                                                                                                                                                                                                                          0                                                               ", "     ...##                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51481");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ", 826, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test51482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51482");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa", "A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a                                                                                                                                                                      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test51483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51483");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(".00", ".0097.00TR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test51484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51484");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "44440.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test51485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51485");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444440true-1.0097.                    44444444444444444444444444      #a######################...##############################################      #a######################.", 220);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51486");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test51487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test51488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51488");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444", 243, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test51489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51489");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("I!HI", "                                       true  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51490");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4                                                                                                                                                                                                                                                                           4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 44", 375, 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".. 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 44" + "'", str3, ".. 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 44");
    }

    @Test
    public void test51491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51491");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51492");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0true-1.0A A A A                        a44444...", "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 140);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0A A A A                        a44444..." + "'", str3, "0true-1.0A A A A                        a44444...");
    }

    @Test
    public void test51493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A ..." + "'", str1, "A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A ...");
    }

    @Test
    public void test51494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51494");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test51495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaa0                                                            ", "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa0                                                            " + "'", str2, "aaa0                                                            ");
    }

    @Test
    public void test51496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0AAAAaTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaaTR4444A44444aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaa", "                       a44444444444444444444...4444                       a44444444444444444444...4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0AAAAaTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaaTR4444A44444aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaa" + "'", str2, "0AAAAaTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaaTR4444A44444aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaa");
    }

    @Test
    public void test51497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51497");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                              4444444 4444 4", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.00###########################################################################################################################################################################################################################", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 43 + "'", int16 == 43);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test51498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51498");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaTrue-1.  97aaaa", "A         A         A         A         A         A         A         A         A         A         A         A         A         A", 385);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51499");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("a0aaaaa              0true-1.0097.00true-1.0097.00trAaaaaaaaaaa4444444...4444444...4444444...4a0aaaaa              0true-1.0097.00true-1.0097.00tr", "0true-1.0097.4444444444444444444444444444444444444444444440true-1.009", 259);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test51500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest102.test51500");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 267 + "'", int9 == 267);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }
}

