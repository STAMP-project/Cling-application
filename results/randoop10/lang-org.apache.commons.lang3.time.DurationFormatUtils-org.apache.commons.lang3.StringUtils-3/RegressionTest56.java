import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest56 {

    public static boolean debug = false;

    @Test
    public void test28001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28001");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P-1Y11M30DTS0 S0 S0P-1Y11M30DT2", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI...AAAAAAAAAAAAAAAAAAP0Y0000DT0a00a9915", 495);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28002");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "0:00:00.99");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 97, 97);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                               0:00:00.004", 955, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test28003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28003");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aahi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28004");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                  i!0i!i!i!i!i!i!i!i!i!", (java.lang.CharSequence) "hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28005");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 0a00", "P-1Y11030DT23059059.98", "S870.0M0H0TD0M0Y0PD43041144Y400-14P4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 0a00" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 0a00");
    }

    @Test
    public void test28006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28006");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                            I:II:IIII32                                           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 98 + "'", int1 == 98);
    }

    @Test
    public void test28007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28007");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444", "                                                                                    P0000Y0M0DT0         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28008");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 0econ00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...                                                       hI!hI!h...hi!                          ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28010");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", "hi!hi!hi! ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                               ...", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', 105, 5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test28011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28011");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44's's.S'm'M'h'h'td'D'm'm'y'YYYY'p'##########################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44's's.S'm'M'h'h'td'D'm'm'y'YYYY'p'##########################################################################################################################################################################################################################################################################" + "'", str1, "44's's.S'm'M'h'h'td'D'm'm'y'YYYY'p'##########################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test28012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAAAAAAAAAAAAA                 P0Y0M0DT0H0M0.001S                 ", "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAA                 P0Y0M0DT0H0M0.001S                 " + "'", str2, "AAAAAAAAAAAAAAA                 P0Y0M0DT0H0M0.001S                 ");
    }

    @Test
    public void test28013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28013");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 146, "                        010.00:00:0                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        010.00:00:0                                                                                                                                                                      " + "'", str2, "                        010.00:00:0                                                                                                                                                                      ");
    }

    @Test
    public void test28014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28014");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P-1Y11030DT23059059.95048");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28015");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("p-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051Sp-1yhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051Sp-1yhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S" + "'", str1, "p-1y11m30dt23h59m59.993sP0Y0M0DT00M0.051Sp-1yhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
    }

    @Test
    public void test28016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28016");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M", "hi!4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test28017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28017");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...#######################hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "0:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.0520:00:00.052");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28019");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("S", "444444444444444P0Y0M0DT0H0M0.395S444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28020");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045SHhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP", "'44", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28021");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 192 + "'", int2 == 192);
    }

    @Test
    public void test28022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0:00:00.03", "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28023");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) " i# #4#hi# #444#hi# #4#hi# #4#hi# #444#hi# #4#hi# #4#hi# #4440#i# #hi# #4#hi# #444#hi# #4#hi# #4#hi# #444#hi# #4#hi# #4#hi# #444", (java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000H S0H S000H SH S0H S000H SH S0H S000H S00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 488 + "'", int2 == 488);
    }

    @Test
    public void test28024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28024");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 14, (long) 187);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.173S" + "'", str2, "P0Y0M0DT0H0M0.173S");
    }

    @Test
    public void test28025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28025");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI", 611);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI" + "'", str2, "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI");
    }

    @Test
    public void test28027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28027");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 277, (long) 22, "h23AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp00059030t0h0590.04559", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28028");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 T044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 ", "0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032", 192);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test28029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28029");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) ":00:00.0974444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.090:00:00.1060:00:00.0974444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.09");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! h" + "'", str2, "hi! hi! hi! hi! hi! hi! hi! hi! hi! h");
    }

    @Test
    public void test28031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28031");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-00P      #####################P Y M DT H M n 56S.372S", "p0Y0M0DT0H0M0.281S");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28032");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "230.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28033");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28034");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0:00:00.139######################################HP0Y000DT00000.01010#######################################", 205);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28035");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I############", "0day88                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28036");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.034S", "###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!  hi!  hi!  hi!  hi!", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28037");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!4hi!444hi HI!  HI..hi!4hi!444hi", "sshi", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28038");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                    'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28039");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 102, 285);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28040");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaa0i!i!...", 197, 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28041");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "P0Y0-10DT07430-10.1663599218");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0-10DT07430-10.1663599218" + "'", str1, "P0Y0-10DT07430-10.1663599218");
    }

    @Test
    public void test28042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaa", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test28043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28043");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0:00:00.034", " hi!   hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28044");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("         s s hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28045");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  i!", 43, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("P0Y0M0DT0H0M0.608S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.608s" + "'", str1, "p0y0m0dt0h0m0.608s");
    }

    @Test
    public void test28047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28047");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("      HI!aahi!P0000Y0-10DT07430-10.99359999      HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28048");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0", "P0Y0M0DT0H0M0.045S");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray9, strArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray9);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, ' ');
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3, strArray9);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "aahi!" + "'", str22, "aahi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "  hi!" + "'", str24, "  hi!");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str26, "S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test28049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(".                                      hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ". hi!hi!hi!" + "'", str1, ". hi!hi!hi!");
    }

    @Test
    public void test28050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28050");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "i! hi!   hi!hi!  hi!  hi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28051");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("  hi!   hi!  hi!  hi!  hi!  hi!  h                                                                               ::.99!  HI!  HI!  HI!  HI!  HI!  HI!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!   hi!  hi!  hi!  hi!  hi!  h                                                                               ::.99!  HI!  HI!  HI!  HI!  HI!  HI!  " + "'", str1, "  hi!   hi!  hi!  hi!  hi!  hi!  h                                                                               ::.99!  HI!  HI!  HI!  HI!  HI!  HI!  ");
    }

    @Test
    public void test28052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28052");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.044S" + "'", str2, "P0Y0M0DT0H0M0.044S");
    }

    @Test
    public void test28053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28053");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "999.95095032TD03011Y1-P", "P0Y0M0DT0H0M0.032S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test28054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28054");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4P41-004Y44114034DT44324954114411795444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4!ih444!ih4!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28055");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("00Y0M0DT0H0M0.001S0Y0M0DT0H0M0.001Sseconds", "P yyyy Y        T");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28056");
        char[] charArray9 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi!0S 0S 00S 0S 00S 0S 00S 0S 00S ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P-1Y11M30DT23H59M59.894S", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test28057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                 0:00:00.495                                 ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 0:00:00.495                                 " + "'", str2, "                                 0:00:00.495                                 ");
    }

    @Test
    public void test28058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28058");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("sshi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28059");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  0econ", 93, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("P0Y000DT00000.225226", 192);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.225226" + "'", str2, "P0Y000DT00000.225226");
    }

    @Test
    public void test28061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28061");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 114);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.114S" + "'", str1, "P0Y0M0DT0H0M0.114S");
    }

    @Test
    public void test28062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test28063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28063");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("P0Y0M0DT0H0M0.087S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0 D0 D0 D0 hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SM'M'd'DT'H'H'm'M's.S'S'44", "0000000000000000000I!I!I!I!I!I!I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 D0 D0 D0 hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SM'M'd'DT'H'H'm'M's.S'S'44" + "'", str2, "0 D0 D0 D0 hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SM'M'd'DT'H'H'm'M's.S'S'44");
    }

    @Test
    public void test28065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28065");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.005" + "'", str1, "0:00:00.005");
    }

    @Test
    public void test28066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28066");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("          Hi!                                                           hi!", "DPM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT0H0M0.464SP0Y0M0DT", "hi!Hi!hi!Hi!Hi!Hi!hi!Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          Hi!                                                           hi!" + "'", str3, "          Hi!                                                           hi!");
    }

    @Test
    public void test28067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28067");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###################################hi!################", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 102);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!", "0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!" + "'", str2, "a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!a4hi!");
    }

    @Test
    public void test28069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28069");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "iHhiHhiHhiHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ..", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! .." + "'", str2, "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ..");
    }

    @Test
    public void test28071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28071");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("################################################################################################################################################################################################################### AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0y0m0dt0h0m0.001sAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!P0Y000...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28072");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s", "0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!'y'm'm' 'dt'h'h'M'");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28073");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!Iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ..", "HI!  P-1Y11M30DT23H59M59.903S...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                 0:00:00.495                                 ", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 0:00:00.495                                 " + "'", str3, "                                 0:00:00.495                                 ");
    }

    @Test
    public void test28075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str2, "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test28076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28076");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                          P-1Y11M30DT23H59M59.424S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                          P-1Y11M30DT23H59M59.424S" + "'", str1, "                                                                          P-1Y11M30DT23H59M59.424S");
    }

    @Test
    public void test28077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28077");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("0:0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28078");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                      aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's", ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "P0Y000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000P0Y0P0Y", 3, 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("00000000000000000000000000004444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H4", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", 31);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i", strArray4, strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i" + "'", str13, "Hi!P0Y0M0DT0H0M0.002Shi!P0Y  i");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test28079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'dHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "                                                       P-1Y11M30DT23H59M59.999S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28080");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) " S0 S0 S0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("p0Y0M0DT0H0M0.904S", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28082");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0DAYS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28083");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 T044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 T044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044" + "'", str1, "44 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 T044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044 0a044");
    }

    @Test
    public void test28084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28084");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("P-1Y11M3DT23H59M59.99", "0TD000Y0Ph");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ", "aaaaaaaaaP-1Y11M30DT23H59M59.935");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! " + "'", str2, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ");
    }

    @Test
    public void test28086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28086");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, '#');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28087");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" hi!  hi!  h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! h" + "'", str1, "hi! hi! h");
    }

    @Test
    public void test28088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28088");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray7, strArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray7);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ');
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.000S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray23, strArray26);
        int int28 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("P-1Y11M30DT23H59M59.999", strArray26);
        java.lang.Class<?> wildcardClass29 = strArray26.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "aahi!" + "'", str20, "aahi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "  hi!" + "'", str22, "  hi!");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test28089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 115);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                   " + "'", str2, "                                                                                                                   ");
    }

    @Test
    public void test28090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "AAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M" + "'", str2, "AAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M");
    }

    @Test
    public void test28091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28091");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaS910.0M0H0TD0M0Y0P                                                             ", 7, "     4yyyy4P4                                                                                                                                                                                                  HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaS910.0M0H0TD0M0Y0P                                                             " + "'", str3, "aaaaaaaaaaaaS910.0M0H0TD0M0Y0P                                                             ");
    }

    @Test
    public void test28092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28092");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...###################################################################################################################################################################################### HI! HI! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ...hi!", "P-1Y11M30DT23H59M59.730S", 72);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28093");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad", "0:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "s020.0m0h0td0m0y0p");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "s020.0m0h0td0m0y0p" + "'", str1, "s020.0m0h0td0m0y0p");
    }

    @Test
    public void test28095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28095");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P-1Y11M30DT23H59M59.863SI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I..hi!4hi!444hI!  0I", "p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28096");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!44HI!44HI!44HI!44HI..HI!44HI!hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       0I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  hi!", "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28097");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("'m'm'D'dt'h'h'Mhi!hi!hi!'m'm'D'dt'h'h'M", "HP0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28098");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!P0000Y0M0DT0H0M0.99S");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "P-1Y11");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("0:00:00.128", strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test28099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!HI!HI!HI..", 888);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     HI!HI!HI!HI!HI!HI.." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     HI!HI!HI!HI!HI!HI..");
    }

    @Test
    public void test28100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28100");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaa0:00:00.00aaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  HI!  HI!  HI!  HI!  HI!  HI!  HI!  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28101");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a4hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str2, "P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test28103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28103");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "44's'ss'm'm'h'h'td'd'm'm'y'yyyy'p'");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28104");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("hi!        hi!                        hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                       'P'yyyy'Y'M'M");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'P'yyyy'Y'M'M" + "'", str1, "'P'yyyy'Y'M'M");
    }

    @Test
    public void test28106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "444!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! " + "'", str2, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
    }

    @Test
    public void test28107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28107");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 46, (-1L), "                                                                                                                      'P'YYYY'Y'0DAY88A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                      PYYYYY0DAY88A" + "'", str3, "                                                                                                                      PYYYYY0DAY88A");
    }

    @Test
    public void test28108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("-1Y11M30DT23H59M59.964S44                                                                                                                               ", "...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ..." + "'", str2, "...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...");
    }

    @Test
    public void test28109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28109");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "#0 0a000 0 hour 0 0inute00 0 econ00 !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444                                                                                             0 -1616567633ECONDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#0 0a000 0 hour 0 0inute00 0 econ00 !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!4444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28110");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #h", "44444S H000S H0S HS H000S H0S HS H000S H0S H44444", 612);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "p0Y0M0DT0H0M0.464");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.464" + "'", str1, "P0Y0M0DT0H0M0.464");
    }

    @Test
    public void test28112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444p0y000dt00000.099104444", 275, 608);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! " + "'", str1, "...  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
    }

    @Test
    public void test28114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28114");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("44444444444444444444444444444444", "743I!  P-1Y11-130DT2374359-159.9033599964...000000000000000000000000000000743I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I!...I", "-1Y11030DT23059059.99379");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444");
    }

    @Test
    public void test28115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28115");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "P0Y000DT00000.000282");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("S010.0M0H0TD0M0Y0Ph", 226);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S010.0M0H0TD0M0Y0Ph" + "'", str2, "S010.0M0H0TD0M0Y0Ph");
    }

    @Test
    public void test28117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("P0Y0M0DT0H0M0.038S", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.038S" + "'", str2, "P0Y0M0DT0H0M0.038S");
    }

    @Test
    public void test28118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28118");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "         HP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.993SAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hP0Y0M0DT0H0M0.010S", 152, "44900970.00000TD000Y0P");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44900970.00000TD000Y0P44900970.00000TD000Y0P44900970.00000TD000Y0P44900970.00000TD000Y0P44900970.00000TD000Y0P44900970.00000TD000Y0P4hP0Y0M0DT0H0M0.010S" + "'", str3, "44900970.00000TD000Y0P44900970.00000TD000Y0P44900970.00000TD000Y0P44900970.00000TD000Y0P44900970.00000TD000Y0P44900970.00000TD000Y0P4hP0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test28120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28120");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hhhP0Y00                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Hi!Hi!hi!Hi!Hi!Hi!hi!Hi!hhhP0Y00", "                                              1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                              1AA P yyyy Y        T H H         0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaa0I!p0y000dt00000.099-1HI!p0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0:00:00.013", 872);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             0:00:00.013" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             0:00:00.013");
    }

    @Test
    public void test28122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("s540.0m0h0td0m0y0paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ", "0P0Y0M0DT0H0M0.019SiP0Y0M0DT0H0M0.019S!P0Y0M0DT0H0M0.019S4444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.019SaahiP0Y0M0DT0H0M0.019S!P0Y0M0DT0H0M0.019S4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s540.0m0h0td0m0y0paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           " + "'", str2, "s540.0m0h0td0m0y0paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ");
    }

    @Test
    public void test28123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                            743i", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               743i    " + "'", str2, "                               743i    ");
    }

    @Test
    public void test28124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("     4yyyy4P4                    !I!I!I347     4yyyy4P4                   ", 955);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     4yyyy4P4                    !I!I!I347     4yyyy4P4                   " + "'", str2, "     4yyyy4P4                    !I!I!I347     4yyyy4P4                   ");
    }

    @Test
    public void test28125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28125");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                     sdnoces 0'H'TD'd'M'M'Y'yyyy'P'                                                                                                                                           ", "001560.00000TD000Y0p");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test28126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28126");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                         P0Y0M0DT0H0M0.099Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...######################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28127");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HY0 HY0HY0H...HY0 P0HP0H..", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28128");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!pphi!pphi!pphi!pphi!pphi!ppS0pS0pS0phi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pphi!pppppppppppp");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28129");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'                                            I:II:IIII32", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", 91);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28130");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  " + "'", str1, "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ");
    }

    @Test
    public void test28131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28131");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!  HI!  HI!  HI!  HI!  HI...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "0SECON");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test28133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28133");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0:00:00.495");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.495" + "'", str1, "0:00:00.495");
    }

    @Test
    public void test28134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "P-1Y11M30DT23H59M59.912S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  ", "###################################hi!################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  " + "'", str2, "                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  ");
    }

    @Test
    public void test28136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28136");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0:00:00.030", "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test28137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28137");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("P0Y0M0DT0H0M0.323S", "P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0711P0Y000DT00000.0                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test28138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!hi!hi!  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi! hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i!" + "'", str1, "hi!hi!hi! hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i!");
    }

    @Test
    public void test28139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!IH !IH !IH !IH !IH !IH !IH !IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test28140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28140");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                           a...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28141");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                               P0Y0-10DT07430-10.2713599914                           ", "                                         P0Y0M0DT0H0M0.126S                 ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28142");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ", "P0Y000DT00000.034903aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28143");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', 24, 23);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "P0Y0M0DT0H0M0.125S");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test28144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28144");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###################################hi!################", 531, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                              ###################################hi!################                                                                                                                                                                                                                                               " + "'", str3, "                                                                                                                                                                                                                                              ###################################hi!################                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test28145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("P00-1Y11-130DT2374359-159.999359998900000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I...", 488);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                    P00-1Y11-130DT2374359-159.999359998900000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I...                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                    P00-1Y11-130DT2374359-159.999359998900000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I...                                                                                                                                                                                                    ");
    }

    @Test
    public void test28146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28146");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ai!aaaaaaaaaaaaaaaa2ahi!aaai!", "hi! hi!   hi HI!  HI..hi! hi!   hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28147");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "P0Y0M0DT0H0M0.089S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28148");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("'P'yyyy'Y'M'M'd'DT'''m'M's.S'S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28149");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("P0Y000DT00000.000282", "                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("P0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", 125, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################P0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str3, "##########################P0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test28151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28151");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("P Y M DT H M n 56S", "P0Y0M0DT0H0M0.99Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("P0Y000...", "p0Y0-10D...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28153");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                       Hi!Hi!H...", "P0Y0M0DT0H0M0.126S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28154");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "###########    m    h m     s############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28155");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                P0Y0M0DT0H0M0.100S                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("p YYYY y        t", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p YYYY y        t" + "'", str2, "p YYYY y        t");
    }

    @Test
    public void test28157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28157");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test28158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...4444444444444444444444444444444444444444444444444444444...", "...h!ih!ih", "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444444444444444444444444444444444444444444444444444..." + "'", str3, "...4444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test28159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28159");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "...   P0Y0M0DT0H0M0.035S                                       ", 134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28160");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Hi! hi!   hi!", "hi!hi!hi      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28161");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################################################################################################################################### aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "0   seconds");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 969 + "'", int2 == 969);
    }

    @Test
    public void test28162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaap0Y0M0DT0H0M0.045S", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaap0Y0M0DT0H0M0.045S" + "'", str2, "aaaaaaaaaaaap0Y0M0DT0H0M0.045S");
    }

    @Test
    public void test28164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28164");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test28165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28165");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test28166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28166");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!4440i!hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444!ih4!ih4!ih444!ih4!ih4!ih444!ih4!ih!i0444!ih4!ih4!ih444!ih4!ih4!ih444!ih4!ih" + "'", str1, "444!ih4!ih4!ih444!ih4!ih4!ih444!ih4!ih!i0444!ih4!ih4!ih444!ih4!ih4!ih444!ih4!ih");
    }

    @Test
    public void test28167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28167");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("......0", 301, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################################################################################################################################################################################################################################################......0" + "'", str3, "######################################################################################################################################################################################################################################################################################################......0");
    }

    @Test
    public void test28168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28168");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "I!i!i!                                                                                                                                                           ", ".s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28169");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("S H000S H0S HS H000S H0S HS H000S H0S H", "0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                                                                                 ", 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("P yyyy Y        T#########################################", "                                                                                             0 -1616567633ECOND");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!");
    }

    @Test
    public void test28173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnochhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  es  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces", 318);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  es  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces" + "'", str2, "0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  es  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces");
    }

    @Test
    public void test28174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28174");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "...4HI!444", "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.09P0:00:00.0900:00:00.09Y0:00:00.0900:00:00.09M0:00:00.0900:00:00.09DT0:00:00.0900:00:00.09H0:00:00.0900:00:00.09M0:00:00.0900:00:00.09.0:00:00.090450:00:00.09S", 75);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test28175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28175");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444", "0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!", 281);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28176");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 18, "s's.s'm'm'h'h'td'd'm'm'y'yyyy'p'!ihaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0s.s0mhht0d0m0yyyyp!ihaa" + "'", str2, "0s.s0mhht0d0m0yyyyp!ihaa");
    }

    @Test
    public void test28177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28177");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("sdnoces", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "sdnoces" + "'", str4, "sdnoces");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "sdnoces" + "'", str5, "sdnoces");
    }

    @Test
    public void test28178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28178");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaasyad 0aaaahhhaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhhaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28179");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!I!I!", "aYaMaDTaHaMa", 49);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "8639930noce86399 0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28181");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28182");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAA01990.00000td000y0p");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28183");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("I!I!I!I!I!I!I!I!I!I!I!I!sssI!I!I!I!I!I!I!I!I!I!I!I!", "#############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28184");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                            I:II:IIII32                                           ", "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            I:II:IIII32                                           " + "'", str3, "                                            I:II:IIII32                                           ");
    }

    @Test
    public void test28186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28186");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hs0hs000hshs0hs000hsh##HI##", "S130.0M0H0TD0M0Y0P");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "hahaaaha");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28188");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("P0Y0M0DT0H0M0.056S", ".099SP0Y0M0DT0H0M0.099SP0Y0M0DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 318);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("00noce0 0ht0d0m0yyyyp                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00noce0 0ht0d0m0yyyyp" + "'", str1, "00noce0 0ht0d0m0yyyyp");
    }

    @Test
    public void test28190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28190");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0a:a00a:a00a                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                             P-1Y11M30DT23H59M59.991S                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28191");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:01117hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:00.008hi!hi!0:00:00.008hi!0:00:0", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28192");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            ", "ysa##i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!p0y0m0dt0h0m0.271s d");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test28194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("p00 P", 138);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p00 P" + "'", str2, "p00 P");
    }

    @Test
    public void test28195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28195");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0i!", "sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces  hi!sdnoces  sdnoces", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28196");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.concatWith("Hi!", (java.lang.Object[]) strArray6);
        java.lang.Class<?> wildcardClass21 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "aahi!" + "'", str19, "aahi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!Hi!hi!" + "'", str20, "Hi!Hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test28197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0         0         0         0         0         0         0         0         0         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("p-1y11m30dt23h59m59.903s", "                                         Hi!Hi!H...HI!                          ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p-1y11m30dt23h59m59.903s" + "'", str2, "p-1y11m30dt23h59m59.903s");
    }

    @Test
    public void test28199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("P-1Y11030DT23059059.990", "I000000000000000IIIIIIIIIIIIIIIhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s'saahi!       0I!#########################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28201");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P-1Y11M30DT23H59M59.601S", "             010.00:00:0             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test28202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                       ##'P'yyyy'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", 5, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test28204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28204");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0         ", "aahi!", 97);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!  hi!  hi!  hi!  hi!  hi...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test28205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "P0Y0M0DT0H0M0.024");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28206");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".09981P0Y000DT00000.09981P0Y000DT0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28207");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440 ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i! ", "                                                                                               hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                          0DAY-1616567371                                            I:II:IIII32                                            0DAY                                            I:II:IIII32                                            0DAY                                            I:II:IIII32", "8S4P0Y0M0DT0H0M0.5");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          0DAY-1616567371                                            I:II:IIII32                                            0DAY                                            I:II:IIII32                                            0DAY                                            I:II:IIII32" + "'", str2, "                                          0DAY-1616567371                                            I:II:IIII32                                            0DAY                                            I:II:IIII32                                            0DAY                                            I:II:IIII32");
    }

    @Test
    public void test28209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!", 44, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                 44444444444444444444444444444444444444444                                                                                                                                                                                                                                  ", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                             44444444444444444444444444444444444444444                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                             44444444444444444444444444444444444444444                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test28211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28211");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                         ", "                                     ::::::::32                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28212");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                           ...", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! hi #############################################################################P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28213");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                44432440404044TD404...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("0.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.49");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.49" + "'", str1, "0.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.49");
    }

    @Test
    public void test28215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28215");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0 SECONDShi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!", "P-1Y11M30DT23H59M59.711S                                                           ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28216");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                             aahi!", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28217");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                            44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'                                                                                                                               ", 390, 298);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28218");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!Ih !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH 0s 0s 0s !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("iHhiHhiHhiHhp-1Y11M30DT23H59M59.924S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iHhiHhiHhiHhp-1Y11M30DT23H59M59.924S" + "'", str1, "iHhiHhiHhiHhp-1Y11M30DT23H59M59.924S");
    }

    @Test
    public void test28220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28220");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                         P0Y0M0DT0H0M0.019S", "aaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0", 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28221");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAP0Y000DT00000.0459I!0000000000000000000000000000I!I!", "  ###############################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28222");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi! hi! hi!hi! hi! hi!hi! hi! hi!", "   HI!  HI!  HI!  HI!  HI!  HI...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28223");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28224");
        char[] charArray10 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("0 DAYS", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         1010.00000TD000Y0p        ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("0:00:00.034", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P-1Y11M30DT23H59M59.123S", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test28225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28225");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("p00-1Y11M30DT23H59M59.964S44                        ", "P0Y000DT00000.281495");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28226");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", "p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaa0:00:00.00aaaaaaaaaaaaaaaaaaaaHI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444                            hi", "                                                                              p000000t0h000.0090");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28228");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test28229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28229");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0:00:00.096", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!IH!IH!IH!IH!IH!IH!IH!IH", "##################################################################################00000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test28231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28231");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28232");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0" + "'", str1, "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0");
    }

    @Test
    public void test28233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                    !I                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28234");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P0Y0M0DT0H0M0.009S", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0I!p000000t00000.099-10I!p0aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str4, "P0Y0M0DT0H0M0.009S");
    }

    @Test
    public void test28235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28235");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "P0Y0M0DT0H0M0.058S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28236");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("sdnoces 0'H'TD'd'M'M'Y'yyyy'P'                                                                                                                                                                                                                                                                    ", (int) (byte) 10, 531);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H'TD'd'M'M'Y'yyyy'P'                                                                                                                                                                                                                                                                    " + "'", str3, "H'TD'd'M'M'Y'yyyy'P'                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test28237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28237");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("yyyy'Y'M'M", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28238");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            ", "0000000I!                                                                                       I!I!...I!                 I!I!..", 608);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28239");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", "09981P0Y000DT00000.09981P0Y000DT0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28240");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28241");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0", (java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test28242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.082");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.082" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.082");
    }

    @Test
    public void test28243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28243");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##hi!", "                                                                                              hi!", 98);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("000000000", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test28244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  HI!  HI!  HI!  HI!  HI!  HI...", 336, "'sdnoces");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces  HI!  HI!  HI!  HI!  HI!  HI...'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces" + "'", str3, "'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces  HI!  HI!  HI!  HI!  HI!  HI...'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces'sdnoces");
    }

    @Test
    public void test28245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28245");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("p0Y0-10D...", "P0Y000DT00000.41495############################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!" + "'", str1, "i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!hi!  i!  i!");
    }

    @Test
    public void test28247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28247");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28248");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                  AAHI!P0000Y0M0DT0H0M0.99S", (int) ' ', "P-1Y11M30DT23H59M59.926S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                  AAHI!P0000Y0M0DT0H0M0.99S" + "'", str3, "                                                                                  AAHI!P0000Y0M0DT0H0M0.99S");
    }

    @Test
    public void test28249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001S", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28250");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0:00:00.090");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.090" + "'", str1, "0:00:00.090");
    }

    @Test
    public void test28251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28251");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaap0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28252");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("   i   i   i   i   i   i  i  i  i   i   i   i   i   i   i   i   i   i   i   i ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   I   I   I   I   I   I  I  I  I   I   I   I   I   I   I   I   I   I   I   I " + "'", str1, "   I   I   I   I   I   I  I  I  I   I   I   I   I   I   I   I   I   I   I   I ");
    }

    @Test
    public void test28253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28253");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################### 0Y0M0DT0H0M0.001S           ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################### 0Y0M0DT0H0M0.001S ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################### 0Y0M0DT0H0M0.001S ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test28254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                       P0Y0M0DT0H0M0.271                                       ", "       i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!       .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                       P0Y0M0DT0H0M0.271                                       " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                       P0Y0M0DT0H0M0.271                                       ");
    }

    @Test
    public void test28255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28255");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444444444444444444444444444444444444ahi!444444444444444444444444444444444444444444", "                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                             ", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28256");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I! ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0 0ECON00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28257");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AA0I!P0000Y000DT00000.99612", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 45);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0:00:00.900", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                0:00:00.900" + "'", str2, "                                                                                0:00:00.900");
    }

    @Test
    public void test28259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28259");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "P0Y0-10DT0730-10.0013599969");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s" + "'", str2, "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s" + "'", str4, "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
    }

    @Test
    public void test28260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28260");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("P0Y000DT00000.041474", "I!                                                                                                  P                                                                                                  I..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test28262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28262");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.0", 83, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27 + "'", int3 == 27);
    }

    @Test
    public void test28263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28263");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28264");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", " : i!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444  ", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28265");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("50278.9509503...", "DAY86                                                                                                DAY", 30);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "p000000t0h000.2710 0a00                                        ", 189, 85);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test28266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("::.99", 125);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "::.99" + "'", str2, "::.99");
    }

    @Test
    public void test28267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0 SECONDShi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 SECONDShi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!" + "'", str2, "0 SECONDShi!P0Y0M0DT0H0M0.002Shi!P0Y0M0DT0H0M0.002Shi!");
    }

    @Test
    public void test28268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce0", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28269");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  " + "'", str1, "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  ");
    }

    @Test
    public void test28270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("####################################              syad 44              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################              syad 44" + "'", str1, "####################################              syad 44");
    }

    @Test
    public void test28271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28271");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                         ...", "444444444444444444                    444444444444444444                    444444                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("      hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test28272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P 0000 Y        T 0", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P 0000 Y        T 0" + "'", str2, "P 0000 Y        T 0");
    }

    @Test
    public void test28273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28273");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("P0Y0M0DT0H0M0.005S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.005S" + "'", str1, "P0Y0M0DT0H0M0.005S");
    }

    @Test
    public void test28274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444" + "'", str1, "HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28275");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("T0H0M0.096S                                                                                                ", 961);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28276");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 125 + "'", int1 == 125);
    }

    @Test
    public void test28277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  h", "S309.95M95H32TD03M11Y1-P");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  h" + "'", str2, "  h");
    }

    @Test
    public void test28278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       p-1y11m30dt23h59m59.983s", 32, 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                    ..." + "'", str3, "...                                                    ...");
    }

    @Test
    public void test28279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "S510.0M0H0TD0M0Y0P");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test28280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P0Y000DT00000.139900", "P-1Y11M30DT23H59M59.981S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.139900" + "'", str2, "P0Y000DT00000.139900");
    }

    @Test
    public void test28281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28281");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!...", "   Hi!Hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28282");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H...");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("HI! ###############################################################  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ...#######################", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test28283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444444444444444444444hi! hi! hi! hi!hhhhi! hi! hi! hi!aA", "0!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...:!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...00!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...:!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...00!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444....!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...030");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444hi! hi! hi! hi!hhhhi! hi! hi! hi!aA" + "'", str2, "4444444444444444444444444444444444444444444444hi! hi! hi! hi!hhhhi! hi! hi! hi!aA");
    }

    @Test
    public void test28284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28284");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       0I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  hi!", (java.lang.CharSequence) "            Hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0 D0 D0 D0 D0 D0 P0000Y0M0DT0H0M0.010S44", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              0 D0 D0 D0 D0 D0 P0000Y0M0DT0H0M0.010S44                              " + "'", str2, "                              0 D0 D0 D0 D0 D0 P0000Y0M0DT0H0M0.010S44                              ");
    }

    @Test
    public void test28286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28286");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("         HP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993Saaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993Saaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "HP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP-1Y11M30DT23H59M59.993Saaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0i!                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i!" + "'", str1, "0i!");
    }

    @Test
    public void test28288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M" + "'", str1, "##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
    }

    @Test
    public void test28289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28289");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) 205);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.205S" + "'", str2, "P0Y0M0DT0H0M0.205S");
    }

    @Test
    public void test28290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(" HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaahi!0i!i!i!i!i!i!i!i!i!... HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaah", "                                                              P0Y0M0DT0H0M0.098S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaahi!0i!i!i!i!i!i!i!i!i!... HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaah" + "'", str2, " HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaahi!0i!i!i!i!i!i!i!i!i!... HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S HHHHHHHHHHHaah");
    }

    @Test
    public void test28291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", "  hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!hP00-1Y11030DT23059059.9994800000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!i!", "i0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHH" + "'", str3, "iiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiiHiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHHHiiHHHHHHHHHHHHHHH");
    }

    @Test
    public void test28292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28292");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAAAAAAAAAAAAAAAA0:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("P0Y0M0DT0H0M0.101S", "44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M" + "'", str2, "44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M0DT0H0M0.100S0Y0M");
    }

    @Test
    public void test28294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("'P'yyyy'Y'M'M", 958);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'P'yyyy'Y'M'M" + "'", str2, "'P'yyyy'Y'M'M");
    }

    @Test
    public void test28295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                                                                                ", ":00:");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                ");
    }

    @Test
    public void test28296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28296");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                44188000TD00Y0P                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("DAY86                                                                                                DAY");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DAY86DAY" + "'", str1, "DAY86DAY");
    }

    @Test
    public void test28298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (int) ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test28299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("P0Y0M0DT0H0M0.005S", "pa0aYa0aMa0aDTa0aHa0aMa0a.a045aS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P" + "'", str2, "P");
    }

    @Test
    public void test28300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28300");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("    HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!HI!i!", "                                                                                                                                                                                                                                                                                                                                                        HI!HI!HI!                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28301");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "P-1Y11M30DT23H59M59.073S", (java.lang.CharSequence) "4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28302");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                           P-1Y11M30DT23H59M59.853S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0:00:00.224", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.224" + "'", str2, "0:00:00.224");
    }

    @Test
    public void test28304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28304");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAHI!P0000Y0M0DT0H0M0.99S", "0:00:00.052");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test28305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28305");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "DNOCES0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28306");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "P0Y000DT00000", 205);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28307");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "p0Y000DT00000.010100Y000DT00000.001110", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28308");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                         0:00:00.021                                                                                         ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444aahi!D");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" P yyyy Y        T H H         ", 126, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " P yyyy Y        T H H                                                                                                        " + "'", str3, " P yyyy Y        T H H                                                                                                        ");
    }

    @Test
    public void test28311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(" 00I!  I.", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444p0y0m0dt0h0m0.003sp0y0m0dt0h0m0.003sp0y0m00444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 00I!  I" + "'", str2, " 00I!  I");
    }

    @Test
    public void test28312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################### 0Y0M0DT0H0M0.001S ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################### 0Y0M0DT0H0M0.001S ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################### 0Y0M0DT0H0M0.001S ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test28313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28313");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.099S", ' ');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "hhh", 8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a', 33, 8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", strArray5, strArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!", strArray5);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###############################################################", "ppYpMpDTpHpMpTp96S", 122);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("I!I!I!I!I!I!I!I!I!I!I!I!sssI!I!I!I!I!I!I!I!I!I!I!I!", strArray16, strArray20);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  " + "'", str14, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "I!I!I!I!I!I!I!I!I!I!I!I!sssI!I!I!I!I!I!I!I!I!I!I!I!" + "'", str21, "I!I!I!I!I!I!I!I!I!I!I!I!sssI!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test28314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("yyyy'Y'M'M", 188);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yyyy'Y'M'M                                                                                                                                                                                  " + "'", str2, "yyyy'Y'M'M                                                                                                                                                                                  ");
    }

    @Test
    public void test28315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28315");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0-10DT07430-10.0113599925", "3H59M59.999S");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28316");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("p0y0m0dt0h0m0.000s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "s000.0m0h0td0m0y0p" + "'", str1, "s000.0m0h0td0m0y0p");
    }

    @Test
    public void test28317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28317");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0s 0s 0                                              ", (java.lang.CharSequence) "                         44 days                                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28318");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("P0Y0M0DT0H0M0.484S", "                                             743i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                              ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28319");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  320 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", "0:00:00.191");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28320");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0 d0 d0 d0 d0 d0 p0000y0m0dt0h0m0.010s44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 D0 D0 D0 D0 D0 P0000Y0M0DT0H0M0.010S44" + "'", str1, "0 D0 D0 D0 D0 D0 P0000Y0M0DT0H0M0.010S44");
    }

    @Test
    public void test28321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28321");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaap0Y000DT00000.01010S00S0S00S0S00S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaap0Y000DT00000.01010S00S0S00S0S00S" + "'", str1, "aaaaaaaaaaaaaaap0Y000DT00000.01010S00S0S00S0S00S");
    }

    @Test
    public void test28322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28322");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!4hi!444hi HI!  HI..hi!4hi!444hi", (java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test28323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28323");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0:00:00.0974444444444444444444444444444444444444444444444AAHI!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.090:00:00.1060:00:00.0974444444444444444444444444444444444444444444444AAHI!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.09", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28324");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi! ", '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hI!", 'a');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", strArray3, strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "P0Y0M0DT0H0M0.930S444444444444444444444444444444444444444444444444444444444444444444444444444444400: 00: 0i! hi!   hi!hi!  hi!  hi!  ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!" + "'", str8, "hI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'0 SECONDS" + "'", str9, "                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test28325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28325");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D001560.00000TD000Y0p230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "p0y0m0dt0h0m0.065s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0y0m0dt0h0m0.065s" + "'", str1, "P0y0m0dt0h0m0.065s");
    }

    @Test
    public void test28327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28327");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "aahi!", (int) (byte) 10, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!Hi!H...", strArray4, strArray7);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concatWith("                      sdnoces 0'h'td'd'm'm'y'yyyy'p'                                                                                                                                           ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aahi!" + "'", str13, "aahi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!Hi!H..." + "'", str14, "Hi!Hi!H...");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test28328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28328");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "P-1Y11M30DT23H59M59.606S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p-1Y11M30DT23H59M59.606S" + "'", str1, "p-1Y11M30DT23H59M59.606S");
    }

    @Test
    public void test28329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28329");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!Hi!H...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) (short) 10, 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "0:00:00.030");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!Hi!H..." + "'", str10, "Hi!Hi!H...");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!Hi!H..." + "'", str11, "Hi!Hi!H...");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test28330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace(" #0 days 0 hours 0 minutes 0 seconds !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aahi!P0000Y0-10DT07430-10.99359999144444444", 107, "                            HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            HI                            HI    aahi!P0000Y0-10DT07430-10.99359999144444444" + "'", str3, "                            HI                            HI    aahi!P0000Y0-10DT07430-10.99359999144444444");
    }

    @Test
    public void test28332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28332");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!shi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099ShI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!shi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099ShI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!shi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Sh  i!i!hi!", "  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28333");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test28334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28334");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0000000000000000000000000000000000i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", 277, 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###################################################################################P0Y0M0DT0H0M0.372S", "HI! HI! HI! HI! HI! HI! HI! HI!0i!P");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################################################################P0Y0M0DT0H0M0.372S" + "'", str2, "###################################################################################P0Y0M0DT0H0M0.372S");
    }

    @Test
    public void test28336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28336");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                      P0Y0M0DT0H0M0.035S                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                      P0Y0M0DT0H0M0.035S                                       " + "'", str1, "                                      P0Y0M0DT0H0M0.035S                                       ");
    }

    @Test
    public void test28337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28337");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!hi!Hi!Hi!Hi!hi!Hi!", "aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444" + "'", str1, "P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28339");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("i!P0Y000DT00000.099-1", "", "ia!aHia!aHa..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!P0Y000DT00000.099-1" + "'", str3, "i!P0Y000DT00000.099-1");
    }

    @Test
    public void test28340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28340");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih!ih!ihhi!hi!hi!", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "hi!P0Y0M0DT0H0M0.139Shi!P0Y0M0DT0H0M0.139SP0Y0M0DT0H0M0.139SP0Y0M0DT0H0M0.139Shi!P0Y0M0DT0H0M0.139S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iihiihiihhiihiihii" + "'", str3, "iihiihiihhiihiihii");
    }

    @Test
    public void test28341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28341");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 15, (long) 96, "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PYYYYY0MDDT0H0M81.S0I" + "'", str3, "PYYYYY0MDDT0H0M81.S0I");
    }

    @Test
    public void test28342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28342");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("P0Y0M0DT0H0M0.110S                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.110s                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str1, "p0y0m0dt0h0m0.110s                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test28343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaS0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "'                                            i:ii:iiii32                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaS0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaS0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28344");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!                                                                                       Hi!Hi!H...HI!", "Hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#4440#i#!#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444#hi#!#4#hi#!#4#hi#!#444", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 3, 958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28345");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test28346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28346");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("   000000I!  I!  I!  I!  I!  I", "'p'YYYY'y'm'm'D'dt'h'                               ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("p00-1Y11M30DT23H59M59.964S44                                                                                                                                                          ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test28347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28347");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("'m'm'D'dt'h'h'M'm'S.s's'hI!", '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                        P0Y0M0DT0H0M0.100S         ", strArray4, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("aahi!P0000Y0M0DT0H0M0.99S DT H M n 56S", strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                        P0Y0M0DT0H0M0.100S         " + "'", str9, "                                                                                                                                                                                                        P0Y0M0DT0H0M0.100S         ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test28348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28348");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0 0ECON00", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28349");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP000000T0H000.0450", 8, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP000000T0H000.0450" + "'", str3, "000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP000000T0H000.0450");
    }

    @Test
    public void test28350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HI! HI!   HI!", "P-1Y11M30DT23H59M59.922S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28351");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0:00:00.017");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("P 0000 Y        T 0 ", "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P 0000 Y        T 0 " + "'", str2, "P 0000 Y        T 0 ");
    }

    @Test
    public void test28353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28353");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      ", "hi!", 139);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Phh-1Y11M3hDT23H59M59M964S44", 103, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test28354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28354");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "...                                 !i0!i0!i0!i0!i0!i0!i0!i0!i0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28355");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray17 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray17);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence6, charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.100S", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!  ", charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...3H59M59.872S", charArray17);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test28356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("iHhiHhiHhiHhp-1Y11M30DT23H59M59.924S", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iHhiHhiHhiHhp-1Y11M30DT23H59M59.924S" + "'", str2, "iHhiHhiHhiHhp-1Y11M30DT23H59M59.924S");
    }

    @Test
    public void test28357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                 440A00", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                 440A00" + "'", str3, "                                                                                                                                                 440A00");
    }

    @Test
    public void test28358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28358");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("   hi!  hi!  hi!  hi!  hi!  hi!    i!i!hi!!  I!  I!  I!  I!  I!  I!  I!  I!", "hi!p0y0m0dt0h0m0.099shi!p0y0m0dt0h0m0.099sp0y0m0dt0h0m0.099sp0y0m0dt0h0m0.099shi!p0y0m0dt0h0m0.099s", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032");
    }

    @Test
    public void test28360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28360");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaa ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA aaaaaaaaaaaaaaaaaaaa", "0i0i!0i!0i!0ip0y00p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0pd4444444444444444444444444444444444444444444444aahi0i!0i!0i!0ip0y00p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0p0y0pd4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28361");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-10i!P0Y000DT00000.099-1hi!P0Y000DT0!ih0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-10i!P0Y000DT00000.099-1hi!P0Y000DT00", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-10i!P0Y000DT00000.099-1hi!P0Y000DT0!ih0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-10i!P0Y000DT00000.099-1hi!P0Y000DT00" + "'", str2, "0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-10i!P0Y000DT00000.099-1hi!P0Y000DT0!ih0i!P0Y000DT00000.099-1hi!P0Y000DT00000.099-1P0Y000DT00000.099-1P0Y000DT00000.099-1hi!P0Y000DT00000.099-10i!P0Y000DT00000.099-1hi!P0Y000DT00");
    }

    @Test
    public void test28364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28364");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!                                                                                       HI!HI!H...HI!                 i!Hi!H..", "                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 174);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!                                                                                       HI!HI!H...HI!                 i!Hi!H.." + "'", str4, "HI!                                                                                       HI!HI!H...HI!                 i!Hi!H..");
    }

    @Test
    public void test28365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28365");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test28366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28366");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!s0s0s0hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 80, 71);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28367");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28368");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("P0Y0M0P-1Y11M30DT23H59M59.679S", "h                                                                                                                               P00-1Y11M30DT23H59M59.964S44                                                                                                                                0Y0M0DT0H0M0.010S", 488, 902);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0P-1Y11M30DT23H59M59.679Sh                                                                                                                               P00-1Y11M30DT23H59M59.964S44                                                                                                                                0Y0M0DT0H0M0.010S" + "'", str4, "P0Y0M0P-1Y11M30DT23H59M59.679Sh                                                                                                                               P00-1Y11M30DT23H59M59.964S44                                                                                                                                0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test28369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                            ...", "P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT000P-1Y11M30DT23H59M59.894S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            ..." + "'", str2, "                                                            ...");
    }

    @Test
    public void test28370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28370");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 476, (long) 204);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.728S" + "'", str2, "P-1Y11M30DT23H59M59.728S");
    }

    @Test
    public void test28371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28371");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 397, (long) 488, "p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("P-1Y11M30DT23H59M59.123S'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S''P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "                                                  .                                               i!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28373");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("p00-1y11m30dt23h59m59.999s00000000000000000000000000000023iiiiiiiiiiiiiiiiiiiiiiiiiiiii", "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...#######################hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi! ...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "P0Y0M0DT0H0M0.041S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pym3dt23P59m59999s2300000000000000000000000000000" + "'", str3, "pym3dt23P59m59999s2300000000000000000000000000000");
    }

    @Test
    public void test28374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28374");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("P0Y0M0DT0H0M0.017S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.017S" + "'", str1, "P0Y0M0DT0H0M0.017S");
    }

    @Test
    public void test28375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28375");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                                    'P'yyyy'Y'M'M'd'DT'H'0 seconds", "Y0M0DT0H0M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 114);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test28377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28377");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("743i!i!i!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28378");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4", "Sdnoces");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4" + "'", str2, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4");
    }

    @Test
    public void test28380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                               hi! ", 159, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               hi!                                                             " + "'", str3, "                                                                                               hi!                                                             ");
    }

    @Test
    public void test28381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28381");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0:00:00.079", "aaaaaaaaaaaap0Y0M0DT0H0M0.045S", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.079" + "'", str4, "0:00:00.079");
    }

    @Test
    public void test28382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28382");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 212, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.798S" + "'", str2, "P-1Y11M30DT23H59M59.798S");
    }

    @Test
    public void test28383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("P0Y0M0DT0H0M0.051S##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M", "   00i!i!hi!   00i!i!hi!   00i!i!hi!  AAAAAAAAAAAAAAAAAAAAA...   00i!i!hi!   00i!i!hi!   00i!i!hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.051S##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M" + "'", str2, "P0Y0M0DT0H0M0.051S##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
    }

    @Test
    public void test28384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28384");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0M0T- H  M30.9 0  0  0T- H  M30.92", "P0Y0M0DT0H0M0.098S", 23);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28385");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" DAYSM4.441SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaM4.441Saaaaaaaaaaaaa", 128, "                     0 seconds                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " DAYSM4.441SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaM4.441Saaaaaaaaaaaaa                     0 seconds                                   " + "'", str3, " DAYSM4.441SaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaM4.441Saaaaaaaaaaaaa                     0 seconds                                   ");
    }

    @Test
    public void test28386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28386");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "P0Y0M0DT0H0M0.509S", (java.lang.CharSequence) "hi!4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28387");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("p0y0m0dt0h0m0.000s");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "P0Y0M");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                              hi", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####################################################################################################################################################################################################################################################################aaP0Y000DT00000.0459", "4444444444444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444444444444", 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("aahi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M", strArray5, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 15 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test28388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28388");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Hi!Hi!H...", " I", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28389");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("P0Y0M0DT0H0M0.139S                                                                                    ", "P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S444444444444444444444444444444444444444HI!4HI!444HI!4HI!4HI!444HI!4HI!4HI!4440I!HI!4HI!444HI!4HI!4HI!444HI!4HI!4HI!444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444", "aaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0", 204);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.139S                                                                                    " + "'", str4, "P0Y0M0DT0H0M0.139S                                                                                    ");
    }

    @Test
    public void test28390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28390");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aahi!P0000Y0-10DT07430-10.99359999aahi!P0000Y0-10DT07430-10.99359999aahi!P0000Y0-10DT07430-10.99359999aahi!P0000Y0-10DT07430-10.99359999aahi!P0000                                      aahi!", "p0y0m0dt0h0m0.110s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("H         h         h         h         h         h         h         h         h         h         h AAHI!'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H         h         h         h         h         h         h         h         h         h         h AAHI!'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's" + "'", str1, "H         h         h         h         h         h         h         h         h         h         h AAHI!'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's");
    }

    @Test
    public void test28392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("H!IH!IH ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!IH " + "'", str2, "H!IH!IH ");
    }

    @Test
    public void test28393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                       p-1y11m30dt23h59m59.999s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28394");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 15, (long) 85, "P yyyy Y        T", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28395");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!P00-1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 151, "HI! HI!HI!H...HI! H                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!P00-1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!P00-1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test28396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28396");
        char[] charArray13 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.000S", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                 P0Y0M0DT0H0M0.001S                 ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test28397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28397");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##h87hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##h87hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##h87hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##h87hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##h87hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##h87hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##h87hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##h87hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##h87hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##h87hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##h87hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##hi#!##h", "Hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28398");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "000000000", (int) 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "p0y000dt00000.09910");
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("        p0Y000DT00000.0101         ", 567, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        p0Y000DT00000.0101         4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "        p0Y000DT00000.0101         4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28400");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence7 = null;
        char[] charArray18 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray18);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray18);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray18);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray18);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence7, charArray18);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ", charArray18);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray18);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                   0I!", charArray18);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "T 00", charArray18);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0:00:00.030", charArray18);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsAny("28010'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!.'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h", charArray18);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray18);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test28401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...44444444444444444444444444444444AAHI!4444444444444444444444444444444444444444444444", "S680.0M0H0TD0M0Y0P HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444444444444444444444444AAHI!4444444444444444444444444444444444444444444444" + "'", str2, "...44444444444444444444444444444444AAHI!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28402");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
    }

    @Test
    public void test28403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D" + "'", str2, "P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D");
    }

    @Test
    public void test28404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28404");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "P0Y0M0DT0H0M0.068S", "h         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA01990.00000td000y0p                                                                       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28405");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "-00P      #####################P Y M DT H M n 56S.372S", 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28406");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "p0Y000DT00000.01010                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y000DT00000.01010                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str1, "P0Y000DT00000.01010                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test28407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28407");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.000", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test28408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("I!hi!hi!hi!h!i  i!hi!hi!hi!h", " days");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!hi!hi!hi!h!i  i!hi!hi!hi!h" + "'", str2, "I!hi!hi!hi!h!i  i!hi!hi!hi!h");
    }

    @Test
    public void test28409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0:00:00.197", "P0Y0-10DT07430-10.0113599925");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28410");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                            I:II:IIII32                                            ", "P0Y0M0DT0H0M0.099S", 84, 28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                            P0Y0M0DT0H0M0.099S               " + "'", str4, "                            P0Y0M0DT0H0M0.099S               ");
    }

    @Test
    public void test28411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28411");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "hi!", (int) (byte) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444", strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(":00.032                                                                               ", strArray2, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("  I!", strArray2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":00.032                                                                               " + "'", str13, ":00.032                                                                               ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test28412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Sdnoces", "P-1Y11M30DT23H59M59.711S                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Sdnoces" + "'", str2, "Sdnoces");
    }

    @Test
    public void test28413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28413");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1###################################################################################00noce0  ##1###################################################################################00noce0  ##1#########################################00.00400001###################################################################################00noce0  ##1###################################################################################00noce0  ##1#########################################", 135);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28414");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0y0m0dt0h0m0.001sAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA           ", "P0Y0M0DT0H0M0.115S", 918);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str4, "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test28415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28415");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28416");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 227, "     ...#################################################################################...     ", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     ...#################################################################################...     " + "'", str3, "     ...#################################################################################...     ");
    }

    @Test
    public void test28417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28417");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "######P00-1", "0econ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28418");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces", "P-1Y11M30DT23H59M59.902S44444444444444444444444444444444444444444444444444444444444444444444444", 102, 277);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  P-1Y11M30DT23H59M59.902S44444444444444444444444444444444444444444444444444444444444444444444444ces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces" + "'", str4, "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  P-1Y11M30DT23H59M59.902S44444444444444444444444444444444444444444444444444444444444444444444444ces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces");
    }

    @Test
    public void test28419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28419");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("P-1Y11M30DT23H59M59.809", 288);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.809" + "'", str2, "P-1Y11M30DT23H59M59.809");
    }

    @Test
    public void test28421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P0Y0M0D...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0D..." + "'", str2, "P0Y0M0D...");
    }

    @Test
    public void test28422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28422");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   000000I!  I!  I!  I!  I!  I", "P-1Y11030DT23059059.98");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...", "                                                                       S230.0M0H0TD0M0Y0P");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi" + "'", str2, "i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi");
    }

    @Test
    public void test28424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28424");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!          Hi!                                                           hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi! hi! Hi! hi! Hi! hi! Hi! hi! Hi! hi! Hi! hi! Hi! hi! Hi! hi! Hi! hi! Hi! hi!" + "'", str1, "Hi! hi! Hi! hi! Hi! hi! Hi! hi! Hi! hi! Hi! hi! Hi! hi! Hi! hi! Hi! hi! Hi! hi!");
    }

    @Test
    public void test28425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Y000DT00000.03", 192);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28426");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "###########1-00P                       ############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 306 + "'", int2 == 306);
    }

    @Test
    public void test28427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28427");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                ", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                             p0y0m0dt0h0m0.473s", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test28428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hhh                                                                         P-1Y11M30DT23H59M59.984Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                  ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhh                                                                         P-1Y11M30DT23H59M59.984Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                  " + "'", str2, "hhh                                                                         P-1Y11M30DT23H59M59.984Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                  ");
    }

    @Test
    public void test28429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28429");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("        p0y0m0dt0...", 301, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                 p0y0m0dt0..." + "'", str3, "                                                                                                                                                                                                                                                                                                 p0y0m0dt0...");
    }

    @Test
    public void test28430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("P0Y000DT00000.004281", "00052 0052...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.004281" + "'", str2, "P0Y000DT00000.004281");
    }

    @Test
    public void test28431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28431");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("P0Y0M0DT0H0M0.271S DAYS", "0:00:00.012");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28432");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       0743i!i!...I!", "0I!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI! HI!HI!HI!", 902);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "743ii..." + "'", str4, "743ii...");
    }

    @Test
    public void test28433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0:00:00.085", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.085" + "'", str2, "0:00:00.085");
    }

    @Test
    public void test28434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28434");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!  DAYSHI!HI!HI!HI!HI!HI..H743i!i!i! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!" + "'", str1, "743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!DAYSHI!HI!HI!HI!HI!HI..H743i!i!i!");
    }

    @Test
    public void test28435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28435");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray13);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray17);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.endsWithAny("Y0M0D  hi!  hi!  hi!  hi!  hi!  hi!  hi", strArray17);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test28436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28436");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!hi!hi!hi!hi!hi!h", "                                                                                    P0000Y0M0DT0         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28437");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###################################################################################################################################################################################################################################################################################################################################################################################################0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!###################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28438");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(":00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032", "                                                                              p000000t0h000.0090");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28439");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HIHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!44HI!44HI!44HI!44HI!44HI..HI!HI!HI!HI!HI!HI!HI!HI", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("00000TD000Y0P0594.00000TD000Y0P0389.95095h32t00301101-p", "H!iH!iH!ii!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28441");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0 days", "230.00:00:0", (int) (byte) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH!IH!IH!IH!IH!IH!IH!IH!!ih!ih!ihhi!hi!hi!", strArray5, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 days" + "'", str6, "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 days");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test28442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28442");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI! HI!   HI!", "                                                                hi! hi! hi! hi!hhhhi! hi! hi! hi!   ", "P-1Y11M30DT23H59M59.950S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI! HI!   HI!" + "'", str3, "HI! HI!   HI!");
    }

    @Test
    public void test28443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                0:00:00.900", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             ..." + "'", str2, "                                             ...");
    }

    @Test
    public void test28444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28444");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       p0Y000DT00000.00228                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       P0Y000DT00000.00228                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       P0Y000DT00000.00228                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test28445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28445");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                        HI!  HI!  HI!  HI!  HI!  HI...                                      ", 122, 888);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28446");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!ih !ih !ih !ih !ih !ih !ih !ih !i", "'p'YYY43I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                      PYYYYY0MDDT00 SECONDS", 159);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih !ih !ih !ih !ih !ih !ih !ih !i" + "'", str4, "!ih !ih !ih !ih !ih !ih !ih !ih !i");
    }

    @Test
    public void test28447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28447");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0:00:00.495");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28448");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("P0Y0M0DT0H0M0.068S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.068S" + "'", str1, "P0Y0M0DT0H0M0.068S");
    }

    @Test
    public void test28449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                    aaaaaaaaaP-1Y11M30DT23H59M59.935");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                    aaaaaaaaaP-1Y11M30DT23H59M59.935" + "'", str1, "                                                                    aaaaaaaaaP-1Y11M30DT23H59M59.935");
    }

    @Test
    public void test28450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28450");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 12, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test28451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("P0Y0M0DT0H0M0.032S                                                                       ", "###############################################################0   seconds");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S                                                                       " + "'", str2, "P0Y0M0DT0H0M0.032S                                                                       ");
    }

    @Test
    public void test28452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28452");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###########################################Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28453");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0a:a00a:a00a                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.045                           ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0:00:00.226", ".s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28455");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnoces", "P-1Y11M30DT23H59M59.999Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 44);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnoces" + "'", str4, "sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnocesHI!sdnocessdnoces");
    }

    @Test
    public void test28456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28456");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 109, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28457");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("         ", 58, 246);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                           ###################################################################################00noce0  #########################################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                           ###################################################################################00noce0  #########################################################" + "'", str2, "                                                                                                                                           ###################################################################################00noce0  #########################################################");
    }

    @Test
    public void test28459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28459");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                              ", 34, "                                                                                                                                                  320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.03");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              " + "'", str3, "                                              ");
    }

    @Test
    public void test28460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28460");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000IAA!IH !IH                                                                                                !IH                                                                             HI!                                                                                                HI! HIAAAAAAAAAI!0I!0I!0I!0I!0I!0I!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0Ip0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y000DT00000.010100Y000DT00000.001110p0Y                                   ", "", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28461");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                            I:II:IIII32                                           0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!0i!", "P0Y0M0DT0H0M0.509S");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("00 T                                                                                                       ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test28462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAAAAAAAAAA...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   I!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28463");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test28464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28464");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi" + "'", str3, "Hi");
    }

    @Test
    public void test28465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28465");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "'m'm'D'dt'h'h'M'm'S.s's'hI!", (int) '4');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("          Hi!                                                           hi!", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("0S 0S 0", strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "DNOCES0");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test28466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0TD000Y0PhP0Y0M0DT0H0M0.446S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TD000Y0PhP0Y0M0DT0H0M0.446S" + "'", str1, "0TD000Y0PhP0Y0M0DT0H0M0.446S");
    }

    @Test
    public void test28467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("days", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "days" + "'", str2, "days");
    }

    @Test
    public void test28468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("pth.271 a", "aa!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pth.271 a" + "'", str2, "pth.271 a");
    }

    @Test
    public void test28469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28469");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 152, "  ############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ############" + "'", str2, "  ############");
    }

    @Test
    public void test28470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAAAAAAAA0I0AAAAAAAAAAAAAAA hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! aahi!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ", 845);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28471");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("p0Y0M0DT0H0M0.002S", "");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test28472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28472");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "P-1Y11M30DT23H59M59.601S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28473");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                            Y0M0DT0H0                                            ", 192, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               P-1Y11M30DT23H59M59.991S", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               P-1Y11M30DT23H59M59.991S" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               P-1Y11M30DT23H59M59.991S");
    }

    @Test
    public void test28475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28475");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i! hi! P0Y0M0DT0H0M0.281Si! hi!  ", "P0Y0M0DT0H0M0.003S");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28476");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "                                                                                                                                                                                                                                                                                                                                                                                   p0y000dt00000.07111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28477");
        char[] charArray8 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi!P0000Y0M0DT0H0M0.99S", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaap0y0m0dt0h0m0.045s", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                               0:00:00.032444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", " hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                               0:00:00.032444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                               0:00:00.032444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28479");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                            !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                         ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28480");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#########0M0.001S###########################...", "#################################0:00:00.289##################################", 76);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "M#1S" + "'", str5, "M#1S");
    }

    @Test
    public void test28481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28481");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 33, (long) 43, "AAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAA..." + "'", str3, "AAAAAAAAAAAA...");
    }

    @Test
    public void test28482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!ih!ih!ih!ih!ih!ih!ih!ih!ih   ", 205, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!ih!ih!ih!ih!ih!ih!ih!ih!ih   4444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!ih!ih!ih!ih!ih!ih!ih!ih!ih   4444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28483");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0:00:00.108", "D 0                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28484");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 122, "hi! hi! hi!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi! hi!0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I" + "'", str3, "hi! hi! hi!0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
    }

    @Test
    public void test28485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("p-1y11030dt23059059.872197", "000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p-1y11030dt23059059.872197" + "'", str2, "p-1y11030dt23059059.872197");
    }

    @Test
    public void test28486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test28487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!  hi!  hi!-1Y11M30DT23H59M59.964S44hi!  hi!  hi! ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          p-1y11030dt23059059.23318");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28488");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("nocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessd");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 397, 85);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test28489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28489");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 488, (long) 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.527S" + "'", str2, "P-1Y11M30DT23H59M59.527S");
    }

    @Test
    public void test28490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28490");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 139, (long) 521, "AAp000000t0h000.0450");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAp000000t0h000.0450" + "'", str3, "AAp000000t0h000.0450");
    }

    @Test
    public void test28491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28491");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HP0Y0M0DT0H0M0.019SaaaaaaaaaaaaP0Y0M0DT0H0M0.019SaaaaaaaaaaaaP0Y0M0DT0H0M0.019SaaaaaaaaaaaaP0Y0M0DT0H0M0.019Sa", 285);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28492");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0 days", "230.00:00:0", (int) (byte) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " days" + "'", str4, " days");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " days" + "'", str9, " days");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test28493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28493");
        char[] charArray17 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray17);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!Hi!H...", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("##hi!", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y000DT00000.281495", charArray17);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "              44 days              ", charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "DAYS                                                                                                DAYS                                                                                                DAYS                                                                            p0y0m0dt0h0m0.024s", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 33 + "'", int22 == 33);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 17 + "'", int25 == 17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17 + "'", int26 == 17);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test28494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28494");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "2890 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!Hi!Hi!Hi!Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", " 00 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 00 " + "'", str2, " 00 ");
    }

    @Test
    public void test28496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28496");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", "###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh", 608);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                            I:II:IIII32                                            ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str5, "i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test28497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28497");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("97P0Y0M0DT                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!Y0M0DT0H0M0.097P0Y0M0DT0", "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28498");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("DNOCES0", "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################### 0Y0M0DT0H0M0.001S           ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DNOCES0" + "'", str3, "DNOCES0");
    }

    @Test
    public void test28499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 961);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28500");
        char[] charArray8 = new char[] { '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0:00:00.001", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!P0000Y0-10DT07430-10.99359999", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }
}

