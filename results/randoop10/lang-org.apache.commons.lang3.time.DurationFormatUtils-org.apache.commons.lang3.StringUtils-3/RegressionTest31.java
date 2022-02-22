import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test15501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15501");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) " SECONDSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("IH                                                                                              ", 10, "                                                                    S                                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH                                                                                              " + "'", str3, "IH                                                                                              ");
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0 0ECON00", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0ECON00" + "'", str2, "0 0ECON00");
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(" HI!  HI..", "       T H H         ", 16);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                  P                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I!                                                                                                  P                                                                                                  I.." + "'", str5, "I!                                                                                                  P                                                                                                  I..");
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "P-1Y11M30DT23H59M59.994S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    ", "HI! HI! HI! HI! HI! HI! HI! HI!0i!P", 174);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("####M#DT#P#M#.##1S###M#DT#P#M#.##1SSECONDS", 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-1Y11M30DT23H59M59.993S", "                                                Hi!                                                 ", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("P0Y0M0DT0H0M0.030S", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.030S" + "'", str8, "P0Y0M0DT0H0M0.030S");
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !i", "444444444444444444                    444444444444444444                    444444                    Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H                                                     'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !i" + "'", str2, "ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !i");
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa", "aahi!hP0Y000DT00000.01063hP0Y000DT0000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" SAAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M", "P0Y0M0DT0H0M0.271");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  ", 151, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  " + "'", str3, "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  ");
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("S808.95M95H32TD03M11Y1-P", 39, "PpYpMpDTpHpMpTp96");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PpYpMpDS808.95M95H32TD03M11Y1-PPpYpMpDT" + "'", str3, "PpYpMpDS808.95M95H32TD03M11Y1-PPpYpMpDT");
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Hi!Hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                        hi!", (int) (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                        hi!" + "'", str3, "                                                                                        hi!");
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                      aahi!", "                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      aahi!" + "'", str2, "                                      aahi!");
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("'44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44'" + "'", str1, "44'");
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aahi!P0000Y0-10DT07430-10.99359999", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!P0000Y0-10DT07430-10.99359999" + "'", str2, "hi!P0000Y0-10DT07430-10.99359999");
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("i! hi!   hi!", 27, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i! hi!   hi!hi!  hi!  hi!  " + "'", str3, "i! hi!   hi!hi!  hi!  hi!  ");
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("p-1y11m30dt23h59m59.872s", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p-1y11m30dt23h59m59.872s" + "'", str2, "p-1y11m30dt23h59m59.872s");
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444444444444", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444aahi!44444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444aahi!44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15521");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15522");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...hi!  hi!  hi!  hi!  hi!  hi!...", "T0", "1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 495);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...hi!  hi!  hi!  hi!  hi!  hi!..." + "'", str4, "...hi!  hi!  hi!  hi!  hi!  hi!...");
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15523");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("444444444444440:00:00.30644444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15524");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("S498.95M95H32TD03M11Y1-P", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15525");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0", "d0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00ys");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0" + "'", str2, "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0");
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15527");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("y0m0dt0h0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15528");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                              hi!", '4');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15529");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 930);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15530");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "                     H                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15531");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                              ", 30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15532");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       !ih    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15533");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0000000I!44I!44I!44!I!44I!44I!44", "daysI!I!I!I!I!I!I!I!I!I!I!I!I...", 14);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("28010'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!.'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "28010'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!.'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h" + "'", str1, "28010'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!.'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h");
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15535");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("440A00", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "440A00" + "'", str4, "440A00");
    }

    @Test
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15536");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15537");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15538");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  ###############################################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 11, "p-1y11m30dt23h59m59.073s");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  ###############################################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  ###############################################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15539");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("  hi! hi! hi! hi!hhhhi! hi! hi! hi!   ", "0:00:00.0170:00:00.0170:00P0Y0000DT0a00a9915", "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15540");
        char[] charArray13 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.000S", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                 P0Y0M0DT0H0M0.001S                 ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                  P0Y0M0DT0H0M0.000S", charArray13);
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
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15541");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  hi!  hi!  !ih", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15542");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", "hi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15543");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15544");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44 0A0", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15545");
        char[] charArray9 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                0", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P00-", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y000DT00000.020134", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 96 + "'", int11 == 96);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15546");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 55, (long) 174, "1010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15547");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("P0Y000DT00000.020134P0Y000DT00000.020134P 0 d P0Y000DT00000.020134P0Y000DT00000.020134P", "   00i!i!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.020134P0Y000DT00000.020134P 0 d P0Y000DT00000.020134P0Y000DT00000.020134P" + "'", str2, "P0Y000DT00000.020134P0Y000DT00000.020134P 0 d P0Y000DT00000.020134P0Y000DT00000.020134P");
    }

    @Test
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15549");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 10, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15550");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("P0Y0M0DT0H0M0.135S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.135S" + "'", str1, "P0Y0M0DT0H0M0.135S");
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 143);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                                  " + "'", str2, "                                  HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                                  ");
    }

    @Test
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15552");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 99, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15553");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("P0Y0M0DT0H0M0.103S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15554");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str5, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0:00:00.030");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.030" + "'", str1, "0:00:00.030");
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("S808.95M95H32TD03M11Y1-P", 414);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S808.95M95H32TD03M11Y1-P" + "'", str2, "S808.95M95H32TD03M11Y1-P");
    }

    @Test
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("t 00", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "t 00" + "'", str3, "t 00");
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15559");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("010.00:00:0", "'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15560");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(".09981P0Y000DT00000.09981P0Y000DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 96, 115);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                   " + "'", str3, "                                                                                                                   ");
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15562");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("P0Y0M0DT0H0M0.134S", 161, 474);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("   P0Y0M0DT0H0M0.100S         ", 110, 122);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15564");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                " + "'", str1, "                                                                                                ");
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15566");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 225, (long) 612);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.387S" + "'", str2, "P0Y0M0DT0H0M0.387S");
    }

    @Test
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15567");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15568");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" HI!  HI.", "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahHI hHI hHI hHIhhhhHI hHI hHI hHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 189, 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15570");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("P0Y000DT00000.065100", "0S0S0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15571");
        char[] charArray15 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P0Y0M0DT0H0M0.126S", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("         H", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0DT0H0M0.051S", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.031S", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!01990.00000td000y0p");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!01990.00000td000y0p" + "'", str1, "hi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!01990.00000td000y0p");
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15573");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "P-1Y11M30444444444HI!HI!HI!4444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               ", "P-1Y11M30DT23H59M59.983S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               " + "'", str2, "'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               ");
    }

    @Test
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15575");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 7, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.089S", 106, "##################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.089S########################################################################################" + "'", str3, "P0Y0M0DT0H0M0.089S########################################################################################");
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15577");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hI!", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.101S");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("P-1Y11M30DT23H59M59.853S", strArray3, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!HI!HI!H                                           ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                    S                                                                      ", 63, 5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "   P0Y0M0DT0H0M0.100S         ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P-1Y11M30DT23H59M59.853S" + "'", str8, "P-1Y11M30DT23H59M59.853S");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hI!" + "'", str16, "hI!");
    }

    @Test
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(".099SP0Y0M0DT0H0M0.099SP0Y0M0DT0", " P 0 Y        T 0          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".099SP0Y0M0DT0H0M0.099SP0Y0M0DT0" + "'", str2, ".099SP0Y0M0DT0H0M0.099SP0Y0M0DT0");
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15579");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 day");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0I!4444444444444444444444444444444444444444444444AAHI!4444444444444444444444444444444444444444444444 DAY" + "'", str1, "0I!4444444444444444444444444444444444444444444444AAHI!4444444444444444444444444444444444444444444444 DAY");
    }

    @Test
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15580");
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("0 SECONDS", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "              44 0a00              ", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi!", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.030S", charArray16);
        java.lang.Class<?> wildcardClass27 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33 + "'", int21 == 33);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  hi!  hi!  !ih", 86, "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  !ihaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaah" + "'", str3, "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  !ihaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
    }

    @Test
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15582");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P0Y0M0DT0H0M0.005S", "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                          0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32" + "'", str2, "                                          0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32");
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15584");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaa", "h");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...#######################", 372, 280);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...                                AAHI!                                              ", "0:00:00.054");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                AAHI!                                              " + "'", str2, "...                                AAHI!                                              ");
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  !ihaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", "0:00:00.290");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  !ihaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaah" + "'", str2, "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  !ihaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "0 DAYS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test15588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15588");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:HT.HHH:HH:HH.HHH:HH:HH.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H", "...                                                                                      ...", 174);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0I!", "i! hi! P0Y0M0DT0H0M0.281Si! hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I!" + "'", str2, "0I!");
    }

    @Test
    public void test15590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15590");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                            I:II:IIII32                                            ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "aahi!hP0Y000DT00000.01063hP0Y000DT0000");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15591");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("01990.00000TD000Y0P", "                                         P0Y0M0DT0H0M0.126S                 ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15592");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I" + "'", str1, "I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I");
    }

    @Test
    public void test15593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15594");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("daysI!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "daysI!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000" + "'", str3, "daysI!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000");
    }

    @Test
    public void test15595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15595");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I", "P0Y0M0DT0H0M0.035S");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test15596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15596");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "i!P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094P0Y0-10DT07430-10.0993599094hi!P0Y0-10DT07430-10.099", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15597");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 118, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                     0 seconds                      ", "0S0S0444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15599");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!", "p0Y000DT00000.010100Y000DT00000.001110");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15600");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("p-1y11m30dt23h59m59.993s0DAY88a", "        0:00:00.032        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15601");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "t 00 ", (java.lang.CharSequence) "I!Hi!Hi");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "t 00 " + "'", charSequence2, "t 00 ");
    }

    @Test
    public void test15602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15602");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi! hi!   hi!", "P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0                                               DAYS                                               ", "hI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! s0 s0 s0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!" + "'", str3, "hi!hi!hi!");
    }

    @Test
    public void test15603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15603");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                               4P41-004Y44114034DT44324954114411795444                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15604");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "00.0040000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15605");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                       Hi!Hi!hi!", "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'SocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15606");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0 0ECON00", "P-1Y11M30DT23H59M59.808S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15607");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!Hi!hi!Hi!Hi!Hi!hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15609");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h!ih!ih!ih!i  i!h!ih!ih!ih!i", 35, "                                       1250 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!ih!ih!i  i!h!ih!ih!ih!i       " + "'", str3, "h!ih!ih!ih!i  i!h!ih!ih!ih!i       ");
    }

    @Test
    public void test15611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("i! hi! P0Y0M0DT0H0M0.281Si! hi!  ", "                                                                                       'P'yyyy'Y'M'M");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test15612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15612");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0TD000Y0Ph", (java.lang.CharSequence) "##################################################################################00000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15613");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P4", "                                                                                                                                                                                                                                                                                                 P00-1Y11M30DT23H59M59.964S44                                                                                                                                                                                                                                                                                                   ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15614");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("p0Y000DT00000.00228");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0Y000DT00000.00228" + "'", str1, "p0Y000DT00000.00228");
    }

    @Test
    public void test15615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15615");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444Y4YYYY4P4         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0a:a00a:a00a.a030");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15617");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444P0Y0M0DT0H0M0.395S444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444S593.0M0H0TD0M0Y0P444444444444444" + "'", str1, "444444444444444S593.0M0H0TD0M0Y0P444444444444444");
    }

    @Test
    public void test15618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15618");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("  #############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############" + "'", str1, "#############");
    }

    @Test
    public void test15619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15619");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                  " + "'", str1, "                                  ");
    }

    @Test
    public void test15620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15620");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0", "0i!", 100);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("P00-1Y11M30DT23H59M59.964S44");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  !ihaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P00-1Y11M30DT23H59M59.964S44" + "'", str7, "P00-1Y11M30DT23H59M59.964S44");
    }

    @Test
    public void test15621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ihaa!i0!i0!i0!i0!i0!i0!i0!i0!i0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihaa!i0!i0!i0!i0!i0!i0!i0!i0!i0" + "'", str2, "!ihaa!i0!i0!i0!i0!i0!i0!i0!i0!i0");
    }

    @Test
    public void test15622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444aahi!44444444444444444444444444444444444444444444", 290);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15623");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!4HI!444HI!4", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15624");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace(":00:");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15625");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!...", "HI!  HI!  HI!  HI!  HI!  HI", 37);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  i", 97, 12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test15626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("######!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H#######", "hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H#######" + "'", str2, "######!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H#######");
    }

    @Test
    public void test15627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15627");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!     ", (java.lang.CharSequence) "0M0H0TD0M0Y0PS594.0M0H0TD0M0Y0Ps389.95m95h32td03m11y1-p");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test15628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15628");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi!4hi!444hi HI!  HI..hi!4hi!444hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih444!ih4!ih..IH  !IH ih444!ih4!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str1, "ih444!ih4!ih..IH  !IH ih444!ih4!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test15629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15629");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("             ", " 0 0 0  0 0 0.930S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15630");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("P0Y0M0DT0H0M0.097S");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("h!ih!ih!ih!i  i!h!ih!ih!ih!i", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("743i! hi! hi! hi!hhhhi! hi! hi! hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test15631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15631");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!" + "'", str1, "hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!");
    }

    @Test
    public void test15632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15632");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test15633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "P0Y000DT00000.0711");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y000DT00000.0711" + "'", str1, "P0Y000DT00000.0711");
    }

    @Test
    public void test15634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15634");
        char[] charArray14 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0 DAYS", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
    }

    @Test
    public void test15635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15635");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ###############################################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15636");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI! HI!HI!H...HI! i!Hi!H..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! HI!HI!H...HI! i!Hi!H.." + "'", str1, "HI! HI!HI!H...HI! i!Hi!H..");
    }

    @Test
    public void test15637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.032S", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S                                                                       " + "'", str2, "P0Y0M0DT0H0M0.032S                                                                       ");
    }

    @Test
    public void test15638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00000000000000000000000000004444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4", "444444444444444P0Y0M0DT0H0M0.395S444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000000000004444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4" + "'", str2, "00000000000000000000000000004444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4");
    }

    @Test
    public void test15639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15639");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15640");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0:00:00.372", "                                         p0y0m0dt0h0m0.126s                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AA0I!p000000-100t07430-10.99359999", "P-1Y11M30DT23H59M59.949S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA0I!p000000-100t07430-10.99359999" + "'", str2, "AA0I!p000000-100t07430-10.99359999");
    }

    @Test
    public void test15642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("059.872103", (int) (byte) -1, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!shi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "059.872103" + "'", str3, "059.872103");
    }

    @Test
    public void test15643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0:00:00.053");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test15644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15644");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!4444444sdnoces44444444444444444a4444444444444444444444444444444444444444444444", "  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "                                                                                       HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!4444444sdnoces44444444444444444a4444444444444444444444444444444444444444444444" + "'", str3, "hi!4444444sdnoces44444444444444444a4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test15645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("P-1Y11M30DT23H59M59.908S", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.908S" + "'", str2, "P-1Y11M30DT23H59M59.908S");
    }

    @Test
    public void test15646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P-1Y11M30DT23H59M59.950S", 53, "P-1Y11M30DT23H59M59.233S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.950SP-1Y11M30DT23H59M59.233SP-1Y1" + "'", str3, "P-1Y11M30DT23H59M59.950SP-1Y11M30DT23H59M59.233SP-1Y1");
    }

    @Test
    public void test15647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("059.872103", 0, "  hi!hi!hi!#######################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "059.872103" + "'", str3, "059.872103");
    }

    @Test
    public void test15648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i", "                                       0743i!i!...I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i" + "'", str2, "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i");
    }

    @Test
    public void test15649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15649");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 90, (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test15650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 201, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "HhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test15651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test15652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15652");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!                              ", 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15653");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("P0Y0M0DT0H0M0.036S", "5940hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ":0230.00:00:0230.00:00:0230.00:00:023044444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15655");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!P0000Y0-10DT07430-10.99359999", "P yyyy Y T H H 0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaa0I!p0y000dt00000.099-1HI!p0", 30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 55, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 115);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15657");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15658");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HI!HI!HI!HI!HI!HI", "P-1Y11M30DT23H59M59.110S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "I!i!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!i!i!" + "'", str1, "I!i!i!");
    }

    @Test
    public void test15660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15660");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", "0 SECONDShi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
    }

    @Test
    public void test15661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15661");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("  hi!hi!hi!#######################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15662");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray7, strArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray7);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '#');
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny("aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's", strArray7);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "aahi!" + "'", str20, "aahi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "##hi!" + "'", str22, "##hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test15663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" 0 0.0 040  0 0 0  hi!  hi!  h", "hi!444444####M#DT#P#M#.##1S###M#DT#P#M#.##1SSECONDS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 0 0.0 040  0 0 0  hi!  hi!  h" + "'", str2, " 0 0.0 040  0 0 0  hi!  hi!  h");
    }

    @Test
    public void test15664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15664");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15665");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "010 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "010 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "010 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15666");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) ".HHH:HH:H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15667");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("::.99", "#############################################################################P0Y0M0DT0H0M0.100S", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444440:00:00.02");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                      P0Y0M0DT0H0M0.035S                                       ", 48, 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   P0Y0M0DT0H0M0.035S                                       " + "'", str3, "...   P0Y0M0DT0H0M0.035S                                       ");
    }

    @Test
    public void test15669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15669");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15670");
        char[] charArray7 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0D...                        ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test15671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "p0Y000DT00000.065100p0Y000DT00000.065100p0Y000DT00000.065100p0Y000DT00000.065100p0Y000DT00000.065100p0'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0Y000DT00000.065100p0Y000DT00000.065100p0Y000DT00000.065100p0Y000DT00000.065100p0Y000DT00000.065100p0'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'd" + "'", str1, "p0Y000DT00000.065100p0Y000DT00000.065100p0Y000DT00000.065100p0Y000DT00000.065100p0Y000DT00000.065100p0'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'd");
    }

    @Test
    public void test15672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15672");
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
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.concatWith("0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0", (java.lang.Object[]) strArray25);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0hi!0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y00I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y00I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0hi!0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0" + "'", str38, "hi!0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0hi!0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y00I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y00I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0hi!0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0");
    }

    @Test
    public void test15673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15673");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "I!00000000000000000000000000000743I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test15674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15674");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "P00-1Y11030DT23059059.99913400000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15675");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...3h59m59.872s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15676");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "i!Hi!Hi!Hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S HS H000S H0S H", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15678");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI!HI!HI!HI!HI..", 107, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15679");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HP0Y000DT00000.01010");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", "0 SECONDShi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4hi!444hi!4", strArray4, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("444444444444444444444444444444444444444444444444444aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HP0Y000DT00000.01010" + "'", str5, "############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HP0Y000DT00000.01010");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4hi!444hi!4" + "'", str9, "4hi!444hi!4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HP0Y000DT00000.01010" + "'", str10, "############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HP0Y000DT00000.01010");
    }

    @Test
    public void test15680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("#############################################################################P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################p0y0m0dt0h0m0.100s" + "'", str1, "#############################################################################p0y0m0dt0h0m0.100s");
    }

    @Test
    public void test15681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15681");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("44 0a00", "P-1Y11M30DT23H59M59.872S", "A:AA:AAA1A1", 143);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44 0a00" + "'", str4, "44 0a00");
    }

    @Test
    public void test15682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test15683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15683");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      IH                                                                                              ", "P0Y0M0DT0H0M0.024");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("'M'M'd'DT'H'H'm'M's.S'S'Hi!", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 27 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test15684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAAAAAAAAAAAAAAAAAAAAAA...", "1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test15685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15685");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray7, strArray10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "D 0", 115, 4);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA3599424540.0-107430TD0-10Y000000000", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str11, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test15686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S 444444444444", "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S 444444444444" + "'", str2, "44444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S 444444444444");
    }

    @Test
    public void test15687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0SECOND", "T 00 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0SECOND" + "'", str2, "0SECOND");
    }

    @Test
    public void test15688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15688");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.004S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", 227);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15689");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "ih444!ih4!ih..IH  !IH ih444!ih4!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444", "!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "                                                                                             0 SECOND");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15691");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Y0M0D  hi!  hi!  hi!  hi!  hi!  hi!  hi", "secondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecoS'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'!ihaa", 16);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test15692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("noce0  ", "                                                                           aahi!p0000y0m0dt0h0m0.99s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "noce0  " + "'", str2, "noce0  ");
    }

    @Test
    public void test15693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15693");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(" !ih", " !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0s 0s 0s  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih", "hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !ih" + "'", str3, " !ih");
    }

    @Test
    public void test15694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15694");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(".s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's", 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S" + "'", str1, "S");
    }

    @Test
    public void test15696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15696");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("P0Y0M0DT0H0M0.509S", "0SECONDP0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15697");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("S870.0M0H0TD0M0Y0P");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "s870.0m0h0td0m0y0p" + "'", str1, "s870.0m0h0td0m0y0p");
    }

    @Test
    public void test15698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15698");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...aaaaaaaap0Y000DT00000.01010S00S0S00S0S00S", 225);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15699");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                      AAHI!'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15700");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".09981P0Y000DT00...", " 0 0.0 040  0 0 0  ", 128);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "p-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051Sp-1yhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15702");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HI!HI!", (java.lang.CharSequence) "0HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test15703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15703");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444444444444444444444444444444444444444444ahi!444444444444444444444444444444444444444444", (java.lang.CharSequence) "T 00 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test15704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15704");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(" HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15705");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("sdnoces  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sdnoces" + "'", str1, "sdnoces");
    }

    @Test
    public void test15706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15706");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", 32);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s", strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AA0I!p000000-100t07430-10.99359999144444444", "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "0 SECOND", 28, (-1));
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4!ih444!ih4!ih", strArray10, strArray13);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "                 P0Y0M0DT0H0M0.001S                 ", 80, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4!ih444!ih4!ih" + "'", str18, "4!ih444!ih4!ih");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA0I!p000000-100t07430-10.99359999144444444" + "'", str19, "AA0I!p000000-100t07430-10.99359999144444444");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test15707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15707");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "##########################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H###########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15708");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 91, "P0Y0M0DT0H0M0.005S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00591" + "'", str2, "P0Y000DT00000.00591");
    }

    @Test
    public void test15709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15709");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 227, 86);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test15710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15710");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 63);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.063" + "'", str1, "0:00:00.063");
    }

    @Test
    public void test15711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15711");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("P-1Y11M30DT23H59M59.991S", "hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15712");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'                                                                                                                               ", 197);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'                                                                                                                               " + "'", str2, "                                                                                                                                44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'                                                                                                                               ");
    }

    @Test
    public void test15713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444                    444444444444444444                    444444                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", "                                            I:II:IIII32                                           ", "...aaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444....................444444444444444444....................444444....................................................................................................................................................................................................................................................................'P'YYYY'Y'M'M'D'DT'H'0.SECONDS" + "'", str3, "444444444444444444....................444444444444444444....................444444....................................................................................................................................................................................................................................................................'P'YYYY'Y'M'M'D'DT'H'0.SECONDS");
    }

    @Test
    public void test15714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15714");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI! HI! HI! HI! HI! HI! HI! HI!0i!P", "                                                                                                                      'p'yyyy'y'm'm'd'dt'h'", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15716");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("444444444444444S593.0M0H0TD0M0Y0P444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("P0Y0M0DT0H0M0.030S", "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.030S" + "'", str2, "P0Y0M0DT0H0M0.030S");
    }

    @Test
    public void test15718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("010.00:00:0", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        010.00:00:0" + "'", str2, "                        010.00:00:0");
    }

    @Test
    public void test15719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15719");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.002S", "0 D0 D0 D0 hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SM'M'd'DT'H'H'm'M's.S'S'44");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "0:00:00.043");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray11, strArray18);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.startsWithAny("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", strArray11);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                            P0Y0M0DT0H0M0.000S             ...", strArray3, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2" + "'", str5, "2");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test15720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15720");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 290);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.290S" + "'", str1, "P0Y0M0DT0H0M0.290S");
    }

    @Test
    public void test15721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" I0i!44444", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " I0i!44444" + "'", str2, " I0i!44444");
    }

    @Test
    public void test15722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15722");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086", "000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.0450");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086" + "'", str2, "i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086");
    }

    @Test
    public void test15724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15724");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0 second", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                ", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            ..." + "'", str2, "                                                            ...");
    }

    @Test
    public void test15726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...          0 seconds                      ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0seconds" + "'", str2, "...0seconds");
    }

    @Test
    public void test15727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0I!p0y000dt00000.099-1HI!p0", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I!p0y000dt00000.099-1HI!p0" + "'", str2, "0I!p0y000dt00000.099-1HI!p0");
    }

    @Test
    public void test15728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15728");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444                            hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444                            hi" + "'", str1, "HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444                            hi");
    }

    @Test
    public void test15729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15729");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi! ", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("sdnoces  ", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "P0Y0M0DT0H0M0.101S");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi! " + "'", str6, "hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi! " + "'", str7, "hi!hi!hi! ");
    }

    @Test
    public void test15730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15730");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4!ih444!ih4!ih", 53, "0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4!ih444!ih4!ih0:00:00.032                            " + "'", str3, "4!ih444!ih4!ih0:00:00.032                            ");
    }

    @Test
    public void test15731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15732");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", 82);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15733");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      ", "                                                                                                                                                                                                                                                  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s", 289, "P0Y0M0DT0H0M0.015S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045sP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0" + "'", str3, "P0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045sP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0H0M0.015SP0Y0M0DT0");
    }

    @Test
    public void test15735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15735");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" 0 0 0  0 0 0.930", (int) (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 0 0 0  0 0 0.930" + "'", str3, " 0 0 0  0 0 0.930");
    }

    @Test
    public void test15736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15736");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(":00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032", "0DAY88a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15737");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444...", "0:00:00.189");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("p-1y11m30dt23h59m59.993s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p-1y11m30dt23h59m59.993s" + "'", str1, "p-1y11m30dt23h59m59.993s");
    }

    @Test
    public void test15739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15739");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "#0days0hours0minutes0seconds!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#0days0hours0minutes0seconds!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444" + "'", str1, "#0days0hours0minutes0seconds!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444");
    }

    @Test
    public void test15740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15740");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test15741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15741");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!4hi!444hi HI!  HI..hi!4hi!444hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15742");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hI!4444444SDNOCES  4444444444444444A4444444444444444444444444444444444444444444444", "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15743");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "                                                                                                                                444S4S4M4m4H4H4TD4d4...", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                44432440404044TD404..." + "'", str3, "                                                                                                                                44432440404044TD404...");
    }

    @Test
    public void test15744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15744");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 18, "hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi! " + "'", str3, "hi!hi!hi! ");
    }

    @Test
    public void test15745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15745");
        char[] charArray9 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("Hhhaaaa", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15746");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00Y0M0DT0H0M0.001S 0Y0M0DT0H0M0.001Sseconds");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("                                                                       hi!hi!hi!                                                                       ", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00Y0M0DT0H0M0.001S                                                                       hi!hi!hi!                                                                       0Y0M0DT0H0M0.001Sseconds" + "'", str3, "00Y0M0DT0H0M0.001S                                                                       hi!hi!hi!                                                                       0Y0M0DT0H0M0.001Sseconds");
    }

    @Test
    public void test15747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15747");
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("0 SECONDS", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0s 0s 0", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                       1250 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33 + "'", int21 == 33);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 39 + "'", int26 == 39);
    }

    @Test
    public void test15748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15748");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0I!       0I!       0I!       0I!  ", "           00noce0 0        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15749");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("0HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "DNOCES0             ", 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str4, "0HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test15750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15750");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", "...          0 seconds                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test15752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYSAA44DAYSI!44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYSAA44DAYSI!44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS" + "'", str3, "!44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYSAA44DAYSI!44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS44DAYS");
    }

    @Test
    public void test15753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.045", "        P0Y0M0DT0H0M0.063S        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.045" + "'", str2, "000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.045");
    }

    @Test
    public void test15754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15754");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "HI!44HI!44HI!44!HI!44HI!44HI!44H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15755");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                               pa0aYa0aMa0aDTa0aHa0aMa0a.a045aS", "                                                                                                                                 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Hi!Hi!hi!Hi!Hi!Hi!hi!Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test15757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15757");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("P0Y0M0DT0H0M0.775S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.775S" + "'", str1, "P0Y0M0DT0H0M0.775S");
    }

    @Test
    public void test15758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("1", 125);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              1                                                              " + "'", str2, "                                                              1                                                              ");
    }

    @Test
    public void test15759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15759");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I", "Hhhaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15760");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0 D0 D0 D0 D0 D0 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", (java.lang.CharSequence) "hi!        hi!                        hi!        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test15761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("###############################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################################" + "'", str1, "##############################################################");
    }

    @Test
    public void test15762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15762");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999", "4444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 604 + "'", int2 == 604);
    }

    @Test
    public void test15763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15763");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "H!IH!IH", "P0Y000DT00000P0Y000DT00000PP-1Y11M30DT23H59M59.987SP0Y000DT00000P0Y000DT00000P");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("P0Y0M0DT0H0M0.086S", "0:00:00.010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.086S" + "'", str2, "P0Y0M0DT0H0M0.086S");
    }

    @Test
    public void test15765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15765");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(" S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15766");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Hi!Hi!hi!Hi!Hi!Hi!hi!Hi!", "p0y000dt00000.09910");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15767");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aahi!D", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "Y0M0DT0H0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("P0Y0M0DT0H0M0.107S", 106, 107);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15769");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045", (java.lang.CharSequence) "a4hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045");
    }

    @Test
    public void test15770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15770");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(".HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:HT.HHH:HH:HH.HHH:HH:HH.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15771");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S" + "'", str1, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S");
    }

    @Test
    public void test15772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15773");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                  444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                   ", "P-1Y11M30DT23H59M59.894S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15774");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  0econ00", "50278.9509503...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15775");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0 second", "           ", 63, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "           " + "'", str4, "           ");
    }

    @Test
    public void test15776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                                                                                                                                                                    P0Y...", "        H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                                                                                                                                                                    P0Y..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                                                                                                                                                                                    P0Y...");
    }

    @Test
    public void test15777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("      hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!" + "'", str1, "      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
    }

    @Test
    public void test15778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15778");
        char[] charArray14 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  i!", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAA...", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444P0Y000DT00000.099104444", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test15779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) 100, "P0Y0M0DT0H0M0.053S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test15780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15780");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!h...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h..." + "'", str2, "hi!hi!h...");
    }

    @Test
    public void test15781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15781");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(charSequence0, (java.lang.CharSequence) "                                       0743i!i!...I!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                       0743i!i!...I!" + "'", charSequence2, "                                       0743i!i!...I!");
    }

    @Test
    public void test15782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15782");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi", 135);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15784");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P0Y0M0DT0H0M0.143S", "!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15785");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 495, (long) 174);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.679S" + "'", str2, "P-1Y11M30DT23H59M59.679S");
    }

    @Test
    public void test15786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15786");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 1, 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15787");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "AA0I!P0000Y000DT00000.99612", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15788");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                        010.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15789");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI               ", "   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hp0y0m0dt0h0m0.097s   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15790");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0", "                                                                                                                 ::.99aaaaaaaaaap-1y11m30dt23h59m59.978s::.99aaaaaaaaaa                                                                                                                 444!ih4!ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15791");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" P yyyy Y        T H H         0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaa0I!p0y000dt00000.099-1HI!p", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                            0 daysaahi!", (int) (byte) 100, ".                                      hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".                                      hi!hi!                                            0 daysaahi!" + "'", str3, ".                                      hi!hi!                                            0 daysaahi!");
    }

    @Test
    public void test15793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15793");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                      'p'yyyy'y'm'm'd'dt'h'", "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15794");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI...AAAAAAAAAAAAAAAAAAP0Y0000DT0a00a9915", " HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15795");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0-10DT07430-10.93035999304444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0-10DT07430-10.93035999304444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0-10DT07430-10.93035999304444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test15796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15796");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("230.00:00:0                                                                               ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("T0H0M0.096S", 107);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "T0H0M0.096S                                                                                                " + "'", str2, "T0H0M0.096S                                                                                                ");
    }

    @Test
    public void test15798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15798");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4444444444'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15799");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("h0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str1, "h0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test15800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                       'P'yyyy'Y'M'M", "0days", "aaaaaaaaaaaaaaaaaaaaaa        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15801");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("Hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("d0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00ys", "aaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00ys" + "'", str2, "d0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00ys");
    }

    @Test
    public void test15803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15803");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("P0Y0M0D...                        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S ", " 3720 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0D...                        " + "'", str4, "P0Y0M0D...                        ");
    }

    @Test
    public void test15804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15804");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("999.95M95H32TD03M11Y1-P", "P-1Y11M30DT23H59M59.533S", "P0Y0M0DT0H0M0.024");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "999.95M95H32TD03M11Y1-P" + "'", str3, "999.95M95H32TD03M11Y1-P");
    }

    @Test
    public void test15805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15805");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhi!", "i!", "                                                                                                                                 'P'yyyy...", 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIh                                                                                                                                 'P'yyyy..." + "'", str4, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIh                                                                                                                                 'P'yyyy...");
    }

    @Test
    public void test15806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15806");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.000S", "::.99aaaaaaaaaaP-1Y11M30DT23H59M59.978S::.99aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!ihaa                                                                                             !i0!i0!i0!i0!i0!i0!i0!i0!i0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "aaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test15808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str1, "P0Y0M0DT0H0M0.034S");
    }

    @Test
    public void test15809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15809");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "P-1Y11M30DT23H59M59.993S", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15810");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi! ###############################################################  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...#######################", "  hi!  hi!  hi!  hi!  hi!  hi!  hi", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 82 + "'", int3 == 82);
    }

    @Test
    public void test15811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15811");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 201, (long) ' ', "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("  hi! hi! hi! hi!hhhhi! hi! hi! hi!   ", "000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.0450");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15813");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "P-1Y11M30DT23H59M59.073S", (java.lang.CharSequence) "P-1Y11030DT23059059.9839444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P-1Y11M30DT23H59M59.073S" + "'", charSequence2, "P-1Y11M30DT23H59M59.073S");
    }

    @Test
    public void test15814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("01990.00000td000y0p", "  #############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01990.00000td000y0p" + "'", str2, "01990.00000td000y0p");
    }

    @Test
    public void test15815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15815");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0:00:00.189", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 PYYYYY0MDDT0H0M43.S44");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test15816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                      IH                                                                                              ", 189);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      IH                                                                                              " + "'", str2, "                                      IH                                                                                              ");
    }

    @Test
    public void test15817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15817");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("28010'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!.'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h", "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("P0Y0M0DT0H0M0.904S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.904S" + "'", str1, "P0Y0M0DT0H0M0.904S");
    }

    @Test
    public void test15819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15819");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("P-1Y11M30DT23H59M59.902S", " !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH 0s 0s 0s  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15820");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!  hi!  hi!  hi!  hi!", (java.lang.CharSequence) "S010.0M0H0TD0M0Y0Ph");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15821");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 101, "       ...hi!4444444444444444444444444444444444444444444444a44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!       ." + "'", str3, "       i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!       .");
    }

    @Test
    public void test15822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                     I!                    ", 85, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     I!                    " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     I!                    ");
    }

    @Test
    public void test15823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15823");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...###################################################################################################################################################################################### HI! HI! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ...hi!", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15825");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44", "  HI!  HI!  HI!  HI!  HI!  HI...", (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT" + "'", str4, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT");
    }

    @Test
    public void test15826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15826");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("p-1y11m30dt23h59m59.073s", "hi!hi!hi!  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                         P0Y0M0DT0H0M0.126S                 ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAA" + "'", str2, "AAAAAAAAAA");
    }

    @Test
    public void test15829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15829");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("P0Y0M0DT0H0M0.289SI!4444444444444444444444444444444444444444444444AAHI!444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099", "P0Y000DT00000.03153");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15830");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!", "  !ih  !ih  !ih  !ih  !ih  !ih  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15831");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("P0Y0M0DT0H0M0.031S", "270noce044", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15832");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("P-1Y11M30DT23H59M59.123S'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S''P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "444444444444444S593.0M0H0TD0M0Y0P444444444444444", 318);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "P0Y0M0DT0a0M0a99S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15834");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444", "28010.00000TD000Y0Ph", 31);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("P-1Y11M30DT23H59M59.903S", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test15835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("P-1Y11M30DT23H59M59.809S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.809" + "'", str1, "P-1Y11M30DT23H59M59.809");
    }

    @Test
    public void test15836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15836");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I                 ", 76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("0:00:00.028                                                                         ", "hHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.028                                                                         " + "'", str2, "0:00:00.028                                                                         ");
    }

    @Test
    public void test15838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15838");
        char[] charArray7 = new char[] { '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0:00:00.001", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!", 125);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!" + "'", str2, "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
    }

    @Test
    public void test15840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...", "0:00:00.289                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi..." + "'", str2, "Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...");
    }

    @Test
    public void test15841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15841");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0:00:00.001");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("0i!44444i  i  i  i  i  i0i!44444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test15842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S" + "'", str2, "aaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S");
    }

    @Test
    public void test15843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15843");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!     ", "               P0Y0M0DT0H0M0.395S               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15844");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", "0 daysHI!HI!HI!HI!HI!HI..HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15845");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("P-1Y11M30DT23H59M59.986S", "P0Y000DT00000.065100", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15846");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!0s 0s 00s 0s 00s 0s 00s 0s 00s ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("P-1Y11M30DT23H59M59.424S", "                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.424S" + "'", str2, "P-1Y11M30DT23H59M59.424S");
    }

    @Test
    public void test15848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 0a00", "44 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 T044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 0a00" + "'", str2, "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 0a00");
    }

    @Test
    public void test15849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15849");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "i! hi! P0Y0M0DT0H0M0.281Si! hi!  ", (java.lang.CharSequence) "P0Y0M0DT0H0M0.110S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test15850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15850");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Y0M0D  hi!  hi!  hi!  hi!  hi!  hi!  hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih  !ih  !ih  !ih  !ih  !ih  !ih  D0M0Y" + "'", str1, "ih  !ih  !ih  !ih  !ih  !ih  !ih  D0M0Y");
    }

    @Test
    public void test15851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15851");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 280, "p0y0m0dt0h0m0.271s days", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p000000t0h000.2710 0a00" + "'", str3, "p000000t0h000.2710 0a00");
    }

    @Test
    public void test15852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi!  hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15853");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 8, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test15854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!IH!IH!IH", "HI!  HI!  HI!  HI!  HI!  HI..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH" + "'", str2, "!IH!IH!IH");
    }

    @Test
    public void test15855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15855");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0", "i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! hi! hi!   hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'H" + "'", str2, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'H");
    }

    @Test
    public void test15857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15857");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  hi!", "hP0Y0M0DT0H0M0.010S", 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "  ai!" + "'", str7, "  ai!");
    }

    @Test
    public void test15858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15858");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "        P0Y0M0DT0H0M0.063S        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("p0y0m0dt0h0m0.395s", "00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.395s" + "'", str2, "p0y0m0dt0h0m0.395s");
    }

    @Test
    public void test15860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15860");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("S540.0M0H0TD0M0Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           ", "230.00:00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15861");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...          0 0econ00                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...          0 0econ00                      " + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...          0 0econ00                      ");
    }

    @Test
    public void test15862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0000000000000000IIIIIIIIIIIIIIII  hi!59059.999", "230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000IIIIIIIIIIIIIIII  hi!59059.999" + "'", str2, "0000000000000000IIIIIIIIIIIIIIII  hi!59059.999");
    }

    @Test
    public void test15863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15863");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("#0days0hours0minutes0seconds!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#0days0hours0minutes0seconds!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444" + "'", str1, "#0days0hours0minutes0seconds!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444");
    }

    @Test
    public void test15864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15864");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", (int) (short) -1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44                                                                                            P0Y0M0DT0H0M0.000S                                                                                            P0Y0M0DT0H0M0.000Shi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44                                                                                            P0Y0M0DT0H0M0.000S                                                                                            P0Y0M0DT0H0M0.000Shi!" + "'", str1, "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44                                                                                            P0Y0M0DT0H0M0.000S                                                                                            P0Y0M0DT0H0M0.000Shi!");
    }

    @Test
    public void test15866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15866");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0000000000000000000000000000000000!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", "hI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  s0 s0 s0 HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15867");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0:00:00.010", "                                                       P-1Y11M30DT23H59M59.999S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15868");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0000000I!44I!44I!44!I!44I!44I!44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15869");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!");
    }

    @Test
    public void test15870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15870");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("##################################################################################################################################################################################################################################################################################################", "P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D", 288);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15871");
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("0 SECONDS", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi! hi!   hi!", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P00-", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("I", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                            ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33 + "'", int21 == 33);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test15872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15872");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT", ".09981P0Y00S130.0M0H0TD0M0Y0P.09981P0Y000", 115);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15873");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0hi!0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y00I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y00I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0hi!0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0haaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11024");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI!HI!HI!HI!HI!HI...", 611, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15875");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("'P'yyyy'Y'M'M'd'DT'H'H'm'M'sTS'S'44", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15876");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " #0 days 0 hours 0 minutes 0 seconds ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15877");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", 955, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaahi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi", 19, 161);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a444444444444444444444444444444444444444444..." + "'", str3, "...44444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a444444444444444444444444444444444444444444...");
    }

    @Test
    public void test15879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15879");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...", "0:00:00.009", 101);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15880");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                            I:II:IIII32                                            ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 306, 161);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test15881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15881");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" aaaaaa", "P0Y0M0DT0H0M0.043S                                                                                                                         ", 397);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15882");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("", "hi!", (int) (short) 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("0:00:00.07", strArray7);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("00noce0 0ht0d0m0yyyyp                                                                                                                                                                                                                                                                    ", strArray7);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test15883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15883");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("P-1Y11M30DT23H59M59.780S", "00Y0M0DT0H0M0.001S0Y0M0DT0H0M0.001Sseconds", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15884");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HHHH...", "                                                                                       HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15885");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test15886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15886");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                        hi!", " SECONDSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                               ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P-1Y11M30DT23H59M59.926S", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.926S" + "'", str2, "P-1Y11M30DT23H59M59.926S");
    }

    @Test
    public void test15888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15888");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                       1250 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0a:a00a:a00a.a030", "hi!hi!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15889");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444230.00:00:0230", 20, 128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15890");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", "           ", 397);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("#############################################################################P0Y000DT00000.100115", 82, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0DT00000.100115" + "'", str3, "0DT00000.100115");
    }

    @Test
    public void test15892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P-1Y11M30DT23H59M59.993S", 75, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.993Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "P-1Y11M30DT23H59M59.993Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15893");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", "d0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00ys");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   Hi!Hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4hi!444hi!4", "                     00noce0 0                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   H  H     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "   H  H     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("440A0", 0, 903);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "440A0" + "'", str3, "440A0");
    }

    @Test
    public void test15896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15896");
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0 DAYS", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                   0I!", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                            0:00:00.032                                            ", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("..                                                                                    HI!...", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test15897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD", "###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD" + "'", str2, "0I!0I!0I!0IP0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD");
    }

    @Test
    public void test15898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("P0Y0M0DT0H0M0.99Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "P0Y0M0DT0H0M0.99Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test15899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15899");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  ", 608);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15900");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!4hi!444hi HI!  HI..hi!4hi!444hi");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 84, 51);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test15901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                           'P'YYYY'Y'M'M'D'DT'H'0 SECONDS                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15902");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI", "000000000");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI" + "'", str4, "HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI");
    }

    @Test
    public void test15903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15903");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...                                 !i0!i0!i0!i0!i0!i0!i0!i0!i0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                 !i0!i0!i0!i0!i0!i0!i0!i0!i0" + "'", str1, "...                                 !i0!i0!i0!i0!i0!i0!i0!i0!i0");
    }

    @Test
    public void test15904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("-1Y11M30DT23H59M59.964S44                                                                                                                               ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1Y11M30DT23H59M59.964S44                                                                                                                               " + "'", str2, "-1Y11M30DT23H59M59.964S44                                                                                                                               ");
    }

    @Test
    public void test15905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("P0Y0M0DT0H0M0.414S", "P-1Y11030DT23059059.95048");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15906");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces", 62, 290);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15907");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
    }

    @Test
    public void test15908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15908");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI", "P0Y0M0DT0H0M0.125S", "                                                                                                                                                                                                                                                                    'P'yyyy'Y'M'M'd'DT'H'0 seconds");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI" + "'", str3, "HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI");
    }

    @Test
    public void test15909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("P0Y0M0DT0H0M0.062S", "00000000000000000000000000004444444444444444444444444444000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15910");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0TD000Y0Ph", "P0Y0M0DT0H0M0.446S", 28, 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0TD000Y0PhP0Y0M0DT0H0M0.446S" + "'", str4, "0TD000Y0PhP0Y0M0DT0H0M0.446S");
    }

    @Test
    public void test15911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15911");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("y0m0dt0h0", 0, 82);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "y0m0dt0h0" + "'", str3, "y0m0dt0h0");
    }

    @Test
    public void test15912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("P0Y0M0DT0H0M0.097S", " SECONDS", 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str3, "P0Y0M0DT0H0M0.097S");
    }

    @Test
    public void test15913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("P0Y000DT00000.031151", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.031151" + "'", str2, "P0Y000DT00000.031151");
    }

    @Test
    public void test15914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15914");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 85, (long) 6, "AAAAAAAAAAAAAAA                 P0Y0M0DT0H0M0.001S                 ", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15915");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                               'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ", "H", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15916");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("a4hi!", 34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15917");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15918");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi! hi! hi!                                                                                ", "aaaaaaaaaaaaaaap0Y000DT00000.01010S00S0S00S0S00S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" HI! HI! HI! HI! HI! HI! HI! HI!aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0", "                                                                                                                               'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HI! HI! HI! HI! HI! HI! HI! HI!aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0" + "'", str2, " HI! HI! HI! HI! HI! HI! HI! HI!aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0");
    }

    @Test
    public void test15920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15920");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   0I!", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "T 00", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("h0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", charArray16);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test15921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15921");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  ip-1y11m30dt23h59m59.808sHi!P0Y0M0DT0H0M0.002Shi!P0Y  i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0:00:00.009");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.009" + "'", str1, "0:00:00.009");
    }

    @Test
    public void test15923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test15924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "0:00:00.611");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15925");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 414, (long) 103, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa99.::", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15926");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("P0Y0M0DT0H0M0.104S", "y0m0dt0h0", "i!i!i!", 18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.104S" + "'", str4, "P0Y0M0DT0H0M0.104S");
    }

    @Test
    public void test15927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "P-1Y11M30DT23H59M59.606S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15928");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("44 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 T044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 ", "444444444444444444444444444444444444444444444444444444444444444444444444444442", "###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!  hi!  hi!  hi!  hi!", 5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 T044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 " + "'", str4, "44 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 T044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 ");
    }

    @Test
    public void test15929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15929");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny(" HI!  HI.", strArray3);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test15930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15930");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("... hI!hI!h...hi! ...", "                                         hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15931");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S");
        java.lang.String[] strArray3 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       0000000000000000000I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!", strArray2, strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       0000000000000000000I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!" + "'", str4, "   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       0000000000000000000I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!");
    }

    @Test
    public void test15932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15932");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "                                 ", 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("059.872103", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             059.872103              " + "'", str2, "             059.872103              ");
    }

    @Test
    public void test15934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15934");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                            P0Y0M0DT0H0M0.000S", "'p'YYYY'y'm'm'D'dt'h'                              ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                      aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0                                                                                                      aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's0M0                                                                                                      aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'sT0H0M0.000S" + "'", str4, "P0                                                                                                      aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's0M0                                                                                                      aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'sT0H0M0.000S");
    }

    @Test
    public void test15935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15935");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15936");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", "!pphi!pphi!pphi!pphi!pphi!ppS0pS0pS0phi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pppppppppppp");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15937");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15938");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!", 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', (int) (short) 10, 0);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.002S", "hi!hi!hi! ", (int) (short) 0);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih", "'m'm'D'dt'h'h'M'm'S.s's'hI!");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.split("0i!", '4');
        boolean boolean27 = org.apache.commons.lang3.StringUtils.startsWithAny("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray26);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("p0y0m0dt0h0m0.020s", strArray22, strArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ", strArray4, strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "p0y0m0dt0h0m0.020s" + "'", str28, "p0y0m0dt0h0m0.020s");
    }

    @Test
    public void test15939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15939");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...I!  HI!  HI!  HI!  HI..", "       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15940");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" !ih", 0, "p0y0m0dt0h0m0.395s");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !ih" + "'", str3, " !ih");
    }

    @Test
    public void test15941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15941");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("t 00 ", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t 00 " + "'", str2, "t 00 ");
    }

    @Test
    public void test15943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15943");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P0Y0M0DT0H0M0.446S", 495);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(" 0 0.0 040  0 0 0  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 0.0 040  0 0 0" + "'", str1, "0 0.0 040  0 0 0");
    }

    @Test
    public void test15945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15945");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("noce0", 134, "p-1y11m30dt23h59m59.808s");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p-1y11m30dt23h59m59.808sp-1y11m30dt23h59m59.808sp-1y11m30dt23h59noce0p-1y11m30dt23h59m59.808sp-1y11m30dt23h59m59.808sp-1y11m30dt23h59m" + "'", str3, "p-1y11m30dt23h59m59.808sp-1y11m30dt23h59m59.808sp-1y11m30dt23h59noce0p-1y11m30dt23h59m59.808sp-1y11m30dt23h59m59.808sp-1y11m30dt23h59m");
    }

    @Test
    public void test15946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15946");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("!ihaa !i0!i0!i0!i0!i0!i0!i0!i0!i04!ih444!ih4!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15947");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0:00:00.007", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15948");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", " !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0s 0s 0s  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0:00:00.086", "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.086" + "'", str2, "0:00:00.086");
    }

    @Test
    public void test15950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15950");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 84, (long) 125);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.041S" + "'", str2, "P0Y0M0DT0H0M0.041S");
    }

    @Test
    public void test15951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15951");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495", 476);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15952");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44459711441145942344TD43041144Y400-14P4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44459711441145942344TD43041144Y400-14P4" + "'", str1, "44459711441145942344TD43041144Y400-14P4");
    }

    @Test
    public void test15954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15954");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("8639930noce86399 0", "AAAAAAAAAAAAAAA", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15955");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 414, (long) (short) 10, "  hi!hi!hi!#######################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!hi!hi!#######################" + "'", str3, "  hi!hi!hi!#######################");
    }

    @Test
    public void test15956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("T 00 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "T00" + "'", str1, "T00");
    }

    @Test
    public void test15957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15957");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih", " 444444444HI!HI!HI!4444444444 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih" + "'", str2, " !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih");
    }

    @Test
    public void test15959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15959");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 36, "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!     ", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!     " + "'", str3, "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi!   hi!     ");
    }

    @Test
    public void test15960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15960");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("P00-1y11-130dt2374359-159.999359998900000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P00-1y11-130dt2374359-159.999359998900000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i" + "'", str1, "P00-1y11-130dt2374359-159.999359998900000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
    }

    @Test
    public void test15961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15961");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("D 0", "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                             P-1Y11M30DT23H59M59.991S                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                              ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                             P-1Y11M30DT23H59M59.991S                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                              " + "'", str2, "                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                             P-1Y11M30DT23H59M59.991S                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                              ");
    }

    @Test
    public void test15963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15963");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P-1Y11M30DTS0 S0 S0P-1Y11M30DT2                                                                                                                                                                                                                                                          ", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15964");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI", "                                                                                                                                44459711441145942344TD43041144Y400-14P4                                                                                                                               ", 23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test15965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15965");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "P0Y0M0DT0H0M0.030Sh         AA0:00:00.082", (java.lang.CharSequence) "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P0Y0M0DT0H0M0.030Sh         AA0:00:00.082" + "'", charSequence2, "P0Y0M0DT0H0M0.030Sh         AA0:00:00.082");
    }

    @Test
    public void test15966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P-1Y11M30DT23H59M59.819S", "  hECON ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test15967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15967");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  !ihaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.013aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!i0", 143);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15969");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" 0000000000000000000-16165675740 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1 0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                           aahi!p0000y0m0dt0h0m0.99s");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test15970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15970");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "hi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!01990.00000td000y0p");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("  i!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  i!" + "'", str2, "  i!");
    }

    @Test
    public void test15972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH0s0s0s!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!Ih" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH0s0s0s!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!Ih");
    }

    @Test
    public void test15973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "H!IH!IH ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!IH " + "'", str1, "H!IH!IH ");
    }

    @Test
    public void test15974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15974");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15975");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.099S", ' ');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "hhh", 8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a', 33, 8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", strArray5, strArray9);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray9);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("P0Y000DT00000.01010", "                                                Hi!                                                 ");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hi!hi!#######################", strArray19);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray19);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray9, strArray19);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, ' ');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  " + "'", str14, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "P0Y000DT00000.01010" + "'", str20, "P0Y000DT00000.01010");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str23, "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "P0Y000DT00000.01010" + "'", str25, "P0Y000DT00000.01010");
    }

    @Test
    public void test15976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15976");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4yyyy4P4                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15977");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "I..I..I..I..I..I", "s870.0m0h0td0m0y0p");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15978");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 23, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test15979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test15980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                ", 372, 397);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           ...!hi!hi!h                                                                                                            ", "...                                 !i0!i0!i0!i0!i0!i0!i0!i0!i0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           ...!hi!hi!h                                                                                                            " + "'", str2, "HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           !!hi!hi!h                                             !hi!hi!h                                           HI!hi!hi!h                                           ...!hi!hi!h                                                                                                            ");
    }

    @Test
    public void test15982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15982");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!H...HI HI!HI!H...HI! HI!HI!H...HI! HI!HI!H...HI! HI!HI!H...HI! HI!HI!H...HI! HI!HI!H...HI! HI!HI!H...HI! P-1Y11M30DT23H59M59.903S...HI! HI!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 902);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test15983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15983");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                         44 days                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("8010.00000TD000Y0P", 61, "...                                                                                                                                                                                    P0Y...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                  8010.00000TD000Y0P...                   " + "'", str3, "...                  8010.00000TD000Y0P...                   ");
    }

    @Test
    public void test15985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test15986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str2, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test15987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15987");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "Hi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aaS0aS0aS0ahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15988");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aahi", 174);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15989");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAp000000t0h000.0450", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15990");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("87");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "87" + "'", str1, "87");
    }

    @Test
    public void test15992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086", "i!hi!hi!hi!h################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086" + "'", str2, "0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086");
    }

    @Test
    public void test15993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15993");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 27, (long) 191, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test15994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15994");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hP0Y0M0DT0H0M0.010S");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("hP0Y0M0DT0H0M0.010S", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAA                 P0Y0M0DT0H0M0.001S                 ", "0I!p0y000dt00000.099-1HI!p0");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00 D", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00 D" + "'", str8, "00 D");
    }

    @Test
    public void test15995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15995");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999", 282, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15996");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1###################################################################################00noce0  ##", "                                                                                                                                                                                                                                                                                                 P00-1Y11M30DT23H59M59.964S44                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15997");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-1", "P00-1Y11M30DT23H59M59.964S44", 27);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15998");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                              ", (java.lang.CharSequence) "P0Y0M0DT0H0M0.071S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 174 + "'", int2 == 174);
    }

    @Test
    public void test15999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15999");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("P00-1Y11M30DT23H59M59.964S44                                                                                                                                ", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P00-1Y11M30DT23H59M59.964S44                                                                                                                                " + "'", str3, "P00-1Y11M30DT23H59M59.964S44                                                                                                                                ");
    }

    @Test
    public void test16000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test16000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Hi!Hi!H...         Hi00noce0 0Hi!Hi!H...         Hi!", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!H...         Hi!" + "'", str2, "i!H...         Hi!");
    }
}

