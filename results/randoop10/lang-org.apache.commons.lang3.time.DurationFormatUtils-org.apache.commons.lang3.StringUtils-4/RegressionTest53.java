import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest53 {

    public static boolean debug = false;

    @Test
    public void test26501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26501");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...44444444444444444444444444444444AAHI!4444444444444444444444444444444444444444444444", "0:00:00.900");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ia!aHia!aHa..", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ia!aHia!aHa.." + "'", str2, "ia!aHia!aHa..");
    }

    @Test
    public void test26503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("P0Y0M0DT0H0M0.011S", "P0Y0  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test26504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26504");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("00DT00000.03477", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s" + "'", str4, "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test26505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444" + "'", str1, "hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444");
    }

    @Test
    public void test26506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26506");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26508");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(":00:00.09", "AAAAAAAAAAAAAAAAAA", 417);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi" + "'", str1, "i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi");
    }

    @Test
    public void test26510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("H", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    H                                    " + "'", str2, "                                    H                                    ");
    }

    @Test
    public void test26511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26511");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0H0M0.002Shi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26512");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "'m'm'D'dt'h'h'M'm'S.s's'hI!", (int) '4');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("          Hi!                                                           hi!", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test26513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26513");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0414 0 0  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0 0 0  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0 0 0  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ihDT00000.086414", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                       P-1Y11030DT23059059.99944444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26514");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "s870.0m0h0td0m0y0p");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "h!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0 0S 0S", "###############################################################", "P0Y0M0DT0H0M0.052S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0S 0S" + "'", str3, "0 0S 0S");
    }

    @Test
    public void test26517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26518");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0:00:00.139hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26520");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("              44 0a00              ", "P-1Y11M30DT23H59M59.809");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26521");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi!Hi!H.", " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26522");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 159);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.159" + "'", str1, "0:00:00.159");
    }

    @Test
    public void test26523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26523");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  HI!  HI!  HI!  HI!  HI!  HI..", "0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444", 10);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("p0Y000DT00000.01010", "P0Y0M0DT0H0M0.031S", 79);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("0:00:00.090", strArray5, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                                                                                                                                       1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                       ", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.090" + "'", str10, "0:00:00.090");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test26524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26524");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaa", "..                                                                                    HI!...", 289, 46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 day..                                                                                    HI!..." + "'", str4, "0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 day..                                                                                    HI!...");
    }

    @Test
    public void test26525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("0:00:00.306", "0:00:00.280");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26526");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-1", "P00-1Y11M30DT23H59M59.964S44", 27);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa", strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-1" + "'", str6, "0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test26527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26527");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("DNOCES0             ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26528");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("   P-1Y11M30DT23H59M59.989S    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("00Y0M0DT0H0M0.001S0Y0M0DT0H0M0.001Sseconds");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00Y0M0DT0H0M0.001S0Y0M0DT0H0M0.001Sseconds" + "'", str1, "00Y0M0DT0H0M0.001S0Y0M0DT0H0M0.001Sseconds");
    }

    @Test
    public void test26530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26530");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("::.99", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test26531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                         P0Y0M0DT0H0M0.019S", "P0Y0M0DT0H0M0.104S", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaa0I!p000000t00000.099-10I!p000000t00000.099-1p000000t00000.099-1p000000t00000.09");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         ....a.aa.a.a.a.a9a" + "'", str3, "                         ....a.aa.a.a.a.a9a");
    }

    @Test
    public void test26532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26532");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hi!hi..", "         1010.00000TD000Y0p        ", 33);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "-00P", 77, 44);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test26533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26533");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00: 00: 00:00: 00: 00:00: 00: 00:", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00: 00: 00:00: 00: 00:00: 00: 00:" + "'", str3, "00: 00: 00:00: 00: 00:00: 00: 00:");
    }

    @Test
    public void test26534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26534");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                            Y0M0DT0H0                                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 0econ00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 102);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih" + "'", str1, "!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih...!i  Y0P!ihS200.0M0H0TD0M0Y0P!ih");
    }

    @Test
    public void test26536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26536");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 second", "HI! ###############################################################  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ...#######################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26537");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "0:00:00.99");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 97, 97);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh", strArray3);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "               P0Y0M0DT0H0M0.395S               ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test26538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26540");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'Sdnoce", "0:...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(".099sp0y0m0dt0h0m0.099sp0y0m0dt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "                                                                               P0Y000DT00000.09910");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".099sp0y0m0dt0h0m0.099sp0y0m0dt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, ".099sp0y0m0dt0h0m0.099sp0y0m0dt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test26542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26542");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.009S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26543");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0.414S");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.414S" + "'", str2, "P0Y0M0DT0H0M0.414S");
    }

    @Test
    public void test26544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26544");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                             ", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                        P0Y0M0DT0H0M0.100S         ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test26545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI", "                                                                                                AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI" + "'", str2, "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI");
    }

    @Test
    public void test26546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26546");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "", 435);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26547");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 955, "############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!############i!0000000000000000000");
    }

    @Test
    public void test26548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26548");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) ".                                      hi!hi!hi!", (java.lang.CharSequence) "3H59M59.999S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                 P-1Y11M30DT23H59M59.926S                                                                                                                                                                                                                                                                                                                                                                                                                  ", 288, 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26550");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!44HI!44HI!44!HI!44HI!44HI!44H", "                                                                                                  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26551");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) " SAAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M", (java.lang.CharSequence) "0:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!" + "'", str1, "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
    }

    @Test
    public void test26553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26553");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1", " hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hhi!hi!hi      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   h", 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                     H                              ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                      IH                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     H                              " + "'", str3, "                     H                              ");
    }

    @Test
    public void test26555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26555");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 591, "I! HI! HI! HI! HI! HI! HI! HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I! 0000000I! I! I! I! I! I! I" + "'", str3, "I! 0000000I! I! I! I! I! I! I");
    }

    @Test
    public void test26556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("p0y0m0dt0h0m0.062s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.062s" + "'", str1, "p0y0m0dt0h0m0.062s");
    }

    @Test
    public void test26557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26557");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ..");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 114 + "'", int1 == 114);
    }

    @Test
    public void test26558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26558");
        char[] charArray15 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!P0000Y0-10DT07430-10.99359999", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0:00:00.290", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "00noce00", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test26559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("#############################################################################P0Y000DT00000.100115");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################P0Y000DT00000.100115" + "'", str1, "#############################################################################P0Y000DT00000.100115");
    }

    @Test
    public void test26560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                       Hi!               P0Y000DT00000.065100", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.065100 Hi!" + "'", str2, "P0Y000DT00000.065100 Hi!");
    }

    @Test
    public void test26561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26561");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "######p00-1");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "######p00-1" + "'", charSequence2, "######p00-1");
    }

    @Test
    public void test26562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                           'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44                                                                                                                            ", 277);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                           'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44                                                                                                                            " + "'", str2, "                                                                                                                           'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44                                                                                                                            ");
    }

    @Test
    public void test26563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("P-1Y11M30DT23H59M59.977S                       ", 190);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.977S                       " + "'", str2, "P-1Y11M30DT23H59M59.977S                       ");
    }

    @Test
    public void test26564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0a00I!I!I!I!I!I!I!I!I!I!I!I!I...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0A00i!i!i!i!i!i!i!i!i!i!i!i!i..." + "'", str1, "0A00i!i!i!i!i!i!i!i!i!i!i!i!i...");
    }

    @Test
    public void test26565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26565");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P-1Y11M30DT23H59M59.983S");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 seconds                                           ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26566");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...aaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP...", "            Hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26568");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44 0a00", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ###############################################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26569");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("-00P", 906);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("   P yyyy Y        T H H          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P yyyy Y        T H H" + "'", str1, "P yyyy Y        T H H");
    }

    @Test
    public void test26571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.000", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##hi!", "0 seconds");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("P0Y0M0DT0H0M0.045S", strArray3, strArray6);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.045S" + "'", str8, "P0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test26572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26572");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("00: 00: 0I! HI!   HI!HI!  HI!  HI!  ", "0I!0I!0I!0I!0I!0I!0I!0I!0I! AAHI", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26573");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                              1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                              1AA P yyyy Y        T H H         0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaa0I!p0y000dt00000.099-1HI!p0", "44days");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" HI! HI! HI! HI! HI! HI! HI! HI", 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                       HI! HI! HI! HI! HI! HI! HI! HI" + "'", str2, "                                                                       HI! HI! HI! HI! HI! HI! HI! HI");
    }

    @Test
    public void test26575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26575");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                            44S37.0M0H0TD0M0Y0000P                                                                                                                               ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("P0Y0M0DT0H0M0.834S", "P0Y0M0DT0HHP-1Y11M30DT23H59M59.972SHh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAA0:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("'p'YYYY'y'm'm'D'dt'h'", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      'p'YYYY'y'm'm'D'dt'h'" + "'", str2, "                                                      'p'YYYY'y'm'm'D'dt'h'");
    }

    @Test
    public void test26579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26579");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                       1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26580");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa", "P0Y0M0DT0H0M0.080S");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0 days", 205);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 days" + "'", str2, "0 days");
    }

    @Test
    public void test26582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26582");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("sdnoces", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("0:00:00.2054", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test26583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(":00:00.139                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "                                                                                                      AAHI!'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":00:00.139                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, ":00:00.139                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test26584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26584");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("p00-1y11-130dt2374359-159.999359998900000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26585");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "S00S0S00S0S00S01010.00000TD000Y0paaaaaaaaaaaaaaa", (java.lang.CharSequence) "0 days");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "S00S0S00S0S00S01010.00000TD000Y0paaaaaaaaaaaaaaa" + "'", charSequence2, "S00S0S00S0S00S01010.00000TD000Y0paaaaaaaaaaaaaaa");
    }

    @Test
    public void test26586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26586");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("'P'yyyy'Y'M'M'd'DT'H'0 seconds", "4444444444444444444444444444444444444444444444A44444444444444444444444444444444444444444444440000i4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444i4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444i4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444i4444444444444444444444444444444444444444444444A444444444444444444444444444444444444444608401.00000td000y0p");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("p0y0m0dt0h0m0.271s days", 197, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26588");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 958, (long) 190, "44 0a0                                                                                     ...", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26589");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  HI!  HI!  HI!  HI!  HI!  HI...", "4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1", 191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26590");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26591");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi! hi! hi! hi!hhhhi! hi! hi! hi!aA", "-1Y11M30DT23H59M59.964S44                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("p YYYY y        t      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!'y'm'm' 'dt'h'h'M'      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!", "#########0M0.001S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26593");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 6, "P0Y0M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0456444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "P0Y000DT00000.0456444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("H         H         H         H         H         H         H         H         H         H         H aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P0Y0M0DT0H0M0.099S" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test26595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!p0y0m0dt0h0m0.099shi!p0y0m0dt0h0m0.099sp0y0m0dt0h0m0.099sp0y0m0dt0h0m0.099shi!p0y0m0dt0h0m0.099s" + "'", str1, "hi!p0y0m0dt0h0m0.099shi!p0y0m0dt0h0m0.099sp0y0m0dt0h0m0.099sp0y0m0dt0h0m0.099shi!p0y0m0dt0h0m0.099s");
    }

    @Test
    public void test26596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26596");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    ", 138);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("P0Y0M0DT0H0M0.033S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.033S" + "'", str1, "P0Y0M0DT0H0M0.033S");
    }

    @Test
    public void test26598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26598");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! s0 s0 s0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               p0Y000DT00000.0101", 281);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("i!I!I!I!I!I", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! s0 s0 s0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!" + "'", str5, "hI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! s0 s0 s0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
    }

    @Test
    public void test26599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26599");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0:00:00.031");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.495S", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.495S" + "'", str2, "P0Y0M0DT0H0M0.495S");
    }

    @Test
    public void test26601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26601");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 142, (long) 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.885S" + "'", str2, "P-1Y11M30DT23H59M59.885S");
    }

    @Test
    public void test26602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26602");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hI!", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, " 0 d ");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("  i!i!hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hI!" + "'", str5, "hI!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test26603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26603");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("00 D00 D00 D00 D00 D00 D00 D004444444444444444444444444444400 D00 D00 D00 D00 D00 D00 D00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00 D00 D00 D00 D00 D00 D00 D004444444444444444444444444444400 D00 D00 D00 D00 D00 D00 D00" + "'", str1, "00 D00 D00 D00 D00 D00 D00 D004444444444444444444444444444400 D00 D00 D00 D00 D00 D00 D00");
    }

    @Test
    public void test26604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26604");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("h h   h ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26605");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa:");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("0:00:00.092", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test26606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26606");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "t 00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test26607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26608");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s44", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26609");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", (int) (byte) 1, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26610");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("S910.0M0H0TD0M0Y0P");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26611");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aahi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M", "HI!4HI!444HI!4HI!4HI!444HI!4HI!4HI!4440I!HI!4HI!444HI!4HI!4HI!444HI!4HI!4HI!444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("P-1Y11030DT23059059.9839     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11030DT23059059.9839" + "'", str1, "P-1Y11030DT23059059.9839");
    }

    @Test
    public void test26613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAHI!p0000y0-10dt07430-10.99359999144444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "S260.0M0H0TD0M0Y0P");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI!p0000y0-10dt07430-10.99359999144444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "AAHI!p0000y0-10dt07430-10.99359999144444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aahi!P0000Y0M0DT0H0M0.99S", "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! s0 s0 s0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!P0000Y0M0DT0H0M0.99S" + "'", str2, "aahi!P0000Y0M0DT0H0M0.99S");
    }

    @Test
    public void test26615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26615");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("S001.0M0H0TD0M0Y0P#############################################################################", 299, 191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26616");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", (java.lang.CharSequence) "P-1Y11M30DT23H59M59.819S");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'0 SECONDS" + "'", charSequence2, "                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
    }

    @Test
    public void test26617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26617");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999", "AA!IH !IH                                                                                                !IH                                                                             HI!                                                                                                HI! HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP0Y0M0DT0H0M0.045S", 16);
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0", strArray4, strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0" + "'", str6, "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0");
    }

    @Test
    public void test26618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26618");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!  hi!  hi!  hi!  hi!  hi...", 30, 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Hi!Hi!H...", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!H..." + "'", str2, "Hi!Hi!H...");
    }

    @Test
    public void test26621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26622");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("hi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi!aAhi! hi! hi! hi!hhhhi! hi! hi! hi'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test26623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "AAAAAAAAAASYAD 0AAAAHHHAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD 0AAAAHHHAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26624");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("000000000000I!  I!  I!  I!  I!  I..I!I!...I I!I!", "HI!4HI!444HI!4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" 0000000000000000000-16165675740 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1 0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaa", 492);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1 0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1 0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26626");
        char[] charArray9 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P-1Y11M30DT23H59M59.923S", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test26627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26627");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "p YYYY y      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26628");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI", "Hi!Hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26629");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaa0:00:00.007", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26630");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) " DAYS                                                                                                DAYS                                                                                                DAYS                                                                            p0y0m0dt0h0m0.024s", (java.lang.CharSequence) "0:00:00.032");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26631");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "##hi", (java.lang.CharSequence) "p0y0m0dt0h0m0.065s");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test26632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26632");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("P0Y0M0DT00M0.051S", 121, "0:00:00.110");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.1100:00:00.1100:00:00.1100:00:00.1100:00:00.1100:00:00.1100:00:00.1100:00:00.1100:00:00.1100:00:P0Y0M0DT00M0.051S" + "'", str3, "0:00:00.1100:00:00.1100:00:00.1100:00:00.1100:00:00.1100:00:00.1100:00:00.1100:00:00.1100:00:00.1100:00:P0Y0M0DT00M0.051S");
    }

    @Test
    public void test26633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26633");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26634");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "P-1Y11M30DT23H59M59.932S", 58);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test26635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                               ::.99                                                                               ::.99                                                                               ::.99                                                                               ::.99                                                                               ::.99                                                                               ::.99                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26636");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("I!00000000000000000000000000000743I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!00000000000000000000000000000743I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I" + "'", str1, "I!00000000000000000000000000000743I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
    }

    @Test
    public void test26637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26637");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "aahi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test26638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26638");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26639");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaHi!Hi!H...", "0:00:00.028", 17);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 336, 87);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaHi!Hi!H" + "'", str4, "aaaaaaaaaaHi!Hi!H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test26640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26640");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0-10DT07430-10.1913599982");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("0 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s44", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("P-1Y11M30DT23", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test26641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26641");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!i       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       i!" + "'", str1, "       i!");
    }

    @Test
    public void test26642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26642");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26643");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "'                                            I:II:IIII32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("i!0i!i!i!i!i!i!i!i!i!", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  i!0i!i!i!i!i!i!i!i!i!" + "'", str2, "                                                                  i!0i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test26645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26645");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0T- H  M30.9 0  0  0T- H  M30.92", "'P'yyyy'Y'M'M'd'DT'H'0 seconds", 85);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26646");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "AAHI!p0000y0-10dt07430-10.99359999144444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 105);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test26648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26648");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 138, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test26649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26649");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("1-00P                       ", 51, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########1-00P                       ############" + "'", str3, "###########1-00P                       ############");
    }

    @Test
    public void test26650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#################################0:00:00.289##################################", "aaaaaaaaaaaaaaaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################0:00:00.289##################################" + "'", str2, "#################################0:00:00.289##################################");
    }

    @Test
    public void test26651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26651");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0a:a00a:a00a                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                             P-1Y11M30DT23H59M59.991S                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                              ", "p-1y11m30dt23h59m59.983s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("   HI!  HI!  HI!  HI!  HI!  HI...", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI..." + "'", str2, "HI!  HI!  HI!  HI!  HI!  HI...");
    }

    @Test
    public void test26653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26653");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days", "HI!                                                                                       HI!HI!H...HI!                 i!Hi!H..", 903);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI", 521, 906);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26655");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "... HI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("###########1-00P                       ############", "              syad 44              ", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########1-00P                       ############" + "'", str3, "###########1-00P                       ############");
    }

    @Test
    public void test26657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26657");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444  hi!444444444444444", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P-1Y11M30DT23H59M59.809S", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P0Y000DT00000P0Y000DT00000PP-1Y11M30DT23H59M59.987SP0Y000DT00000P0Y000DT00000P", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                            44 days                                                             ", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 17 + "'", int23 == 17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test26658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26658");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("P0Y000DT00000.0456444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26659");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26660");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aahi!", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("S00S0S00S0S00S01010.00000TD000Y0paaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S00S0S00S0S00S01010.00000TD000Y0paaaaaaaaaaaaaaa" + "'", str1, "S00S0S00S0S00S01010.00000TD000Y0paaaaaaaaaaaaaaa");
    }

    @Test
    public void test26662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26662");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Y0M0DT0H0M");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("...                  8010.00000TD000Y0P...                   ", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Y0M0DT0H0M" + "'", str3, "Y0M0DT0H0M");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Y0M0DT0H0M" + "'", str4, "Y0M0DT0H0M");
    }

    @Test
    public void test26663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("P0Y0M0DT0H0M0.930S", "P yyyy Y        T H H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.930S" + "'", str2, "P0Y0M0DT0H0M0.930S");
    }

    @Test
    public void test26664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26664");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0:00:00.848");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.848" + "'", str1, "0:00:00.848");
    }

    @Test
    public void test26665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26665");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  ###############################################################################################", "p00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("sdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces", 128, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces" + "'", str3, "sdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces");
    }

    @Test
    public void test26667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26667");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", 492, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
    }

    @Test
    public void test26668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26668");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "aaaaaaaaaaaaaahi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26669");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 487);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.487" + "'", str1, "0:00:00.487");
    }

    @Test
    public void test26670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P-1Y11M30DT23H59M59.952S", "        p0Y000DT00000.0101         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26671");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 591, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test26672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26672");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "Y0M0DT0H0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "y0M0DT0H0" + "'", str1, "y0M0DT0H0");
    }

    @Test
    public void test26673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26673");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("p00-1y11-130dt2374359-159.999359998900000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", "i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi", 476);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 970, 572);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test26674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26674");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0                                               DAYS                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0                                               days                                               " + "'", str1, "y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0dt0h0m0.097p0y0m0                                               days                                               ");
    }

    @Test
    public void test26675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26675");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("P0Y0M0DT0H0M0.080S..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.", "P0Y0M0DT0H0M0.323S", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test26676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "                                                                                                                                           ", "!i0!i0!i0!i0!i0!i0!i0!i0 680.00:00:0!I!I!I347");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str3, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test26677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("   I!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   I!    " + "'", str1, "   I!    ");
    }

    @Test
    public void test26678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                        4444444444444444444444444444                       4444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "P0Y0M0DT0H0M0.244S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.244S" + "'", str1, "P0Y0M0DT0H0M0.244S");
    }

    @Test
    public void test26680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26680");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                     0 seconds                      ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                              P0Y0M0DT0H0M0.009S", strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test26681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "   H  H     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   H  H     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "   H  H     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "444!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str2, "3I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test26683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "S910.0M0...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str2, "i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test26684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("p0Y0M0DT0H0M0.289P0Y0M0DT0H0M0.09744444444444444444", "HI! Hi!Hi!H...HI! H                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0Y0M0DT0H0M0.289P0Y0M0DT0H0M0.09744444444444444444" + "'", str2, "p0Y0M0DT0H0M0.289P0Y0M0DT0H0M0.09744444444444444444");
    }

    @Test
    public void test26685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26685");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("PYYYYY0MDDT00 SECONDS", 224, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "yyyy'Y'M'M");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26687");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444", "00.0040000", 2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26688");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("P-1Y11M30DT23H59M59.973S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.973S" + "'", str1, "P-1Y11M30DT23H59M59.973S");
    }

    @Test
    public void test26689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26689");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0:00:00.061", "D 0", 61, 970);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.061D 0" + "'", str4, "0:00:00.061D 0");
    }

    @Test
    public void test26690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                       Hi!               P0Y000DT00000.065100", 46, "P0Y0M0DT0H0M0.281S4P41-004Y44114034DT44324954114411795444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                       Hi!               P0Y000DT00000.065100" + "'", str3, "                                                                                       Hi!               P0Y000DT00000.065100");
    }

    @Test
    public void test26691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26691");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0DAY88a", "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26692");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("############T 0############", "H!IH!IH P0Y0M0DT0H0M0.086S", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26693");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aahi!", (int) (byte) 10, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("hi!", 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", strArray3, strArray12);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach(":00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032", strArray3, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aahi!" + "'", str9, "aahi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str14, "hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test26694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("D 0", 111);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "D 0" + "'", str2, "D 0");
    }

    @Test
    public void test26695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26695");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI! ###############################################################  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ...#######################", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI! ###############################################################  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ...#######################" + "'", str3, "HI! ###############################################################  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ...#######################");
    }

    @Test
    public void test26696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26696");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                         aaaaaaaaaaaaaaaaaaa", 0, "44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                         aaaaaaaaaaaaaaaaaaa" + "'", str3, "                                                                                         aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26697");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray17 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray17);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence6, charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "P", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0D...", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("P-1Y11M30DT23H59M59.903S", charArray17);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1Y11M30DT23H59M59.853SIH                                                                                              ", charArray17);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 25 + "'", int28 == 25);
    }

    @Test
    public void test26698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                            I:II:IIII32                                            ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "P-1Y11M30DT23H59M59.730S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            I:II:IIII32                                            ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "                                            I:II:IIII32                                            ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test26699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26699");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0 D0 D0 D0 D0 D0 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("I!                                                                                       Hi!Hi!H...", "                                                                                                                                                                                       P0Y   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!                                                                                       Hi!Hi!H..." + "'", str2, "I!                                                                                       Hi!Hi!H...");
    }

    @Test
    public void test26701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaahi!444444444444444444444444444444444444444444...", "hi!4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahi!444444444444444444444444444444444444444444..." + "'", str2, "aaahi!444444444444444444444444444444444444444444...");
    }

    @Test
    public void test26702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26702");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "p0Y0M0DT0H0M0.289Si!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26703");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0...3h59059.8720 ...3h59059.8720seconds");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test26704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P0Y0M0DT0H0M0.099S", "4444444444444444444444444444444444444444444444A44444444444444444444444444444444444444444444440000i4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444i4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444i4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444i4444444444444444444444444444444444444444444444A444444444444444444444444444444444444444608401.00000td000y0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26705");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("h         H         H         H         H         H         H         H         H         H         H aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H         h         h         h         h         h         h         h         h         h         h AAHI!'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's" + "'", str1, "H         h         h         h         h         h         h         h         h         h         h AAHI!'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's");
    }

    @Test
    public void test26706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26706");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0:00:00.097");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.097" + "'", str1, "0:00:00.097");
    }

    @Test
    public void test26707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26707");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("##i!hi!hi!hi!hi!hi!", "HP0Y000DT00000.01010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26708");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "P", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0D...", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "           ", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "I! HI! HI! HI! HI! HI! HI! HI", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test26709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26709");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "hP00-1Y11030DT23059059.999480000000...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26710");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "hi!", 2);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test26711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26711");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                           aahi!p    y m dt h m    s", "!i       #######################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26712");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!", "0:00:00.531");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26714");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("##", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444'4'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26715");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", "p0y0m0dt0h0m0.062s", 120);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26716");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("       a0Y0M0DT0H0M0.001Sa       ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26717");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '#');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!HI!", strArray4);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray10, strArray17);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray17);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("P-1Y11M30DT23H59M59.711S", strArray4, strArray19);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, "P-1Y11M30DT23H59M59.826S", 903, 224);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!" + "'", str21, "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P-1Y11M30DT23H59M59.711S" + "'", str22, "P-1Y11M30DT23H59M59.711S");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test26718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26718");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26719");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                 P0Y0-10DT07430-10.0013599969                 ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaS910.0M0H0TD0M0Y0P                                                             ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test26720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "P-1Y11030DT23059059.990");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26721");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444444444444444444444A4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444a4444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444a4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26722");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26723");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4", "HHHHHHH####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26724");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test26725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26725");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("h!ih!ih!ih!i  i!h!ih!ih!ih!i", 6, 182);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26726");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "P0Y0M0DT0H0M0.200S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26727");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("p0Y0M0DT0H0M0.904S", 274, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0Y0M0DT0H0M0.904S" + "'", str3, "p0Y0M0DT0H0M0.904S");
    }

    @Test
    public void test26728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test26729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26729");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26730");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 secondsi!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26731");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0 days", "0i0", 33);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith(" #0 days 0 hours 0 minutes 0 seconds ", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 days" + "'", str7, "0 days");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0 days" + "'", str8, "0 days");
    }

    @Test
    public void test26732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26732");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("IH                            4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444!ih", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH                            4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444!ih" + "'", str3, "IH                            4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444!ih");
    }

    @Test
    public void test26733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26733");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("       4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4Y4M4D44H4M4.441Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4Y4M4D44H4M4.441Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4Y4M4D44H4M4.441Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26734");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 48, (long) 0, "P0Y0M0DT0H0M0.548S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10.5483599952" + "'", str3, "P0Y0-10DT07430-10.5483599952");
    }

    @Test
    public void test26735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26735");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 PYYYYY0MDDT0H0M43.S44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PYYYYY0MDDT0H0M43.S44" + "'", str1, "PYYYYY0MDDT0H0M43.S44");
    }

    @Test
    public void test26736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                   P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                        aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                        aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa" + "'", str2, "                   P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                        aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26737");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aAAAAAAAAAAAAAAAAAAAHI!", 336, 274);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26738");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 612 + "'", int1 == 612);
    }

    @Test
    public void test26739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26739");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("I!i!i!", "SShi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!  hi!  hP'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  hi!  hP'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'D" + "'", str2, "hi!  hi!  hP'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'D");
    }

    @Test
    public void test26741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26741");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  HI!  HI!  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  ", "a");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "p0y0m0dt0h0m0.100s");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test26742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26742");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("      0 SECONDS      ", "", 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26743");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("   I   I   I   I   I   I  I  I  I   I   I   I   I   I   I   I   I   I   I   I ", "0 0.0 040  0 0 0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26744");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.224", "P-1Y11M30444444444HI!HI!HI!4444444444P-1Y11M30444444444HI!HI!HI!4444444444P-1Y11M30444444444HI!HI!HI!4444444444P-1Y11M30444444444HI!HI!HI!4444444444P-1Y11M30444444444HI!HI!HI!4444444444P-1Y11M30444444444HI!HI!HI!4444444444P-1Y11M30444444444HI!HI!HI!4444444444P-1Y11M30444444444HI!HI!HI!4444444444P-1Y11M30444444444HI!HI!HI!4444444444P-1Y11M30444444444HI!HI!HI!4444444444P-1Y11M30444444444HI!HI!HI!4444444444P-1Y11M30444444444HI!HI!HI!4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26745");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0Y0M0DT0H0M0.99S", "Hi!Hi!H.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                    aaaaaaaaaP-1Y11M30DT23H59M59.935", "                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    aaaaaaaaaP-1Y11M30DT23H59M59.935" + "'", str2, "                                                                    aaaaaaaaaP-1Y11M30DT23H59M59.935");
    }

    @Test
    public void test26747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26747");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0T- H  M30.9 0  0  0T- H  M30.92", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("P-1Y11M30DT23H59M59.809", "#################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.809" + "'", str2, "P-1Y11M30DT23H59M59.809");
    }

    @Test
    public void test26749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26749");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "::.99");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495", 567, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                     hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495                                                                                                                                                                                                                                     " + "'", str3, "                                                                                                                                                                                                                                     hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test26751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaa", 40, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaa                      " + "'", str3, "aaaaaaaaaaaaaaaaaa                      ");
    }

    @Test
    public void test26752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!P0Y0M0DT0H0M0.139Shi!P0Y0M0DT0H0M0.139SP0Y0M0DT0H0M0.139SP0Y0M0DT0H0M0.139Shi!P0Y0M0DT0H0M0.139S", "!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", 138);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!P0Y0M0DT0H0M0.139Shi!P0Y0M0DT0H0M0.139SP0Y0M0DT0H0M0.139SP0Y0M0DT0H0M0.139Shi!P0Y0M0DT0H0M0.139S" + "'", str3, "hi!P0Y0M0DT0H0M0.139Shi!P0Y0M0DT0H0M0.139SP0Y0M0DT0H0M0.139SP0Y0M0DT0H0M0.139Shi!P0Y0M0DT0H0M0.139S");
    }

    @Test
    public void test26753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("-1Y11M30DT23H59M59.964S44", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1Y11M30DT23H59M59.96#S##" + "'", str3, "-1Y11M30DT23H59M59.96#S##");
    }

    @Test
    public void test26754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                      ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      " + "'", str2, "                                      ");
    }

    @Test
    public void test26755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26755");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P0Y0M0DT0H0M0.051S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26756");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#####T 00", 197);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####T 00                                                                                                                                                                                            " + "'", str2, "#####T 00                                                                                                                                                                                            ");
    }

    @Test
    public void test26758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444444a44444444444444444444444444444444444444444444440000I4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444I4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444I4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444I4444444444444444444444444444444444444444444444a444444444444444444444444444444444444444608401.00000TD000Y0P", 98, 212);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444I44444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444I44444444444444444444");
    }

    @Test
    public void test26759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26759");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.99359999!i0                                                                                             0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.99359999");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.99359999!i0                                                                                             0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.9935999" + "'", str1, "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.99359999!i0                                                                                             0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.9935999");
    }

    @Test
    public void test26760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str1, "############I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test26761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26761");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                            ...hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0I!p0y000dt00000.099-1HI!p0", "                                                                                                                                                                                                                                                                                                                                                                          p0Y0M0DT0H0M0.099SI:II:IIII32P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SI:II:IIII32P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26763");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0:00:00.495", "P0Y0M0DT0H0M0.99Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "           44459711441145942344TD43041144Y400-14P4");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test26764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...3H59M59.872S", 484, 900);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26765");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", '4');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("       P-1Y11M30DT23H59M59.926S", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("       !ih    ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test26766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26766");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ", "I!I!I!I!I!I", "                                                                                                                                44's'ss'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! " + "'", str3, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ");
    }

    @Test
    public void test26767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26767");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P0Y0M0DT0HHP-1Y11M30DT23H59M59.972SHh", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26768");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!h0:00:00.306", (java.lang.CharSequence) "P0Y0M0DT0H0M0.051S##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26769");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!  HI!  HI!  HI!  HI!  HI..", "                     0                              ", 48);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI.." + "'", str4, "HI!  HI!  HI!  HI!  HI!  HI..");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI.." + "'", str6, "HI!  HI!  HI!  HI!  HI!  HI..");
    }

    @Test
    public void test26770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("####################################              syad 44              ", "4444P0Y000DT00000.099104444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################              syad 44              " + "'", str2, "####################################              syad 44              ");
    }

    @Test
    public void test26771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26771");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "   00i!i!hi!   00i!i!hi!   00i!i!hi!  AAAAAAAAAAAAAAAAAAAAA...   00i!i!hi!   00i!i!hi!   00 00I!  I.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26772");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("p-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051S", "P0Y0M0DT0...", 252, 531);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "p-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051SP0Y0M0DT0..." + "'", str4, "p-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051SP0Y0M0DT0...");
    }

    @Test
    public void test26773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26773");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0Y0M0DT0H0M0.001S:0Y0M0DT0H0M0.001S0Y0M0DT0H0M0.001S:0Y0M0DT0H0M0.001S0Y0M0DT0H0M0.001S.0Y0M0DT0H0M0.001S0Y0M0DT0H0M0.001S8", "                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26774");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
    }

    @Test
    public void test26775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#########0M0.001S###########################...", "  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########0M0.001S###########################..." + "'", str2, "#########0M0.001S###########################...");
    }

    @Test
    public void test26776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26776");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26777");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'                                                                                                                               ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                             0 SECONDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray12);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test26778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P-1Y11M30DTS0 S0 S0P-1Y11M30DT2", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P-1Y11M30DTS0 S0 S0P-1Y11M30DT2" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P-1Y11M30DTS0 S0 S0P-1Y11M30DT2");
    }

    @Test
    public void test26779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26779");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "1117");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!  hi!  hP'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'D");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!  hi!  hP'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'D" + "'", str1, "hi!  hi!  hP'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'D");
    }

    @Test
    public void test26781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26781");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                              H                                                                                                                                                                                                                                                                                                                                                                                           P0Y0M0DT0H0M0.099S", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26782");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 161, (long) 474, "TH", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26783");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("H...", 281);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26784");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                            P-1Y11M30DT23H59M59.863S", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26785");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("M0DT0H0M0.034S", "p0y0-10dt07430-10.1913599982", 608);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26786");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y0M0DT0H0M0.005S", 159, 931);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26787");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0:00:00.009");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26788");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("P-1Y11M30DT23H59M59.689S", "         HP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993Saaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.689S" + "'", str2, "P-1Y11M30DT23H59M59.689S");
    }

    @Test
    public void test26790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26790");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'                                                                                                                              ", "iiiihi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26791");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaasyad 0aaaahhhaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhhaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0", "a4hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26792");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!4hi!444hi!4", "..");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!4hi!444hi!4" + "'", str4, "hi!4hi!444hi!4");
    }

    @Test
    public void test26793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26793");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0 day");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26794");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                               hi!                                                                                                hi! hi!", "0!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...:!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...00!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...:!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...00!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444....!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...030");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("'M'M'd'DT'H'H'm'M's.S'S'Hi!#######################################################################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("p0y0m0dt0h0m0.473s", 111, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                             p0y0m0dt0h0m0.473s" + "'", str3, "                                                                                             p0y0m0dt0h0m0.473s");
    }

    @Test
    public void test26796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26796");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i", " HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0000000020" + "'", str4, "0000000020");
    }

    @Test
    public void test26797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...          0 0econ00                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...          0 0ECON00                      " + "'", str1, "...          0 0ECON00                      ");
    }

    @Test
    public void test26798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", 107, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I" + "'", str3, "hi!hi!hi!  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
    }

    @Test
    public void test26799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26799");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P-1Y11M30DT23H59M59.989S", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26800");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                        ...IH!IH!IH!IH!IH!IH                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.0DAY88Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S", "0:00:00.187");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.0DAY88Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S" + "'", str2, "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.0DAY88Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S");
    }

    @Test
    public void test26802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aahi!P0000Y0-10DT0743      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", "HP0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26803");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P00-1Y11-130DT2374359-159.999359998900000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I...", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26804");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                            Y0M0DT0H0                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26805");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "P0Y0M0DT0H0M0.484S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test26806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HI!HI!HI!HI!HI!H  I!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!H  I!" + "'", str2, "HI!HI!HI!HI!HI!H  I!");
    }

    @Test
    public void test26807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26807");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "  !ih  !ih  !ih  !ih  !ih  !ih  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi", "##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0 D", "TH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 D" + "'", str2, "0 D");
    }

    @Test
    public void test26810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P0Y0M0DT0H0M0.485S", "S130.0M0H0TD0M0Y0P");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.485S" + "'", str2, "P0Y0M0DT0H0M0.485S");
    }

    @Test
    public void test26811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26811");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("        P0Y0M0DT0H0M0.0:00:00.038        ", 83, 182);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        P0Y0M0DT0H0M0.0:00:00.038        " + "'", str3, "        P0Y0M0DT0H0M0.0:00:00.038        ");
    }

    @Test
    public void test26812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("t 00 ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t 00 " + "'", str2, "t 00 ");
    }

    @Test
    public void test26813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0:00:00.061", 61, 969);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26814");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                               0:00:00.032", "                                                                                                                                44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'                                                                                                                               ", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0 D", 14, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaa0 D" + "'", str3, "aaaaaaaaaaa0 D");
    }

    @Test
    public void test26816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26816");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ", "P0Y0M0DT0H0M0.904S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26817");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0:00:00.318");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.318" + "'", str1, "0:00:00.318");
    }

    @Test
    public void test26818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("P0Y0M0DT0H0M0.071S", "44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.071S" + "'", str2, "P0Y0M0DT0H0M0.071S");
    }

    @Test
    public void test26819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26819");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!s0s0s0hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26820");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str1, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test26821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaahi!0i!i!i!i!i!i!i!i!i!... HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaah", "Sdnoces");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaahi!0i!i!i!i!i!i!i!i!i!... HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaah" + "'", str2, " HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaahi!0i!i!i!i!i!i!i!i!i!... HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaah");
    }

    @Test
    public void test26822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26822");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) 160, "H H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S HS H0S H000S S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00 060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 " + "'", str3, "00 060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 060 0060 000060 ");
    }

    @Test
    public void test26823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26823");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "######p00-1######p00-1######p00-1######p00-1#####P-1Y11M30DT23H59M59.808S######p00-1######p00-1######p00-1######p00-1#####", "AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i9935999p0y0m0dt0h0m0i000sAA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i99359999AA0i!p000000-100t07430-10i9935999");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test26824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26824");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!", "                                                                                       hi!hi!h..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test26825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26825");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26826");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "P0Y0M0DT0H0M0.115S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.115S" + "'", str1, "P0Y0M0DT0H0M0.115S");
    }

    @Test
    public void test26827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26827");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                    aaaaaaaaaP-1Y11M30DT23H59M59.935", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT", 552);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26828");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaai!hi!hi!hi!h!i  i!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaa", 204, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26829");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("p00-1y11m30dt23h59m59.999s00000000000000000000000000000023iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("p0y0m0dt0h0m0.110s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.110S" + "'", str1, "P0Y0M0DT0H0M0.110S");
    }

    @Test
    public void test26831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26831");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "44444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI!  HI!  HI!  HI!  HI!  HI", "i!Hi!Hi!Hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI" + "'", str2, "HI!  HI!  HI!  HI!  HI!  HI");
    }

    @Test
    public void test26833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!", "S498.95M95H32TD03M11Y1-P");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26834");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "S00S0S00S0S00S01010.00000TD000Y0paaaaaaaaaaaaaaa", "0:00:00.110");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 'P'yyyy''M'M'd''H'H'm'M's0'0" + "'", str3, " 'P'yyyy''M'M'd''H'H'm'M's0'0");
    }

    @Test
    public void test26835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!I!I!i!I!I!", "                                                                                                                0                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!I!I!i!I!I!" + "'", str2, "!I!I!i!I!I!");
    }

    @Test
    public void test26836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26836");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "00i!i!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26837");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...", "!ih !ih                   H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !P0Y0M0DT0H0M0.030Sh AAAAAAAAAAAAAAAAAAAAAAAAA!ih !ih                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26838");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!", 135, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!" + "'", str3, "0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!");
    }

    @Test
    public void test26839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26839");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0Ip0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y", "###########p0y0m0dt0h0m0.000s############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0Ip0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y" + "'", str2, "I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0Ip0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y");
    }

    @Test
    public void test26841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str3, "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test26842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26842");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                i!", (java.lang.CharSequence) "aYaMaDTaHaMa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 159 + "'", int2 == 159);
    }

    @Test
    public void test26843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26843");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P-1Y11M30DT23H59M59.984S", "hi!hi!hi!  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", 846, 902);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 846");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                       " + "'", str2, "                                                                                       ");
    }

    @Test
    public void test26845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26845");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P00-1Y11M30DT23H59M59.964S44                                                                                                                                                                                                         P0Y0M0DT0H0M0.035S                                       ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000I!I!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26846");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.09949", "Aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!0s 0s 00s 0s 00s 0s 00s 0s 00s");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("p      t h   .    ", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 28");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test26847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26847");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...   P0Y0M0DT0H0M0.035S                                       3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAA", "AAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26848");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P-1Y11M30DT23H59M59.809S", "230.00:00:0                                                                               hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 78, 285);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 78");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26849");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 54, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test26850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26850");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("p000000t0h000.2710 0a00", "440A0");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test26851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0:00:00.09");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.09" + "'", str1, "0:00:00.09");
    }

    @Test
    public void test26852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26852");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y000DT00000.41495############################################################################################################################################################", "I! HI! HI! HI! HI! HI! HI! HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26853");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("       ...", 161, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!PYMDTHM2Shi!PYMDTHM2Shi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26855");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  hi!" + "'", str5, "  hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test26856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26856");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "00: 00: 0I! HI!   HI!HI!  HI!  HI!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00: 00: 0I! HI!   HI!HI!  HI!  HI!  " + "'", str1, "00: 00: 0I! HI!   HI!HI!  HI!  HI!  ");
    }

    @Test
    public void test26857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HI!Hi!Hi!H...HI!H", "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!Hi!Hi!H...HI!H" + "'", str2, "HI!Hi!Hi!H...HI!H");
    }

    @Test
    public void test26858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26858");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa", "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26859");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("P-1Y11M30DT23H59M59.631S", "      0 seconds      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26860");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44'");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26861");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S0s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 0", "P0Y0M0DT0H0M0.151S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26862");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "8010.00000TD000Y0P", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26863");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("         444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P4         ", "Ih's's.S'm'M'h'h'td'D'm'm'y'YYYY'44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P4         " + "'", str2, "         444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P4         ");
    }

    @Test
    public void test26865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26865");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                          743i!i!i! ", "h                                                                                                                          ...", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26866");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                               0:00:00.032444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                                                 'P'yyyy...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test26867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26867");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0:00:00.03");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26868");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...#######################################   ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...#######################################", "P0Y0M0DT0H0M0.067S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26869");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                           p0000y0m0dth0 seconds                      ", 139, 697);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                           P-1Y11M30DT23H59M59.853S", "!IH !IH !IH !IH !IH !IH !IH !IH", " ip-10110300t23h59059.80800i!P0Y000DT00000.0021hi!P0Y  ip-10110300t23h59059.80800i!P0Y000DT00000.0021hi!P0Y  ip-10110300t23h59059.80800i!P0Y000DT00000.0021hi!P0Y  i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "---------------------------P-1Y11M30DT23p59M59.853S" + "'", str3, "---------------------------P-1Y11M30DT23p59M59.853S");
    }

    @Test
    public void test26871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26871");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", 290);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", (java.lang.Object[]) strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray8, strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("hI!hI!h..", strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S H", (java.lang.Object[]) strArray8);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray21, strArray28);
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.stripAll(strArray28);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray30);
        int int32 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray30);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.concatWith("HI! HI! HI! HI! HI! HI! HI! HI!", (java.lang.Object[]) strArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("-00P      #####################P Y M DT H M n 56S.372S", strArray8, strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str9, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str14, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!hi!hi!" + "'", str31, "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!" + "'", str33, "hi!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!");
    }

    @Test
    public void test26872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26872");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("p0Y0M0DT0H0M0.045S", "...4HI!444", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26873");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                              P00-1                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26874");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D001560.00000TD000Y0p230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26875");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("p00 P yyyy Y        T H H          ", 46, "sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnoces");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sdnocessdnop00 P yyyy Y        T H H          " + "'", str3, "sdnocessdnop00 P yyyy Y        T H H          ");
    }

    @Test
    public void test26876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("'P'yyyy'Y'M'M'd'DT'H'H'm'M'sTS'S'44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44'S'STs'M'm'H'H'TD'd'M'M'Y'yyyy'P'" + "'", str1, "44'S'STs'M'm'H'H'TD'd'M'M'Y'yyyy'P'");
    }

    @Test
    public void test26877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26877");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!  hi!  hi!  hi!  hi!", "P-1Y11M30DT23H59M59.819S                                                                       hi!hi!hi!                                                                                                                                              hi!hi!hi!                                           ", ".099SP0Y0M0DT0H0M0.099SP0Y0M0DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################### 00   00   00   00   " + "'", str3, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################### 00   00   00   00   ");
    }

    @Test
    public void test26878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26878");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0 DAYS", "                                                                                        ...3H59M59.872S                                                                                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0y0m0dt0h0m0.001sAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           ", 301, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################################################################################################################################### AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0y0m0dt0h0m0.001sAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           " + "'", str3, "################################################################################################################################################################################################################### AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0y0m0dt0h0m0.001sAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           ");
    }

    @Test
    public void test26880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaa", 48, "0:00:00.017");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.0170:00:00.0170:00:00.0170:aaaaaaaaaaaaa" + "'", str3, "0:00:00.0170:00:00.0170:00:00.0170:aaaaaaaaaaaaa");
    }

    @Test
    public void test26881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26881");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("T4H4H", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26882");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!P0000Y0M0DT0H0M0.99SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!0:00:00.008hi!0:00:00.008hi!", "sdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces", 495);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 day..                                                                                    HI!...", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 day..                                                                                    HI!..." + "'", str7, "0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 day..                                                                                    HI!...");
    }

    @Test
    public void test26883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44", "'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44" + "'", str2, "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44");
    }

    @Test
    public void test26884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26884");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...#######################################   ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...#######################################", "230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D001560.00000TD000Y0p230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D", 275);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26885");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("  HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!HI!", "i!H...         Hi!", 111, 48);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!Hi!H...         Hi!" + "'", str4, "  HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!Hi!H...         Hi!");
    }

    @Test
    public void test26886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26887");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 2, " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0" + "'", str3, " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0");
    }

    @Test
    public void test26888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26888");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Hi!Hi!H..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26889");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I!I!I!I!I!I!I!I!I!I!I!I!sssI!I!I!I!I!I!I!I!I!I!I!I!", 492, 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26890");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26891");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                           00noce0 0                     ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26892");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(".099-1hi!P0Y000DT00000.099-1", "HI! Hi!Hi!H...HIP Y M DT H M n 56SHI! Hi!Hi!H...HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!##", "aaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test26894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 7, "                                                                               ::.99");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str3, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test26895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(" D0 D0 D0 '", 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 '" + "'", str2, " D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 '");
    }

    @Test
    public void test26896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26896");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("######p00-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######p00-1" + "'", str1, "######p00-1");
    }

    @Test
    public void test26897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26897");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0", (java.lang.CharSequence) "sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnochhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  es  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 579 + "'", int2 == 579);
    }

    @Test
    public void test26898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26898");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aahi!P0000Y0M0DT0H0M0.99SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26899");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 43, "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 second", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                      P0000Y0M0DT00 second" + "'", str3, "                                                                                                                      P0000Y0M0DT00 second");
    }

    @Test
    public void test26900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26900");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0:...                                                                                                                                                            ", "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26901");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("999.95095!ih  IIIIIIIIIIIIIIII0000000000000000", "hi!        hi!                        hi!        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26902");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 62, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test26903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26903");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44 0a0                                                                                     ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "h'h'm'm's.s'saahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!       0I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test26905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26905");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26906");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "P", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0D...", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "           ", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P-1Y11030DT23059059.9839444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 24 + "'", int26 == 24);
    }

    @Test
    public void test26907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...#################################################################################...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#################################################################################..." + "'", str2, "...#################################################################################...");
    }

    @Test
    public void test26908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26908");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("P0Y000DT00000.004281", "0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26909");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 591, (long) 872, "p0y000dt00000.09910");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p000000t00000.09910" + "'", str3, "p000000t00000.09910");
    }

    @Test
    public void test26910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26910");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 25, (long) 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.067S" + "'", str2, "P0Y0M0DT0H0M0.067S");
    }

    @Test
    public void test26911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26911");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaa", "0i!4hi!444hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26912");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "###########p0y0m0dt0h0m0.000s############                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26913");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!i0", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26914");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.0DAY88Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S", 487);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26915");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaap0y0m0dt0h0m0.045s", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26916");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) ".                                      hi!hi!                                            0 daysaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".                                      hi!hi!                                            0 daysaahi!" + "'", str1, ".                                      hi!hi!                                            0 daysaahi!");
    }

    @Test
    public void test26917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0I!p0y000dt00000.099-1HI!p0", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I!p0y000dt00000.099-1HI!p0" + "'", str2, "0I!p0y000dt00000.099-1HI!p0");
    }

    @Test
    public void test26918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", "0i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa day                                                                                                     ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26919");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("'Sdnoce", 188, "aaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###########################################Hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa######################'Sdnoceaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################" + "'", str3, "aaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa######################'Sdnoceaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################");
    }

    @Test
    public void test26920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26920");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!44days44days44days44days44days44days44days44days44day                                                                                                                                           'P'YYYY'Y'M'M'D'DT'H'0 SECONDS                      4days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days", "p0y0m0dt0...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26921");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###############################################################0   seconds");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################################0   seconds" + "'", str1, "###############################################################0   seconds");
    }

    @Test
    public void test26922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "P0Y0M0DT0H0M0.093S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P-1Y11M30DT23H59M59.915S", 122, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhP-1Y11M30DT23H59M59.915Shhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhP-1Y11M30DT23H59M59.915Shhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test26924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26924");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 252, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test26925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26925");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hhhhhhhhhhhAAHI!'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26926");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("p0y0m0dt0...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26927");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("'p'YYYY'y'm'm'D'dsdnoces  'p'YYYY'y'm'm'D'd", "0:00:00.05", 575);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26928");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 67);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.067S" + "'", str1, "P0Y0M0DT0H0M0.067S");
    }

    @Test
    public void test26929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26929");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hi!h...P0Y000DT00000.0991", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test26930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26930");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "P-1Y11M30DT23H59M59.983S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p-1Y11M30DT23H59M59.983S" + "'", str1, "p-1Y11M30DT23H59M59.983S");
    }

    @Test
    public void test26931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26931");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("syad 44");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444a444444444444444444444444444444444444444S401.0M0H0TD0M0Y0P", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 464 + "'", int3 == 464);
    }

    @Test
    public void test26932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!HI!HI! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0i!                                         ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!                                         " + "'", str2, "0i!                                         ");
    }

    @Test
    public void test26934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S", 21, 54);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S ..." + "'", str3, "...aaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S ...");
    }

    @Test
    public void test26935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26935");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaa SECONaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaa", 7, 197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI" + "'", str2, "'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI");
    }

    @Test
    public void test26937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26937");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 134, (long) 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.916S" + "'", str2, "P-1Y11M30DT23H59M59.916S");
    }

    @Test
    public void test26938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26938");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi! hi!   hi HI!  HI..hi! hi!   hi", "!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "'P'yyyy''''d''1'      'M'M'd'DT'H'H'm'M's.S'S'Hi!'P'yyyy''''d''1'       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! hi!   hi HI!  HI..hi! hi!   hi" + "'", str4, "hi! hi!   hi HI!  HI..hi! hi!   hi");
    }

    @Test
    public void test26939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26939");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0s 0s 0", "P0Y0M0DT0H0M0.009S");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "4444444444444444444444444444444444444444444444a4444444444444444  seconds4444444!iH", 99, 13);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test26940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("p000000t0h000.2710 0a00                                        ", "                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p000000t0h000.2710 0a00                                        " + "'", str2, "p000000t0h000.2710 0a00                                        ");
    }

    @Test
    public void test26941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26941");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("P-1Y11M30DT23H59M59.922S", "hi!P0Y0M0DT0H0M0.139Shi!P0Y0M0DT0H0M0.139SP0Y0M0DT0H0M0.139SP0Y0M0DT0H0M0.139Shi!P0Y0M0DT0H0M0.139S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495");
    }

    @Test
    public void test26943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26943");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "AAAAAAAAAAAAP0y0m0dt0h0m0.045s", 103);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test26944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26944");
        char[] charArray15 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0I!p000000t00000.099-10I!p000000t00000.099-1p000000t00000.099-1p000000t00000.09", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!P0Y0M0DT0H0M0.099...", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...          0 0econ00                      ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("Aahi!P0000Y0-10DT07430-10.99359999144444444", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                             ...", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test26945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaa0:00:00.018", "i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa0:00:00.018" + "'", str2, "aaaa0:00:00.018");
    }

    @Test
    public void test26946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26946");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("p-10110300t23h59059.9830P0Y000DT00000.4950P0Y000DT00000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000TD000Y0P0594.00000TD000Y0P0389.95095h32t00301101-p" + "'", str1, "00000TD000Y0P0594.00000TD000Y0P0389.95095h32t00301101-p");
    }

    @Test
    public void test26947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S0S00S0S00S0S00S0S00Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0day88                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S0S00S0S00S0S00S0S00S" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S0S00S0S00S0S00S0S00S");
    }

    @Test
    public void test26949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26949");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("S", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HHHH...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("44hi!", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "S" + "'", str4, "S");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test26950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26950");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "00noce0 0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test26951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26951");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i" + "'", str1, "p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
    }

    @Test
    public void test26952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(" S S S ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " s s s " + "'", str1, " s s s ");
    }

    @Test
    public void test26953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26953");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "'p'YYYY'y'm'm'D'dsdnoces  'p'YYYY'y'm'm'D'd", (java.lang.CharSequence) "AAAAAAAA###############################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days" + "'", str1, "0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days");
    }

    @Test
    public void test26955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Y000DT00000.031");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Y000DT00000.03" + "'", str1, "Y000DT00000.03");
    }

    @Test
    public void test26956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26956");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.280", " !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0s 0s 0s  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26957");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aahi!P0000Y0M0DT0H0M0.99S", "0M0DT0", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test26958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!230.00:00:0                                                                               HI!                   63540.00000TD000Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!                    HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!", "aaP0Y000DT00000.0459");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26959");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("i! ", "...  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26960");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44 0A0", 902);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("iHhi0:00:00.191####", "M30DT23H59M59.872S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iHhi0:00:00.191####" + "'", str2, "iHhi0:00:00.191####");
    }

    @Test
    public void test26962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "         444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y0000S0S0444444444444444444444444444444P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y0000S0S0444444444444444444444444444444P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y000" + "'", str1, "P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y0000S0S0444444444444444444444444444444P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y000DT00000P0Y000");
    }

    @Test
    public void test26964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26964");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26965");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 174, (long) 99, "P0Y0M0DT0H0M0.011S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0113599925" + "'", str3, "P0Y0-10DT07430-10.0113599925");
    }

    @Test
    public void test26966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26966");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0         0         0         0         0         0         0         0         0                                                                                                                                                                                                                                                                                                                                                                                                                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26967");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                           HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "AAP0Y000DT00000.0459I!0000000000000000000000000000I!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAP0Y000DT00000.0459I!0000000000000000000000000000I!I!" + "'", str1, "AAP0Y000DT00000.0459I!0000000000000000000000000000I!I!");
    }

    @Test
    public void test26969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!                    " + "'", str2, "                    'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!                    ");
    }

    @Test
    public void test26970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days", "i!0i!i!i!i!i!i!i!i!i!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days" + "'", str2, "days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days0days");
    }

    @Test
    public void test26971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26971");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", 8);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 91, 77);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0:00:00.02", "0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!", 77);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!HI!HI!H", strArray4, strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!HI!HI!H" + "'", str13, "!HI!HI!H");
    }

    @Test
    public void test26972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26972");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                             444597114");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26973");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "'p'!!!!'y'm'm''dt'h'h'm'm'.s's'hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26974");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("P-1Y11M30DTS0 S0 S0P-1Y11M30DT2                                                                                                                                                                                                                                                          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26975");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "T23H59M59.999S");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26976");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 906, (long) 201);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.295S" + "'", str2, "P-1Y11M30DT23H59M59.295S");
    }

    @Test
    public void test26977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26977");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "Hhhaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test26978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Y0M0D  hi!  hi!  hi!  hi!  hi!  hi!  hi", "aaaaaaaaaaHi!Hi!H...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "444444444444444  HI!444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444  HI!444444444444444" + "'", str1, "444444444444444  HI!444444444444444");
    }

    @Test
    public void test26980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26980");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "p-1Y11-130DT2374359-159.9243599968");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p-1Y11-130DT2374359-159.9243599968" + "'", str2, "p-1Y11-130DT2374359-159.9243599968");
    }

    @Test
    public void test26981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26981");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!i!i!", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26982");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  hi", " !Ip YYYY y        t      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!'y'm'm' 'dt'h'h'M'      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!                                           !i0!i0!i0!i0!i0!i0!i0!i0!i0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI", "P0Y0M0DT0H0M0.775S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26984");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "'P'yyyy'Y'M'M'd'DT'i!Hi!H..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test26985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26985");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("#############################################################################p0y0m0dt0h0m0.100s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################p0y0m0dt0h0m0.100s" + "'", str1, "#############################################################################p0y0m0dt0h0m0.100s");
    }

    @Test
    public void test26986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26986");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("sdnoces  ", "", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test26987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("P0Y0M0DT0H0M0.080S", "P0Y0M0DT0H0M0.024");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.080S" + "'", str2, "P0Y0M0DT0H0M0.080S");
    }

    @Test
    public void test26988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("S100.0MI I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!44I!44I!44I!44I!44I..y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S100.0MI I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "S100.0MI I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test26989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26989");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hHHHHHH####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aahi!D", "4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!D" + "'", str2, "aahi!D");
    }

    @Test
    public void test26991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26991");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("S540.0M0H0TD0M0Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###############################################################################################  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26992");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444", 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26993");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0s 0s 0s  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0s 0s 0s  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih" + "'", str3, " !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0s 0s 0s  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih");
    }

    @Test
    public void test26994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" hi!  hi!  h", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26995");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("28010.00000td000y0ph");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26996");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!", "!hi!hi!hi!hi!hi!h", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("p0Y000DT00000.01010hi!444444400noce0  4444444444444444a4444444444444444444444444444444444444444444444", "P-1Y11M30DT23H59M59.872S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0Y000DT00000.01010hi!444444400noce0  4444444444444444a4444444444444444444444444444444444444444444444" + "'", str2, "p0Y000DT00000.01010hi!444444400noce0  4444444444444444a4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "p0y0m0dt0h0m0.151s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26999");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("p000000t0h000.2710 0a00                                        ", 0, 930);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p000000t0h000.2710 0a00                                        " + "'", str3, "p000000t0h000.2710 0a00                                        ");
    }

    @Test
    public void test27000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test27000");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

