import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test17501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17501");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih", "aahi!D");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17502");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test17504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17504");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 17, "0:00:00.028");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.028" + "'", str2, "0:00:00.028");
    }

    @Test
    public void test17505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17505");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17506");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "S001.0M0H0TD0M0Y0P                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17507");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                    ", "4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444Y4YYYY4P4         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17508");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "S H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S...", (java.lang.CharSequence) "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17509");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hS H000S H0S HS H000S H0S HS H000S H0S Hh", (java.lang.CharSequence) "P0Y0M0DT0H0M0.104S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17510");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("p0y0m0dt0h0m0.100s", "...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...######################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17511");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...          0 seconds                      ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S", "0 seconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S" + "'", str2, "aaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S");
    }

    @Test
    public void test17513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17513");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0:00:00.082", (java.lang.CharSequence) "                            HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("I I I I I I I I I I I I I I I I I I I I I I I I ", "                         44 days                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I I I I I I I I I I I I I I I I I I I I I I I I " + "'", str2, "I I I I I I I I I I I I I I I I I I I I I I I I ");
    }

    @Test
    public void test17515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17515");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 128, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11024", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11024" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11024");
    }

    @Test
    public void test17516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ", "00noce0  ", "                                                                                       Hi!Hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    " + "'", str3, "hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ");
    }

    @Test
    public void test17517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("i!Hi!Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("P-1Y11M30DT23H59M59.533S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.533S" + "'", str1, "P-1Y11M30DT23H59M59.533S");
    }

    @Test
    public void test17519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17519");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("28010'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!.'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h", 51, " 0 0 0  0 0 0.930");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28010'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!.'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h" + "'", str3, "28010'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!.'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h");
    }

    @Test
    public void test17520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17520");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!0s 0s 00s 0s 00s 0s 00s 0s 00s ", "00DNOCE 0");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "Hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test17521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17521");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "0:00:00.027");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17522");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                 'P'yyyy... ", 197, " #0 days 0 hours 0 minutes 0 seconds");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                 'P'yyyy...  #0 days 0 hours 0 minutes 0 seconds #0 days 0 hours 0 mi" + "'", str3, "                                                                                                                                 'P'yyyy...  #0 days 0 hours 0 minutes 0 seconds #0 days 0 hours 0 mi");
    }

    @Test
    public void test17523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17523");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                           'p'yyyy'y'm'm'd'dt'h'0 seconds                      ", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                           'p'yyyy'y'm'm'd'dt'h'0 seconds                      " + "'", str3, "                                                                                                                                           'p'yyyy'y'm'm'd'dt'h'0 seconds                      ");
    }

    @Test
    public void test17524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                    ", "DNOCES0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    " + "'", str2, "                                                    ");
    }

    @Test
    public void test17525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !", "230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !" + "'", str2, "H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !");
    }

    @Test
    public void test17526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17526");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 83);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.083" + "'", str1, "0:00:00.083");
    }

    @Test
    public void test17527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("p-1y11m30dt23h59m59.073s", "P00-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P00-" + "'", str2, "P00-");
    }

    @Test
    public void test17528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17528");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                       hI!hI!h...hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("0I!pp0Y000DT00000.01010", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.01010" + "'", str2, "0I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.01010");
    }

    @Test
    public void test17530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17530");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S H", "P-1Y11M30DT2359M59.999", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17531");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s" + "'", str2, "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test17532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17532");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "P0Y0M0DT0H0M0.024");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0Y0M0DT0H0M0.024" + "'", str1, "p0Y0M0DT0H0M0.024");
    }

    @Test
    public void test17533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17533");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 106, (long) 139);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.033S" + "'", str2, "P0Y0M0DT0H0M0.033S");
    }

    @Test
    public void test17534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'HI" + "'", str1, "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'HI");
    }

    @Test
    public void test17535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                           ", "H        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           " + "'", str2, "                                                                                           ");
    }

    @Test
    public void test17536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("P0Y0M0DT0H0M0.005S", 118);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.005S" + "'", str2, "P0Y0M0DT0H0M0.005S");
    }

    @Test
    public void test17537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17537");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "-1Y11030DT23059059.99379", 281);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17538");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #", "                                                                                                                                           hi!                                                                                                hi! hi!                                            ", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17539");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "Hi!4hi!444hi!", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0i!4hi!444hi!" + "'", str3, "0i!4hi!444hi!");
    }

    @Test
    public void test17540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("P0Y0M0DT0H0M0.495S", "        P0Y0M0DT0H0M0.100S           ", 55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.495S" + "'", str3, "P0Y0M0DT0H0M0.495S");
    }

    @Test
    public void test17541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17541");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 16, (long) 103, "0SECONDP0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("################################################################################################################################################################################################################################################################################################################################################################################################################################################### aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###################################################################################################################################################################################################################################################################################################################################################################################################################################################", 306, 87);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#################################################################################..." + "'", str3, "...#################################################################################...");
    }

    @Test
    public void test17543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17543");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!  hi!  hi!  hi!  hi!  hi..hi!", "");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0:00:00.053", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "i! hi!   hi!hi!  hi!  hi!  ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi..hi!" + "'", str6, "hi!  hi!  hi!  hi!  hi!  hi..hi!");
    }

    @Test
    public void test17544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17544");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44459711441145942344TD43041144Y400-14P4", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!4hi!444hi HI!  HI..hi!4hi!444hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17545");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("P-1Y11030DT23059059.780128");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17546");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "P-1Y11M30DT23H59M59.987S", 611);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17547");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaahi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi", "###############################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17548");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aP0Y0M0DT0H0M0.151Sa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17549");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "P0Y0M0DT0H0M0.099SI:II:IIII32P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SI:II:IIII32P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0Y0M0DT0H0M0.099SI:II:IIII32P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SI:II:IIII32P0Y0M0DT0H0M0.099S" + "'", str1, "p0Y0M0DT0H0M0.099SI:II:IIII32P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SI:II:IIII32P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test17550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17550");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0Y0M0DT0H0M0.99S                                                                                                                                                                                                                                                                                 ", "", "Aahi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17551");
        char[] charArray9 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("0 DAYS", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi! hi!   hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0:00:00.969", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test17552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1" + "'", str1, "4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1");
    }

    @Test
    public void test17553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17553");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y000DT00000", "444444444444444444444444444444444444444444444444444aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17555");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0haaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11024", "000 0 0                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("   00i!i!hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00i!i!hi!" + "'", str2, "00i!i!hi!");
    }

    @Test
    public void test17557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "###t 00###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###t 00###" + "'", str1, "###t 00###");
    }

    @Test
    public void test17558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17558");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0 ", "###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH###########IhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhHIhH", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("###########p0y0m0dt0h0m0.000s############                                          ", 397);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                          ###########p0y0m0dt0h0m0.000s############                                          " + "'", str2, "                                                                                                                                                                                                                                                                                                                          ###########p0y0m0dt0h0m0.000s############                                          ");
    }

    @Test
    public void test17560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaahi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi", "0:00:00.038");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaahi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi" + "'", str2, "aaaaaaaaaaaaaahi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi");
    }

    @Test
    public void test17561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("P0Y000000000000000000-1P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000000000000000000-1P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD" + "'", str2, "P0Y000000000000000000-1P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD");
    }

    @Test
    public void test17562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih" + "'", str1, "!ih!ih!ih");
    }

    @Test
    public void test17563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17563");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi!ahi!aaahi!a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17564");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "P0Y0M0DT0H0M0.009S", 414);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17565");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("############i!00000000000000000000000000000i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               'M'M'd'DT'H'H'm'M's.S'S'Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("P-1Y11M30DT23H59M59.903S", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.903S" + "'", str2, "P-1Y11M30DT23H59M59.903S");
    }

    @Test
    public void test17567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17567");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0:00:00.033                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.033                                                                                        " + "'", str1, "0:00:00.033                                                                                        ");
    }

    @Test
    public void test17568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17568");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17569");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17570");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI!", (-1), 78);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17571");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "p0y0m0dt0h0m0.020s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17572");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0econ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17573");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P-1Y11030DT23059059.9839", "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                                                              P00-1                                                                                                                                               ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0 SECOND");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("0 days 0 hours 0 minutes 0 secondsi!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!H", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P-1Y11030DT23059059.9839" + "'", str5, "P-1Y11030DT23059059.9839");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                              p000000t0h000.0090");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                              p000000t0h000.0090" + "'", str1, "                                                                              p000000t0h000.0090");
    }

    @Test
    public void test17575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.0040:00:00.004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17576");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##hi!", "P00-");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.018S", 143);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.018S                                                                                                                             " + "'", str2, "P0Y0M0DT0H0M0.018S                                                                                                                             ");
    }

    @Test
    public void test17578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "0:00:00.007");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test17579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!", "...                                AAHI!                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!" + "'", str2, "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!");
    }

    @Test
    public void test17580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("... hI!hI!h...hi! ...", 608);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ... hI!hI!h...hi! ..." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ... hI!hI!h...hi! ...");
    }

    @Test
    public void test17581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17581");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!#######################", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("TAHAH", "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  !ihaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17583");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 7, (long) 82, "T 0 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "T 0 " + "'", str3, "T 0 ");
    }

    @Test
    public void test17584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17584");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                            p0Y000DT00000.065100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                            P0y000dt00000.065100" + "'", str1, "                                                                            P0y000dt00000.065100");
    }

    @Test
    public void test17585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17585");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ", 29, "HhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               " + "'", str3, "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ");
    }

    @Test
    public void test17586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Sdnoces", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Sdnoces" + "'", str2, "Sdnoces");
    }

    @Test
    public void test17587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17587");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444P0Y000DT00000.099104444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444p0y000dt00000.099104444" + "'", str1, "4444p0y000dt00000.099104444");
    }

    @Test
    public void test17588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0" + "'", str1, "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0");
    }

    @Test
    public void test17589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  " + "'", str1, "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ");
    }

    @Test
    public void test17590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!4444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaahi!444444444444444444444444444444444444444444...", 63, 197);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaahi!444444444444444444444444444444444444444444..." + "'", str3, "aaahi!444444444444444444444444444444444444444444...");
    }

    @Test
    public void test17591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17591");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y0M0DT0H0M0.387S", ":00:00.096");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17592");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HP0Y000DT00000.01010", 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17593");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#############################################################################P0Y0M0DT0H0M0.100", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.100" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.100");
    }

    @Test
    public void test17594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17594");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  hi!  hi!  !ih", "0I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.010100I!pp0Y000DT00000.01010", 2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17595");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ", (java.lang.CharSequence) "HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 277 + "'", int2 == 277);
    }

    @Test
    public void test17596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "h        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17597");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", "AAAAAAAAAAHI!HI!H...", 290);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'44", "S0 S0 S0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "'Sdnoce");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17600");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440...", " S0 S0 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                              1                                                              ", "              44 days              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              1                                                              " + "'", str2, "                                                              1                                                              ");
    }

    @Test
    public void test17602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17602");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17603");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!HI!HI!H                                           ", "IH", "0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!I0!I0!I                                           " + "'", str3, "!I0!I0!I                                           ");
    }

    @Test
    public void test17604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17604");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAAAAAAAAAAAAAAAAAAAAAAAA##", ".                                      hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17606");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", 608, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("999.95095032TD03011Y1-P", "743i!i!i! ", "P0Y0M0DT0H0M0.191S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "999.95095032TD03011Y1-P" + "'", str3, "999.95095032TD03011Y1-P");
    }

    @Test
    public void test17608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17608");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "'m'm'D'dt'h'h'M'm'S.s's'hI!", (int) '4');
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("          Hi!                                                           hi!", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("0S 0S 0", strArray6);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray15, strArray22);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray22);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray24, "hi!");
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray24, "hi!", (int) (byte) 100, 10);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray24);
        java.lang.String[] strArray33 = org.apache.commons.lang3.StringUtils.stripAll(strArray24, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        boolean boolean34 = org.apache.commons.lang3.StringUtils.endsWithAny("  hi!  hi!  hi!  hi!  hi!  hi...", strArray24);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray24);
        int int36 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray24);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray24);
        java.lang.String[] strArray39 = org.apache.commons.lang3.StringUtils.stripAll(strArray24, "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray24, "i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", 62, 225);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 62");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!hi!hi!" + "'", str37, "hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray39);
    }

    @Test
    public void test17609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17609");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp" + "'", str1, "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp");
    }

    @Test
    public void test17610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17610");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0:00:00.082", "P-1Y11030DT23059059.9839");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("001560.00000TD000Y0p  hP00-1Y11030DT23059", "      0 seconds      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001560.00000TD000Y0p  hP00-1Y11030DT23059" + "'", str2, "001560.00000TD000Y0p  hP00-1Y11030DT23059");
    }

    @Test
    public void test17612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17612");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("T H H", "P0Y0M0DT0H0M0.062S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444", "AAAAAAAA###############################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444" + "'", str2, "hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test17614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17614");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("h        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17615");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("t h h", "0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y000dt00000.0459                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17616");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!", "I..I..I..I..I..I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            ", 969, "743I!  P-1Y11-130DT2374359-159.9033599964...000000000000000000000000000000743I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            743I!  P-1Y11-130DT2374359-159.9033599964...000000000000000000000000000000743I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I" + "'", str3, "                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            743I!  P-1Y11-130DT2374359-159.9033599964...000000000000000000000000000000743I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I");
    }

    @Test
    public void test17618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444", "aaaaaaaaaaHi!Hi!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444" + "'", str2, "Hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test17619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                       P00-1", "0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       P00-1" + "'", str2, "                       P00-1");
    }

    @Test
    public void test17620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT" + "'", str3, "1010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT");
    }

    @Test
    public void test17621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi! hi!   hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "30.00:00:0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi!   hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "hi! hi!   hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test17622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17622");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P", 91, "0:00:00.027");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0:00:00.0270:00:00.0270:00:00.0270:00:00.0270:00:00.0270:00:00.0270:00:00.0270:00:00.0270:" + "'", str3, "P0:00:00.0270:00:00.0270:00:00.0270:00:00.0270:00:00.0270:00:00.0270:00:00.0270:00:00.0270:");
    }

    @Test
    public void test17623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17623");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test17625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P-1Y11M30DT23H59M59.991S", 97, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################P-1Y11M30DT23H59M59.991S#####################################" + "'", str3, "####################################P-1Y11M30DT23H59M59.991S#####################################");
    }

    @Test
    public void test17626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...0HS0HS000HSHS0HS000HSHS0HS000HS000000000000000000000000000000000000000000000000000000000000000...", "0 seconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI!", "T4H4H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17628");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17629");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("S130.0M0H0TD0M...", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17630");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P-1Y11M30DT23H59M59.730S", "4444444444444444444444444444444444444444444444AAHI!4444444444444444444444444444444444444444444444", 52);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17631");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'HI!" + "'", str1, "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'HI!");
    }

    @Test
    public void test17632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17632");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                                       1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test17633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17633");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAHI!p0000y0-10dt07430-10.99359999144444444", "!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17634");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!P0000Y0M0DT0H0M0.99S");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "P-1Y11M30DT23H59M59.908S");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "HI!  HI!  HI!  HI!  HI!  HI...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aahi!P0000Y0M0DT0H0M0.99S" + "'", str4, "aahi!P0000Y0M0DT0H0M0.99S");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17635");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  ", "aaP0Y000DT00000.0459", 97);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  " + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  ");
    }

    @Test
    public void test17636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17636");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("P0Y000DT00000.010100Y000DT00000.001110", "!I0!I0!I                                           ", "aAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010100Y000DT00000.001110" + "'", str3, "P0Y000DT00000.010100Y000DT00000.001110");
    }

    @Test
    public void test17637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17637");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'H", "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17638");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih", "'m'm'D'dt'h'h'M'm'S.s's'hI!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("0i!", '4');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("p0y0m0dt0h0m0.020s", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "p0y0m0dt0h0m0.020s" + "'", str9, "p0y0m0dt0h0m0.020s");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih" + "'", str10, " !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih");
    }

    @Test
    public void test17639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17639");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("           4444444444444444444444444444A4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17640");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 68, " HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 0000000000000000000I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  " + "'", str2, " 0000000000000000000I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  ");
    }

    @Test
    public void test17641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17641");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'", 38, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaa" + "'", str3, "'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaa");
    }

    @Test
    public void test17642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test17643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17643");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "P0Y0M0DT0H0M0.019S", "...    ...", 318);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str4, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test17644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "0:00:00.015");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.015" + "'", str2, "0:00:00.015");
    }

    @Test
    public void test17645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17645");
        char[] charArray6 = new char[] { ' ', ' ' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI! ", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "00 D", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ".s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P-1Y11M30DT23H59M59.973S", charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test17646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17646");
        char[] charArray13 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.000S", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                 P0Y0M0DT0H0M0.001S                 ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h...", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test17647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17647");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0:00:00.047", "hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17648");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("d", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "p0y0m0dt0h0m0.930s4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
    }

    @Test
    public void test17649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444" + "'", str1, "HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test17650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17650");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P-1Y11M30:00:00.134DT23H59M59.999", "                                            I:II:IIII32                                            ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17651");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    ", "0:00:00.028                                                                         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032", "P p00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032" + "'", str2, "0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032");
    }

    @Test
    public void test17653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17653");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", "'m'm'D'dt'h'h'M'm'S.s's'hI!", (int) (short) 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("aaP0Y000DT00000.0459", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S", strArray5, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S" + "'", str8, "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test17654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        " + "'", str2, "        ");
    }

    @Test
    public void test17655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17655");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(" DAYS                                                                                                DAYS                                                                                               ", "p0y000dt00000.010100y000dt00000.001110", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0         ", "!I!I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0         " + "'", str2, "0         ");
    }

    @Test
    public void test17657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17657");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "ai!aaaaaaaaaaaaaaaa2ahi!aaa  i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17658");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                  P                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17659");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("010 0 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "i! hi! hi! hi! hi! hi! hi! hi", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("sdnoces  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sdnoces  " + "'", str2, "sdnoces  ");
    }

    @Test
    public void test17661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17661");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "hi!", (int) (short) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', 52, 51);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.Class<?> wildcardClass14 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test17662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", "44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS" + "'", str2, "                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
    }

    @Test
    public void test17663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17663");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                           h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", (java.lang.CharSequence) "                                                            44 days                                                             ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                           h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" + "'", charSequence2, "                           h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
    }

    @Test
    public void test17664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...                                AAHI!                                              ", "#########0M0.001S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17665");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                    ", "                           P-1Y11M30DT23H59M59.853S", 474, 612);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                               P-1Y11M30DT23H59M59.853S" + "'", str4, "                                               P-1Y11M30DT23H59M59.853S");
    }

    @Test
    public void test17666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17666");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0 daysaahi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("P0Y0M0DT0H0M0.464S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.464S" + "'", str1, "P0Y0M0DT0H0M0.464S");
    }

    @Test
    public void test17668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000H S0H S000H SH S0H S000H SH S0H S000H S00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "...0 ...0 ...0 0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320", "0:00:00.007");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000H:S0H:S000H:SH:S0H:S000H:SH:S0H:S000H:S00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000H:S0H:S000H:SH:S0H:S000H:SH:S0H:S000H:S00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test17669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17669");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("I I I I I I I I I I I I I I I I I I I I I I I I I...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I I I I I I I I I I I I I I I I I I I I I I I I I..." + "'", str1, "I I I I I I I I I I I I I I I I I I I I I I I I I...");
    }

    @Test
    public void test17671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                           ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17672");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!444444400noce0  4444444444444444a4444444444444444444444444444444444444444444444", 77, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!444444400noce0  4444444444444444a4444444444444444444444444444444444444444444444" + "'", str3, "hi!444444400noce0  4444444444444444a4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test17673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17673");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa", 970, "                                         P0Y0M0DT0H0M0.126S                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                        aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                         P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                        aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test17674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17674");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("   P-1Y11M30DT23H59M59.989S    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str1, "P-1Y11M30DT23H59M59.989S");
    }

    @Test
    public void test17675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17675");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!  hi!  hi!  hi!  hi!  hi..hi!", 101, 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17676");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.990" + "'", str1, "P-1Y11M30DT23H59M59.990");
    }

    @Test
    public void test17677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17677");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", 52, 126);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "459" + "'", str3, "459");
    }

    @Test
    public void test17678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17678");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  ###############################################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 128, "P0Y0M0DT0H0M0.930S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  ###############################################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  ###############################################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test17679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  hi!  hi!  hi!  hi!  hi!  hi...", 697, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!  hi!  hi!  hi!  hi!  hi..." + "'", str3, "  hi!  hi!  hi!  hi!  hi!  hi...");
    }

    @Test
    public void test17680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17680");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "                                                Hi!                                                 ", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("444444444444444  hi!444444444444444", "S130.0M0H0TD0M...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17682");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44 0a00", " 0 0 0  0 0 0.930");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17683");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.100", "hi!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17684");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("P0Y0M0DT0H0M0.271S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17685");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 seconds");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 seconds" + "'", str1, "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 seconds");
    }

    @Test
    public void test17686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17686");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("P0Y0M0DT0H0M0.032S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str1, "P0Y0M0DT0H0M0.032S");
    }

    @Test
    public void test17687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17687");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test17688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                       Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAAAAA...", (int) (short) 100, "   00i!i!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   00i!i!hi!   00i!i!hi!   00i!i!hi!  AAAAAAAAAAAAAAAAAAAAA...   00i!i!hi!   00i!i!hi!   00i!i!hi!  " + "'", str3, "   00i!i!hi!   00i!i!hi!   00i!i!hi!  AAAAAAAAAAAAAAAAAAAAA...   00i!i!hi!   00i!i!hi!   00i!i!hi!  ");
    }

    @Test
    public void test17690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17690");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("        P0Y0M0DT0H0M0.063S        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!                              ", 227, 82);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("01990.00000td000y0p");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01990.00000td000y0p" + "'", str1, "01990.00000td000y0p");
    }

    @Test
    public void test17693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                         P0Y0M0DT0H0M0.126S                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         P0Y0M0DT0H0M0.126S                                         " + "'", str1, "                                         P0Y0M0DT0H0M0.126S                                         ");
    }

    @Test
    public void test17694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17694");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "P0Y0M0DT0H0M0.078S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17695");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                               44459711441145942344TD43041144Y400-14P4", "hi!hi!hi!hi!hi!hi..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17696");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.100115", "  i!i!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17697");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days" + "'", str1, "!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days");
    }

    @Test
    public void test17698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17698");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 225, "P0Y0M0DT0H0M0.068S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.068225" + "'", str2, "P0Y000DT00000.068225");
    }

    @Test
    public void test17699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17699");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", "P0Y0M0DT0H0M0.034S", "::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224::224");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIH" + "'", str3, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
    }

    @Test
    public void test17700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444" + "'", str1, "hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test17701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17701");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI                                                                                        HI HI H...HI", "                                                                                              hi!", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17702");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H", "P00-1Y11030DT23059059.99913400000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17703");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test17704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17704");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                       ", 476, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test17705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17705");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Hi!4hi!444hi!4", "P0Y0M0DT0H0M0.032S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17706");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("P-1Y11M30DT23H59M59.679S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17707");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#########0M0.001S###########################...", "                                                               44459711441145942344TD43041144Y400-14P4");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test17708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaa", "...i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test17709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17709");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaa", "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17710");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("t 00 ", "                                                                                                                               P00-1Y11M30DT23H59M59.964S44                                                                                                                                ", 24);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17711");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S", (java.lang.CharSequence) "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17712");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0i!0i!0i!0i!0i!0i!0i!0i!0i!", "28010.00000td000y0ph");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!0i!0i!0i!0i!0i!0i!0i!0i!" + "'", str2, "0i!0i!0i!0i!0i!0i!0i!0i!0i!");
    }

    @Test
    public void test17713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17713");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17714");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "      HI!aahi!P0000Y0-10DT07430-10.99359999      HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", "P-1Y11M30DT23H59M59.999Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17716");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "####################################P-1Y11M30DT23H59M59.991S#####################################", "  #############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17717");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0Ip0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y", 107);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! ", 20, 51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!  ..." + "'", str3, "...!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!  ...");
    }

    @Test
    public void test17719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("p000000t0h000.2710 0a00", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p000000t0h000.2710 0a00                                        " + "'", str2, "p000000t0h000.2710 0a00                                        ");
    }

    @Test
    public void test17720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17720");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                            I:II:IIII32                                           0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!", "P0Y0M0DT0H0M0.509S");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17721");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("               P0Y0M0DT0H0M0.395S              ", 0, "P0Y0M0DT0H0M0.063S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               P0Y0M0DT0H0M0.395S              " + "'", str3, "               P0Y0M0DT0H0M0.395S              ");
    }

    @Test
    public void test17722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s###########i", 50, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s###########i" + "'", str3, "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s###########i");
    }

    @Test
    public void test17724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P0Y0M0DT0H0M0.053S", "0:00:00.139");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.053S" + "'", str2, "P0Y0M0DT0H0M0.053S");
    }

    @Test
    public void test17725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44 0a0", "P-1Y11M30DT23H59M59.780S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44 0a0" + "'", str2, "44 0a0");
    }

    @Test
    public void test17726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17726");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!Hi!H...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) (short) 10, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray15, strArray22);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray22);
        int int25 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray22);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.stripAll(strArray22, "0i!");
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray27);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.concatWith("P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", (java.lang.Object[]) strArray27);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("P-1Y11M30DT23H59M59.952S", strArray2, strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!Hi!H..." + "'", str8, "Hi!Hi!H...");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hhh" + "'", str28, "hhh");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str29, "hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test17727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("P-1Y11M30DT23H59M59.937S", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17728");
        char[] charArray14 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  ", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaa", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  I!", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 ...", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "I!I!I!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test17729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17729");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAHI!p0000y0-10dt07430-10.99359999144444444", "P0Y0M0DT0H0M0.134S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           ...!hi!hi!h                                                                                                            ", "h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           ...!hi!hi!h                                                                                                            " + "'", str2, "HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           ...!hi!hi!h                                                                                                            ");
    }

    @Test
    public void test17731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "T 0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17732");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   000000I!  I!  I!  I!  I!  I");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17733");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#4440#i#!#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444", "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", 281, 95);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17735");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                                                                                                                                                               0:00:00.004");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                               0:00:00.004" + "'", str1, "                                                                                                                                                                                                                                                                               0:00:00.004");
    }

    @Test
    public void test17736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17736");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! Hi!", 106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17737");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("              ", (int) (short) -1, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052.." + "'", str1, "52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052..");
    }

    @Test
    public void test17739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...          0 0econ00                      ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test17740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17740");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh" + "'", str1, "###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh");
    }

    @Test
    public void test17741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17741");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "p0Y0M0DT0H0M0.043S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test17742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17742");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) " P yyyy Y        T H H         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17743");
        char[] charArray11 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       T H H         ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                                                           aahi!p0000y0m0dt0h0m0.99s", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test17744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17744");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17745");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("P0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17746");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!p00-1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!P00-1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!P00-1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test17747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17747");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) 21, "                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              " + "'", str3, "                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ");
    }

    @Test
    public void test17748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17748");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("743i!i!i! ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!0i!0i!0i!0i!0i!0i0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!0i!0i!0i!0i!0i!0i", "                                                                                                      AAHI!'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!0i!0i!0i!0i!0i!0i0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!0i!0i!0i!0i!0i!0i" + "'", str2, "0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!0i!0i!0i!0i!0i!0i0i!0i!0i!0i!0i!0i!0i!0i!0i! aahi!0i!0i!0i!0i!0i!0i");
    }

    @Test
    public void test17750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17750");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0                                                                                                                      PYYYYY0MDDT00 SECONDS", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 23);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                                                                      P0Y0M0DT0H0M0.397S                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                      P0Y0M0DT0H0M0.397S                                                                                                                                                                                                      " + "'", str1, "                                                                                                                                                                                                      P0Y0M0DT0H0M0.397S                                                                                                                                                                                                      ");
    }

    @Test
    public void test17752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("P 0000 Y        T 0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 0 T        Y 0000 P" + "'", str1, " 0 T        Y 0000 P");
    }

    @Test
    public void test17753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17753");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("'Sdnoces");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'sdnoces" + "'", str1, "'sdnoces");
    }

    @Test
    public void test17754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17754");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "i!Hi!H..", (java.lang.CharSequence) "S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17755");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                     sdnoces 0                     ", (java.lang.CharSequence) "0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!...                                                       hI!hI!h...hi!                          ...0i!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17756");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                             ", (java.lang.CharSequence) "P-1Y11M30DT23H59M59.826S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 205 + "'", int2 == 205);
    }

    @Test
    public void test17757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                " + "'", str2, "                                                                                                ");
    }

    @Test
    public void test17758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17758");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 00 ", "p-1y11m30dt23h59m59.937s", 961);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("000000000", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000000000" + "'", str2, "000000000");
    }

    @Test
    public void test17760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17760");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hp0y0m0dt0h0m0.097s", 118, 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17761");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "444444444444444P0Y0M0DT0H0M0.395S444444444444444", (java.lang.CharSequence) "                                                                                       Hi!Hi!H..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17762");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(":00:00.495", "HI!  HI!  HI!  HI!  HI!  HI...                                                                 ", 11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "  hECON ", 17, 604);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               " + "'", str3, "                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ");
    }

    @Test
    public void test17764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17764");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "0I!p0y000dt00000.099-1HI!p0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17765");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H", "444444444444444  hi!444444444444444", 126);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17766");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S0S00S0S00S0S00S0S00S", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17767");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAAAAAAAAA0I0AAAAAAAAAAAAAAA");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test17768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("P-1Y11M30DT23H59M59.612S", "hi!4hi!444hi HI!  HI..hi!4hi!444hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.612S" + "'", str2, "P-1Y11M30DT23H59M59.612S");
    }

    @Test
    public void test17769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17769");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("P-1Y11M30DT23H59M59.942S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p-1y11m30dt23h59m59.942s" + "'", str1, "p-1y11m30dt23h59m59.942s");
    }

    @Test
    public void test17770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17770");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17771");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0i!P0Y000DT00000.00228hi!P0Y  ip-10110300t23h59059.80800i!P0Y000DT00000.00228hi!P0Y  ip-10110300t23h59059.80800i!P0Y000DT00000.00228hi!P0Y  ip-10110300t23h59059.80800i!P0Y000DT00000.00228hi!P0Y  ip-10110300t23h59059.80800i!P0Y000DT00000.00228hi!P0Y  i", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!P0Y000DT0000..." + "'", str2, "0i!P0Y000DT0000...");
    }

    @Test
    public void test17772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17772");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                             aahi!", "P0Y0M0DT0H0M0.271", 31);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test17773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17773");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "S001.0M0H0TD0M0Y0P                ", (java.lang.CharSequence) "!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!i");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "S001.0M0H0TD0M0Y0P                " + "'", charSequence2, "S001.0M0H0TD0M0Y0P                ");
    }

    @Test
    public void test17774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17774");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17775");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                444S4S4M4m4H4H4TD4d4...", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17776");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-1", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0", "P0Y0M0DT0H0M0.043S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp" + "'", str2, "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp");
    }

    @Test
    public void test17778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", "0econ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
    }

    @Test
    public void test17779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17779");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!       0I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!       0I!" + "'", str1, "aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!       0I!");
    }

    @Test
    public void test17780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("p-1y11m30dt23h59m59.903s", "h!ih!ih!ih!i  i!h!ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "T 00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" P yyyy Y        T H H         ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " P yyyy Y        T H H         " + "'", str2, " P yyyy Y        T H H         ");
    }

    @Test
    public void test17783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", 35, 289);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!I!I!I!I!I!I!I!I!" + "'", str3, "!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test17784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17784");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!", "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0T- H  M30.9 0  0  0T- H  M30.92");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test17786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17786");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 224, ".09981P0Y000DT00000.09981P0Y000DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".09981P0Y000DT00000.09981P0Y000DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str3, ".09981P0Y000DT00000.09981P0Y000DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test17787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17787");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaa", "h");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "d");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444444444P0Y0M0DT0H0M0.395S444444444444444", strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaaaaaaaaa" + "'", str8, "aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test17788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17788");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase(" HI! HI! HI! HI! HI! HI! HI! HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444444444444  hi!444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444  hi!444444444444444" + "'", str1, "444444444444444  hi!444444444444444");
    }

    @Test
    public void test17790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hi!hi!  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i" + "'", str1, "hi!hi!hi!  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i");
    }

    @Test
    public void test17791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17791");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "P-1Y11M30DT23H59M59.808S");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test17792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!  ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!  ..." + "'", str1, "...!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!  ...");
    }

    @Test
    public void test17793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17793");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "  !ih  !ih  !ih  !ih  !ih  !ih  ", (java.lang.CharSequence) "HI!  P-1Y11M30DT23H59M59.903S...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "  !ih  !ih  !ih  !ih  !ih  !ih  " + "'", charSequence2, "  !ih  !ih  !ih  !ih  !ih  !ih  ");
    }

    @Test
    public void test17794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17794");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i...", "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "'p'!!!!'y'm'm''dt'h'h'm'm'.s's'hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i..." + "'", str3, "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i...");
    }

    @Test
    public void test17795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17795");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(":00:00.01", "!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17796");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'" + "'", str1, "'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'");
    }

    @Test
    public void test17797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17797");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                       ", "4444444444444444444444444444aahi!44444444444444444444444444444444444444444444", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17798");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.082S", "  0econ00", 68);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17799");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 32, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444", 224);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("i!i!i!", "0:00:00.083");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!i!i!" + "'", str2, "i!i!i!");
    }

    @Test
    public void test17802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.40I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.4", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045", "######################################HP0Y000DT00000.01010#######################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("00I!  I..", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00I!  I.." + "'", str2, "00I!  I..");
    }

    @Test
    public void test17805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i" + "'", str2, " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i");
    }

    @Test
    public void test17806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17806");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                         P0Y0M0DT0H0M0.126S                 ...", "0:00:00.017");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17807");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", 955);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17808");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI!  HI!  HI!  HI!  HI!  HI...", "444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                   ", 86);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI..." + "'", str3, "HI!  HI!  HI!  HI!  HI!  HI...");
    }

    @Test
    public void test17809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17809");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "##hi!", 318);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17810");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("T 00 ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "T00" + "'", str2, "T00");
    }

    @Test
    public void test17812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17812");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("t 00", 81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17813");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                        0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0", "P-1Y11M30DT23H59M59.908S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17814");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0 D0 D0 D0 hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SM'M'd'DT'H'H'm'M's.S'S'44", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("P0Y0M0DT0H0M0.395S", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.395S" + "'", str3, "P0Y0M0DT0H0M0.395S");
    }

    @Test
    public void test17816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17816");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0:0i!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:0i!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444..." + "'", str1, "0:0i!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444...");
    }

    @Test
    public void test17817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17817");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(".065100", "", 189);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test17818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Hi!Hi!H..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Hi!H." + "'", str1, "Hi!Hi!H.");
    }

    @Test
    public void test17819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !" + "'", str2, "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !");
    }

    @Test
    public void test17820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17820");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "daysI!I!I!I!I!I!I!I!I!I!I!I!I...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17821");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0DAY88", 75, "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.0DAY88Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S" + "'", str3, "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.0DAY88Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S");
    }

    @Test
    public void test17822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17822");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("              ", "h P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.01", "HI!  HI!  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17823");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("P0Y0M0DT0H0M0.024");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "420.0M0H0TD0M0Y0P" + "'", str1, "420.0M0H0TD0M0Y0P");
    }

    @Test
    public void test17824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17824");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("P-1Y11M30DT23H59M59.935S", "HI!  HI!  HI!  HI!  HI!  HI..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17825");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 3, (long) 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.012S" + "'", str2, "P0Y0M0DT0H0M0.012S");
    }

    @Test
    public void test17826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("  #############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  #############" + "'", str1, "  #############");
    }

    @Test
    public void test17828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17828");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("###################################################################################P0Y0M0DT0H0M0.372S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################################################################P0Y0M0DT0H0M0.372S" + "'", str1, "###################################################################################P0Y0M0DT0H0M0.372S");
    }

    @Test
    public void test17829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("I!                                                                                                  P                                                                                                  I..", "0econ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!                                                                                                  P                                                                                                  I.." + "'", str2, "I!                                                                                                  P                                                                                                  I..");
    }

    @Test
    public void test17830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17830");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("'P'yyyy'Y'M'M'd'DT'H'                                       hI!hI!h...hi!", "0TD000Y0Ph");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test17832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44                                                                                            P0Y0M0DT0H0M0.000S                                                                                            P0Y0M0DT0H0M0.000Shi!", 492);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44                                                                                            P0Y0M0DT0H0M0.000S                                                                                            P0Y0M0DT0H0M0.000Shi!" + "'", str2, "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44                                                                                            P0Y0M0DT0H0M0.000S                                                                                            P0Y0M0DT0H0M0.000Shi!");
    }

    @Test
    public void test17833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("P0Y0M0DT0H0M0...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0..." + "'", str2, "P0Y0M0DT0H0M0...");
    }

    @Test
    public void test17834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("p00-1Y11M30DT23H59M59.964S44                                                                                                                                                                   ", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p00-1Y11M30DT23H59M59.964S44                        " + "'", str2, "p00-1Y11M30DT23H59M59.964S44                        ");
    }

    @Test
    public void test17835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " HI! HI! HI! HI! HI! HI! HI! HI" + "'", str1, " HI! HI! HI! HI! HI! HI! HI! HI");
    }

    @Test
    public void test17836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI", "0...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test17837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17837");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hhh", (int) (byte) 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "         S S hi!");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!  HI!  HI!  HI!  HI!  HI..", "                     0                              ", 48);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("T0H0M0.096S", strArray6, strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI.." + "'", str11, "HI!  HI!  HI!  HI!  HI!  HI..");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "T0H0M0.096S" + "'", str12, "T0H0M0.096S");
    }

    @Test
    public void test17838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17838");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0 days 0 hours 0 minutes 0 secondsi!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!Hii!Hi!H", 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("P0Y0M0DT0H0M0.020S", "0:00:00.033");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.020S" + "'", str2, "P0Y0M0DT0H0M0.020S");
    }

    @Test
    public void test17840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17840");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("p00-1Y11030DT23059059.964144", 0, 189);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p00-1Y11030DT23059059.964144" + "'", str3, "p00-1Y11030DT23059059.964144");
    }

    @Test
    public void test17841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAAAAAAAAAAAAAAAA0:00:00.010", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                                                                                                                                                                    P0Y...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAA0:00:00.010" + "'", str2, "AAAAAAAAAAAAAAAAAA0:00:00.010");
    }

    @Test
    public void test17842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17842");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Y0M0DT0H0M", "P-1Y11030DT23059059.991511", "P0Y0M0D...                        ", 118);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Y0M0DT0H0M" + "'", str4, "Y0M0DT0H0M");
    }

    @Test
    public void test17843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17843");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("28010.00000TD000Y0PH", "P 0000 Y        T 0 P0Y0M0DT0H0M0.397SP0Y0M0DT0H0M0.397SP0Y0M0DT0H0M0.397SP0Y0M0DT0H0", 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17844");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.000S", "hi!hi!hi! ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", (int) ' ');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("hI!", strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!", strArray3, strArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!" + "'", str13, "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test17845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17845");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P-1Y11M30DT23H59M59.937S", 139, "  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.937S  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI" + "'", str3, "P-1Y11M30DT23H59M59.937S  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI");
    }

    @Test
    public void test17846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17846");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P00-1Y11030DT23059059.99913400000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "S H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S...", 135);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P00-1Y11030DT23059059.99913400000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str4, "P00-1Y11030DT23059059.99913400000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test17847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444" + "'", str2, "4444444444");
    }

    @Test
    public void test17848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44" + "'", str1, "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44");
    }

    @Test
    public void test17849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17849");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 43, (long) 76, "P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993300000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str3, "P00-1Y11030DT23059059.9993300000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test17850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17850");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(":0230.00:00:0230.00:00:0230.00:00:023044444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":0230.00:00:0230.00:00:0230.00:00:023044444444444" + "'", str1, ":0230.00:00:0230.00:00:0230.00:00:023044444444444");
    }

    @Test
    public void test17851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17851");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "-1Y11030DT23059059.99379", (java.lang.CharSequence) "...44444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17852");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "#############################################################################P0Y000DT00000.100115", (java.lang.CharSequence) "                    ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "#############################################################################P0Y000DT00000.100115" + "'", charSequence2, "#############################################################################P0Y000DT00000.100115");
    }

    @Test
    public void test17853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444", "HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           ...!hi!hi!h                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444" + "'", str2, "hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test17855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17855");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", 97, 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! " + "'", str3, "...  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
    }

    @Test
    public void test17856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17856");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S", (int) '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str4, "0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test17857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17857");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "P-1Y11M30DT23H59M59.780S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17858");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                        HI!  HI!  HI!  HI!  HI!  HI...                                      ", "0:00:00.495", 77);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 0:00:00.495                                 " + "'", str3, "                                 0:00:00.495                                 ");
    }

    @Test
    public void test17859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17859");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("P-1Y11M30DT23H59M59.942S", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                           aahi!p0000y0m0dt0h0m0.99s", "I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0Ip0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                           aahi!p0000y0m0dt0h0m0.99s" + "'", str2, "                                                                           aahi!p0000y0m0dt0h0m0.99s");
    }

    @Test
    public void test17861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(":00:00.139", 955);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":00:00.139                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, ":00:00.139                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test17862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                                                                                                                                                         P-1Y11M30DT23H59M59.424S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                         p-1y11m30dt23h59m59.424s" + "'", str1, "                                                                                                                                                                                                                                                                         p-1y11m30dt23h59m59.424s");
    }

    @Test
    public void test17863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17863");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "HI!  HI!  HI!  HI!  HI!  HI..", 17);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17864");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                            p0y0m0dt0h0m0.395s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17865");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 903);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17866");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "S ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!0:00:00.008hi!0:00:00.008hi!", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!0:00:00.008hi!0:00:00.008hi!" + "'", str2, "hi!0:00:00.008hi!0:00:00.008hi!");
    }

    @Test
    public void test17868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17868");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 77, (long) (short) -1, "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17869");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0 seconds");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0   seconds" + "'", str5, "0   seconds");
    }

    @Test
    public void test17870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "00: 00: 00:00: 00: 00:00: 00: 00:");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17871");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("P-1Y11M30DT23H59M59.923S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17872");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("days", "8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17873");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "P00-1Y11030DT23059059.99913400000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17874");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 903, "P0Y0M0DT0H0M0.034S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.034903" + "'", str3, "P0Y000DT00000.034903");
    }

    @Test
    public void test17875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17875");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0000000I!44I!44I!44!I!44I!44I!44", "h0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", 77);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17876");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "", 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0:00:00.306", "00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.306" + "'", str2, "0:00:00.306");
    }

    @Test
    public void test17878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17878");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.106");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("P-1Y11M30DT23H59M59.826S", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17880");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("p YYYY y      ", " !I!I!I347");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17882");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y000DT00000.020134P0Y000DT00000.020134P 0 d P0Y000DT00000.020134P0Y000DT00000.020134P", "                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17883");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                                                                                                                                                 P00-1Y11M30DT23H59M59.964S44                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P00-1Y11M30DT23H59M59.964S44" + "'", str1, "P00-1Y11M30DT23H59M59.964S44");
    }

    @Test
    public void test17884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("P-1Y11M30DT23H59M59.881S", "                                      P0Y0M0DT0H0M0.035S                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      P0Y0M0DT0H0M0.035S                                       " + "'", str2, "                                      P0Y0M0DT0H0M0.035S                                       ");
    }

    @Test
    public void test17885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17885");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "  ", (int) (short) -1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "0:00:00.032");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", (int) ' ');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S" + "'", str6, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test17886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17886");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", 3, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17887");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("#############################################################################################################################P0Y0hP0Y0M", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                              0i!0i!0i!0i!0i!0i!0i!0i!0i!", "...                  8010.00000TD000Y0P...                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              0i!0i!0i!0i!0i!0i!0i!0i!0i!" + "'", str2, "                                                              0i!0i!0i!0i!0i!0i!0i!0i!0i!");
    }

    @Test
    public void test17889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17889");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", "...aaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP...", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" !ih", "                                                                                                                                                                                        0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " !ih" + "'", str2, " !ih");
    }

    @Test
    public void test17891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17891");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hI!4444444SDNOCES  4444444444444444A4444444444444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAA...", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17892");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 608, (long) 201);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.593S" + "'", str2, "P-1Y11M30DT23H59M59.593S");
    }

    @Test
    public void test17893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "743I!I!I!0:00:00.086 0i!0i!0i!0i!0i!0i!0i!0i!" + "'", str2, "743I!I!I!0:00:00.086 0i!0i!0i!0i!0i!0i!0i!0i!");
    }

    @Test
    public void test17894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17894");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH" + "'", str1, "!iH");
    }

    @Test
    public void test17895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17895");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#########0M0.001S##################################################################################################", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                              7111                                               ", "Hhhaaaaa", (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              7111                                               " + "'", str3, "                                              7111                                               ");
    }

    @Test
    public void test17897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0", 139, "000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P0Y000DT00000.09710");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0" + "'", str3, "000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0");
    }

    @Test
    public void test17898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17898");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("sdnoces 0'h'td'd'm'm'y'yyyy'p'                                                                                                                                                                                                                                                                    ", "44444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.100", "pa0aYa0aMa0aDTa0aHa0aMa0a.a045aS");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17899");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 306, 52);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "0:00:00.086");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, " aaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
    }

    @Test
    public void test17900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17900");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!4HI!444HI!4", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!4HI!444HI!4" + "'", str3, "HI!4HI!444HI!4");
    }

    @Test
    public void test17901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17901");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("       T H H         ", "", "0 D0 D0 D0 D0 D0 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", 41);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       T H H         " + "'", str4, "       T H H         ");
    }

    @Test
    public void test17902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17902");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "44 days");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17903");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "0:00:00.000", 34);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "p0y0m0dt0h0m0.000s");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!  HI!  ", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str6, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test17904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17904");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "H!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17905");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                     sdnoces 0                     ", 4, "0 D0 D0 D0 hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SM'M'd'DT'H'H'm'M's.S'S'44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     sdnoces 0                     " + "'", str3, "                     sdnoces 0                     ");
    }

    @Test
    public void test17906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", 28, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! " + "'", str3, "!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
    }

    @Test
    public void test17907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17907");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = new char[] { ' ', ' ' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI! ", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!       0I!#########################################################################################################################################################################################################", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("I!i!i!", "P-1Y11030DT23059059.9839");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!i!i!" + "'", str2, "I!i!i!");
    }

    @Test
    public void test17909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17909");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("     743i!i!i! ", "P0Y0M0DT0H0M0.458S", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17910");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      0 seconds      ", "SECONDSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("P0Y0M0DT0H0M0.473S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.473s" + "'", str1, "p0y0m0dt0h0m0.473s");
    }

    @Test
    public void test17912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17912");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                             0 -1616567633ECONDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "420.0M0H0TD0M0Y0P");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 182 + "'", int2 == 182);
    }

    @Test
    public void test17913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17913");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 2, 0L, "P0Y000DT00000.020134");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.020134" + "'", str3, "P0Y000DT00000.020134");
    }

    @Test
    public void test17914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17914");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" SECONDSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                       Hi!Hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17915");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("P0Y0M0DT0H0M0.033S", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA", "HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test17917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17917");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("###################################################################################00noce0  ", 282);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17919");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("000000000");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                    i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                                                                                                                44's's.S'm'M'h'h'td'D'm'm'y'YYYY'p'                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "000000000" + "'", str4, "000000000");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17920");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("Y000DT00000.031", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17921");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  ", 77, 182);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnochhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  es  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces" + "'", str4, "sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnochhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  es  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces");
    }

    @Test
    public void test17922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                            0 daysaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("p0y0m0dt0h0m0.110s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.110s" + "'", str1, "p0y0m0dt0h0m0.110s");
    }

    @Test
    public void test17924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17924");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 33, (long) 90, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               ");
    }

    @Test
    public void test17925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("'P'yyyy'Y'M'M'd'DT'i!Hi!H..", " ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'P'yyyy'Y'M'M'd'DT'i!Hi!H.." + "'", str2, "'P'yyyy'Y'M'M'd'DT'i!Hi!H..");
    }

    @Test
    public void test17926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17926");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! s0 s0 s0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str1, "Hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test17927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17927");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '4', false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test17928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17928");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("###########p0y0m0dt0h0m0.000s############                                          ", "                     ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                       Hi!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!P00-1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17930");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("p YYYY y        t", 161, "      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!'y'm'm' 'dt'h'h'M'");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p YYYY y        t      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!'y'm'm' 'dt'h'h'M'      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!" + "'", str3, "p YYYY y        t      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!'y'm'm' 'dt'h'h'M'      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!");
    }

    @Test
    public void test17931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("h        ", "p0y0m0dt0h0m0.473s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17932");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", (java.lang.CharSequence) "Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0                                               DAYS                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17933");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "P-1Y11030DT23059059.95048", (java.lang.CharSequence) "                                                                               ::.99");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84 + "'", int2 == 84);
    }

    @Test
    public void test17934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17934");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("I I I I I I I I I I I I I I I I I I I I I I I I I...", "H         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17935");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 900, "P0Y0M0DT0H0M0.139S                                                                                    ", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.139900                                                                                    " + "'", str3, "P0Y000DT00000.139900                                                                                    ");
    }

    @Test
    public void test17936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17936");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                     0                              ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "'p'!!!!'y'm'm''dt'h'h'm'm'.s's'hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test17937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17937");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h0...", "i!hi!hi!hi!h!i  i!hi!hi!hi!hs0 S0 S0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17938");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                               44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                             ", "!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17939");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "I!00i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17940");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...                                                       hI!hI!h...hi!                          ...", (java.lang.CharSequence) "                                                                                                                      P0000Y0M0DT0                                       hI!hI!h...hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17941");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!4440i!hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!444", "                                                                                              ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17942");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000H S0H S000H SH S0H S000H SH S0H S000H S000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", (java.lang.CharSequence) "AAAAAAAA###############################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 495 + "'", int2 == 495);
    }

    @Test
    public void test17943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17943");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!4444444sdnoces44444444444444444a4444444444444444444444444444444444444444444444", (java.lang.CharSequence) "0:00:00.053");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17944");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("######P00-1", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!", 970);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "######P00-1" + "'", str4, "######P00-1");
    }

    @Test
    public void test17945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17945");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("p-1Y11M30DT23H59M59.924S", 143, 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17946");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("P0Y0M0DT0H0M0.103S", "1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17947");
        char[] charArray11 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!Hi!hi!", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P0Y0M0DT0H0M0.99S", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HHHHHHH####", charArray11);
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
    public void test17948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17948");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hi!ahi!aaahi!a", "44459711441145942344TD43041144Y400-14P4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17949");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!        hi!                        hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17950");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 89, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                         " + "'", str3, "                                                                                         ");
    }

    @Test
    public void test17951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0i!0i!0i!0i!0i!0i!0i!0i!0i!", "0:00:00.902");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":00:00.902" + "'", str2, ":00:00.902");
    }

    @Test
    public void test17952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17952");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999", "0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17953");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("00noce0 0P0Y0M0DT0H0M0.015SP", "S510.0M0H0TD0M0Y0P", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17954");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("P", "p0y0m0dt0h0m0.056s");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 0a00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
    }

    @Test
    public void test17956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17956");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aa!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", "                                                                                                                                444S4S4M4m4H4H4TD4d4...", 0, 15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                444S4S4M4m4H4H4TD4d4...                                                                                          !ih                                                                             hi!                                                                                                hi! hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S" + "'", str4, "                                                                                                                                444S4S4M4m4H4H4TD4d4...                                                                                          !ih                                                                             hi!                                                                                                hi! hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
    }

    @Test
    public void test17957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17957");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                              HI!", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17958");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("'44", "0:00:00.015");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17959");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!  hi!  hi!  hi!  hi!", "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 591 + "'", int2 == 591);
    }

    @Test
    public void test17960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17960");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!h0:00:00.306", 0, 900);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!h0:00:00.306" + "'", str3, "0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!h0:00:00.306");
    }

    @Test
    public void test17961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(":00:00.096", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":00:00.096" + "'", str2, ":00:00.096");
    }

    @Test
    public void test17962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17962");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("p0y0m0dt0h0m0.000s", 900, "AA0I!p000000-100t07430-10.99359999");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.9935999p0y0m0dt0h0m0.000sAA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.9935999" + "'", str3, "AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.9935999p0y0m0dt0h0m0.000sAA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.99359999AA0I!p000000-100t07430-10.9935999");
    }

    @Test
    public void test17963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17963");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test17964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17964");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 151, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17965");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!hi!hi      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17966");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi!Hi!H...");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', (int) (short) 10, 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "0:00:00.030");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "AAp000000t0h000.0450");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test17967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17967");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("h                                                                                                                          ...", 37, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17968");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.271", "0:00:00.027");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17969");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "         s s hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         s s hi" + "'", str1, "         s s hi");
    }

    @Test
    public void test17970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17970");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI", 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "#############################################################################P0Y000DT00000.100115");
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi! hi! hi! hi!hhhhi! hi! hi! hi!", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!HI!HI!HI!HI!HI" + "'", str5, "HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! hi! hi! hi!hhhhi! hi! hi! hi!" + "'", str7, "hi! hi! hi! hi!hhhhi! hi! hi! hi!");
    }

    @Test
    public void test17971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17971");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi", "0:00:00.087");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17972");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0M0DT0H0M0.496S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.496100" + "'", str3, "P0Y000DT00000.496100");
    }

    @Test
    public void test17973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("p0Y0M0DT0H0M0.002Sp0Y0M0DT...AAAAAAAAAAAAAAAAAAAAA0000I!I!I!p0Y0M0DT0H0M0.002Sp0Y0M0DT", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0Y0M0DT0H0M0.002Sp0Y0M0DT...AAAAAAAAAAAAAAAAAAAAA0000I!I!I!p0Y0M0DT0H0M0.002Sp0Y0M0DT" + "'", str2, "p0Y0M0DT0H0M0.002Sp0Y0M0DT...AAAAAAAAAAAAAAAAAAAAA0000I!I!I!p0Y0M0DT0H0M0.002Sp0Y0M0DT");
    }

    @Test
    public void test17974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17974");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17975");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("T0H0M0.096S", "0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days0 days");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17976");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.000S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "P0Y0M0DT0H0M0.010S");
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str4, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17977");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444", "0 seconds");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444" + "'", str3, "0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444" + "'", str5, "0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
    }

    @Test
    public void test17978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17978");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("'sdnoces", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'sdnoces" + "'", str3, "'sdnoces");
    }

    @Test
    public void test17979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17979");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("P0Y0M0DT0H0M0.096S", "hi!0:00:00.008hi!0:00:00.008hi!", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.096S" + "'", str3, "P0Y0M0DT0H0M0.096S");
    }

    @Test
    public void test17980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444230.00:00:0230", "", "...          0 0econ00                      ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17981");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0:00:00.139hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", " 0I! I! I! I! I! I! I! I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17982");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("P0Y0M0DT0H0M0.135S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17983");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 492, "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000" + "'", str2, "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000");
    }

    @Test
    public void test17984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17984");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "d0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00ys", "P0Y0M0DT0H0M0.024");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17985");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!", "HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17986");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("H        ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test17987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17987");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...0HS0HS000HSHS0HS000HSHS0HS000HS000000000000000000000000000000000000000000000000000000000000000...", "0:00:00.093", 288, 191);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...0HS0HS000HSHS0HS000HSHS0HS000HS000000000000000000000000000000000000000000000000000000000000000...0:00:00.093" + "'", str4, "...0HS0HS000HSHS0HS000HSHS0HS000HS000000000000000000000000000000000000000000000000000000000000000...0:00:00.093");
    }

    @Test
    public void test17988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("i!Hi!Hi!Hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!Hi!Hi!Hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!Hi!Hi!" + "'", str1, "i!Hi!Hi!Hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!Hi!Hi!");
    }

    @Test
    public void test17989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17989");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("S808.95M95H32TD03M11Y1-P", "ia!aHia!aHa..", "AA0I!p000000-100t07430-10.99359999144444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17990");
        char[] charArray14 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                     0                              ", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("sdnoces 0'h'td'd'm'm'y'yyyy'p'                                                                                                                                                                                                                                                                    ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!Hi!hi!", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999", charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!Hi!Hi!H...HI!Hi!Hi!H...HI!Hi!Hi!H...HI!Hi!Hi!H...HI!Hi!Hi!H...HI!Hi!Hi!H...HI!Hi!Hi!H...HI!Hi!Hi!H...HI!Hi!Hi!H...HI", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test17991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17991");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0.000S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..", "H                                                    ", 51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                            P0Y0M0DT0H0M0.000S             ...", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17992");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "P0Y000DT00000.0991");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("P0Y0M0DT0H0M0.397S", "                                                                                                                                                                                                      P0Y0M0DT0H0M0.397S                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.397S" + "'", str2, "P0Y0M0DT0H0M0.397S");
    }

    @Test
    public void test17994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17994");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aahi!P0000Y0M0DT0H0M0.99SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP0Y0M0DT0H0M0.104SP");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17995");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!     ", ".09981P0Y000DT00...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!     " + "'", str2, "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!     ");
    }

    @Test
    public void test17996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17996");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 900);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17997");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("... hI!hI!h...hi! ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... hI!hI!h...hi! ..." + "'", str1, "... hI!hI!h...hi! ...");
    }

    @Test
    public void test17998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                    i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17999");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!  HI!  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test18000");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI", "t 00 ", 414);
        org.junit.Assert.assertNotNull(strArray3);
    }
}

