import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest47 {

    public static boolean debug = false;

    @Test
    public void test23501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23501");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 95, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test23502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23502");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                       P0Y0M0DT0H0M0.271                                       ", "P00-1Y11M30DT23H59M59.964S44                                                                                              I!  HI..hi!4hi!444hi                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444444444444444444444444A4444444444444444444444444444444444444444444444", 318);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444A4444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444A4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test23504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23504");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih###", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih###" + "'", str3, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih###");
    }

    @Test
    public void test23505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23506");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...44444444HI!HI!HI!4444444444", "                                        HI!  HI!  HI!  HI!  HI!  HI...                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23507");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("i!hi!hi!hi!h################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test23508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23508");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("H S0H S000H SH S0H S000H SH##hi!", "HS0HS000HSHS0HS000HSH##hi##", "P00-1Y11M30DT23H59M59.964S44                                                                                                                                                                                                         P0Y0M0DT0H0M0.035S", 87);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H S0H S000H SH S0H S000H SH##hi!" + "'", str4, "H S0H S000H SH S0H S000H SH##hi!");
    }

    @Test
    public void test23509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23509");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test23511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23511");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...", 4, 115);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!..." + "'", str3, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...");
    }

    @Test
    public void test23512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23512");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("..                                                                                    HI!...", "743i! hi! hi! hi!hhhhi! hi! hi! hi!", 95);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test23513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s", "                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s" + "'", str2, "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
    }

    @Test
    public void test23514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23514");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i..." + "'", str1, "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i...");
    }

    @Test
    public void test23515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0DAY88                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0DAY88                                                                                                                                                                                                                                                                                                            " + "'", str1, "0DAY88                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test23516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444                            HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test23517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23517");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi", "00000000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi" + "'", str3, "hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi");
    }

    @Test
    public void test23518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23518");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("#####################################################################################AAP0Y000DT00000.0459######################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test23519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23519");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnoces");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnoces" + "'", str1, "sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnoces");
    }

    @Test
    public void test23520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23520");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("001560.00000TD000Y0p  hP00-1Y11030DT23059", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 51);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test23521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23521");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAAAAAAAAA0I!I!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAA0I!I!..." + "'", str1, "AAAAAAAAAA0I!I!...");
    }

    @Test
    public void test23522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P0Y0M0DT0H0M0.071S", "P 0000 Y        T 0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.071S" + "'", str2, "P0Y0M0DT0H0M0.071S");
    }

    @Test
    public void test23523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0:00:00.038", "I:II:IIII32");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.038" + "'", str2, "0:00:00.038");
    }

    @Test
    public void test23524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23524");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", (int) ' ');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "hi!hi!hi! ", (int) 'a', (int) 'a');
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444444444444444444444444444444444444", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test23525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23525");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test23526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("4yyyy4P4 HI!", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!" + "'", str2, "4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!");
    }

    @Test
    public void test23527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23527");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("1###################################################################################00noce0  ##1###################################################################################00noce0  ##1#########################################00.00400001###################################################################################00noce0  ##1###################################################################################00noce0  ##1#########################################", "                                                                                                ", 138);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test23528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "i! hi! hi! hi! hi! hi! hi! hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i! hi! hi! hi! hi! hi! hi! hi" + "'", str1, "i! hi! hi! hi! hi! hi! hi! hi");
    }

    @Test
    public void test23529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23529");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "P0Y0M0DT0H0M0                                                                                                                                                                                                                                                                  P-1Y11M30DT23H59M59.930S", (java.lang.CharSequence) "   P-1Y11M30DT23H59M59.989S    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 274 + "'", int2 == 274);
    }

    @Test
    public void test23530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23530");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "AAAAAAAAAAAAAAA                 P0Y0M0DT0H0M0.001S                 ", 902);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test23531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0:00:00.289                                                                                               ", 204, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.289                                                                                               " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.289                                                                                               ");
    }

    @Test
    public void test23532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("P0Y0M0DT0H0M0.011S", "00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test23533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("S010.0M0H0TD0M0Y0Ph");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S010.0M0H0TD0M0Y0Ph" + "'", str1, "S010.0M0H0TD0M0Y0Ph");
    }

    @Test
    public void test23534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23534");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp", "                      0:00:00.007");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23535");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("h!ih!ih!ih!i  i!h!ih!ih!ih!i       ", 100, "                                                                                       000i!i!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 h!ih!ih!ih!i  i!h!ih!ih!ih!i       " + "'", str3, "                                                                 h!ih!ih!ih!i  i!h!ih!ih!ih!i       ");
    }

    @Test
    public void test23536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pppppppppppp");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!PPHI!PPHI!PPHI!PPHI!PPHI!PPHI!PPHI!PPHI!PPHI!PPPPPPPPPPPP" + "'", str1, "!PPHI!PPHI!PPHI!PPHI!PPHI!PPHI!PPHI!PPHI!PPHI!PPPPPPPPPPPP");
    }

    @Test
    public void test23537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp", "D 0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp" + "'", str2, "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp");
    }

    @Test
    public void test23538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23538");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!4444444sdnoces44444444444444444a4444444444444444444444444444444444444444444444", "I!i!i!                                                                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23539");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "                                             059.872103                                              ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test23541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 102, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test23542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23542");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 77, (long) 89, "                           h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23543");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                    P0000Y0M0DT0         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test23544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23544");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0I!0I!0I!0I!0I!0I!0I!0I!0I! AAHI", "hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                               ...", "P-1Y11M30DT23H59M59.932S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               ..." + "'", str2, "                               ...");
    }

    @Test
    public void test23546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23546");
        char[] charArray12 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y000DT00000.01010", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "230.00:00:0", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "H   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0DT0a0M0a99S", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P-1Y11030DT23059059.93092 #0 days 0 hours 0 minutes 0 seconds !4444444444444444444444444444444444", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23547");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 903, "p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101" + "'", str3, "p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101");
    }

    @Test
    public void test23548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("743i!i!i!", "4444444444444444444444444444444444444444444444  hi!4444444444444444444444444444444444444444444444", "hi!444444400noce0  4444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "743i!i!i!" + "'", str3, "743i!i!i!");
    }

    @Test
    public void test23549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23549");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "                         p0Y000DT00000.0101         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         p0Y000DT00000.0101         " + "'", str2, "                         p0Y000DT00000.0101         ");
    }

    @Test
    public void test23550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23550");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0:...                                                                                                                                                            ", 285);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "....................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23552");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("000 0 0                                              ", "H!iH!iH!ii!Hi!Hi!H", 697);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test23553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23553");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("743I!I!I!0:00:00.086 0i!0i!0i!0i!0i!0i!0i!0i!", "0s 0s 0                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("P-1Y11M30DT23H59M59.993Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.993Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "P-1Y11M30DT23H59M59.993Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test23555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23555");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23556");
        char[] charArray12 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1Y11M30DT23H59M59.964S44                                                                                                                                ", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("      hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'd", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test23557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("PpYpMpDTpHpMpTp96S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PpYpMpDTpHpMpTp96S" + "'", str1, "PpYpMpDTpHpMpTp96S");
    }

    @Test
    public void test23558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23558");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...                                                       hI!hI!h...hi!                          ...                                                                                                                                                                                            ", (int) (short) 1, 190);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("           P-1Y11030DT23059059.97780", "0:00:00.053");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           P-1Y11030DT23059059.97780" + "'", str2, "           P-1Y11030DT23059059.97780");
    }

    @Test
    public void test23560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#####################################################################################################################################################################################################################################################################aaP0Y000DT00000.0459", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################################################################################################################################################################################################aaP0Y000DT00000.0459" + "'", str2, "#####################################################################################################################################################################################################################################################################aaP0Y000DT00000.0459");
    }

    @Test
    public void test23561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23561");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0 SECOND", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "Y0M0DT0H0M");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 SECOND" + "'", str4, "0 SECOND");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0 SECOND" + "'", str7, "0 SECOND");
    }

    @Test
    public void test23562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I" + "'", str1, "  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I");
    }

    @Test
    public void test23563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                          ", 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          " + "'", str2, "                                                                                          ");
    }

    @Test
    public void test23564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23564");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444P0Y000DT00000.0682254444444444444444444444444444444444444444", "p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23565");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(" HI! HI! HI! HI! HI! HI! HI! HI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "   hi!  hip00-1Y11M30DT23H59M59.964S44                        ", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23566");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0 0.0 040  0 0 0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23567");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "hi!hi!hi!");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("00000000000000000000000000004444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4", strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "S870.0M0H0TD0M0Y0P");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test23568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23568");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("p000000t0h000.2710 0a00", "440A0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pth.271 a" + "'", str3, "pth.271 a");
    }

    @Test
    public void test23569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045sP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0", 16, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045sP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0" + "'", str3, "P0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045sP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0");
    }

    @Test
    public void test23570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23570");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("H:HH:HHIH43", "!iH", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43" + "'", str3, "H:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43!iHH:HH:HHIH43");
    }

    @Test
    public void test23571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                   ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("IH                            4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444!IH", "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1" + "'", str2, "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1");
    }

    @Test
    public void test23573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0:00:00.101", "TP-1Y11M30DT23H59M59.872S0", "Hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i:ii:iih i " + "'", str3, "i:ii:iih i ");
    }

    @Test
    public void test23574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23574");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "'m'm'D'dt'h'h'M'm'S.s's'hI!", (int) '4');
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("          Hi!                                                           hi!", strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("0S 0S 0", strArray7);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray16, strArray23);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray23);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.stripAll(strArray25, "hi!");
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray25, "hi!", (int) (byte) 100, 10);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray25);
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.stripAll(strArray25, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        boolean boolean35 = org.apache.commons.lang3.StringUtils.endsWithAny("  hi!  hi!  hi!  hi!  hi!  hi...", strArray25);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray7, strArray25);
        int int37 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray25);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray25);
        java.lang.String[] strArray40 = org.apache.commons.lang3.StringUtils.stripAll(strArray25, "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI");
        java.lang.String[] strArray45 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S", 115);
        boolean boolean46 = org.apache.commons.lang3.StringUtils.endsWithAny("####M#DT#P#M#.##1S###M#DT#P#M#.##1SSECONDS", strArray45);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray40, strArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 6 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!hi!hi!" + "'", str38, "hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str47, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test23575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("'P'yyyy''''d''1'                                       hIYhIYhPPPh1Y");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test23576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                           'p'yyyy'y'm'm'd'dt'h'0 seconds                      ", "Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0 DAYS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23577");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "sdnoces 0", (java.lang.CharSequence) "                                       Hi!Hi!H...HI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "sdnoces 0" + "'", charSequence2, "sdnoces 0");
    }

    @Test
    public void test23578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 604);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0         ", "P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 51, 30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "P0Y0M0DT0H0M0.071S", 277, 931);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 277");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0         " + "'", str3, "0         ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test23580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23580");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".09981P0Y000DT00000.09981P0Y000DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23581");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "H        ", 902);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test23582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23582");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("p00-1Y11M30DT23H59M59.964S44                                                                                                                                                          ", "", 0, 192);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test23583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23583");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("h         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "h         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test23584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23584");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaHI", "hi!  hi!  hi!  hi!  hi!  hi...", "i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", 612);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaHI" + "'", str4, "aaaaaaaaaaaaaaaaaaaaHI");
    }

    @Test
    public void test23585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...!iH!iH!iH!iH!iH!iH!iH!iH!iH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...!iH!iH!iH!iH!iH!iH!iH!iH!iH" + "'", str2, "...!iH!iH!iH!iH!iH!iH!iH!iH!iH");
    }

    @Test
    public void test23586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23586");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "I!  0I..hi!4hi!444h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23587");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("######!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H#######");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test23588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23588");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       P0Y0M0DT0H0M0.271                                       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test23589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("p YYYY y        t", "P0Y0M0DT0H0M0.032S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p YYYY y        t" + "'", str2, "p YYYY y        t");
    }

    @Test
    public void test23590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H##  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!##", 74, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H##  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!##" + "'", str3, "H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H##  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!##");
    }

    @Test
    public void test23591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23591");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                            ...hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "p0y0m0dt0h0m0.065s", "hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23593");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                               P0Y0-10DT07430-10.2713599914                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23594");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hiHi!Hi!hi!Hi!Hi!Hi!hi!Hi!hiHi!Hi!hi!Hi!Hi!Hi!hi!Hi!Hi!Hi!hi!Hi!Hi!Hi!hi!Hi!Hi!Hi!hi!Hi!Hi!Hi!hi!Hi!hiHi!Hi!hi!Hi!Hi!Hi!hi!Hi!", "P-1Y11M30DT23H59M59.826S", 161);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test23595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAA...", 105, "P0Y0M0DT0H0M0.280S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAA...P0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0" + "'", str3, "AAAAAAAAAAAAAAAAAAAAA...P0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0");
    }

    @Test
    public void test23596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23596");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 92, (long) 38, "0000000000000000743I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000743I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I!" + "'", str3, "0000000000000000743I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I!");
    }

    @Test
    public void test23597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23597");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                 P0Y0-10DT07430-10.0013599969                 ", "p0y0-10d...", 918);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(".09910", "0:00:00.013");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".09910" + "'", str2, ".09910");
    }

    @Test
    public void test23599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23599");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("           ", "Hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23600");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                 440A00", 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23601");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0I!" + "'", str1, "0I!");
    }

    @Test
    public void test23602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0:0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444", "1010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23603");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               'M'M'd'DT'H'H'm'M's.S'S'Hi!", (int) (byte) 100);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("H P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test23604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23604");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaa", 24, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaa" + "'", str3, "aaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaa");
    }

    @Test
    public void test23605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23605");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                   0I!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hi!hi!hi!hi!hi!hi", "hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23607");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.100", 75, 918);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAAAAAAAAAA...", "P0Y0M0DT0H0M0.110S                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAA..." + "'", str2, "AAAAAAAAAAAA...");
    }

    @Test
    public void test23609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0 daysHI!HI!HI!HI!HI!HI..HI", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 daysHI!HI!HI!HI!HI!HI..HI                                                                      " + "'", str2, "0 daysHI!HI!HI!HI!HI!HI..HI                                                                      ");
    }

    @Test
    public void test23610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("p-10110300t23h59059.9830P0Y000DT00000.4950P0Y000DT00000", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("720.00:00:0", "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", 159);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "720.00:00:0" + "'", str3, "720.00:00:0");
    }

    @Test
    public void test23612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("P0Y0M0DT0H0M0.289Si!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.289Si!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444" + "'", str1, "P0Y0M0DT0H0M0.289Si!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
    }

    @Test
    public void test23613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("P0Y0M0DT0H0M0.096S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S690.0M0H0TD0M0Y0P" + "'", str1, "S690.0M0H0TD0M0Y0P");
    }

    @Test
    public void test23614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23614");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0I!p0y000dt00000.099-1HI!p0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0I!p0y000dt00000.099-1HI!p0" + "'", str1, "0I!p0y000dt00000.099-1HI!p0");
    }

    @Test
    public void test23615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa99.::", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23616");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1Y11M30DT23H59M59.993S", "                                                Hi!                                                 ", 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444444444444444444                    ", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "444444444444444444                    " + "'", str6, "444444444444444444                    ");
    }

    @Test
    public void test23617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23617");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("P0Y0M0DT0H0M0.139S                                                                                    ", "########################################################################444444444444444444                    ", 288);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23618");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       p0Y000DT00000.00228                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23619");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("P00-1Y11M30DT23H59M59.964S44                                                                                                                                ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("P-1Y11M30DT23H59M59.819S", (java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "HI!HI!H...HI HI!HI!H...HI!...", 930, 50);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("4yyyy4P4 HI!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P00-1Y11M30DT23H59M59.964S44                                                                                                                                " + "'", str5, "P00-1Y11M30DT23H59M59.964S44                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test23620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23620");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                44SSMmHHTDdMMYyyyyP                                                                                                                               ", (java.lang.CharSequence) "HI! HI! HI! HI! HI! HI! HI! HI!0i!P");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23621");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) 73, "i!P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.099");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.099" + "'", str3, "i!P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.099");
    }

    @Test
    public void test23622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23622");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.000S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23623");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.012" + "'", str1, "0:00:00.012");
    }

    @Test
    public void test23624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "hi!'p'YYYY'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!'p'YYYY'" + "'", str1, "hi!'p'YYYY'");
    }

    @Test
    public void test23625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0H0M0.002Shi!                                                                                                                                                                                        ", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0H0M0.002Shi!                                                                                                                                                                                        " + "'", str2, "0H0M0.002Shi!                                                                                                                                                                                        ");
    }

    @Test
    public void test23626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23626");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23627");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("01990.00000td000y0p", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23628");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test23629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "hi!  hi!  hi!  hi!  hi!  hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi..." + "'", str1, "hi!  hi!  hi!  hi!  hi!  hi...");
    }

    @Test
    public void test23630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23630");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaSDNOCES", 961, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaSDNOCES                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaSDNOCES                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test23631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                              hi", " 0I! I! I! I! I! I! I! I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("010.00:00:0", "-1113235959.88");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23633");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                               ::.99");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test23634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("p0y0m0dt0h0m0.078s", "hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.078s" + "'", str2, "p0y0m0dt0h0m0.078s");
    }

    @Test
    public void test23635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23635");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray14 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!Hi!hi!", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'0 seconds", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " #0 days 0 hours 0 minutes 0 seconds ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0 seconds", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaahi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #h", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test23636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23636");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                     00noce0 0                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23637");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                 ::.99aaaaaaaaaap-1y11m30dt23h59m59.978s::.99aaaaaaaaaa                                                                                                                 ", 47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23638");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("h...", "P-1Y11-130DT2374359-159.9503599971", "   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       0000000000000000000I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test23639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!" + "'", str2, "44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
    }

    @Test
    public void test23640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23640");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 955, "                                                                                                                                44S970.0M0H0TD0M0Y0P                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                44955970.00000TD000Y0P                                                                                                                               " + "'", str2, "                                                                                                                                44955970.00000TD000Y0P                                                                                                                               ");
    }

    @Test
    public void test23641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("######################################hp0y000dt00000.01010#######################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################hp0y000dt00000.01010#######################################" + "'", str2, "######################################hp0y000dt00000.01010#######################################");
    }

    @Test
    public void test23642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23642");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("P0Y000DT00000.004281", "  I!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0i!0i!0i!0i!0i!0i!0i!0i!0i!", "AAAAAAAAAAHI!HI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0i!44444i  i  i  i  i  i0i!44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test23645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23645");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "P0Y0M0DT0H0M0.001S");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", charSequence2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test23646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("p0y0m0dt0h0m0.100s", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                            p0y0m0dt0h0m0.100s" + "'", str2, "                                                                            p0y0m0dt0h0m0.100s");
    }

    @Test
    public void test23647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("P0Y000DT00000.03796", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03796" + "'", str3, "P0Y000DT00000.03796");
    }

    @Test
    public void test23648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23648");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("P0Y0M0DT0H0M0.004S", "                                                                                                AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaa", "P0Y0M0DT00M0.051S");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test23649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "P0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD" + "'", str1, "p0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD");
    }

    @Test
    public void test23650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0                                                                                                                      PYYYYY0MDDT00 SECONDS", (int) (byte) 100, "P0Y0M0DT0H0M0.024");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0                                                                                                                      PYYYYY0MDDT00 SECONDS" + "'", str3, "P0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0                                                                                                                      PYYYYY0MDDT00 SECONDS");
    }

    @Test
    public void test23651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str1, "P0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test23652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23652");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", "0000000000000000000000000000000000!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test23653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23653");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                          ...", "hI!4444444SDNOCES  4444444444444444A4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23654");
        char[] charArray14 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       ...hi!4444444444444444444444444444444444444444444444a44444444444444444444444444444444444444", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4P41-004Y44114034DT44324954114411795444", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("P-1Y11M30DT23H59M59.819S", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!ihhi!hi!hi!", 58, 55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!ihhi!hi!hi!" + "'", str3, "!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!ihhi!hi!hi!");
    }

    @Test
    public void test23656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "#############################################################################P0Y0M0DT0H0M0.100S", "AAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test23657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23657");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                            I:II:IIII32                                            ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray10, strArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray17);
        int int20 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concatWith("        ", (java.lang.Object[]) strArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("                                            I:II:IIII32                                           0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!", strArray3, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!        hi!                        hi!        " + "'", str21, "hi!        hi!                        hi!        ");
    }

    @Test
    public void test23658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23658");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 845, "HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I!" + "'", str2, "0I!");
    }

    @Test
    public void test23659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23659");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", 476);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str2, "############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test23660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23660");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #h", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI!HI!HI!", 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 HI!HI!HI!                                                  " + "'", str2, "                                                 HI!HI!HI!                                                  ");
    }

    @Test
    public void test23662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23662");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0Ip0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y", (java.lang.CharSequence) "!ihaa                                                                                             !i0!i0!i0!i0!i0!i0!i0!i0!i0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("######################################HP0Y000DT00000.01010#######################################", "aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################HP0Y000DT00000.01010#######################################" + "'", str2, "######################################HP0Y000DT00000.01010#######################################");
    }

    @Test
    public void test23664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23664");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H..." + "'", str1, "H...");
    }

    @Test
    public void test23665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 476, " hi!   hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hhi!hi!hi      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   h" + "'", str3, " hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hhi!hi!hi      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   hi!  hi!   h");
    }

    @Test
    public void test23666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("             P0Y0M0DT0H0M0.009S             ", "0:00:00.108", 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             P0Y0M0DT0H0M0.009S             " + "'", str3, "             P0Y0M0DT0H0M0.009S             ");
    }

    @Test
    public void test23667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23667");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                       T 00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(" HI! HI! HI! HI! HI! HI! HI! HI!aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! HI! HI! HI! HI! HI! HI! HI!aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0" + "'", str1, "HI! HI! HI! HI! HI! HI! HI! HI!aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0");
    }

    @Test
    public void test23669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23669");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                            p0y0m0dt0h0m0.395s", "   00i!i!hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23670");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("H S0H S000H SH S0H S000H SH##hi##", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!S0S0S0hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H##  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!##" + "'", str5, "H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H   HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!H##  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!##");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test23671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23671");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 pyyyyy0mddt0h0m43.s44", "H P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23672");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("P0Y0M0DT0a0M0a99S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0a0M0a99S" + "'", str1, "P0Y0M0DT0a0M0a99S");
    }

    @Test
    public void test23673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23673");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAS H000S H0S HS H000S H0S HS H000S H0S H", "AAHI!P0000Y0-10DT07430-10.99359999144444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test23674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0000000000000000000000000000000000!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I" + "'", str3, "0000000000000000000000000000000000!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
    }

    @Test
    public void test23675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23675");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.40I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.4", "                                                                                                                      PYYYYY0MDDT00 SECONDS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111 + "'", int2 == 111);
    }

    @Test
    public void test23676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("I!i!i!                                                                                                                                                           ", "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00", "##########################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H###########################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!i!i!                                                                                                                                                           " + "'", str3, "I!i!i!                                                                                                                                                           ");
    }

    @Test
    public void test23677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("P0Y0M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0..." + "'", str2, "P0Y0M0DT0...");
    }

    @Test
    public void test23678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23678");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test23679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23679");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "        P0Y0M0DT0...", (java.lang.CharSequence) "000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P0Y000DT00000.09710");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "Hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str1, "Hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test23681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23681");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("   hi!  hi!P-1Y11M30DT23H59M59.853S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test23682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23682");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.056S", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "P-1Y11M30DT23H59M59.950S");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("p-1y11m30dt23h59m59.942s", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.056S" + "'", str5, "P0Y0M0DT0H0M0.056S");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "p-1y11m30dt23h59m59.942s" + "'", str9, "p-1y11m30dt23h59m59.942s");
    }

    @Test
    public void test23683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23683");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0444444444444444444444444444444444444444444444444444444444444444444444444444442", " HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23684");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 6, (long) 931, " HI!  HI.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 00I!  I." + "'", str3, " 00I!  I.");
    }

    @Test
    public void test23685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23685");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "P-1Y11M30DT23H59M59.803S", (java.lang.CharSequence) "i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P-1Y11M30DT23H59M59.803S" + "'", charSequence2, "P-1Y11M30DT23H59M59.803S");
    }

    @Test
    public void test23686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                   P-1Y11M30DT23H59M59.853S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23687");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0Y0M0DT0H0M0.99S", "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23688");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P-1Y11030DT23059059.711100                                                           ", "  hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23689");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!h...");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("HP0Y0M0DT0H0M0.019SaaaaaaaaaaaaP0Y0M0DT0H0M0.019SaaaaaaaaaaaaP0Y0M0DT0H0M0.019SaaaaaaaaaaaaP0Y0M0DT0H0M0.019Sa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test23690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23690");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "noce0  ", 487);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test23691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23691");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("0 day");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 day" + "'", str1, "0 day");
    }

    @Test
    public void test23693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23693");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) 0, "P-1Y11M30DT23H59M59.952S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9523599990" + "'", str3, "P-1Y11-130DT2374359-159.9523599990");
    }

    @Test
    public void test23694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23694");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("pa0aYa0aMa0aDTa0aHa0aMa0a.a045aS", "                                                                                                                                                                                                                                                                                                                          ###########p0y0m0dt0h0m0.000s############                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23695");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aahi", "Y0-10DT07430-1");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test23697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("p00-1y11m30dt23h59m59.999s00000000000000000000000000000023iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p00-1y11m30dt23h59m59.999s00000000000000000000000000000023iiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "p00-1y11m30dt23h59m59.999s00000000000000000000000000000023iiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test23698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23698");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0000000I!                                                                                       I!I!...I!                 I!I!..", "-1Y11M30DT23H59M59.853SIH                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23699");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "###################################################################################################################################################################################################################################################################################################################################################################################################0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!###################################################################################################################################################################################################################################################################################################################################################################################################", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################################################################################################################################################################################################################################################################################################################################################################0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!###################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "###################################################################################################################################################################################################################################################################################################################################################################################################0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!###################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test23700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str1, "Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test23701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4", "P0Y000DT00000.0711");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4" + "'", str2, "4444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4");
    }

    @Test
    public void test23702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23702");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'", (java.lang.CharSequence) "HI!44HI!44HI!44!HI!44HI!44HI!44H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23703");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhhP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23704");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test23705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Y0M0DT0H0", "                                                                                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000I!I!I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test23706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23706");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaahi!", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("P0Y0M0DT0H0M0.078S", "0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-'P'yyyy'Y'M'M'd'DT'H'H'm'", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.078S" + "'", str3, "P0Y0M0DT0H0M0.078S");
    }

    @Test
    public void test23708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23708");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                0", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23709");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  i!i!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test23710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23710");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!h" + "'", str1, "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!h");
    }

    @Test
    public void test23711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23711");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.151S", "P0Y0M");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23712");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                P0Y0M0DT0H0M0.100S");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0:00:00.009", (java.lang.CharSequence) "M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23714");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!i!i!", "...                  8010.00000TD000Y0P...                   ", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("P-1Y11M30DT23H59M59.949S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.949S" + "'", str1, "P-1Y11M30DT23H59M59.949S");
    }

    @Test
    public void test23716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23716");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("p40000004t404h40004.40000", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23717");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                            P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                            p0y0m0dt0h0m0.000s" + "'", str1, "                                                                                            p0y0m0dt0h0m0.000s");
    }

    @Test
    public void test23718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23718");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("############i!00000000000000000000000000000i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23719");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "hi!", (int) (short) 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a', 52, 51);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HP0Y000DT00000.01010", strArray6);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test23720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23720");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h", "H");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                     ", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("1117", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test23721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!", 146);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!" + "'", str2, "Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!");
    }

    @Test
    public void test23722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23722");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray15 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099", charArray15);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test23723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23723");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.045", (java.lang.CharSequence) "                                                                                                                                           'p'yyyy'y'm'm'd'dt'h'0 seconds                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23724");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("P-1Y11M30DT2359M59.999", "P-1Y11M30DT23H59M59.923S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000HS0HS000HSHS0HS000HSHS0HS000HS000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 608);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000HS0HS000HSHS0HS000HSHS0HS000HS000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000HS0HS000HSHS0HS000HSHS0HS000HS000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test23726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23726");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAAAAAAAAHI!HI!H...", "noce");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23727");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                       HI!HI!HI!HI!HI!HI...                                                                                                        ", "!i0                                                                                      ...", "###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test23728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23728");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 11, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test23729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" 0 D ", 151);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 0 D " + "'", str2, " 0 D ");
    }

    @Test
    public void test23730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23730");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("      0 seconds      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      0 SECONDS      " + "'", str1, "      0 SECONDS      ");
    }

    @Test
    public void test23731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                           ", "P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           " + "'", str2, "                           ");
    }

    @Test
    public void test23732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23732");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0:00:00.001");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test23733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23733");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44 0a0                                                                                                                                                                                                                                                                                            ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("HP-1Y11M30DT23H59M59.972SHh", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test23734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23734");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!  hi!  hi!-1Y11M30DT23H59M59.964S44hi!  hi!  hi! ", "syad 44");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                     SDNOCES 0                     ", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     SDNOCES 0                     " + "'", str2, "                     SDNOCES 0                     ");
    }

    @Test
    public void test23736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23736");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("m95h32td03m11y1-ps808.95m95h32td03m11y1-ps808.95m95h32td03m11y1-p0econ95h32td03m11y1-ps808.95m95h32td03m11y1-ps808.95m95h32td03m11y1-p", 103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23737");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                             059.872103                                              ", "P0Y0M0DT0H0M0.191S", 284);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23738");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 94);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.094S" + "'", str1, "P0Y0M0DT0H0M0.094S");
    }

    @Test
    public void test23739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23739");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) 138, "  hi! ###############################################################  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...#######################", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23740");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0:00:00.011", "           P-1Y11030DT23059059.97780");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "::" + "'", str3, "::");
    }

    @Test
    public void test23741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23741");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.079");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("P0Y0000DT0a00a9915", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("T 00 ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test23742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23742");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", "T0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23743");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "aahi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", (int) ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray3, strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "s0 S0 S0");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "Y0M0DT0H0                                         ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!" + "'", str5, "Hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S" + "'", str15, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test23744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23744");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                       'P'yyyy'Y'M'M");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'P'yyyy'Y'M'M" + "'", str1, "'P'yyyy'Y'M'M");
    }

    @Test
    public void test23745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Y0M0DT0H0M0.097P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0", "P0Y0M0DT0H0M0.834S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0" + "'", str2, "97P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0");
    }

    @Test
    public void test23746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23746");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "P0Y0M0DT0H0M0.395S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("P0Y000DT00000.139900                                                                                    ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.139900                                                                                    " + "'", str2, "P0Y000DT00000.139900                                                                                    ");
    }

    @Test
    public void test23748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23748");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!                                                                                                hi! hi!", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                                                                                hi! hi!" + "'", str3, "hi!                                                                                                hi! hi!");
    }

    @Test
    public void test23749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23749");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih...h!Ih!Ih                                       'H'TD'd'M'M'Y'yyyy'P'                                                                                                                                   0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0              0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0              0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0              0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0              0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0              0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0              0320:00:00.0320:00:00.0320:00:00.0320:0", 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I" + "'", str1, "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I");
    }

    @Test
    public void test23751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23751");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "-130DT2374359-159.8723599999");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("P00-1Y11030DT23059059.99913400000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99913400000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str2, "P00-1Y11030DT23059059.99913400000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test23753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23753");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("       0I!", "0:00:00.099", 143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23754");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AAAAAAAAAAAAP0Y0M0DT0H0M0.045S", "i!I!I!", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "       P-1Y11M30DT23 59M59.926S44444444444444444444444444444444444444444444444   44   44   44    44   44   44 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!000000000000000000000000073i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str2, "i!000000000000000000000000073i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test23757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23757");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "S401.0M0H0TD0M0Y0P");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "S401.0M0H0TD0M0Y0P" + "'", charSequence2, "S401.0M0H0TD0M0Y0P");
    }

    @Test
    public void test23758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-1", "4!ih444!ih4!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-1" + "'", str2, "0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-1");
    }

    @Test
    public void test23759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23759");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 151, (long) 970, " P yyyy Y        T H H         0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaa0I!p0y000dt00000.099-1HI!p");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " P 0000 Y        T 00          0I!p000000t00000.099-10I!p0aaaaaaaaaaaaaaaa0I!p000000t00000.099-10I!p" + "'", str3, " P 0000 Y        T 00          0I!p000000t00000.099-10I!p0aaaaaaaaaaaaaaaa0I!p000000t00000.099-10I!p");
    }

    @Test
    public void test23760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                            HI4a4hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4hi!a                            HI4" + "'", str2, "4hi!a                            HI4");
    }

    @Test
    public void test23761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23761");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0:00:00.038", "                                         P0Y0M0DT0H0M0.126S                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23762");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0                                               DAYS                                               ", "P-1Y11030DT23059059.780128");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI", 903, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI");
    }

    @Test
    public void test23764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0H0M0.002Shi!", " SECON");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0H0M0.002Shi!" + "'", str2, "0H0M0.002Shi!");
    }

    @Test
    public void test23765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23765");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("....099-10I!p...", 81, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23767");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "############i!00000000000000000000000000000i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", (java.lang.CharSequence) "Aahi!P0000Y0M0DT0H0M0.103S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23768");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaHi!Hi!H...", "P0Y0M0DT0H0M0.024");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                           p0000y0m0dth0 seconds                      ", "001560.00000TD000Y0p  hP00-1Y11030DT23059");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                           p0000y0m0dth0 seconds" + "'", str2, "                                                                                                                                           p0000y0m0dth0 seconds");
    }

    @Test
    public void test23770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23770");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aahi4hP0Y0M0DT0.0M0.010ShP0Y0M0DT0.0M", "p0y0m0dt0h0m0.100s", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23771");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" SECON", 495, "aaaaaaaaaaaaaaaaaaaa                                                                                              HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaa SECONaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaa SECONaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaaaaaaaaa                                                                                              HIaaaaaaaaaaaaa");
    }

    @Test
    public void test23772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("noce0  ", "p0y000dt00000.09910aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "noce0  " + "'", str3, "noce0  ");
    }

    @Test
    public void test23773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                            T0H0M0.096S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "T0H0M0.096S" + "'", str1, "T0H0M0.096S");
    }

    @Test
    public void test23774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23774");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 16, (long) 552, "                                                                                                                0                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                0                                                                                                                " + "'", str3, "                                                                                                                0                                                                                                                ");
    }

    @Test
    public void test23775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23775");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'dHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "S690.0M0H0TD0M0Y0P");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test23776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                             444597114", 72, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                             444597114" + "'", str3, "                                                                                                                             444597114");
    }

    @Test
    public void test23777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23777");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!  hi!  hi!  hi!  hi!  hi..", "hi!hi!h...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045SHhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045SHhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP" + "'", str1, "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045SHhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045SHhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP");
    }

    @Test
    public void test23779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", 122, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test23780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23780");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "noceHI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444                            hi  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test23781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23781");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 days", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444d 0                        4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test23782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaP-1Y11M30DT23H59M59.935", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    aaaaaaaaaP-1Y11M30DT23H59M59.935" + "'", str2, "                                                                    aaaaaaaaaP-1Y11M30DT23H59M59.935");
    }

    @Test
    public void test23783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23783");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0:00:00.139", "#############################################################################P0Y0M0DT0H0M0.100");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.139" + "'", str4, "0:00:00.139");
    }

    @Test
    public void test23784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23784");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaa", "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'                                       hI!hI!h...hi!", 89);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!     ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test23785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23785");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("440A0", (int) (byte) 10, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0:00:00.051");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23787");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                      PYYYYY0MDDT00 SECONDS", 288);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                      PYYYYY0MDDT00 SECONDS" + "'", str2, "                                                                                                                      PYYYYY0MDDT00 SECONDS");
    }

    @Test
    public void test23789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23789");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032                                                                               ", "444444444444444  HI!444444444444444                                                                                                                                                                                                                                                                               ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23790");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  ", 474);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                              0i!0i!0i!0i!0i!0i!0i!0i!0i!", 280, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test23792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23792");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                        010.00:00:0", "                                                                                                                                                                                          ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0:00:00.061", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.061" + "'", str2, "0:00:00.061");
    }

    @Test
    public void test23794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23794");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaa0I!p000000t00000.099-10I!p000000t00000.099-1p000000t00000.099-1p000000t00000.09", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23795");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                            P0Y0M0DT0H0M0.000S", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0:00:00.078", 611);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.078                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str2, "0:00:00.078                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test23797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23797");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0000000I!                                                                                       I!I!...I!                 I!I!..", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("TP-1Y11M30DT23H59M59.872S0", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TP-1Y11M30DT23H59M59.872S0" + "'", str3, "TP-1Y11M30DT23H59M59.872S0");
    }

    @Test
    public void test23799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23799");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "      0 SECONDS      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test23800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...", 27, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!P0Y000...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...");
    }

    @Test
    public void test23801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ihS200.0M0H0TD0M0Y0P!ihS200.0M0H0TD0M0Y0P!ih", "p00-1y11m30dt23h59m59.999s00000000000000000000000000000023iiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23802");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Y0M0DT0H0M");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Y0M0DT0H0M" + "'", str1, "Y0M0DT0H0M");
    }

    @Test
    public void test23803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "hi!hi!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!" + "'", str1, "hi!hi!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!");
    }

    @Test
    public void test23804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "P-1Y11030DT23059059.9839444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("P-1Y11M30DT23H59M59.872S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.872S" + "'", str1, "P-1Y11M30DT23H59M59.872S");
    }

    @Test
    public void test23806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23806");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hHH", "444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23807");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                    aaaaaaaaaP-1Y11M30DT23H59M59.935", "p-1y11m30dt23h59m59.903s", 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23808");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...3h59m59.872s", "..IH!IH!IH!IH!IH!IH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "I!  HI!  HI!  HI!  HI", 191, 275);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 191");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23809");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                 !hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23810");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444444444444S401.0M0H0TD0M0Y0P4444444444444444444444444444444444444444444444444444", (int) (short) 10, 91);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444S401.0M0H0TD0M0Y0P444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444S401.0M0H0TD0M0Y0P444444444444444444444");
    }

    @Test
    public void test23811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23811");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###############################################################################################  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", " I0i!44444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23812");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HHHH...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test23813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23813");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 697, "5940hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5940hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0" + "'", str3, "5940hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0");
    }

    @Test
    public void test23814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23814");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0Y0M0DT0H0M0.001S");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23815");
        char[] charArray12 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0:00:00.000", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("P-1Y11M30DT23H59M59.993Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
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
    }

    @Test
    public void test23816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23816");
        char[] charArray10 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444  hi!444444444444444", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("1010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23817");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("p-1y11m30dt23h59m59.993s0DAY88a", "P-1Y11M30DT23H59M59.809S", 31);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test23818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495" + "'", str1, "Hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495");
    }

    @Test
    public void test23819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("  hi!hi!hi!#######################", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############" + "'", str2, "###############");
    }

    @Test
    public void test23820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23820");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", 32);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s", strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("P0Y0M0DT0H0M0.037S", (java.lang.Object[]) strArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("                                         hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!                                            ", strArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!4444444sdnoces44444444444444444a4444444444444444444444444444444444444444444444", strArray12);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aahi!" + "'", str14, "aahi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23821");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", ' ');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("P0Y000DT00000.01010", strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny(" #0 days 0 hours 0 minutes 0 seconds !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444", strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                             0 -1616567633ECONDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test23822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!iha");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0:...                                                                                                                                                            ", "'p'YYYY'y'm'm'D'dt'h'                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:...                                                                                                                                                            " + "'", str2, "0:...                                                                                                                                                            ");
    }

    @Test
    public void test23824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("44 0a00", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23825");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                         aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23826");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("P-1Y11M30DT23H59M59.950S", 282, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23827");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                      'p'yyyy'y'm'm'd'dt'h'", '4');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test23828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23828");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str3, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test23829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P0Y0M0DT0H0M0.098S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "P0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str1, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test23831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M", "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0414 0 0  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0 0 0  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0 0 0  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ihDT00000.086414", 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M");
    }

    @Test
    public void test23832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("P0Y000DT00000.28966i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444", "P00-1y11-130dt2374359-159.999359998900000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.28966i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444" + "'", str2, "P0Y000DT00000.28966i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
    }

    @Test
    public void test23833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23833");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#####################p y m dt h m n 56s.372s", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23834");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0:00:00.029", "                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih", "P0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...P0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M0DT0H0M0.097SP0Y0M");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih" + "'", str2, "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih");
    }

    @Test
    public void test23836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.09P0:00:00.0900:00:00.09Y0:00:00.0900:00:00.09M0:00:00.0900:00:00.09DT0:00:00.0900:00:00.09H0:00:00.0900:00:00.09M0:00:00.0900:00:00.09.0:00:00.090450:00:00.09S", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.09P0:00:00.0900:00:00.09Y0:00:00.0900:00:..." + "'", str2, "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.09P0:00:00.0900:00:00.09Y0:00:00.0900:00:...");
    }

    @Test
    public void test23837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23837");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P-1Y11030DT23059059.999", "p0y0m0dt0h0m0.195s");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test23838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("  HI!  HI!  HI!  HI!  HI!  HI..", "44444444444444444444444444444444444444444444444444444444444444444444'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23839");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0:0i!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444...", "", (int) (byte) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test23840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23840");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "H!IH!IH P0Y0M0DT0H0M0.086S", (java.lang.CharSequence) "T0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23841");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 476, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045476" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045476");
    }

    @Test
    public void test23842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23842");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("P0Y0M0DT0H0M0.970S", "hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       0I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  hi!", "hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 903);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.970S" + "'", str4, "P0Y0M0DT0H0M0.970S");
    }

    @Test
    public void test23843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23843");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "p0y0m0dt0h0m0.195s", (java.lang.CharSequence) "####M#DT#P#M#.##1S###M#DT#P#M#.##1Sseconds");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23844");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...aaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP...", "S130.0M0H0TD0M...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!     " + "'", str2, "    hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!     ");
    }

    @Test
    public void test23846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23846");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 372, (long) 336, "       HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23847");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "999.95M95H32TD03M11Y1-P");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test23848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44459711441145942344TD43041144Y400-14P4", "P0Y0M0DT0H0M0.107SP0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.0013599969P0Y0-10DT0730-10.001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44459711441145942344TD43041144Y400-14P4" + "'", str2, "44459711441145942344TD43041144Y400-14P4");
    }

    @Test
    public void test23849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23849");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("  hi!     hi!  ", "HhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "0:00:00.02");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!     hi!  " + "'", str3, "  hi!     hi!  ");
    }

    @Test
    public void test23850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("I!00000000000000000000000000000743I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", "P0Y0000DT0a00a9915");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!00000000000000000000000000000743I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I" + "'", str2, "I!00000000000000000000000000000743I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
    }

    @Test
    public void test23851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test23852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23852");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P0Y0M0DT0H0M0.458S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23853");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0", "##'P'yyyy'");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23854");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("         444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P4         ", "...AAAAAAAAAAAAAAAAAAAAA0000I!I!I!", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P4         " + "'", str3, "         444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P4         ");
    }

    @Test
    public void test23855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23855");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0SECONDS", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23856");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "0 DAYS", 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAA...", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str6, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str8, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test23857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23857");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P-1Y11M30DT23H59M59.984Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                              HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23858");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...", "I I I I I I I I I I I I I I I I I I I I I I I I ", 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23859");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hP0Y0M0DT0H0M0.010S");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "743i!i!i! ");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                               0:00:00.032444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test23860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23860");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str1, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test23861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23861");
        char[] charArray12 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! s0 s0 s0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("-1Y11M30DT23H59M59.964S44", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "        p0y0m0dt0...", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test23862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23862");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "P-1Y11M30DT23H59M59.809", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23863");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...44444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H", "230.00:00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23864");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", "h P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S0s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23865");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0S 0S", "                                                                                       HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!", 188);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test23866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23866");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "P0Y0M0DT0H0M0.004S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "H!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test23868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23868");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("AAAAAAAAAA", "P0Y0M0DT0H0M0.019Saaaaaaaaaaaa", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23869");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("M30DT23H59M59.872S", '4');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test23870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23870");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                          743i!i!i! ", 52, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23871");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "S010.0M0H0TD0M0Y0Ph");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!       0I!", 24, 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h'h'm'm's.s'saahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!       0I!" + "'", str3, "h'h'm'm's.s'saahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!       0I!");
    }

    @Test
    public void test23873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23873");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!Hi!hi!Hi!Hi!Hi!hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test23874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23874");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0.414S############################################################################################################################################################", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23875");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAA01990.00000td000y0p", ":00:00.495");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23876");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.000:00:00.00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23877");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("'Sdnoces", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("001560.00000TD000Y0p  hP00-1Y11030DT23059                                                                             ", "                                                                              P0Y0M0DT0H0M0.009S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "001560.00000TD000Y0p  hP00-1Y11030DT23059                                                                             " + "'", str3, "001560.00000TD000Y0p  hP00-1Y11030DT23059                                                                             ");
    }

    @Test
    public void test23879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hSECONDS", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hSECONDS" + "'", str2, "0hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hSECONDS");
    }

    @Test
    public void test23880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23880");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test23881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                               P0Y0-10DT07430-10.2713599914                           ", "00NOCE0 0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00NOCE0 0" + "'", str2, "00NOCE0 0");
    }

    @Test
    public void test23882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23882");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23883");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test23884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23884");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(" S0 S0 S0 ", "0:00:00.000", 9);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " S S S " + "'", str4, " S S S ");
    }

    @Test
    public void test23885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23885");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 961, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test23886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23886");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444444AAHI!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444AAHI!4444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444AAHI!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test23887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0 DAYSHI!HI!HI!HI!HI!HI..HI", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 DAYSHI!HI!HI!HI!HI!HI..HI" + "'", str2, "0 DAYSHI!HI!HI!HI!HI!HI..HI");
    }

    @Test
    public void test23888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23888");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "S H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 390 + "'", int1 == 390);
    }

    @Test
    public void test23889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23889");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" I", "S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23890");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("p0y0m0dt0h0m0.020s", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23891");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 79, 0L, "97P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S" + "'", str2, "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S");
    }

    @Test
    public void test23893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23893");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0:00:000000:00:000000:00:000000:00:000000:00:000000:0AA0:p0000y0-10dt07430-1099359999:00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000:00:000000:00:000000:00:000000:00:000000:00:000000:0AA0:p0000y0-10dt07430-1099359999", " SAAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M", 41, 531);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:000000:00:000000:00:000000:00:000000 SAAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M" + "'", str4, "0:00:000000:00:000000:00:000000:00:000000 SAAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M");
    }

    @Test
    public void test23894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23894");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 52);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahi!  hi!  hi!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str5, "aaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahi!  hi!  hi!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test23895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!", "0SECONDP0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D", "                                                                                              hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!" + "'", str3, "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!");
    }

    @Test
    public void test23896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                44010000TD000Y0000P                                                                                                                               ", "P0Y000DT00000.281495");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                44010000TD000Y0000P                                                                                                                               " + "'", str2, "                                                                                                                                44010000TD000Y0000P                                                                                                                               ");
    }

    @Test
    public void test23897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                            I:II:IIII32                                            ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 15, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            I:II:IIII32                                            ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "                                            I:II:IIII32                                            ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test23898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23898");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("2890 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!Hi!Hi!Hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!Hi!Hi!Hi!Hi!H", "", 306);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("   HI!  HI!  HI!  HI!  HI!  H", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test23899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23899");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "########################################################################444444444444444444                    ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("0:00:00.306", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0", "AAAAAAAAAA0I!I!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0" + "'", str2, "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0");
    }

    @Test
    public void test23901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAA...P0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test23902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("p0y0-10dt07430-10.1913599982", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23903");
        char[] charArray14 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  ###############################################################################################", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!H", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         HP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993Saaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test23904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23904");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("d 0                        ", "I000000000000000IIIIIIIIIIIIIII  hi!", 161);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23905");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih...h!Ih!Ih                                       'H'TD'd'M'M'Y'yyyy'P'                                                                                                                      ", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih...h!Ih!Ih                                       'H'TD'd'M'M'Y'yyyy'P'                                                                                                                      " + "'", str3, "!ih...h!Ih!Ih                                       'H'TD'd'M'M'Y'yyyy'P'                                                                                                                      ");
    }

    @Test
    public void test23906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23906");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "Hi!4hi!444hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!4hi!444hi!" + "'", str1, "hi!4hi!444hi!");
    }

    @Test
    public void test23907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23907");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "P0Y0M0DT0H0M0.395S");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", charSequence2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test23908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23908");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("S010.0M0H0TD0M0Y0P", 91);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23909");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0!i0                                           23IIII:II:I                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str4, "p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test23910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23910");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahHI hHI hHI hHIhhhhHI hHI hHI hHI", "!", 29);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test23911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23911");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "'                                            I:II:IIII32                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23912");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!4440i!hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!444");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("'m'm'D'dt'h'h'M'm'S.s's'hI!", '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("aahi!P0000Y0-10DT07430-10.99359999aahi!P0000Y0-10DT07430-10.99359999aahi!P0000Y0-10DT07430-10.99359999aahi!P0000Y0-10DT07430-10.99359999aahi!P0000                                      aahi!", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aahi!P0000Y0-10DT07430-10.99359999aahi!P0000Y0-10DT07430-10.99359999aahi!P0000Y0-10DT07430-10.99359999aahi!P0000Y0-10DT07430-10.99359999aahi!P0000                                      aahi!" + "'", str8, "aahi!P0000Y0-10DT07430-10.99359999aahi!P0000Y0-10DT07430-10.99359999aahi!P0000Y0-10DT07430-10.99359999aahi!P0000Y0-10DT07430-10.99359999aahi!P0000                                      aahi!");
    }

    @Test
    public void test23913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23913");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "P-1Y11M30DT23H59M59.932S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23914");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("I! ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                          P-1Y11M30DT23H59M59.424S", strArray3, strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("28010.00000TD000Y0Ph");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray6, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                          P-1Y11M30DT23H59M59.424S" + "'", str7, "                                                                          P-1Y11M30DT23H59M59.424S");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test23915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23915");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HIHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI", "...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test23916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23917");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0:00:00.492", 109, 591);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.492" + "'", str3, "0:00:00.492");
    }

    @Test
    public void test23918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "1117");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23919");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("SecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecoS'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'!ihaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecoS'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'!ihaa" + "'", str1, "SecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecoS'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'!ihaa");
    }

    @Test
    public void test23920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23920");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "   hI!hI!HI!", 47);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test23921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23922");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 63, (long) 611);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.548S" + "'", str2, "P0Y0M0DT0H0M0.548S");
    }

    @Test
    public void test23923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                           1                                                              ", "P-1Y11M30DT23H59M59.977S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           1                                                              " + "'", str2, "                                           1                                                              ");
    }

    @Test
    public void test23924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23924");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H.!I0HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H...HI!HI!H..");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test23925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("i!00000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!0000000000000000000000000" + "'", str2, "i!0000000000000000000000000");
    }

    @Test
    public void test23926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "                                                                                                                      PYYYYY0MDDT00 SECONDS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test23927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("####################################P-1Y11M30DT23H59M59.991S#####################################", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################P-1Y11M30DT23H59M59.991S#####################################" + "'", str2, "####################################P-1Y11M30DT23H59M59.991S#####################################");
    }

    @Test
    public void test23928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23928");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aahi!P0000Y0-10DT07430-10.993599991");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23929");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("P0Y0M0DT0H0M0.121S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S121.0M0H0TD0M0Y0P" + "'", str1, "S121.0M0H0TD0M0Y0P");
    }

    @Test
    public void test23930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23930");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!" + "'", str1, "! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
    }

    @Test
    public void test23931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23931");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!hi!hi!hi!h!i  i!hi!hi!hi!h", "P0Y0M0D...                        ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!hi!h!ii!hi!hi!hi!h" + "'", str3, "i!hi!hi!hi!h!ii!hi!hi!hi!h");
    }

    @Test
    public void test23932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23932");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!44I!44I!44I!44I!44I..", 190, "y0m0dt0h0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!44I!44I!44I!44I!44I..y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y" + "'", str3, "000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!44I!44I!44I!44I!44I..y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y");
    }

    @Test
    public void test23933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23933");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "hi!4hi!444hi!", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!4hi!444hi!" + "'", charSequence2, "hi!4hi!444hi!");
    }

    @Test
    public void test23934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                       000i!i!...", 900);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          000i!i!..." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          000i!i!...");
    }

    @Test
    public void test23935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23935");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  HI! HI! HI! HI!HHHHI! HI! HI! HI!   ", "        H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23936");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaap0Y0M0DT0H0M0.045S", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! Hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test23937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23937");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("I!                                                                                                  P                                                                                                  I..", "18 000018 0018 018 000018 0018 018 000018 0018 018 000018 0018 018 000018 0018 018 000018 0018...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test23938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23938");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!0I!0I!0I!0I!0I!0I!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0Ip0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y#######################################################################################################################################################################################################################", "HI!Hi!Hi!H...HI!H", "         1010.00000td000y0p        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test23939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23939");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(" S0 S0 S0 ", "                                                                                                                 ::.99aaaaaaaaaaP-1Y11M30DT23H59M59.978S::.99aaaaaaaaaa                                                                                                                 ", 604);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23940");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P yyyy Y        T", 284, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P yyyy Y        T###########################################################################################################################################################################################################################################################################" + "'", str3, "P yyyy Y        T###########################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test23941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("P-1Y11M30DT23H59M59.999", "0:00:00.079");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999" + "'", str2, "P-1Y11M30DT23H59M59.999");
    }

    @Test
    public void test23942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("00: 00: 0i! hi!   hi!hi!  hi!  hi!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00: 00: 0I! HI!   HI!HI!  HI!  HI!  " + "'", str1, "00: 00: 0I! HI!   HI!HI!  HI!  HI!  ");
    }

    @Test
    public void test23943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23943");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAASYAD 0AAAAHHHAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD 0AAAAHHHAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD " + "'", str1, "AAAAAAAAAASYAD 0AAAAHHHAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD 0AAAAHHHAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD ");
    }

    @Test
    public void test23944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23944");
        char[] charArray11 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                0", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P00-", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y000DT00000.020134", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "S870.0M0H0TD0M0Y0P", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "         444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P4         ", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44 days", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 96 + "'", int13 == 96);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23945");
        char[] charArray14 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                P0Y0M0DT0H0M0.100S", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test23946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23946");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("..", 126, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444..44444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444..44444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test23947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23947");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("P0Y000...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y000..." + "'", str1, "P0Y000...");
    }

    @Test
    public void test23948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23948");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                               ");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test23949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...0seconds", 487);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0seconds" + "'", str2, "...0seconds");
    }

    @Test
    public void test23950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23950");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...:00.032", "!HI!HI!H                                           ", 903);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "P-1Y11M30DTS0 S0 S0P-1Y11M30DT2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DTS0 S0 S0P-1Y11M30DT2" + "'", str2, "P-1Y11M30DTS0 S0 S0P-1Y11M30DT2");
    }

    @Test
    public void test23952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23952");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("I I I I I I I I I I I I I I I I I I I I I I I I I...", "                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            743I!  P-1Y11-130DT2374359-159.9033599964...000000000000000000000000000000743I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test23953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23953");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("h                                                                                                                          ...", "                                                                                                                                                                                                             ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi" + "'", str1, "44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi");
    }

    @Test
    public void test23955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23955");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("p      t h   .    ", 318, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097SHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097SHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097SHI!HI!HI!p      t h   .    " + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097SHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097SHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097SHI!HI!HI!p      t h   .    ");
    }

    @Test
    public void test23956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23956");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444440:00:00.30644444444444444", strArray4, strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "                                                                                              hi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray8, strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "444444444444440:00:00.30644444444444444" + "'", str9, "444444444444440:00:00.30644444444444444");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str13, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test23957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("h444!ih4!ih..I0  !I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h444!ih4!ih..I0  !I" + "'", str1, "h444!ih4!ih..I0  !I");
    }

    @Test
    public void test23958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23958");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0000000000000000000I!  I!  I!  I!  I!  I!  I! ", "P-1Y11M30DT23H59M59.923S");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test23959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23959");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 111, (long) 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.982S" + "'", str2, "P-1Y11M30DT23H59M59.982S");
    }

    @Test
    public void test23960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23960");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "IH                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH                                                                                              " + "'", str1, "IH                                                                                              ");
    }

    @Test
    public void test23961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23961");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.002S", "hi!hi!hi! ", (int) (short) 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s0:...p-1y11m30dt23h59m59.808s", strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test23962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23962");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444" + "'", str2, "0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test23963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                i!", "P-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051Sp-1yhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", "AAAAAAAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test23964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0I!0I!0I!0I!0I!0I!0I!0I!0I! AAHI", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I!0I!0I!0I!0I!0I!0I!0I!0I! AAHI" + "'", str2, "0I!0I!0I!0I!0I!0I!0I!0I!0I! AAHI");
    }

    @Test
    public void test23965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                              aahi!  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                             ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              aahi!  " + "'", str2, "                                                                                              aahi!  ");
    }

    @Test
    public void test23966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23967");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HP-1Y11M30DT23H59M59.972SHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HP-1Y11M30DT23H59M59.972SH" + "'", str1, "HP-1Y11M30DT23H59M59.972SH");
    }

    @Test
    public void test23968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23968");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", ' ');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny(" S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str7, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test23969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi", "00DT00000.03477");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi" + "'", str2, "!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi");
    }

    @Test
    public void test23970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" D0 D0 D0 '", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "D0D0D0'" + "'", str2, "D0D0D0'");
    }

    @Test
    public void test23971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23971");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "Hi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aaS0aS0aS0ahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!a", 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23972");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097S");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "!ihS200.0M0H0TD0M0Y0P!ihS200.0M0H0TD0M0Y0P!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test23973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                P0Y0M0DT0H0M0.100S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                P0Y0M0DT0H0M0.100S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str1, "                P0Y0M0DT0H0M0.100S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test23974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  i", "######################################hp0y000dt00000.01010#######################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  i" + "'", str2, " ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  i");
    }

    @Test
    public void test23975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23975");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!", "P0Y0000DT0a00a9915", 288);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test23976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23976");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 5, "44444444444444444444444hi! hi! hi! hi!hhhhi! hi! hi! hi!444444444444444444444444", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaahi!", "P-1Y11M30DT23H59M59.994S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaahi!" + "'", str2, "aaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test23978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                            p0Y000DT00000.065100", "hS H000S H0S HS H000S H0S HS H000S H0S Hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("daysI!I!I!I!I!I!I!I!I!I!I!I!I...", "P00-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "daysI!I!I!I!I!I!I!I!I!I!I!I!I..." + "'", str2, "daysI!I!I!I!I!I!I!I!I!I!I!I!I...");
    }

    @Test
    public void test23980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23980");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "P0Y0M0DT0H0M0.397S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                     0                                                   0                                                   0                                                   0                                                   0                                                   0       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0                                                   0                                                   0                                                   0                                                   0                                                   0" + "'", str1, "0                                                   0                                                   0                                                   0                                                   0                                                   0");
    }

    @Test
    public void test23982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23982");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23983");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 62, (long) 36, "daysI!I!I!I!I!I!I!I!I!I!I!I!I...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "30a086399I!I!I!I!I!I!I!I!I!I!I!I!I..." + "'", str3, "30a086399I!I!I!I!I!I!I!I!I!I!I!I!I...");
    }

    @Test
    public void test23984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("................................................................0a:a00a:a00a.a03", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'dHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "................................................................0a:a00a:a00a.a03" + "'", str2, "................................................................0a:a00a:a00a.a03");
    }

    @Test
    public void test23985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23985");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h", "0 SECONDS");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!H", strArray5, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAAAAAAAA", strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("P0Y0M0DT0H0M0.387S", strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!H" + "'", str8, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test23986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23986");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aahi!P0000Y0-10DT07430-10.99359999144444444", "HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI", (int) '#');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("P0Y0M0DT0H0M0.289SI!4444444444444444444444444444444444444444444444AAHI!444444444444444444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test23987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23987");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("S0 S0 S0", "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.09P0:00:00.0900:00:00.09Y0:00:00.0900:00:...", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test23988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0:00:00.0974444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.090:00:00.1060:00:00.0974444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.09", "hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       0I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":00:00.0974444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.090:00:00.1060:00:00.0974444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.09" + "'", str2, ":00:00.0974444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.090:00:00.1060:00:00.0974444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.09");
    }

    @Test
    public void test23989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23989");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 19, "P0Y000DT00000.065100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "P0Y000DT00000.065100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test23990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23990");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444", "0Y0M0DT0H0M0.99S                                                                                                                                                                                                                                                                                 ", 970);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                             0i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ", 918, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test23991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAA" + "'", str2, "aAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test23992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!  hi!  h", 72, "P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hP'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'" + "'", str3, "hi!  hi!  hP'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'");
    }

    @Test
    public void test23993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23993");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "P0Y0M0DT0H0M0.041S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test23994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23994");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ", 969, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test23995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("P0Y000DT00000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y000DT00000" + "'", str1, "P0Y000DT00000");
    }

    @Test
    public void test23996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("p0y0m0dt0h0m0.020s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "s020.0m0h0td0m0y0p" + "'", str1, "s020.0m0h0td0m0y0p");
    }

    @Test
    public void test23997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23997");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("P-1Y11M30DT23H59M59.950S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.950S" + "'", str1, "P-1Y11M30DT23H59M59.950S");
    }

    @Test
    public void test23998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23998");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 76, "!ihaa                                                                                             !i0!i0!i0!i0!i0!i0!i0!i0!i0", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("           00noce0 0        ", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        00noce0 0        " + "'", str2, "        00noce0 0        ");
    }

    @Test
    public void test24000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test24000");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...                                 !i0!i0!i0!i0!i0!i0!i0!i0!i0", "...                 hi! hi!   hi!hi! hi!   hi...");
        org.junit.Assert.assertNotNull(strArray2);
    }
}

