import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest61 {

    public static boolean debug = false;

    @Test
    public void test30501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30501");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P0Y0M0DT0H0M0.904S", 25, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIP0Y0M0DT0H0M0.904SIIII" + "'", str3, "IIIP0Y0M0DT0H0M0.904SIIII");
    }

    @Test
    public void test30502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30502");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 200, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test30503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30503");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000:60800:6080000:6080:60800:6080000:6080:60800:6080000:60800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "P0Y000DT00000.065100 Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30504");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", '#');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0         0         0         0         0         0         0         0         0         ", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("0:00:00.139HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str8, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test30505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30505");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y0M0DT0H0M0.108S", "0:00:00.107", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30506");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h", "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("sdnoces  ", "1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("Y0M0DT0H0                                          ", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("P0Y0M0DT0H0M0.387S", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0Y0M0DT0H0M0.387S" + "'", str10, "P0Y0M0DT0H0M0.387S");
    }

    @Test
    public void test30507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30507");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I days", "IH", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0:...                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30509");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0 ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S0S00S0S00S0S00S0S00Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 969 + "'", int3 == 969);
    }

    @Test
    public void test30510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ai!aaaaaaaaaaaaaaaa2ahi!aaai!", "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ai!aaaaaaaaaaaaaaaa2ahi!aaai!" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ai!aaaaaaaaaaaaaaaa2ahi!aaai!");
    }

    @Test
    public void test30511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30511");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "S540.0M0H0TD0M0Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30512");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) 281);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.280S" + "'", str2, "P0Y0M0DT0H0M0.280S");
    }

    @Test
    public void test30513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30513");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "0:00:00.000", (java.lang.CharSequence) "0:00:00.139hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0:00:00.000" + "'", charSequence2, "0:00:00.000");
    }

    @Test
    public void test30514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                    ", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                    " + "'", str2, "                                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                    ");
    }

    @Test
    public void test30515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30515");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          0 SECONDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS5940hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.00 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYSa0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS5940hh" + "'", str2, "P0Y000DT00000.00 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYSa0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS0 DAYS5940hh");
    }

    @Test
    public void test30517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0S 0S", "pYDT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30518");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi...aaaaaaaaaaaaaaaaaap0y0000dt0a00a9915             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0:00:00.005", 51);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi...aaaaaaaaaaaaaaaaaap0y0000dt0a00a9915             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi...aaaaaaaaaaaaaaaaaap0y0000dt0a00a9915             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test30519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30519");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 126, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test30520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30520");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "hi!hi!hi!");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("##", "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44", 961);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("           00noce0 0        ", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test30521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30521");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.606SP-1Y11M3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30522");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000", "T H H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!", 281);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!" + "'", str2, "         ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!");
    }

    @Test
    public void test30524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30524");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                 'P'yyyy...  #0 days 0 hours 0 minutes 0 seconds #0 days 0 hours 0 mi", 71, "0:00:00.0170:00:00.0170:00:00.0170:aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                 'P'yyyy...  #0 days 0 hours 0 minutes 0 seconds #0 days 0 hours 0 mi" + "'", str3, "                                                                                                                                 'P'yyyy...  #0 days 0 hours 0 minutes 0 seconds #0 days 0 hours 0 mi");
    }

    @Test
    public void test30525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30525");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaahi!444444444444444444444444444444444444444444...", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30526");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y0M0DT0H0M0.205S", 23, 298);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0:00:00.083");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.083" + "'", str1, "0:00:00.083");
    }

    @Test
    public void test30528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444");
    }

    @Test
    public void test30529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30529");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.40I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30530");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!", "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 63);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "I!                                                                                       Hi!Hi!H...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!" + "'", str5, "Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!");
    }

    @Test
    public void test30531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30531");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("::.99aaaaaaaaaaP-1Y11M30DT23H59M59.978S::.99aaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30532");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("p0Y0M0DT0H0M0.464S", 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30533");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("97P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30534");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "808.95095032TD03011Y1-P                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "!I!I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test30535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30535");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("p0Y0M0D...", "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...#######################hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0Y0M0D..." + "'", str3, "p0Y0M0D...");
    }

    @Test
    public void test30536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                     H!IH!IH ", 201);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                     H!IH!IH " + "'", str2, "                                                                                                                     H!IH!IH ");
    }

    @Test
    public void test30537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("###t 00###", "00Y0M0DT0H0M0.001S                                                                       hi!hi!hi!                                                                       0Y0M0DT0H0M0.001Sseconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###t 00###" + "'", str2, "###t 00###");
    }

    @Test
    public void test30538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30538");
        char[] charArray17 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray17);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("0 SECONDS", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0s 0s 0", charArray17);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "p0y0m0dt0h0m0.271s", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI...", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P-1Y11M30DT23H59M59.902S44444444444444444444444444444444444444444444444444444444444444444444444", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 33 + "'", int22 == 33);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test30539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0:00:00.189", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaa0I!p000000t00000.099-10I!p000000t00000.099-1p000000t00000.099-1p000000t00000.09");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.189" + "'", str2, "0:00:00.189");
    }

    @Test
    public void test30540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0:00:00.075");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.075" + "'", str1, "0:00:00.075");
    }

    @Test
    public void test30541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30541");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("S S hi!", "!ih!ih!ihhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30542");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                                                                               hi! ", "                                                                                              hi!", 8);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "        ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.290");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'd", strArray5, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("!ih !ih                                                                                                !ih                                                                                               ", (java.lang.Object[]) strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!IyImIdII!ImI!IIIsIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'd" + "'", str10, "'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.290" + "'", str11, "0:00:00.290");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.290" + "'", str14, "0:00:00.290");
    }

    @Test
    public void test30543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30543");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaa", 99, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", "0:00:00.611");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30545");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }
}

