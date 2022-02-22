import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", "Y0M0DT0H0M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("  HI!  HI!  HI!  HI!  HI!  HI...", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("p0y0m0dt0h0m0.271s days");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.271s days" + "'", str1, "p0y0m0dt0h0m0.271s days");
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999", 608);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999");
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! hi!   hi! " + "'", str15, "hi! hi!   hi! ");
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("T 00 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                              0i!0i!0i!0i!0i!0i!0i!0i!0i!", "T0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 55, (long) 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.977S" + "'", str2, "P-1Y11M30DT23H59M59.977S");
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0");
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####" + "'", str1, "####");
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "28010.00000TD000Y0Ph", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("   Hi!Hi!hi!", 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   Hi!Hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "   Hi!Hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" 0 0.0 040  0 0 0  ", 28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 63, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################################" + "'", str3, "###############################################################");
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("p-1y11m30dt23h59m59.993s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("h", 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!" + "'", str1, "hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!");
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("P-1Y11M30DT23H59M59.999", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", "4444P0Y000DT00000.099104444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.999" + "'", str3, "P-1Y11M30DT23H59M59.999");
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's", "!i0", (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                            I:II:IIII32                                            ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                                                                  P0Y0M0DT0H0M0.030S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            I:II:IIII32                                            ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "                                            I:II:IIII32                                            ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        char[] charArray9 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!h", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                    S                                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(" S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   " + "'", str2, " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   ");
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iHhiHhiHhiHh" + "'", str2, "iHhiHhiHhiHh");
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("h0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 118, 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s###########i", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 50, (long) 14, "HI!  P-1Y11M30DT23H59M59.903S...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "743I!  P-1Y11-130DT2374359-159.9033599964...000000000000000000000000000000743I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I" + "'", str3, "743I!  P-1Y11-130DT2374359-159.9033599964...000000000000000000000000000000743I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I");
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0DAY88", 306, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0DAY88                                                                                                                                                                                                                                                                                                            " + "'", str3, "0DAY88                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                0", 110);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("P-1Y11M30DT23H59M59.809S", 98, 290);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.809S" + "'", str3, "P-1Y11M30DT23H59M59.809S");
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0:00:00.027");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0DAY88a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0 seconds", " DAYS                                                                                               ", 135);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0I!p000000t00000.099-10I!p000000t00000.099-1p000000t00000.099-1p000000t00000.09", "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  ", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "                                                                                              hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 27, "P-1Y11M30DT23H59M59.950S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", 90, "###################################################################################################################################################################################################################################################################################################################################################################################################0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!####################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str3, "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray17 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray17);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence6, charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                    ", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                      'p'yyyy'y'm'm'd'dt'h'", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P-1Y11M30DT23H59M59.935S", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                i!", strArray2, strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                i!" + "'", str6, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                i!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.013aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!Hi!hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.013aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.013aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaahi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi", 47, "0:00:00.100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaahi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi" + "'", str3, "aaaaaaaaaaaaaahi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi");
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("P0Y0M0DT0H0M0.271S", "                                                                                       0i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny(" ", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "           00noce0 0        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           00noce0 0        " + "'", str1, "           00noce0 0        ");
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("sdnoces", "0:00:00.033", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "4hi!444hi!4", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4hi!444hi!4" + "'", str3, "4hi!444hi!4");
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!" + "'", str1, "hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!");
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("P-1Y11M30DT23H59M59.950S", "D 0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("H         ", "hi!  hi!  hi!  hi!  hi!  hi..", "                     0 seconds                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H         " + "'", str3, "H         ");
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HHHHI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 96, "P0Y0M0DT0H0M0.037S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03796" + "'", str2, "P0Y000DT00000.03796");
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("iHhiHhiHhiHh", "P-1Y11M30DT23H59M59.923S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iHhiHhiHhiHh" + "'", str2, "iHhiHhiHhiHh");
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "hP0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "P0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD", (java.lang.CharSequence) "44 0a0                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD" + "'", charSequence2, "P0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD");
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI!44HI!44HI!44!HI!44HI!44HI!44H", "010.00:00:0", "P-1Y11M30DT23H59M59.935S");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000I!I!I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.097", 6, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.097" + "'", str3, "P0Y0M0DT0H0M0.097");
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, '4');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("P-1Y11M30DT23H59M59.930S", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("28010.00000TD000Y0PH", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("'p'YYYY'y'm'm'D'dt'h'                              ", "HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'p'YYYY'y'm'm'D'dt'h'                              " + "'", str2, "'p'YYYY'y'm'm'D'dt'h'                              ");
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "S0 S0 S0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "s0 S0 S0" + "'", str1, "s0 S0 S0");
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  P0Y0M0DT0H0M0.000S                ", "                                            0:00:00.032                                            ", "", 20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  P0Y0M0DT0H0M0.000S                " + "'", str4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  P0Y0M0DT0H0M0.000S                ");
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaa                                                                                              HI", "P0Y0M0DT0H0M0.289Si!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", (java.lang.CharSequence) "p00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", "                     0 seconds                      ", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "P yyyy Y        T H H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!i0", "                                                                                                                                           'P'yyyy'Y'M'M'd'DT'H'0 seconds                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i0" + "'", str2, "!i0");
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 34);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str1, "P0Y0M0DT0H0M0.034S");
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("P0Y0M0DT0H0M0.930S", "                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.930S" + "'", str2, "P0Y0M0DT0H0M0.930S");
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HI!HI! ", (-1), 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI! " + "'", str3, "HI!HI!HI! ");
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...                                                       hI!hI!h...hi!                          ...", 89);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "'M'M'd'DT'H'H'm'M's.S'S'Hi!#######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'M'M'd'DT'H'H'm'M's.S'S'Hi!#######################################################################" + "'", str1, "'M'M'd'DT'H'H'm'M's.S'S'Hi!#######################################################################");
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D", "P0Y000DT00000.0711", "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000H S0H S000H SH S0H S000H SH S0H S000H S000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444" + "'", str2, "0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAP0Y000DT00000.0459", "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAP0Y000DT00000.0459" + "'", str2, "AAP0Y000DT00000.0459");
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0i!44444I  I  I  I  I  I0i!44444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...", 135);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "i!Hi!H..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("P00-1Y11030DT23059059.964144");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P00-1Y11030DT23059059.964144" + "'", str1, "P00-1Y11030DT23059059.964144");
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "4444444444444444444444444444444444444444444444aahi!D");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444444444444444                    444444444444444444                    444444                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444                    444444444444444444                    444444                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS" + "'", str2, "444444444444444444                    444444444444444444                    444444                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("P0Y0M0DT0H0M0.093S", "00i!i!hi!", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "0         0         0         0         0         0         0         0         0                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444444444444444444                    444444444444444444                    444444                    Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H                                                     'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", "P-1Y11M30DT23H59M59.872S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444                    444444444444444444                    444444                    Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H                                                     'P'YYYY'Y'M'M'D'DT'H'0 SECONDS" + "'", str2, "444444444444444444                    444444444444444444                    444444                    Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H                                                     'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" HI!  HI.", "P-1Y11M30DT23H59M59.987S", 4);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 54);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.054" + "'", str1, "0:00:00.054");
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("P0Y000DT00000", "aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000" + "'", str2, "P0Y000DT00000");
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#############################################################################P0Y0M0DT0H0M0.100S", 41, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################################################P0Y0M0DT0H0M0.100S" + "'", str3, "#############################################################################P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HP-1Y11M30DT23H59M59.972SHh", "230.00:00:0", "00DNOCE 0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI!HI!HI!", "P-1Y11M30DT23H59M59.952S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("'44                                                                                                                ", "sdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 125, (long) 900);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.775S" + "'", str2, "P0Y0M0DT0H0M0.775S");
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Phh-1Y11M3hDT23H59M59M964S44", "P-1Y11M30DT23H59M59.950S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Phh-1Y11M3hDT23H59M59M964S44" + "'", str2, "Phh-1Y11M3hDT23H59M59M964S44");
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("P-1Y11");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11" + "'", str1, "P-1Y11");
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 10, "...I!  HI!  HI!  HI!  HI...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 5, "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0" + "'", str3, "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0");
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444444444444444444444444444444444444444444  hi!4444444444444444444444444444444444444444444444", "0 SECONDShi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 SECONDShi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!" + "'", str2, "0 SECONDShi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!");
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0         " + "'", str1, "0         ");
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "0:00:00.033");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", 930, "aaaa0:00:00.018");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:0" + "'", str3, "Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:00:00.018aaaa0:0");
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 612, "AAHI!P0000Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA0I!P0000Y000DT00000.99612" + "'", str2, "AA0I!P0000Y000DT00000.99612");
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces", "                                                                    S                                                                      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("HI!HI!HI!HI!HI!HI..P0Y0M0DT0H0M0.446S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  ", (java.lang.CharSequence) "                                                                       hi!hi!hi!                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 900);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                 ", 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032", 189);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032                                                                               " + "'", str2, "0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032                                                                               ");
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 seconds");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("P-1Y11", "hi!hi!hi!hi!hi!hi..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11" + "'", str2, "P-1Y11");
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!" + "'", str1, "hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!");
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("###############################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################################################################" + "'", str1, "###############################################################################################");
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                              P00-1                                                                                                                                               ", "  hi!  hi!  hi!  hi!  hi!  hi!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("syad 44", 97, 372);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("P-1Y11M30DT23H59M59.533S", "0:00:00.047");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.533S" + "'", str2, "P-1Y11M30DT23H59M59.533S");
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!0s 0s 00s 0s 00s 0s 00s 0s 00s " + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!0s 0s 00s 0s 00s 0s 00s 0s 00s ");
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                       0i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i!" + "'", str1, "0i!");
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("0 DAYS", "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 DAYS" + "'", str2, "0 DAYS");
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  P0Y0M0DT0H0M0.000S                ", (java.lang.CharSequence) "Hhhaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 611 + "'", int2 == 611);
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S ", (int) '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "iHhiHhiHhiHh", (java.lang.CharSequence) "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT", "HI!HI!HI!HI!HI!HI..P0Y0M0DT0H0M0.446S", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4444444444444444444444444444444444444444444444aahi!D");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P0Y0M0DT0H0M0.101S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) ".099SP0Y0M0DT0H0M0.099SP0Y0M0DT0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".099SP0Y0M0DT0H0M0.099SP0Y0M0DT0" + "'", str1, ".099SP0Y0M0DT0H0M0.099SP0Y0M0DT0");
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 115);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.115S" + "'", str1, "P0Y0M0DT0H0M0.115S");
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099", "#####################################################################################################################################################################################################################################################################aaP0Y000DT00000.0459", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("I!                                                                                       Hi!Hi!H...", "              44 days              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0i!hi!hi!hi!hi!hi!hi!hi!hi!h", "0         ", 9);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!", "hi!Hi!hi!Hi!Hi!Hi!hi!Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!" + "'", str2, "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aahi!P0000Y0-10DT07430-10.99359999144444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0:00:00.135", " days");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", 63, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str3, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("..", "230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.015S", 961, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.015S4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "P0Y0M0DT0H0M0.015S4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" SECONDS", 77, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " SECONDSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, " SECONDSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                        ...3H59M59.872S                                                                                        ", 476, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i" + "'", str1, "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i");
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4Y4M4D44H4M4.441Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "010.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAS H000S H0S HS H000S H0S HS H000S H0S H", "           00noce0 0        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!", "  hECON ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Y000DT00000.031", 28, 86);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Y000DT00000.031" + "'", str3, "Y000DT00000.031");
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                               0:00:00.032", 86, "DNOCES0             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                               0:00:00.032" + "'", str3, "                                                                               0:00:00.032");
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0:00:00.052", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:..." + "'", str2, "0:...");
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "         1010.00000TD000Y0p        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Hhhaaaaa", "4444444444444444444444444444444444444444444444aahi!D", "hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("'p'yyyy'y'm'm'd'dt'h'", 0, 289);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'p'yyyy'y'm'm'd'dt'h'" + "'", str3, "'p'yyyy'y'm'm'd'dt'h'");
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("P0Y0M0DT0H0M0.099S", 84, 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days", "hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("H P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S" + "'", str1, "H P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ihaa                                                                                             !i0!i0!i0!i0!i0!i0!i0!i0!i0", 42, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("000000000", "P0Y0M0DT0H0M0.041S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000000000" + "'", str2, "000000000");
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "P0Y0M0DT0H0M0.097");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("p0y0m0dt0h0m0.000s");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "P0Y0M");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", strArray3, strArray7);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459" + "'", str8, "0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "P0Y0M0DT0H0M0.372S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                       0i!", 476, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("P0Y0M0DT0H0M0.099S                                            I:II:IIII32                                            P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099S                                            I:II:IIII32                                            P0Y0M0DT0H0M0.099S", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y0  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "   HI!  HI!  HI!  HI!  HI!  HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   HI!  HI!  HI!  HI!  HI!  HI" + "'", str1, "   HI!  HI!  HI!  HI!  HI!  HI");
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaa", "h");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!", "aahi!P0000Y0M0DT0H0M0.99S", 90);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("h!ih!ih!ih!i  i!h!ih!ih!ih!i", strArray5, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h!ih!ih!ih!i  i!h!ih!ih!ih!i" + "'", str10, "h!ih!ih!ih!i  i!h!ih!ih!ih!i");
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray15 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                    ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0:00:00.087", charArray15);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!44I!44I!44I!44I!44I..");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! s0 s0 s0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!", "i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 608);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.608S" + "'", str1, "P0Y0M0DT0H0M0.608S");
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("h!ih!ih!ih!i  i!h!ih!ih!ih!i", "0i!44444I  I  I  I  I  I0i!44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" HI! HI! HI! HI! HI! HI! HI! HI!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099");
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0...", "S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("      0 seconds      ", 81, "'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!'y'm'm' 'dt'h'h'M'" + "'", str3, "      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!'y'm'm' 'dt'h'h'M'");
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!", "0:00:00.000");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (byte) 0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi! hi!   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "hi! hi!   hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!4440i!hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'SocesHIsdnocessdnocesHIsdnocessdnAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces", "hi!4hi!444hi HI!  HI..hi!4hi!444hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0 SECOND", (java.lang.CharSequence) "444                                                                                       Hi!444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 306, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("0", "P0Y0M0DT0H0M0.045S");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("P00-1", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("0 D0 D0 D0 D0 D0 P0000Y0M0DT0H0M0.010S44");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", strArray5, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!hi!", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str10, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sdnoces 0" + "'", str2, "sdnoces 0");
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "p0y0m0dt0h0m0.930s4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("  hi!  hi!  hi!  hi!  hi!  hi!  ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!  hi!  hi!  hi!  hi!  hi!  " + "'", str2, "  hi!  hi!  hi!  hi!  hi!  hi!  ");
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "p00-1y11-130dt2374359-159.9993599989000000000000000000000000000000444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("P0Y0M0DT0H0M0.002S", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                  P0Y0M0DT0H0M0.030S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("H         H         H         H         H         H         H         H         H         H         H aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "aahi!P0000Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H         H         H         H         H         H         H         H         H         H         H aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S" + "'", str2, "H         H         H         H         H         H         H         H         H         H         H aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", 101, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459" + "'", str3, "                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("-1Y11-130D", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1Y11-130D" + "'", str3, "-1Y11-130D");
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("8010.00000TD000Y0Ph", "hS H000S H0S HS H000S H0S HS H000S H0S Hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8010.00000TD000Y0P" + "'", str2, "8010.00000TD000Y0P");
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44 0a00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44 0a00" + "'", str1, "44 0a00");
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("p0y000dt00000.0991", "P-1Y11M30DT23H59M59.606S", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P-1Y11M30DTS0 S0 S0P-1Y11M30DT2", " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   ", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "8010.00000TD000Y0Ph", "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI", "H         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 84, "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.99" + "'", str3, "0:00:00.99");
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", 77, 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44" + "'", str1, "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44");
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "P0Y0M0DT0H0M0.097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!", 608, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("0a:a00a:a00a.a030");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0a:a00a:a00a.a03" + "'", str1, "0a:a00a:a00a.a03");
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.224", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hp0y0m0dt0h0m0.097s", "T 0 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224" + "'", str3, "::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224");
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.099S                                            I:II:IIII32                                            P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099S                                            I:II:IIII32                                            P0Y0M0DT0H0M0.099S", "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s###########i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1" + "'", str2, "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1");
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Sdnoces", 8, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'Sdnoces" + "'", str3, "'Sdnoces");
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0.018S", "                 S100.0M0H0TD0M0Y0P                 ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("00i!i!hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("'44                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'44" + "'", str1, "'44");
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("p-1y11m30dt23h59m59.808s", "0:...", 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s" + "'", str3, "p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s");
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!" + "'", str2, "                     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!");
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("P-1Y11M30DT23H59M59.711S", "P0Y0  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ", 135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0 D0 D0 D0 D0 D0 P0000Y0M0DT0H0M0.010S44", "########################################################################44444444444444444477777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!a", 495, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!..." + "'", str3, "...!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!...");
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!Hi!hi!Hi!Hi!Hi!hi!Hi!", 34, 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", "0:00:00.032");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                       P-1Y11M30DT23H59M59.999S");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                ", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 56");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 24, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!...", "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !" + "'", str3, "H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !");
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.001", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.020S", (int) (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.020S" + "'", str3, "P0Y0M0DT0H0M0.020S");
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("p0y0m0dt0h0m0.000s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.000s" + "'", str1, "p0y0m0dt0h0m0.000s");
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!" + "'", str2, "  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!");
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(10L, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!", "hi!0:00:00.008hi!0:00:00.008hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!");
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y0M0DT0H0M0.034S", 191);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("'Sdnoces", "P0Y0M0DT0H0M0.031S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'Sdnoces" + "'", str2, "'Sdnoces");
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("P0Y0M0DT0H0M0.015S", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("'                                            I:II:IIII32                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'                                            i:ii:iiii32                                           " + "'", str1, "'                                            i:ii:iiii32                                           ");
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####" + "'", str1, "####");
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 54, (long) 'a', "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 PYYYYY0MDDT0H0M43.S44" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 PYYYYY0MDDT0H0M43.S44");
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("P0Y0M0DT0H0M0.091S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.091S" + "'", str1, "P0Y0M0DT0H0M0.091S");
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0 second");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("S H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S..." + "'", str2, "S H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S...");
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAA                 P0Y0M0DT0H0M0.001S                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999", "  I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "I!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.013aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0 seconds", 125);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                          0 seconds                                                          " + "'", str2, "                                                          0 seconds                                                          ");
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097S", "P0Y0M0DT0H0M0.151S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 306, (long) 191, "P", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 81, ".099SP0Y0M0DT0H0M0.099SP0Y0M0DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".09981P0Y000DT00000.09981P0Y000DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, ".09981P0Y000DT00000.09981P0Y000DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) " 0 D ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aahi!p0000y0m0dt0h0m0.99s", "  I!", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYSAA44DAYSI!44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS" + "'", str1, "!44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYSAA44DAYSI!44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS");
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ", (int) '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               " + "'", str3, "                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ");
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaa", "00noce0 0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 days", "!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!i");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("'M'M'd'DT'H'H'm'M's.S'S'Hi!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "########################################################################44444444444444444477777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  ", "p00-1Y11M30DT23H59M59.964S44                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  " + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  ");
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ", 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                               'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ", 13, "!i0                                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                               'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                " + "'", str3, "                                                                                                                               'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ");
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 19, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("P0Y0M0DT0H0M0.065S", "0:00:00.007", 135);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str3, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("P-1Y11M30DT23H59M59.903S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S309.95M95H32TD03M11Y1-P" + "'", str1, "S309.95M95H32TD03M11Y1-P");
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("p0y0m0dt0h0m0.000s", "230.00:00:0                                                                               ", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 63, "P-1Y11M30DT23H59M59.606S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.606SP-1Y11M3" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.606SP-1Y11M3");
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        char[] charArray12 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0 DAYS", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                        hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 86, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 12, "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I000000000000000IIIIIIIIIIIIIII  hi!" + "'", str3, "I000000000000000IIIIIIIIIIIIIII  hi!");
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "!ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih", (java.lang.CharSequence) "230.00:00:0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih" + "'", charSequence2, "!ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih");
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("h P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S", "Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.01" + "'", str2, "h P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.01");
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0i0", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i0" + "'", str2, "0i0");
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0a:a00a:a00a.a030", "                           P-1Y11M30DT23H59M59.853S", "hi!                                                                                                hi! hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("P0Y0M0DT0H0M0.041S", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.041S" + "'", str2, "P0Y0M0DT0H0M0.041S");
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495", "                                                                                              aahi!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 280, "ppYpMpDTpHpMpTp96S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hhh", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11024");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                              1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "                                              1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444p0y000dt00000.099104444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y000DT00000.020134", "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 second");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("p0y0m0dt0h0m0.000s", 41, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########p0y0m0dt0h0m0.000s############" + "'", str3, "###########p0y0m0dt0h0m0.000s############");
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y000DT00000.0711", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 612 + "'", int1 == 612);
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" #0 days 0 hours 0 minutes 0 seconds ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#0 days 0 hours 0 minutes 0 seconds" + "'", str1, "#0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH" + "'", str1, "###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH");
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "P-1Y11M30:00:00.134DT23H59M59.999");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 PYYYYY0MDDT0H0M43.S44", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 PYYYYY0MDDT0H0M43.S44" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 PYYYYY0MDDT0H0M43.S44");
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P0Y000DT00000.0991", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0991" + "'", str2, "P0Y000DT00000.0991");
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444" + "'", str4, "4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0", "hi!4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("P0Y0M0DT0H0M0.271S", "hi! hi! hi! hi!hhhhi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0 days 0 hours 0 minutes 0 seconds", 495, "i!Hi!Hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 secondsi!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!H" + "'", str3, "0 days 0 hours 0 minutes 0 secondsi!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!H");
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                 'P'yyyy...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" SECONDSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444444  hi!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                ", "44 0a0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444" + "'", str1, "!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "P0Y0M0DT0H0M0.051S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!", 33, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!" + "'", str3, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!");
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("noce0  ", 6, 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000H S0H S000H SH S0H S000H SH S0H S000H S000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str2, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!h" + "'", str2, "!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y000DT00000.031151", "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("p-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051Sp-1yhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'                                       hI!hI!h...hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                     ", "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     " + "'", str2, "                                                     ");
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "hi!", (int) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444", strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "'m'm'D'dt'h'h'M'm'S.s's'hI!", (int) '4');
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("          Hi!                                                           hi!", strArray18);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("0S 0S 0", strArray18);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray27, strArray34);
        java.lang.String[] strArray36 = org.apache.commons.lang3.StringUtils.stripAll(strArray34);
        java.lang.String[] strArray38 = org.apache.commons.lang3.StringUtils.stripAll(strArray36, "hi!");
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray36, "hi!", (int) (byte) 100, 10);
        int int43 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray36);
        java.lang.String[] strArray45 = org.apache.commons.lang3.StringUtils.stripAll(strArray36, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        boolean boolean46 = org.apache.commons.lang3.StringUtils.endsWithAny("  hi!  hi!  hi!  hi!  hi!  hi...", strArray36);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray18, strArray36);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                             0 SECOND", strArray11, strArray18);
        java.lang.String[] strArray50 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.07");
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.replaceEach("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", strArray11, strArray50);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "                                                                                             0 SECOND" + "'", str48, "                                                                                             0 SECOND");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str51, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "###################################################################################################################################################################################################################################################################################################################################################################################################0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!####################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("00Y0M0DT0H0M0.001S 0Y0M0DT0H0M0.001Sseconds");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("   hI!hI!HI!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 7, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 13, "AAHI!p0000y0-10dt07430-10.99359999");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA0I!p000000-100t07430-10.99359999" + "'", str2, "AA0I!p000000-100t07430-10.99359999");
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) ' ', "4444P0Y000DT00000.099104444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444P0Y000DT00000.099104444" + "'", str3, "4444P0Y000DT00000.099104444");
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("#############################################################################P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################P0Y0M0DT0H0M0.100" + "'", str1, "#############################################################################P0Y0M0DT0H0M0.100");
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                       S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!ih...h!Ih!Ih                                       'H'TD'd'M'M'Y'yyyy'P'                                                                                                                      ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "aahi!", (int) (byte) 100);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("   Hi!Hi!hi!", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "P0Y0-10DT07430-10.1913599982", 89, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 89");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "P-1Y11M30DT23H59M59.123S'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S''P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("  hi!  hi!  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ", "   hI!hI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!  hi!  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  " + "'", str2, "  hi!  hi!  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ");
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray12);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 0econ00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray14);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!" + "'", str15, "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  " + "'", str2, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("i!hi!hi!hi!h!i  i!hi!hi!hi!h", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   i!hi!hi!hi!h!i  i!hi!hi!hi!h                                    " + "'", str2, "                                   i!hi!hi!hi!h!i  i!hi!hi!hi!h                                    ");
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "p0y0m0dt0h0m0.271s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.271s" + "'", str1, "p0y0m0dt0h0m0.271s");
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!i", (int) (byte) 100, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 101);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str1, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!44HI!44HI!44HI!44HI!44HI..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!0:00:00.008hi!0:00:00.008hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("0:00:00.090");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.090" + "'", str1, "0:00:00.090");
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("DNOCES0             ", "0:00:00.224");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DNOCES0             " + "'", str2, "DNOCES0             ");
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0SECONDP0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D", "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  320 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0SECONDP0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D" + "'", str2, "0SECONDP0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D");
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!HI!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! " + "'", str2, "p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0I!", "'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                    i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     ", 289, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "                    i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "  hECON ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y000000000000000000-1P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD", "              44 days              ", 32);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0days", "HI!HI!HI!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("  hi!", "hP0Y0M0DT0H0M0.010S", 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("P0Y0M0DT0H0M0.051S", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "  i!" + "'", str9, "  i!");
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAA0I0AAAAAAAAAAAAAAA", "P0Y0M0DT0H0M0.005S", 53);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!  hi!  hi!  hi!  hi!  hi..hi!", "hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi..hi!" + "'", str2, "hi!  hi!  hi!  hi!  hi!  hi..hi!");
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                            0:00:00.032                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("S001.0M0H0TD0M0Y0P                ", "0:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.224");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.224" + "'", str2, "0:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.224");
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0" + "'", str1, "422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0");
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hHH", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000", "000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", "AA0I!p000000-100t07430-10.99359999144444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000" + "'", str3, "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000");
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                  P0Y0M0DT0H0M0.030S", " #0 days 0 hours 0 minutes 0 seconds ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  P0Y0M0DT0H0M0.030S" + "'", str2, "                                                                                  P0Y0M0DT0H0M0.030S");
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ", "P0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("P0Y000DT00000.01010", 20, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!", "ppYpMpDTpHpMpTp96S", 372);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       T H H         ", " ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith(".HHH:HH:H", (java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:HT.HHH:HH:HH.HHH:HH:HH.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H" + "'", str4, ".HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:HT.HHH:HH:HH.HHH:HH:HH.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("S130.0M0H0TD0M0Y0P", "S910.0M0H0TD0M0Y0P");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 3, (long) 52, "                                       hI!hI!h...hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       hI!hI!h...hi!" + "'", str3, "                                       hI!hI!h...hi!");
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!44I!44I!44I!44I!44I..", 10, "              44 days              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!44I!44I!44I!44I!44I.." + "'", str3, "000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!44I!44I!44I!44I!44I..");
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !i", "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !i" + "'", str2, "ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !i");
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444" + "'", str1, "HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("        0:00:00.032        ", "Hi!Hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("'M'M'd'DT'H'H'm'M's.S'S'Hi!", 970);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               'M'M'd'DT'H'H'm'M's.S'S'Hi!" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               'M'M'd'DT'H'H'm'M's.S'S'Hi!");
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4!ih444!ih4!ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444", "444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0:00:00.100", "                                                                                                      AAHI!'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.100" + "'", str2, "0:00:00.100");
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", "0i0");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                 S100.0M0H0TD0M0Y0P                 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("P0Y0M0DT0H0M0.034S", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                      IH                                                                                              ", "aaaaaaaaaaaaaaaaaaaaaa        ", "                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      IH                                                                                              " + "'", str3, "                                      IH                                                                                              ");
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444" + "'", str3, "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099", "h                                                                                                                               P00-1Y11M30DT23H59M59.964S44                                                                                                                                0Y0M0DT0H0M0.010S", 612);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!i!i!" + "'", str4, "i!i!i!");
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "28010.00000TD000Y0Ph", 101, (int) (byte) 10);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "                                      P0Y0M0DT0H0M0.035S                                       ", 128);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str3, "P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0:00:00.033", 21, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "0:00:00.99");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 97, 97);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!" + "'", str8, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("::.99aaaaaaaaaaP-1Y11M30DT23H59M59.978S::.99aaaaaaaaaa", 280);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                 ::.99aaaaaaaaaaP-1Y11M30DT23H59M59.978S::.99aaaaaaaaaa                                                                                                                 " + "'", str2, "                                                                                                                 ::.99aaaaaaaaaaP-1Y11M30DT23H59M59.978S::.99aaaaaaaaaa                                                                                                                 ");
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P-1Y11M30DT23H59M59.110S", '#');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0D...                        ", "hi!", 4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str8, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!IH!IH!IH", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032                                                                               ", "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("a4hi!", "'                                            i:ii:iiii32                                           ", "  hi!hi!hi!#######################", 290);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a4hi!" + "'", str4, "a4hi!");
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        char[] charArray14 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("0 SECONDS", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi! hi!   hi!", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "           00noce0 0        ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0S0S0", "P0Y0M0DT0H0M0.101S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("P0Y000DT00000", "P0Y0M0DT0H0M0.110S", 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H     ", "P-1Y11M30DT23H59M59.935", "P0Y0M0DT0H0M0.033S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H     " + "'", str3, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H     ");
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aahi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M" + "'", str1, "AAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M");
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("p-1y11m30dt23h59m59.872s", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!", 930);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p-1y11m30dt23h59m59.872s" + "'", str3, "p-1y11m30dt23h59m59.872s");
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D", "##hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 " + "'", str1, "                                                                                                 ");
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                            I:II:IIII32                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("00Y0M0DT0H0M0.001S0Y0M0DT0H0M0.001Sseconds", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0:00:00.02", "AAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAA..." + "'", str2, "AAAAAAAAAAAAAAA...");
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...44444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 372, " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 3720 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, " 3720 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str1, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("P0Y0M0DT0H0M0.003S", "P-1Y11M30DT23H59M59.853S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H##  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0Y0M0DT0H0M0.99S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 97);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.097" + "'", str1, "0:00:00.097");
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("########################################################################44444444444444444477777777777777777777", "                                                Hi!                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################################44444444444444444477777777777777777777" + "'", str2, "########################################################################44444444444444444477777777777777777777");
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("00i!i!hi!", "                                                          0 seconds                                                          ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00i!i!hi!" + "'", str3, "00i!i!hi!");
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" P yyyy Y        T H H          ", "           00noce0 0        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ", "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("P0Y0M0DT0H0M0.930S", "'P'yyyy'Y'M'M'd'DT'H'                                       hI!hI!h...hi!", "                                        HI!  HI!  HI!  HI!  HI!  HI...                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 0 0 0  0 0 0.930S" + "'", str3, " 0 0 0  0 0 0.930S");
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0 ", 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0 " + "'", str2, "             0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0 ");
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0:0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444" + "'", str1, "0:0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "####M#DT#P#M#.##1S###M#DT#P#M#.##1SSECONDS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0                                               DAYS                                               ", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!hi!hi!h", "Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        char[] charArray11 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHI!p0000y0-10dt07430-10.99359999144444444", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("hi! hi! hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("        H", "444444444444444444                    444444444444444444                    444444                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.110S", 476);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.110S                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "P0Y0M0DT0H0M0.110S                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 0, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("S540.0M0H0TD0M0Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "P0Y0M0DT0H0M0.000S                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(".099-1hi!P0Y000DT00000.099-1", (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("  I!", " P yyyy Y        T H H          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0Y0M0DT0H0M0.99S" + "'", str1, "0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!P00-1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H..." + "'", str2, "H...");
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  ", (java.lang.CharSequence) "                                                                                                                      'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 174 + "'", int2 == 174);
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("230.00:00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "0i!P0Y000DT00000.099-1hi!P0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "230.00:00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str3, "230.00:00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "p0y0m0dt0h0m0.271s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("P00-1Y11030DT23059059.964144", "8639930noce86399 0", 197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "Hi!4hi!444hi!4", 961);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("S S hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045");
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                        ...3H59M59.872S                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                        ...3H59M59.872S                                                                                        " + "'", str1, "                                                                                        ...3H59M59.872S                                                                                        ");
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("P-1Y11M30DT23H59M59.999", "444444444HI!HI!HI!4444444444", 51, 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P-1Y11M30444444444HI!HI!HI!4444444444" + "'", str4, "P-1Y11M30444444444HI!HI!HI!4444444444");
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD", 189, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Aahi!P0000Y0-10DT07430-10.99359999144444444", "-1Y11M30DT23H59M59.964S44                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("SDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCES");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCES" + "'", str1, "SDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCES");
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.0450");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("aahi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                               hi! ", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", (int) '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "P0Y0M0DT0H0M0.015S4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 961, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "p      t h   .    ", "daysI!I!I!I!I!I!I!I!I!I!I!I!I...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi! ", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                    'P'yyyy'Y'M'M'd'DT'H'0 seconds", 3, 86);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("230.00:00:0                                                                               hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ", "   hI!hI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "230.00:00:0                                                                               hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    " + "'", str2, "230.00:00:0                                                                               hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ");
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!", strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 191, 91);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                               'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.606SP-1Y11M3", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 0econ00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0 0ECON00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0 0ECON00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!44HI!44HI!44!HI!44HI!44HI!44H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("00000000000000000000000000004444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", "P-1Y11M30DT23H59M59.935S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("S H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S H", 476);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa", "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0", 3, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "H S0H S000H SH S0H S000H SH##hi##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444                    444444444444444444                    444444                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", "", "I!I!I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444                    444444444444444444                    444444                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS" + "'", str3, "444444444444444444                    444444444444444444                    444444                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("01990.00000td000y0p", "   000000I!  I!  I!  I!  I!  I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "0i!");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray18);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray18);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("0 D0 D0 D0 hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SM'M'd'DT'H'H'm'M's.S'S'44", strArray18, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 6 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hhh" + "'", str19, "hhh");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaa##", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 9, "                                             Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             0i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              " + "'", str2, "                                             0i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ");
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h", "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray9, strArray16);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("hI!hI!h..", strArray3, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S");
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i...", "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "P0Y0M0DT0H0M0.051S##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-1" + "'", str1, "0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-1");
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ih !ih                                                                                                !ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                 'P'yyyy...", "440A00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", 42, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!" + "'", str3, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 82, (long) 96, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.013aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.013aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.013aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" 0 0 0  0 0 0.930S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 0 0  0 0 0.930S" + "'", str1, "0 0 0  0 0 0.930S");
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" DAYS", "h                                                                                                                          ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " DAYS" + "'", str2, " DAYS");
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi..." + "'", str2, "Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...");
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        char[] charArray12 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.000S", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihS200.0M0H0TD0M0Y0P!ihS200.0M0H0TD0M0Y0P!ih" + "'", str1, "!ihS200.0M0H0TD0M0Y0P!ihS200.0M0H0TD0M0Y0P!ih");
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(".099SP0Y0M0DT0H0M0.099SP0Y0M0DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "p0y0m0dt0h0m0.930s4444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032");
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "28010.00000TD000Y0Ph", 101, (int) (byte) 10);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("  hi!  hi!  hi!  hi!  hi!  hi!  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

