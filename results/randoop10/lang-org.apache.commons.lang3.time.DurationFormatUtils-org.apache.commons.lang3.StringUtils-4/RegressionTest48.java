import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest48 {

    public static boolean debug = false;

    @Test
    public void test24001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24001");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "PpYpMpDTpHpMpTp96SPpYpMpDTpHpMpTp9PpYpMpDTpHpMpTp96SPpYpMpDTpHpMpTp9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("sdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces", "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  s0 s0 s0 HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces" + "'", str2, "sdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces");
    }

    @Test
    public void test24003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24003");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                          0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0:00:00.07", "aahi4hP0Y0M0DT0.0M0.010ShP0Y0M0DT0.0M");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":00:00.07" + "'", str2, ":00:00.07");
    }

    @Test
    public void test24005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(" #0 0a000 0 hour 0 0inute00 0 econ00 !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444", "P0Y0M0DT0H0M0.054S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " #0 0a000 0 hour 0 0inute00 0 econ00 !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444" + "'", str2, " #0 0a000 0 hour 0 0inute00 0 econ00 !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444");
    }

    @Test
    public void test24006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! S0 S0 S0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          000i!i!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! S0 S0 S0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!" + "'", str2, "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! S0 S0 S0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
    }

    @Test
    public void test24007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24007");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "       P-1Y11M30DT23H59M59.926S", 74, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                 P-1Y11M30DT23H59M59.926S                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str4, "                 P-1Y11M30DT23H59M59.926S                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test24008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24008");
        char[] charArray14 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  ###############################################################################################", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "P", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            23IIII:II:I                                            ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test24009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24009");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("  #############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  ############" + "'", str1, "  ############");
    }

    @Test
    public void test24010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24010");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("87");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24011");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test24012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24012");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("h23AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp00059030t0h0590.04559");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h23AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp00059030t0h0590.04559" + "'", str1, "h23AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp00059030t0h0590.04559");
    }

    @Test
    public void test24013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test24014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24014");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24015");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!..." + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...");
    }

    @Test
    public void test24016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24016");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test24017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24017");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("P0Y0M0DT0H0M0.548S", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8S4P0Y0M0DT0H0M0.5" + "'", str2, "8S4P0Y0M0DT0H0M0.5");
    }

    @Test
    public void test24019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("P0Y0M0DT0H0M0.678S", "Hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495", "p YYYY y      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.678S" + "'", str3, "P0Y0M0DT0H0M0.678S");
    }

    @Test
    public void test24021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24021");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("P0Y0M0DT0H0M0.099S", "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 days", 495);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("8639930noce86399 0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8639930noce86399 0" + "'", str1, "8639930noce86399 0");
    }

    @Test
    public void test24023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24023");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444'", "t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 t 00 ", " ip-10110300t23h59059.80800i!P0Y000DT00000.0021hi!P0Y  ip-10110300t23h59059.80800i!P0Y000DT00000.0021hi!P0Y  ip-10110300t23h59059.80800i!P0Y000DT00000.0021hi!P0Y  i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444'" + "'", str3, "4444444444'");
    }

    @Test
    public void test24024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24024");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       !ih    ", "P0Y0M0DT0H0M0.027S");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!h!i  i!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaa", "... HI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!h!i  i!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!h!i  i!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24026");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                i!", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 903, 82);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test24027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                    HI!                   ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24028");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!                                                                                       Hi!Hi!H...", "10.0993599094P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.099", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0:00:00.139######################################HP0Y000DT00000.01010#######################################", "p0y0-10dt07430-10.1913599982");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test24030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.49", 608, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.494444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.494444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test24031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hhhaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhaaaaa" + "'", str2, "Hhhaaaaa");
    }

    @Test
    public void test24032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Hi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aaS0aS0aS0ahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!", "!i0!i0!i0!i0!i0!i0!i0!i0 680.00:00:0!I!I!I347");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aaS0aS0aS0ahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!" + "'", str2, "Hi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aaS0aS0aS0ahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!");
    }

    @Test
    public void test24033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24033");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4Y4M4D44H4M4.441Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24034");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("3599424540.0-107430td0-10y0paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "T 00 ", 122);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24035");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", '#');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0         0         0         0         0         0         0         0         0         ", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str5, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test24036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24036");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00Y0M0DT0H0M0.001S 0Y0M0DT0H0M0.001Sseconds", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24037");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 50, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test24038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0day88                                                                                                                                                                                                                                                                                                            ", "P0000Y0M0DT0                                       hI!hI!h...hi!", "S498.95M95H32TD03M11Y1-P");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test24039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("P0Y0M0DT0H0M0.086S", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                P0Y0M0DT0H0M0.086S                 " + "'", str2, "                P0Y0M0DT0H0M0.086S                 ");
    }

    @Test
    public void test24040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24040");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "");
        java.lang.String[] strArray18 = null;
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("sdnoces  ", strArray6, strArray18);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "P0Y000DT00000.01010");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "sdnoces  " + "'", str19, "sdnoces  ");
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test24041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24041");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 107);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.107S" + "'", str1, "P0Y0M0DT0H0M0.107S");
    }

    @Test
    public void test24042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24042");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#############################################################################################################################P0Y0hP0Y0M", "                                                                                                                                           hi!                                                                                                hi! hi!                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24043");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("P0000Y0M0DT0H0M0.372S44                                                                                                                                i!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi!4444444sdnoces44444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24044");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           ...!hi!hi!", "4P41-004Y44114034DT4432495411441179544");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           ...!hi!hi!" + "'", str2, "HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           ...!hi!hi!");
    }

    @Test
    public void test24046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                           'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24047");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0i0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD4444444444444444444444444444444444444444444444aahi0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i0i!0i!0i!0ip0y00p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0pd4444444444444444444444444444444444444444444444aahi0i!0i!0i!0ip0y00p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0pd4444444444444444444444444444444444444444444444" + "'", str1, "0i0i!0i!0i!0ip0y00p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0pd4444444444444444444444444444444444444444444444aahi0i!0i!0i!0ip0y00p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0pd4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test24048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24048");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "  HI!  HI!  HI!  HI!  HI!  HI..", 98);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  hi!", "hi!hi!hi! ", (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test24049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24049");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", "P0Y000DT00000.06316");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24050");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "!ih...h!Ih!Ih                                       'H'TD'd'M'M'Y'yyyy'P'                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih###", 289);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih###                                                                                                                                                                                          " + "'", str2, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih###                                                                                                                                                                                          ");
    }

    @Test
    public void test24052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24052");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "P0Y0M0DT0H0M0.091S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.03", 224);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                  320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.03" + "'", str2, "                                                                                                                                                  320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.03");
    }

    @Test
    public void test24054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24054");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("P0Y0M0DT0H0M0.030S", strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 73, 44);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test24055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaasyad 0aaaahhhaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhhaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0", "                            HI4a4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaasyad 0aaaahhhaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhhaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0" + "'", str2, "aaaaaaaaaasyad 0aaaahhhaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhhaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0");
    }

    @Test
    public void test24056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24056");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("p0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD", "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.99359999!i0                                                                                             0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.99359999", 390);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD" + "'", str3, "p0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD");
    }

    @Test
    public void test24057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24057");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00i!i!hi!", "hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!I!I!I347", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!I!I!I347" + "'", str2, "!I!I!I347");
    }

    @Test
    public void test24059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24059");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!", 390, 290);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24060");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h", "0 SECONDS");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("0i!", (java.lang.Object[]) strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("...:00.032", strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterType("P0Y0M0DT0H0M0.271");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("P0Y0M0DT0H0M0.125S", strArray8, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test24061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24061");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 12, (long) 192, "!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi" + "'", str3, "!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi");
    }

    @Test
    public void test24062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24062");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0 ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("I!i!i!", (java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 274, 608);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 274");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320I!i!i!...0I!i!i!...0I!i!i!...0I!i!i!" + "'", str3, "0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320I!i!i!...0I!i!i!...0I!i!i!...0I!i!i!");
    }

    @Test
    public void test24063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AAAAAAAAAAAAAAAAAAAAA...", "P0Y0M0DT0H0M0.464S", " P yyyy Y        T H H          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAA..." + "'", str3, "AAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test24064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24064");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444                                                                                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000I!I!I!444444444444444444444444444444444444", " ", 121);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24065");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P-1Y11M30DTS0 S0 S0P-1Y11M30DT2", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HIHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24066");
        char[] charArray10 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P-1Y11M30DT23H59M59.903S", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "230.00:00:0", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "      0 seconds      ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test24067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24067");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaa", 604, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24068");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("        P0Y0M0DT0...", "!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", 143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "  ai!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  ai!" + "'", str1, "  ai!");
    }

    @Test
    public void test24070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24070");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 372, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24071");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce", 285, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("P-1Y11030DT23059059.9839444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "i! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11030DT23059059.9839444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "P-1Y11030DT23059059.9839444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test24073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                              aahi!  ", 17, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              aahi!  " + "'", str3, "                                                                                              aahi!  ");
    }

    @Test
    public void test24074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24074");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0 0 0  0 0 0.930s", "#############################################################################################################################P0Y0hP0Y0M", "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.09P0:00:00.0900:00:00.09Y0:00:00.0900:00:...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test24075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Hhhaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhaaaa" + "'", str1, "Hhhaaaa");
    }

    @Test
    public void test24076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24076");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003S", 191);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! " + "'", str5, "!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
    }

    @Test
    public void test24077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24077");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "hI!HI!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24078");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                          ", 139, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          ");
    }

    @Test
    public void test24079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0 SECOND", "-00p                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 SECOND" + "'", str2, "0 SECOND");
    }

    @Test
    public void test24080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24080");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                 440a00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24081");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Y0M0DT0H0M", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("P0Y0M0DT0H0M0.099S", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test24082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24082");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0000000000000000IIIIIIIIIIIIIIII  hi!59059.999");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24083");
        char[] charArray4 = new char[] { '4' };
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                 00-1 11 30  23 59 59 964 44                                                                                                                                0 0 0  0 0 0 010 ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 152 + "'", int7 == 152);
    }

    @Test
    public void test24084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24084");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("p0Y000DT00000.01010", 'a');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test24085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str1, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test24086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24086");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("p0y0m0dt00m0.024s", 205, 299);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24087");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                           aahi!p0000y0m0dt0h0m0.99s", (java.lang.CharSequence) ":00:00.495");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24088");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444444444444444444444444444444444444444!IHAA4444444444444444444444444444444444444444444444", "sdnoces");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24089");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("4yyyy4P4                                                                                                                               ", "P-1Y11M30444444444HI!HI!HI!444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...AAAAAAAAAAAAAAAAAAAAA0000I!I!I!", "0:00:000000:00:000000:00:000000:00:000000:00:000000:0AA0:p0000y0-10dt07430-1099359999:00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000:00:000000:00:000000:00:000000:00:000000:00:000000:0AA0:p0000y0-10dt07430-1099359999");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test24091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24092");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i! ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i! " + "'", str4, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i! ");
    }

    @Test
    public void test24093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0:00:00.289                                                                                               ", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24094");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "T 00 ", (java.lang.CharSequence) "aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test24095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24095");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("S0 S0 S0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                       P0Y0M0DT0H0M0.271                             ", "p-1y11m30dt23h59m59.808sp-1y11m30dt23h59m59.808sp-1y11m30dt23h59noce0p-1y11m30dt23h59m59.808sp-1y11m30dt23h59m59.808sp-1y11m30dt23h59m");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24096");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                44S970.0M0H0TD0M0Y0P                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444444444444444444444444444444444444444444444444S401.0M0H0TD0M0Y0P4444444444444444444444444444444444444444444444444444", "0:00:00.492");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444S401.0M0H0TD0M0Y0P4444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444S401.0M0H0TD0M0Y0P4444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test24098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24098");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-1", "aYaMaDTaHaMa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24099");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ", "hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24100");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0:00:00.289                                                                                               ", "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I", 492);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24101");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("T 0", 24, 58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0:00:00.07", "         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.07" + "'", str2, "0:00:00.07");
    }

    @Test
    public void test24103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24103");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("P0Y0M0DT0H0M0.225S", "0i!", 161);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24104");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0:00:00.086", (java.lang.CharSequence) "##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24105");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "00: 00: 0i! hi!   hi!hi!  hi!  hi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24106");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("743I!I!I! ", "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", 96);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("0 SECOND", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("        P0Y0M0DT0H0M0.100S         ", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test24107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24107");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24108");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "P-1Y11M30DT23H59M59.949S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24109");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                'P'yyyy'Y'M'M'd'DT'H'0 seconds");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24110");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 118, (long) 152, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str3, "0000000000000000000000000000000000i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test24111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("ai!aaaaaaaaaaaaaaaa2ahi!aaa  i!", "                                                              1                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                       Hi!Hi!H...HI", 280, "P");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       Hi!Hi!H...HIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP" + "'", str3, "                                       Hi!Hi!H...HIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
    }

    @Test
    public void test24113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24113");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0:00:00.306");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.306" + "'", str1, "0:00:00.306");
    }

    @Test
    public void test24115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24115");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(".s's.s's.s's.s's.s's.s's.s's.s's", 495);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24116");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                 hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("T H HI", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P-1Y11M30DT23H59M59.233S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24118");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "Sdnoces", (java.lang.CharSequence) "...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Sdnoces" + "'", charSequence2, "Sdnoces");
    }

    @Test
    public void test24119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24119");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0:00:00.139######################################HP0Y000DT00000.01010#######################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0haaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11024");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24120");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P Y M DT H M n 56S", "!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24121");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                       000i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("S0 S0 S0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                       P0Y0M0DT0H0M0.271                             ", "                                                                                       HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S0 S0 S0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                       P0Y0M0DT0H0M0.271                             " + "'", str2, "S0 S0 S0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                       P0Y0M0DT0H0M0.271                             ");
    }

    @Test
    public void test24123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24123");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 36, (long) 54, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P-1Y11M30DT23H59M59.233S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P-1Y11030DT23059059.23318" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P-1Y11030DT23059059.23318");
    }

    @Test
    public void test24124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) ":00:00.052");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":00:00.052" + "'", str1, ":00:00.052");
    }

    @Test
    public void test24125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("p-1y11m30dt23h59m59.872s", 930, "sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnoce");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHp-1y11m30dt23h59m59.872ssdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesH" + "'", str3, "sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHp-1y11m30dt23h59m59.872ssdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesH");
    }

    @Test
    public void test24126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24126");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                              aahi!  ", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 1, 612);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("97P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0", "!  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  daysaa  daysi!  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0" + "'", str2, "97P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0");
    }

    @Test
    public void test24128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24128");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P0Y0M0DT0HHP-1Y11M30DT23H59M59.972SHh", 85, "0i0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD4444444444444444444444444444444444444444444444aahi0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0i0I!0I!0I!0IP0Y00P0Y0P0P0Y0M0DT0HHP-1Y11M30DT23H59M59.972SHh0i0I!0I!0I!0IP0Y00P0Y0P0" + "'", str3, "0i0I!0I!0I!0IP0Y00P0Y0P0P0Y0M0DT0HHP-1Y11M30DT23H59M59.972SHh0i0I!0I!0I!0IP0Y00P0Y0P0");
    }

    @Test
    public void test24129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24129");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0M0DT0H0M0.024S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.024100" + "'", str3, "P0Y000DT00000.024100");
    }

    @Test
    public void test24130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24130");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("P0Y0M0DT0H0M0.176S", "HY0 HY0HY0H...HY0 P0HP0H..", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24131");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi! hi!   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI       ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24132");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("######P00-1", " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24133");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                               0:00:00.032444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "p000000t0h000.0000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                 S100.0M0H0TD0M0Y0P                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S100.0M0H0TD0M0Y0P" + "'", str1, "S100.0M0H0TD0M0Y0P");
    }

    @Test
    public void test24135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D -1Y11M30DT23H59M59.964S44                                    ", "                                                                                                                                                                                                                                                                                                                                                        HI!HI!HI!                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D -1Y11M30DT23H59M59.964S44                                    " + "'", str2, "D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D 0D -1Y11M30DT23H59M59.964S44                                    ");
    }

    @Test
    public void test24136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 0econ00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 0econ00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 0econ00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", "0:00:00.106");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str2, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test24139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("##i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str1, "##I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test24140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24140");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                              P00-1     ##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test24141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24141");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("daysI!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000", "###################################################################################################################################################################################################################################################################################################################################################################################", "aaaaaaaaaa0i!i!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "daysI!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000" + "'", str3, "daysI!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000");
    }

    @Test
    public void test24142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24142");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!pphi!pphi!pphi!pphi!pphi!ppS0pS0pS0phi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pppppppppppp", (java.lang.CharSequence) "p0y000dt00000.07111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                         P0Y0M0DT0H0M0.019S", 37, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         P0Y0M0DT0H0M0.019S" + "'", str3, "                         P0Y0M0DT0H0M0.019S");
    }

    @Test
    public void test24144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24144");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("H S0H S000H SH S0H S000H SH S0H S000H S", 30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("P-1Y11M30DT23H59M59.935", "hP-1Y11M30DT23H59M59.986SHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.986SApP-1Y11M30DT23H59M59.986S0P-1Y11M30DT23H59M59.986SyP-1Y11M30DT23H59M59.986S0P-1Y11M30DT23H59M59.986SmP-1Y11M30DT23H59M59.986S0P-1Y11M30DT23H59M59.986SdtP-1Y11M30DT23H59M59.986S0P-1Y11M30DT23H59M59.986ShP-1Y11M30DT23H59M59.986S0P-1Y11M30DT23H59M59.986SmP-1Y11M30DT23H59M59.986S0P-1Y11M30DT23H59M59.986S.P-1Y11M30DT23H59M59.986S045P-1Y11M30DT23H59M59.986Ss");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.935" + "'", str2, "P-1Y11M30DT23H59M59.935");
    }

    @Test
    public void test24146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24146");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                  .                                      hi!hi!hi!", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I############", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I############" + "'", str2, "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I############");
    }

    @Test
    public void test24148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!h", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str3, "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test24149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24149");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray8, strArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray8);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '#');
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        int int27 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("####", strArray8);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.endsWithAny("230.00:00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", strArray8);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "aahi!" + "'", str21, "aahi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "##hi!" + "'", str23, "##hi!");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test24150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24150");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P0Y0M0DT0H0M0.397S", "P0Y0M0DT0H0M0.007S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "S910.0M0H0TD0M0Y0P");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24152");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("P0Y0M0DT0H0M0.056S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.056S" + "'", str1, "P0Y0M0DT0H0M0.056S");
    }

    @Test
    public void test24154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24154");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0:00:00.079", "                                                                                                                                              P00-1                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24155");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("        00noce0 0        ", "P00-1Y11030DT23059059.9993300000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24156");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaahi!444444444444444444444444444444444444444444...", "                                         hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24157");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaa", 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24158");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aahi!P0000Y0-10DT07430-10.99359999", "0i0");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aahi!P0000Y0-10DT07430-10.99359999" + "'", str4, "aahi!P0000Y0-10DT07430-10.99359999");
    }

    @Test
    public void test24159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24159");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray15 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi! hi!   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'p'YYYY'y'm'm'D'dt'h'                              ", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                         p0Y000DT00000.0101         ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test24160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", "0 days");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
    }

    @Test
    public void test24161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24161");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("H:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43" + "'", str1, "H:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43");
    }

    @Test
    public void test24162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24162");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(".09910", "                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(".s's.s's.s's.s's.s's.s's.s's.s's");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".s's.s's.s's.s's.s's.s's.s's.s's" + "'", str1, ".s's.s's.s's.s's.s's.s's.s's.s's");
    }

    @Test
    public void test24164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(" DAY86                                                                                                DAY                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " day86                                                                                                day                                                                                               " + "'", str1, " day86                                                                                                day                                                                                               ");
    }

    @Test
    public void test24165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24165");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ih                                                                                              ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test24166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24166");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!0i!i!i!i!i!i!i!i!i!...", 152, " HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaahi!0i!i!i!i!i!i!i!i!i!... HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaah" + "'", str3, " HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaahi!0i!i!i!i!i!i!i!i!i!... HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaah");
    }

    @Test
    public void test24167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!44days44days44days44days44days44days44days44days44day                                                                                                                                           'P'YYYY'Y'M'M'D'DT'H'0 SECONDS                      4days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!44days44days44days44days44days44days44days44days44day                                                                                                                                           'P'YYYY'Y'M'M'D'DT'H'0 SECONDS                      4days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days" + "'", str2, "!44days44days44days44days44days44days44days44days44day                                                                                                                                           'P'YYYY'Y'M'M'D'DT'H'0 SECONDS                      4days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days");
    }

    @Test
    public void test24168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24168");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aahi!P0000Y0-10DT07430-10.99359999", "0i0");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("P0Y0M", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "  hi!  hi!  !ih  !ih  !ih  !ih  !ih  !00noce0 0h  !ih  !ih  !ih  !ih  !ih  ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test24169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24169");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) ":00:00.09", (java.lang.CharSequence) "ih  !ih  !ih  !ih  !ih  !ih  !ih  D0M0Y");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24170");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("8010.00000TD000Y0Ph28010.00000TD000Y0PH", (-1), "0 day");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8010.00000TD000Y0Ph28010.00000TD000Y0PH" + "'", str3, "8010.00000TD000Y0Ph28010.00000TD000Y0PH");
    }

    @Test
    public void test24171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("-1Y11030DT23059059.99379", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1Y11030DT23059059.99379              " + "'", str2, "-1Y11030DT23059059.99379              ");
    }

    @Test
    public void test24172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24172");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 76, (long) (byte) -1, "  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############  #############", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24173");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                     hi!        hi!                        hi!        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0haaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11024");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24174");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...3H59M59.872S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...3H59M59.872S" + "'", str1, "...3H59M59.872S");
    }

    @Test
    public void test24175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24175");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "P0Y0M0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24176");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 125, (long) 903, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24177");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "P0Y000DT00000.000282");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test24178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24178");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("059.872103");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24179");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "p0Y0M0DT0H0M0.289Si!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ih444!ih4!ih..IH  !IH ih444!ih4!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24181");
        char[] charArray11 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0DT0H0M0.003S", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaa                          'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!aaaaaaaaaaaaaaaaaaaa                           ", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("P-1Y11030DT23059059.9839444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test24182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24182");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!'y'm'm' 'dt'h'h'M'", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24183");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          ", 19, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aa" + "'", str3, "aa");
    }

    @Test
    public void test24184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test24185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24185");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("P0Y000DT00000.07111", 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24186");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                             059.872103                                                                               ", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444059.8721034444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444059.8721034444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test24187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24187");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hP0Y0M0DT0H0M0.010S", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          0 SECONDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24188");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0M0DT0H0M0.043S     ", "...:00.032", 226);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24189");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("               P0Y000DT00000.065100", "####################################################################################################################################################44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24190");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !P0Y0M0DT0H0M0.030Sh AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24191");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0I!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("P0Y000000000000000000-1P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P", "pi!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086000000i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086ti!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.0860i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086hi!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086000i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086.i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.0860000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24193");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(" !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH 0s 0s 0s  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24194");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih !ih !ih !ih !ih !ih !ih !ih !i", 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24195");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("P-1Y11M30DT23H59M59.950SP-1Y11M30DT23H59M59.233SP-1Y1", "                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.950SP-1Y11M30DT23H59M59.233SP-1Y1" + "'", str2, "P-1Y11M30DT23H59M59.950SP-1Y11M30DT23H59M59.233SP-1Y1");
    }

    @Test
    public void test24196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("P0Y0M0DT0H0M0.054S", "P0Y0M0DT0H0M0.834S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.054S" + "'", str2, "P0Y0M0DT0H0M0.054S");
    }

    @Test
    public void test24197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "I##I##I##I##I##I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("1010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT" + "'", str1, "1010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT");
    }

    @Test
    public void test24199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24199");
        char[] charArray7 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                0", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!444444####M#DT#P#M#.##1S###M#DT#P#M#.##1SSECONDS", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test24200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24200");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "H        ", "                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                        ...3H59M59.872S                                                                                        ", "##i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!p0y0m0dt0h0m0.271s days");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        ...3H59M59.872S                                                                                        " + "'", str2, "                                                                                        ...3H59M59.872S                                                                                        ");
    }

    @Test
    public void test24202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0i!44444i  i  i  i  i  i0i!44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00aa440a00i!440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00", "0i0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00aa440a00i!440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a" + "'", str2, "!440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00aa440a00i!440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a00440a");
    }

    @Test
    public void test24204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24204");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test24205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24205");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P-1Y11030DT23059059.23318");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          p-1y11030dt23059059.23318" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          p-1y11030dt23059059.23318");
    }

    @Test
    public void test24206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24206");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("S100.0M0H0TD0M0Y0P", "I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 7, 111);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "S100.0MI I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str4, "S100.0MI I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test24207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24207");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24208");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("00noce0", "AAAAAAAA", "######P00-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00noce0" + "'", str3, "00noce0");
    }

    @Test
    public void test24209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !P0Y0M0DT0H0M0.030Sh AAAAAAAAAAAAAAAAAAAAAAAAA", 200, "!ih !ih                                                                                                !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih !ih                   H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !P0Y0M0DT0H0M0.030Sh AAAAAAAAAAAAAAAAAAAAAAAAA!ih !ih                   " + "'", str3, "!ih !ih                   H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !P0Y0M0DT0H0M0.030Sh AAAAAAAAAAAAAAAAAAAAAAAAA!ih !ih                   ");
    }

    @Test
    public void test24210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24210");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.002S", "hi!hi!hi! ", (int) (short) 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 91, (-1));
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   ... hI!hI!h...hi! ...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str7, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test24211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24211");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAAAAAA...", (java.lang.CharSequence) "  i!i!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test24212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0 0S 0S", 212);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0S 0S" + "'", str2, "0 0S 0S");
    }

    @Test
    public void test24213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("P0Y0M0DT0H0M0.052S", "HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.052S" + "'", str2, "P0Y0M0DT0H0M0.052S");
    }

    @Test
    public void test24214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("i! ", " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0", "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i! " + "'", str3, "i! ");
    }

    @Test
    public void test24215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24215");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                44S970.0M0H0TD0M0Y0P                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 275 + "'", int1 == 275);
    }

    @Test
    public void test24216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24216");
        char[] charArray9 = new char[] { ' ', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI! ", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".s's", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                            00noce0 0                                           ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test24217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24217");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0:00:00.139######################################HP0Y000DT00000.01010#######################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24218");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 92, (long) 126, "##hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##hi!" + "'", str3, "##hi!");
    }

    @Test
    public void test24219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24219");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P0Y0M0DT0H0M0.281S", " HI! HI! HI! HI! HI! HI! HI! HI!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("DAY86                                                                                                DAY", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test24220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24220");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", (java.lang.CharSequence) "! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1 S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaa", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1 S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1 S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "IH##############################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH##############################################################################################################################" + "'", str1, "IH##############################################################################################################################");
    }

    @Test
    public void test24223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24223");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Hhhaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHAAAAA" + "'", str1, "hHHAAAAA");
    }

    @Test
    public void test24224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24224");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "p0y0m0dt0h0m0.062s", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ", "aaaaaaaaaaaaaaa   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test24226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24226");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", 8);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, " HI!  HI.");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("P-1Y11M30DT23H59M59.999Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test24227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24227");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ", "                                                                            p0y0m0dt0h0m0.100s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24228");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("P0Y0M0DT0H0M0.080S", "aaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24229");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("P0Y0M0DT0H0M0.062S", "   Hi!Hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24230");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i############", "P0:00:00.0270:00:00.0270:00:00.0270:00:00.0270:00:00.0270:00:00.0270:00:00.0270:00:00.0270:", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24231");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                                                    'p'yyyy'y'm'm'd'dt'h'0 seconds");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("i!i!i!", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       i!i!i!" + "'", str2, "                       i!i!i!");
    }

    @Test
    public void test24233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       i!P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.099");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24234");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.000S", "hi!hi!hi! ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", (int) ' ');
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("hI!", strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!", strArray5, strArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", strArray5);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("Y0M0DT0H0M0.097P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0", strArray5, strArray19);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!" + "'", str15, "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Y0M0DT0H0M0.097P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0" + "'", str20, "Y0M0DT0H0M0.097P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0");
    }

    @Test
    public void test24235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              " + "'", str2, "                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ");
    }

    @Test
    public void test24236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0:00:00.027", 970);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24237");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "p0y000dt00000.010100y000dt00000.001110");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                 ::.99aaaaaaaaaaP-1Y11030DT23059059.97844::.99aaaaaaaaaa                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "::.99aaaaaaaaaaP-1Y11030DT23059059.97844::.99aaaaaaaaaa" + "'", str1, "::.99aaaaaaaaaaP-1Y11030DT23059059.97844::.99aaaaaaaaaa");
    }

    @Test
    public void test24239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24239");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi...  hi!  hi!  hi!  hi!  hi!  hi...  hi!  hi!  hi!  hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444444444444444444444444444444444444444a44444444444444444444444444444444444444444444440000I4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444I4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444I4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444I4444444444444444444444444444444444444444444444a444444444444444444444444444444444444444608401.00000TD000Y0P");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444A44444444444444444444444444444444444444444444440000i4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444i4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444i4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444i4444444444444444444444444444444444444444444444A444444444444444444444444444444444444444608401.00000td000y0p" + "'", str1, "4444444444444444444444444444444444444444444444A44444444444444444444444444444444444444444444440000i4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444i4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444i4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444i4444444444444444444444444444444444444444444444A444444444444444444444444444444444444444608401.00000td000y0p");
    }

    @Test
    public void test24241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 68, "                         p0Y000DT00000.0101         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         p0Y000DT00000.0101                         " + "'", str3, "                         p0Y000DT00000.0101                         ");
    }

    @Test
    public void test24242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24242");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("p0Y0M0DT0H0M0.043S", "I!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24243");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 888, "0:00:00.961", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24244");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H S0H S000H SH S0H S000H SH##hi##", "sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "010.00:00:0", (int) 'a', (int) ' ');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("   P0Y0M0DT0H0M0.100S         ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test24245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24245");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           ...!hi!hi!h                                                                                                            ", "       P-1Y11M30DT23H59M59.926S44444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s###########i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s###########i" + "'", str1, "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s###########i");
    }

    @Test
    public void test24247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("        p0y0m0dt0...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "p0y0m0dt0...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test24248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24248");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!P0Y000...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!P0Y000...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!P0Y000...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test24249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24249");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("iHhiHhiHhiHh", 47, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iHhiHhiHhiHh###################################" + "'", str3, "iHhiHhiHhiHh###################################");
    }

    @Test
    public void test24250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24250");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0days", "HI!HI!HI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "IH                            4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444!ih", 30, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24251");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ", 318, 298);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ", "sdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  " + "'", str3, "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ");
    }

    @Test
    public void test24253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24253");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("00I!  I..", "                                                                                                                                           'p'yyyy'y'm'm'd'dt'h'0 seconds                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                            743I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                            743i" + "'", str1, "                            743i");
    }

    @Test
    public void test24255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24255");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("'P'yyyy'Y'M'M'd'DT'''m'M's.S'S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!I!I!!I!I0:00:00.277", "                                                                               P-1Y11M30DT23H59M59.606S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!I!I!!I!I0:00:00.277" + "'", str2, "!I!I!!I!I0:00:00.277");
    }

    @Test
    public void test24257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24257");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...:!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...00!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...:!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...00!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444....!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...030", "444444444444444444444444444444444444444444444444444aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24258");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("0DAY88                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0DAY88" + "'", str1, "0DAY88");
    }

    @Test
    public void test24259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24259");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAP0Y000DT00000.0459I!0000000000000000000000000000I!I!", 48, 212);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAP0Y000DT00000.0459I!0000000000000000000000000000I!I!" + "'", str3, "AAP0Y000DT00000.0459I!0000000000000000000000000000I!I!");
    }

    @Test
    public void test24260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("DAYS", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DAYS" + "'", str3, "DAYS");
    }

    @Test
    public void test24261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAHI!p0000y0-10dt07430-10.99359999144444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24262");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0 0ECON00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                       Hi!Hi!H..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                       hi!hi!h.." + "'", str1, "                                                                                       hi!hi!h..");
    }

    @Test
    public void test24264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24264");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                  .                                               i!", "P0Y0M0DT0H0M0.036S", 115);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24265");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                 !hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", "  hi!  hi!  hi!  hi!  hi!  hi...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24266");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444", 390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("p-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8a", "P-1Y11M30DT23H59M59.819S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8a" + "'", str2, "p-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8a");
    }

    @Test
    public void test24268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24268");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", (int) ' ');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("                                            I:II:IIII32                                            ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S" + "'", str7, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test24269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24269");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI.. HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24270");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H.!I0HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H..", "      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24271");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0:00:00.061", 23, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24272");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test24273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi! hi! hi!                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("P-1Y11M30DT23H59M59.123S", ":00:");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.123S" + "'", str2, "P-1Y11M30DT23H59M59.123S");
    }

    @Test
    public void test24275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24275");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                           'P'yyyy'Y'M'M'd'DT'H'0 seconds                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                           'P'yyyy'Y'M'M'd'DT'H'0 seconds                     " + "'", str1, "                                                                                                                                           'P'yyyy'Y'M'M'd'DT'H'0 seconds                     ");
    }

    @Test
    public void test24276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaSDNOCES", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test24277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24277");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("i:ii:iiii32                                            0days                                            i:ii:iiii32                                            0days                                            i:ii:iiii32                                            0days                                            i:ii:iiii32", "444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hI!hI!h..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24279");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("i!hi!hi!hi!h!ii!hi!hi!hi!h", "00NOCE0 0", 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("M30DT23H59M59.872S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "M30DT23H59M59.872S" + "'", str1, "M30DT23H59M59.872S");
    }

    @Test
    public void test24281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "'SDNOCES");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test24282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" P 0 Y        T 0          0ap000000t00000.099-10ap0aaaaaaaaaaaaaaaa0ap000000t00000.099-10I!p0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "P-1Y11M30DT23H59M59.711S                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " P 0 Y        T 0          0ap000000t00000.099-10ap0aaaaaaaaaaaaaaaa0ap000000t00000.099-10I!p0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, " P 0 Y        T 0          0ap000000t00000.099-10ap0aaaaaaaaaaaaaaaa0ap000000t00000.099-10I!p0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test24283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24283");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000H S0H S000H SH S0H S000H SH S0H S000H S00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "pa0aYa0aMa0aDTa0aHa0aMa0a.a045aS", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24284");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                               P0Y0-10DT07430-10.2713599914                           ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24285");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 101, "        P0Y0M0DT0H0M0.0:00:00.038        P0Y0M0DT0H0M0.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        P0Y000DT000000.0:00:00.038        P0Y00DT00000." + "'", str2, "        P0Y000DT000000.0:00:00.038        P0Y00DT00000.");
    }

    @Test
    public void test24286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                           1                                                              ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           1                                                              " + "'", str2, "                                           1                                                              ");
    }

    @Test
    public void test24287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24287");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444442");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24288");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...   P0Y0M0DT0H0M0.035S                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24289");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H         ", "H P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!        hi!                        hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test24290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24290");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "hi!", (int) (short) 1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test24291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24291");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("I!", "P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h", 204, 58);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h" + "'", str4, "I!P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h");
    }

    @Test
    public void test24292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24292");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                          743i!i!i! ", "hi!hi!hi! P0Y0-10DT07430-10.0113599861");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test24293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24293");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", "'m'm'D'dt'h'h'M'm'S.s's'hI!", (int) (short) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("       ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test24294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  HI!  HI!  HI!  HI!  HI!  HI!  HI!  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  HI!  HI!  HI!  HI!  HI!  HI!  HI!  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test24295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24295");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32", "18 000018 0018 018 000018 0018 018 000018 0018 018 000018 0018 018 000018 0018 018 000018 0018...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24296");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00", "                                                                            p0y0m0dt0h0m0.100s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00" + "'", str2, ":00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00");
    }

    @Test
    public void test24298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24298");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444", "999.95095!ih  IIIIIIIIIIIIIIII0000000000000000");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24299");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test24300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24300");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 503, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test24301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24301");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24302");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.225S", "-1Y11M30DT23H59M59.853SIH                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24303");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 567 + "'", int2 == 567);
    }

    @Test
    public void test24304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24304");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P0Y000DT00000.07111", 76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24305");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24306");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("p0Y0M0DT0H0M0.002S", "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("...                                                                                      ...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test24307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("H!IH!IH ", 125);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                     H!IH!IH " + "'", str2, "                                                                                                                     H!IH!IH ");
    }

    @Test
    public void test24308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24308");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("sdnoces 0", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "P0Y0M0DT00M0.051S");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("!ihaa !i0!i0!i0!i0!i0!i0!i0!i0!i04!ih444!ih4!ih", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test24309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24309");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("P0Y0M0DT0H0M0.043S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.043s" + "'", str1, "p0y0m0dt0h0m0.043s");
    }

    @Test
    public void test24310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24310");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("P0Y0M0DT0H0M0.065S");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("0:...                                                                                                                                                            ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test24311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24311");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s" + "'", str3, "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s" + "'", str4, "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
    }

    @Test
    public void test24312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24312");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0:00:00.289", "P-1Y11M30DT23H59M59.990", 961);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24313");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                     0                              ", "p YYYY y        t");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24314");
        char[] charArray11 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!Hi!hi!", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny(" P yyyy Y        T H H         ", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("0:00:00.043", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test24315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  i!  i!HI!  i!  i!HI!  i!  i!HI!" + "'", str2, "  i!  i!HI!  i!  i!HI!  i!  i!HI!");
    }

    @Test
    public void test24316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24316");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 174, "                                                                                                                                44010000TD000Y0000P                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                44010000TD000Y0000P                                                                                                                               " + "'", str2, "                                                                                                                                44010000TD000Y0000P                                                                                                                               ");
    }

    @Test
    public void test24317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24317");
        char[] charArray15 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!Hi!H...", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "P yyyy Y        T H H", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HP0Y000DT00000.01010", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "         s s hi!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test24318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24318");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0 0S 0S", (java.lang.CharSequence) "I!00000000000000000000000000000743I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   ", "pP0Y0M0DT0H0M0.191S0P0Y0M0DT0H0M0.191SYP0Y0M0DT0H0M0.191S0P0Y0M0DT0H0M0.191SM");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   " + "'", str2, " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   ");
    }

    @Test
    public void test24320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24320");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!P0Y000...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "HI!hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hi!HI!hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hi!HI!hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hi!HI!hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hi!HI!hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hi!HI!hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hi!HI!hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0hi!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24321");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#0 days 0 hours 0 minutes 0 seconds !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444", "                P2Y2M2DT22M2022iP2Y222DT2222202hiP2Y222DT2222202P2Y222DT2222202P2Y222DT2222202hiP2Y222DT2222202", 126);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test24322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("AAP0Y000DT00000.0459I!0000000000000000000000000000I!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAP0Y000DT00000.0459I!0000000000000000000000000000I!I!" + "'", str1, "AAP0Y000DT00000.0459I!0000000000000000000000000000I!I!");
    }

    @Test
    public void test24324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24324");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S", "AAAAAAAAAA0I!I!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24325");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                Hi!                                                 ", 282, 120);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24328");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI" + "'", str1, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI");
    }

    @Test
    public void test24329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24329");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaS910.0M0H0TD0M0Y0P", " 0 days 0 hours 0 minutes 0 seconds ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24330");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 50, (long) (byte) 10, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24332");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 252, 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24333");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("          ", "0S0S0", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24334");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "p-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 41 + "'", int1 == 41);
    }

    @Test
    public void test24335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("p0Y0M0DT0H0M0.904S", 604, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################################################################################################################################################################################################################################################p0Y0M0DT0H0M0.904S#####################################################################################################################################################################################################################################################################################################" + "'", str3, "#####################################################################################################################################################################################################################################################################################################p0Y0M0DT0H0M0.904S#####################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test24336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24336");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441");
    }

    @Test
    public void test24337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24337");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                           hi!                                                                                                hi! hi!                                            ", "H S0H S000H SH S0H S000H SH S0H S000H S", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     I!                    ", "aaaaaaaaaaaaaaa   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     I!                    " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     I!                    ");
    }

    @Test
    public void test24339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                44188000TD00Y0P                                                                                                                               ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                 !hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test24340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24340");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ", 970, "230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                hi!0S 0S 00S 0S 00S 0S 00S 0S 00S " + "'", str3, "230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
    }

    @Test
    public void test24341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24341");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0:00:00.009", "Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24342");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI! Hi!Hi!H...HI! H                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! Hi!Hi!H...HI! H" + "'", str1, "HI! Hi!Hi!H...HI! H");
    }

    @Test
    public void test24343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24343");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                          0 seconds                                                          ", "Hi!Hi!H...         Hi00noce0 0Hi!Hi!H...         Hi!", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24344");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("I:II:IIII32", "aaaaaaaaaP-1Y11M30DT23H59M59.935");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaa0:00:00.018", "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("    hi!       ", 290);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                              hi!                                                                                                                                                 " + "'", str2, "                                                                                                                                              hi!                                                                                                                                                 ");
    }

    @Test
    public void test24347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24347");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("P0Y0M0DT0H0M0.082S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24348");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1Y11-130DT2374359-159.999359998900000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", "");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i", "AAHI!p0000y0-10dt07430-10.99359999");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI!p0000y0-10dt07430-10.99359999" + "'", str2, "AAHI!p0000y0-10dt07430-10.99359999");
    }

    @Test
    public void test24350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24350");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0y0m0dt0h0m0.001sAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                              1                                                              ", "       0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                0P0Y0M0DT0H0M0.019SiP0Y0M0DT0H0M0.019S!P0Y0M0DT0H0M0.019S4444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.019SaahiP0Y0M0DT0H0M0.019S!P0Y0M0DT0H0M0.019S4444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                0P0Y0M0DT0H0M0.019SiP0Y0M0DT0H0M0.019S!P0Y0M0DT0H0M0.019S4444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.019SaahiP0Y0M0DT0H0M0.019S!P0Y0M0DT0H0M0.019S4444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                0P0Y0M0DT0H0M0.019SiP0Y0M0DT0H0M0.019S!P0Y0M0DT0H0M0.019S4444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.019SaahiP0Y0M0DT0H0M0.019S!P0Y0M0DT0H0M0.019S4444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test24352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24352");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!        hi!                        hi!        ", 397);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24353");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hhhhi!hi!hi!hi!", "", "##################...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test24354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24354");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0:00:00.030");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0a:a00a:a00a.a030" + "'", str4, "0a:a00a:a00a.a030");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test24355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24355");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.071S", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", 98);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test24356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24356");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("P0Y0M0DT0H0M0.030Sh         AA0:00:00.082", "P-1Y11M30DT23H59M59.593S", "noce0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test24357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24357");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                 'P'yyyy...", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 902);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24358");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("P0Y0M0DT0H0M0.227S", "P0Y000DT00000.139900                                                                                    ", 152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! ", "P0Y000DT00000.034903");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! " + "'", str2, "hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! ");
    }

    @Test
    public void test24360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24360");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!hi!", "p00-1y11-130dt2374359-159.999359998900000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("!44days44days44days44days44days44days44days44days44day                                                                                                                                           'P'YYYY'Y'M'M'D'DT'H'0 SECONDS                      4days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!hi!" + "'", str4, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!hi!");
    }

    @Test
    public void test24361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24361");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0:00:00.000", 958, 107);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                       ", "                                                                                               hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24363");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                        ...IH!IH!IH!IH!IH!IH                                                                                                       ", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24364");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24365");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                           P-1Y11M30DT23H59M59.853S", 204);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "P 0 Y        T 0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24367");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                             ...", "                                                                                             0 -1616567633ECOND", "30.00:00:0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test24368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24368");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 143, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test24369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24369");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0:00:00.039", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.039" + "'", str2, "0:00:00.039");
    }

    @Test
    public void test24371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24371");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("              i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...               ", 53, "P p00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...               " + "'", str3, "              i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...               ");
    }

    @Test
    public void test24372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24372");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("p0y000dt00000.010100y000dt00000.001110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                                                                                                           ###################################################################################00noce0  #########################################################", 55, 397);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24373");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!  HI!  ", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24374");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!hi!hi!  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i", "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24375");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...h!ih!ih", "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24376");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#4440#i#!#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#4440#i#!#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444" + "'", str2, "hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#4440#i#!#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#4440#i#!#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444" + "'", str3, "hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#4440#i#!#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444");
    }

    @Test
    public void test24377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24377");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24378");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4hi!444hi!4");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4hi!444hi!4" + "'", str2, "4hi!444hi!4");
    }

    @Test
    public void test24379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24379");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Y0M0DT0H0M0.097P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test24380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("p0y000dt00000.07111", 390);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                   p0y000dt00000.07111" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                   p0y000dt00000.07111");
    }

    @Test
    public void test24381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!444444400noce0  4444444444444444a4444444444444444444444444444444444444444444444", "#0 days 0 hours 0 minutes 0 seconds !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#0 days 0 hours 0 minutes 0 seconds !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444" + "'", str2, "#0 days 0 hours 0 minutes 0 seconds !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444");
    }

    @Test
    public void test24382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24382");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI", "       a0Y0M0DT0H0M0.001Sa       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24383");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("S", "");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!hi!", "P0Y0  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                       Hi!Hi!H...", strArray5, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032", strArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith("0:...", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                       Hi!Hi!H..." + "'", str10, "                                                                                       Hi!Hi!H...");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "S" + "'", str12, "S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "S" + "'", str13, "S");
    }

    @Test
    public void test24384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24384");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i9935999p0y0m0dt0h0m0i000sAA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i9935999");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" 00I!  I.", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 00I!  I." + "'", str2, " 00I!  I.");
    }

    @Test
    public void test24386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24386");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("P-1Y11030DT23059059.9839444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", " DAY4                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24387");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                  444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                   ", 152, 612);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("S0 S0 S0 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0:00:00.848");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24389");
        char[] charArray13 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.000S", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("                                                       P-1Y11030DT23059059.999444", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test24390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24390");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT", 151, 931);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24391");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("D0D0D0'", "P0Y0:00:00.134");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "D0D0D0'" + "'", str2, "D0D0D0'");
    }

    @Test
    public void test24393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24393");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("p-1y11030dt23059059.872197", "p0Y0M0DT0H0M0.904S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("p-1y11030dt23059059.872197", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p-1y11030dt23059059.872197" + "'", str2, "p-1y11030dt23059059.872197");
    }

    @Test
    public void test24395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24395");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                     0                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test24396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24396");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444444444444444444444444444444444444444444059.8721034444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444059.8721034444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444059.8721034444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test24397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24397");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(" aaaaaa", 484, 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi! hi!   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI       ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi!4hi!444hi hi!  hi..hi!4hi!444hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi!   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI       " + "'", str2, "hi! hi!   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI       ");
    }

    @Test
    public void test24399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("#####################P0Y000DT00000.020134", "...###################################################################################################################################################################################### HI! HI! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ...hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################P0Y000DT00000.020134" + "'", str2, "#####################P0Y000DT00000.020134");
    }

    @Test
    public void test24400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24400");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4!ih444!ih4!ih0:00:00.032                            ", "###################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24401");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.079");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("######P00-1", (java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                             ", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.079" + "'", str3, "0:00:00.079");
    }

    @Test
    public void test24402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44", "444444444444440:00:00.30644444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44");
    }

    @Test
    public void test24403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24403");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0y0m0dt0h0m0.001sAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           ", 174, 197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24404");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 474, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test24405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24405");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray9, strArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray9);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "                                                                                               hi! ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0:00:00.128", strArray3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "aahi!" + "'", str22, "aahi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                                                                               hi!                                                                                                hi! hi!" + "'", str25, "                                                                                               hi!                                                                                                hi! hi!");
    }

    @Test
    public void test24406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                     H                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     H                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                     H                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24407");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("44444444444444444444444444444444444444hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444444444444", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test24410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24410");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("P0Y0M0DT0H0M0.414S############################################################################################################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24411");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0a:a00a:a00a                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                             P-1Y11M30DT23H59M59.991S                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045", 106);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0a:a00a:a00a                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045                           " + "'", str3, "0a:a00a:a00a                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045                           ");
    }

    @Test
    public void test24412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24412");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444", "0Y0M0DT0H0M0.99S                                                                                                                                                                                                                                                                                 ", 970);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'dHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444Y0M0DT0H04444444444", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test24413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24413");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!                                                                             ", "P0Y0M0DT0H0M0.097P0Yp0y0m0dt0h0m0.003sp0y0m0dt0h0m0.003sp0y0m0097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0                                               DAYS                                               ", "Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!                                                                             " + "'", str3, "                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!                                                                             ");
    }

    @Test
    public void test24414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("P0Y000DT00000.00591", "0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00591" + "'", str2, "P0Y000DT00000.00591");
    }

    @Test
    public void test24415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.0" + "'", str1, "aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.0");
    }

    @Test
    public void test24416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24416");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) " HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaahi!0i!i!i!i!i!i!i!i!i!... HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "P-1Y11M30DT23H59M59.593S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24418");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("sshi", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24419");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################################################################################################### aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###################################################################################################################################################################################################################################################################################################################################################################################################################################################", "HI.. HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 435 + "'", int2 == 435);
    }

    @Test
    public void test24420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24420");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("p0y0m0dt0h0m0.000s", (java.lang.Object[]) strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray6);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                     hi!        hi!                        hi!        ", strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 91 + "'", int11 == 91);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test24421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("P-1Y11030DT23059059.711100                                                           ", "AAAAAAAAAAAAAAAAAAAAA...P0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11030DT23059059.711100                                                           " + "'", str2, "P-1Y11030DT23059059.711100                                                           ");
    }

    @Test
    public void test24422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24422");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "00Y0M0DT0H0M0.001S 0Y0M0DT0H0M0.001Sseconds", (java.lang.CharSequence) "Hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "00Y0M0DT0H0M0.001S 0Y0M0DT0H0M0.001Sseconds" + "'", charSequence2, "00Y0M0DT0H0M0.001S 0Y0M0DT0H0M0.001Sseconds");
    }

    @Test
    public void test24423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("i", " !I!I!I347", 42);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24424");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", ".HHH:HH:H", "sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24426");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "P0Y0M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24427");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...P0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M", "000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test24428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24428");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                      'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", "444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24429");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 900, "44S970.0M0H0TD0M0Y0P");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44900970.00000TD000Y0P" + "'", str2, "44900970.00000TD000Y0P");
    }

    @Test
    public void test24430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24430");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S", 115);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("####M#DT#P#M#.##1S###M#DT#P#M#.##1SSECONDS", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("P0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD", strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = null;
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  ############", strArray6, strArray11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str8, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str10, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "  ############" + "'", str12, "  ############");
    }

    @Test
    public void test24431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24431");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaa", "                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", 120);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0:00:00.139hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.139hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str1, "0:00:00.139hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test24433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0 daysaahi!", "'4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0:00:00.00", "                                                                                             0 SECONDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00." + "'", str2, "0:00:00.");
    }

    @Test
    public void test24435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                                                        HI!HI!HI!                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test24436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24436");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aa0i!p000000-100t07430-10.99359999144444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa0i!p000000-100t07430-10.99359999144444444" + "'", str1, "aa0i!p000000-100t07430-10.99359999144444444");
    }

    @Test
    public void test24437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495", "############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "                                                                                                                                                                                        0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495" + "'", str3, "Hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495");
    }

    @Test
    public void test24438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24438");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                              HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24439");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "h         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "P0Y0M0DT0H0M0.442S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24440");
        char[] charArray14 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       ...hi!4444444444444444444444444444444444444444444444a44444444444444444444444444444444444444", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaHi!Hi!H", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaS0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 450 + "'", int21 == 450);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test24441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24441");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0140 0 0", 275, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24442");
        char[] charArray12 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0i0", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'HI!", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  hi!hi!hi!#######################", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1Y11M30DT23H59M59.964S44                                    ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test24443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24443");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                            0:00:00.032                                            ", "h P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.01", 900);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("00: 00: 0i! hi!   hi!hi!  hi!  hi!  ", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24445");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y0M0DT0H0M0.176S", "444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.40I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.4", 174);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24446");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("0 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 ", "S H hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah H   H0     0 ", "0 days 0 hours 0 minutes 0 secondsi!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!H", 84);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 " + "'", str4, "0 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s440 d0 d0 ");
    }

    @Test
    public void test24447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24447");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                            743I", "i!0i!i!i!i!i!i!i!i!i!", 246);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24448");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 970, (long) 188, "P0Y0M0DT0H0M0.166S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1663599218" + "'", str3, "P0Y0-10DT07430-10.1663599218");
    }

    @Test
    public void test24449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("::", "aahi4hP0Y0M0DT0.0M0.010ShP0Y0M0DT0.0M");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test24450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0 days 0 hours 0 minutes 0 secondsi!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!H", "                                                                                                                                                                                                                                                                                                                                                        HI!HI!HI!                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 days 0 hours 0 minutes 0 secondsi!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!H" + "'", str2, "0 days 0 hours 0 minutes 0 secondsi!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!H");
    }

    @Test
    public void test24451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 0econ00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 0econ00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24452");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ", "                                                                                                                                                                                                                                                                    'p'yyyy'y'm'm'd'dt'h'0 seconds", 212);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.015S", 16, "-00p                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.015S" + "'", str3, "P0Y0M0DT0H0M0.015S");
    }

    @Test
    public void test24454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24454");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!", "43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 114, 6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'p'YYY43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "'p'YYY43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24455");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi! hi! hi! hi!hhhhi! hi! hi! hi!", 212, 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S444444444444444444444444444444444444444hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!4440i!hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S444444444444444444444444444444444444444hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!4440i!hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444" + "'", str2, "P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S444444444444444444444444444444444444444hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!4440i!hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444");
    }

    @Test
    public void test24457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                               ::.99");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("P0Y0M0DT0H0M0.093S", "P0Y0M0DT0H0M0.487S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.093S" + "'", str2, "P0Y0M0DT0H0M0.093S");
    }

    @Test
    public void test24459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S" + "'", str2, "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
    }

    @Test
    public void test24460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24460");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(":00:00.495", 138, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":00:00.49544444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, ":00:00.49544444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test24461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24461");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 281, "M'M'd'DT'H'");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0M0DT0" + "'", str2, "0M0DT0");
    }

    @Test
    public void test24462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad", "!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test24463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.289                                                                                               ", 125, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.289                                                                                               " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.289                                                                                               ");
    }

    @Test
    public void test24464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0day88                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24465");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1Y11M30DT23H59M59.964S44                                                                                                                               ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24466");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", "AAP0Y000DT00000.0459I!0000000000000000000000000000I!I!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!0s 0s 00s 0s 00s 0s 00s 0s 00s " + "'", str1, "HI!0s 0s 00s 0s 00s 0s 00s 0s 00s ");
    }

    @Test
    public void test24468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                    S                                                                                                                                          S                                                                      hi!", "p0y0m0dt0h0m0.003sp0y0m0dt0h0m0.003sp0y0m00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    S                                                                                                                                          S                                                                      hi!" + "'", str2, "                                                                    S                                                                                                                                          S                                                                      hi!");
    }

    @Test
    public void test24469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "##############################################################hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                                                                                                                                                                  P-1Y11M30DT23H59M59.930S", "P");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hhh", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhh" + "'", str2, "hhh");
    }

    @Test
    public void test24472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24472");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("-130DT2374359-159.8723599999         ", "P00-1Y11M30DT23H59M59.964S44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24473");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi!4hi!444hi HI!  HI..hi!4hi!444hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test24474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24474");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI!", "Hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495", 17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 35, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH 0s 0s 0s  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH", 17, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH 0s 0s 0s  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH" + "'", str3, " !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH 0s 0s 0s  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH");
    }

    @Test
    public void test24476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24476");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0S 0S 0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("i!4444444444444444444444444444444444444444444444aahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!4444444444444444444444444444444444444444444444aahi!" + "'", str1, "i!4444444444444444444444444444444444444444444444aahi!");
    }

    @Test
    public void test24478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24478");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 397);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.397S" + "'", str1, "P0Y0M0DT0H0M0.397S");
    }

    @Test
    public void test24479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24479");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("P-1Y11M30DT23H59M59.922S", "Hi! hi!   hi!", 205);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.922S" + "'", str3, "P-1Y11M30DT23H59M59.922S");
    }

    @Test
    public void test24480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24480");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence7 = null;
        char[] charArray18 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray18);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray18);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray18);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray18);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence7, charArray18);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray18);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0:00:00.043", charArray18);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00", charArray18);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                              ", charArray18);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence2, charArray18);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                 P0Y0-10DT07430-10.0013599969                 ", charArray18);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 77 + "'", int26 == 77);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test24481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Y0M0DT0H0M");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "y0m0dt0h0m" + "'", str1, "y0m0dt0h0m");
    }

    @Test
    public void test24482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24482");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                          0 0 0  0 0 0.930s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.010hP0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0:00:00.017", "...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   ... hI!hI!h...hi! ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.017" + "'", str2, "0:00:00.017");
    }

    @Test
    public void test24485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24485");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24487");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" 0 0 0  0 0 0.930S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 0 0 0  0 0 0.930S" + "'", str1, " 0 0 0  0 0 0.930S");
    }

    @Test
    public void test24488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("SDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCES", "P0Y000DT00000.1261");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0:00:00.034", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.03" + "'", str2, "0:00:00.03");
    }

    @Test
    public void test24490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                 ", "000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                 " + "'", str2, "                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                 ");
    }

    @Test
    public void test24492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24492");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0:00:00.080", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aahi!D");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi!D" + "'", str1, "aahi!D");
    }

    @Test
    public void test24494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24494");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!" + "'", str1, "hi!hi!hi!");
    }

    @Test
    public void test24495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("##################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################################################################################################################################################################################################################################################################################" + "'", str1, "##################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test24496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24496");
        char[] charArray7 = new char[] { ' ', ' ' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI! ", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("i!00000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0D...                             ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih", "ih444!ih4!ih..IH  !IH ih444!ih4!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih" + "'", str3, "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih");
    }

    @Test
    public void test24498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24498");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaHi!Hi!H...", "0:00:00.028", 17);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      aahi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaHi!Hi!H" + "'", str5, "aaaaaaaaaaHi!Hi!H");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test24499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24499");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 seconds", "                                                                            P-1Y11M30DT23H59M59.950S", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test24500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24500");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 318);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.318" + "'", str1, "0:00:00.318");
    }
}

