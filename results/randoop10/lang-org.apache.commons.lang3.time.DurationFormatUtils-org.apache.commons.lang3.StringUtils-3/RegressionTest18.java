import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa", "230.00:00:0                                                                               ", 96);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                              HI", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("P0Y0M0DT0H0M0.110S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.110s" + "'", str1, "p0y0m0dt0h0m0.110s");
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi" + "'", str1, "!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi");
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                             aahi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             aahi!" + "'", str2, "                                                                                             aahi!");
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!", 98, "                                                  .                                               i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  .                                      hi!hi!hi!" + "'", str3, "                                                  .                                      hi!hi!hi!");
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0:00:00.086");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097S", "", (int) '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097S" + "'", str6, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HP0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("I!I!I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!I!I!" + "'", str1, "I!I!I!");
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032", "P0Y0M0DT0H0M0.281S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0:00:00.099");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                               h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i############                                                                                                ", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i############                                                                                                " + "'", str2, "                                                                                               h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i############                                                                                                ");
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("TAHAH", "P-1Y11030DT23059059.9839");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TAHAH" + "'", str2, "TAHAH");
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S", 930, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S" + "'", str3, "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S");
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("999.95095032TD03011Y1-P", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s###########i", (int) (short) 1, "                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s###########i" + "'", str3, "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s###########i");
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P0Y0M0DT0H0M0.099S", 224, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P0Y0M0DT0H0M0.099S" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "DAYS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "P00-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0...", "hHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHH" + "'", str2, "hHH");
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 30, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0", "0DAYS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0" + "'", str2, "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0");
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("P0Y0M0DT0H0M0.930S", "P0Y0M0DT0H0M0.097S", 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "P0Y0M0DT0H0M0.015S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("44 0a00", "                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) " 0 D ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 0 D " + "'", str1, " 0 D ");
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("P0Y0M0DT0H0M0.051S##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M", 102, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("P0Y0M0DT0H0M0.395S", "P-1Y11M30DT23H59M59.935");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S" + "'", str2, "S");
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("p-1y11m30dt23h59m59.872s", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p-1y11m30dt23h59m59.872s" + "'", str2, "p-1y11m30dt23h59m59.872s");
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018", "4444444444444444444444444444444444444444444444!IHAA4444444444444444444444444444444444444444444444", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018" + "'", str3, "aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018P0Y000DT00000.031151aaaa0:00:00.018");
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(".HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:HT.HHH:HH:HH.HHH:HH:HH.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H", 63, "P-1Y11M30DT23H59M59.923S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:HT.HHH:HH:HH.HHH:HH:HH.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H" + "'", str3, ".HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:HT.HHH:HH:HH.HHH:HH:HH.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H.HHH:HH:H");
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("h         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Hhhaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099", "P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SPaahi!P0000Y0M0DT0H0M0.99SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099" + "'", str2, "i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099");
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", '4');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                              HI!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("p0y0m0dt0h0m0.024s", "Y0M0DT0H0M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", "HhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aahi!", (int) (byte) 10, 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("0i!", strArray4, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "Hhhaaaaa", 102);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                               0:00:00.032", strArray4, strArray18);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0i!" + "'", str13, "0i!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aahi!" + "'", str14, "aahi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                               0:00:00.032" + "'", str19, "                                                                               0:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "0DAY88a", "hP0Y0M0DT0H0M0.010S", 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str4, "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P00-1Y11M30DT23H59M59.964S44                                                                                                                                                                   ", 89, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P00-1Y11M30DT23H59M59.964S44                                                                                                                                                                   " + "'", str3, "P00-1Y11M30DT23H59M59.964S44                                                                                                                                                                   ");
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", 961);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" + "'", str2, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0.151S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "      0 seconds      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI", 290);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("00 D", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("p YYYY y        t");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("P0Y0M0DT0H0M0.107S", "!ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.107S" + "'", str2, "P0Y0M0DT0H0M0.107S");
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI! HI! HI! HI!HHHHI! HI! HI! HI!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "H S0H S000H SH S0H S000H SH S0H S000H S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', (int) (byte) 1, 82);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0 days", "                 S100.0M0H0TD0M0Y0P                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                i!", 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                i!" + "'", str3, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                i!");
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("I!  HI..hi!4hi!444hi", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I! " + "'", str2, "I! ");
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0:00:00.134", (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!", "0:00:00.018", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.005S", "I", 27);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!  HI!  HI!  HI!  HI!  HI..", 24, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI.." + "'", str3, "HI!  HI!  HI!  HI!  HI!  HI..");
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0:00:00.017", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.017" + "'", str2, "0:00:00.017");
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                            HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                       0i!", 189, 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  ", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  " + "'", str2, "                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  ");
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444P0Y000DT00000.099104444", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444P0Y000DT00000.099104444" + "'", str3, "4444P0Y000DT00000.099104444");
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "P-1Y11M30DT23H59M59.986S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0 DAYS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 days" + "'", str1, "0 days");
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("H   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih                                                                                                  ", 118, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih                                                                                                  " + "'", str3, "                                                                                                  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih                                                                                                  ");
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str2, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0s 0s 0", 281, 608);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0s 0s 0" + "'", str3, "0s 0s 0");
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                             0 SECOND");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("SDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCES", "      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'SocesHIsdnocessdnocesHIsdnocessdnAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0:00:00.017", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("h!ih!ih!ih!i  i!h!ih!ih!ih!i", "h        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih!ih!i  i!h!ih!ih!ih!i" + "'", str2, "h!ih!ih!ih!i  i!h!ih!ih!ih!i");
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("p0y0m0dt0h0m0.395s", "P0Y0M0DT0H0M0.107S", 134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi! hi!   hi!", "############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HP0Y000DT00000.01010", (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("p0y0m0dt0h0m0.024s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.024s" + "'", str1, "p0y0m0dt0h0m0.024s");
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!", "0:00:00.032");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hS H000S H0S HS H000S H0S HS H000S H0S Hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hS H000S H0S HS H000S H0S HS H000S H0S Hh" + "'", str1, "hS H000S H0S HS H000S H0S HS H000S H0S Hh");
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("P0Y0M0DT0H0M0.065S", ".HHH:HH:H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str2, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "00NOCE0 0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  ", 372);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!                                            " + "'", str2, "                                         hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!                                            ");
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000", 15, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H", 53, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H" + "'", str3, "...44444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H");
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "0:0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str2, "p00-1y11m30dt23h59m59.999s00000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("i!", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!" + "'", str2, "i!");
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi", "hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  ", 14, 17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaahi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi" + "'", str4, "aaaaaaaaaaaaaahi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444444a4444444444444444444444444444444444444444444444hi!4444444sdnoces  4444444444444  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi");
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                 'P'yyyy...", (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0" + "'", str3, " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0");
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.2240:00:00.224");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0" + "'", str1, "422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0422.00:00:0");
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0:00:00.139");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.139" + "'", str1, "0:00:00.139");
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("sdnoces 0", "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "H         H         H         H         H         H         H         H         H         H         H aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "SDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCES");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P-1Y11M30DT23H59M59.853S", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444", "HI!4HI!444HI!4HI!4HI!444HI!4HI!4HI!4440I!HI!4HI!444HI!4HI!4HI!444HI!4HI!4HI!444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("  HI!  HI!  HI!  HI!  HI!  HI..", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0 0econ00", "P0Y000DT00000.065100", 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0econ00" + "'", str3, "0 0econ00");
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("P0Y0M0DT0H0M0.395S", "P0Y000000000000000000-1P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD", "4444440:00:00.0434444444", 930);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.395S" + "'", str4, "P0Y0M0DT0H0M0.395S");
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa", "                P0Y0M0DT0H0M0.100S", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("SDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCES", "p-1y11m30dt23h59m59.993s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCES" + "'", str2, "SDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCEShiSDNOCESSDNOCES");
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 79, "   HI!  HI!  HI!  HI!  HI!  HI", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   000000I!  I!  I!  I!  I!  I" + "'", str3, "   000000I!  I!  I!  I!  I!  I");
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                               P00-1Y11M30DT23H59M59.964S44                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 372);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.372S" + "'", str1, "P0Y0M0DT0H0M0.372S");
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaa", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa" + "'", str2, "aaaaaaaa");
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi");
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459                                          " + "'", str2, "0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459                                          ");
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                       P-1Y11M30DT23H59M59.999S", "P-1Y11M30DT23H59M59.903S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("THH", "hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("         444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P4         ", "P-1Y11M30DT23H59M59.935S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P4         " + "'", str2, "         444S4S4M4M4H4H4TD4D4M4M4Y4YYYY4P4         ");
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32                                            0DAYS                                            I:II:IIII32", " P yyyy Y        T H H          ", 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hp0y0m0dt0h0m0.097s", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hp0y0m0dt0h0m0.097s" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hp0y0m0dt0h0m0.097s");
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0:0i!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444...", (java.lang.CharSequence) "...:00.032");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y000DT00000.01010", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "230.00:00:0", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Hi!Hi!H..", "AAAAAAAAAAAAAAA                 P0Y0M0DT0H0M0.001S                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!H.." + "'", str2, "Hi!Hi!H..");
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0 SECONDS", "P-1Y11M30DT23H59M59.999");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!a", 970);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#0 days 0 hours 0 minutes 0 seconds", "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", "H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SPaahi!P0000Y0M0DT0H0M0.99SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0", (java.lang.CharSequence) "        ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SPaahi!P0000Y0M0DT0H0M0.99SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0" + "'", charSequence2, "P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SPaahi!P0000Y0M0DT0H0M0.99SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0");
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" days", "   hI!hI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  " + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!       0I!  ");
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0i!44444I  I  I  I  I  I0i!44444", "!i0", 102);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0i!44444I  I  I  I  I  I0i!44444" + "'", str4, "0i!44444I  I  I  I  I  I0i!44444");
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', 1L, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI...AAAAAAAAAAAAAAAAAAP0Y0000DT0a00a9915", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...AAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "       ...", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999", 126, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "... HI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i############", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i############" + "'", str2, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i############");
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...AAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "AAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "SDNOCES 0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00DNOCE 0" + "'", str2, "00DNOCE 0");
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("S910.0M0H0TD0M0Y0P", 118);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S910.0M0H0TD0M0Y0P" + "'", str2, "S910.0M0H0TD0M0Y0P");
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("############i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!HP0Y000DT00000.01010", "P0Y0M0DT0H0M0.033S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aahi!", (int) (byte) 10, 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("0i!", strArray4, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("!hi!hi!h", strArray4);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray22, strArray29);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray29);
        int int32 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray29);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAny("0         ", strArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEach("      hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", strArray4, strArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0i!" + "'", str13, "0i!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aahi!" + "'", str14, "aahi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hhhhi!hi!hi!hi!", 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("         H", "P0Y0M0D...                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray12 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny(" ", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y00P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi..", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 5, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("IH                                                                                              ", 118);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH                                                                                              " + "'", str2, "IH                                                                                              ");
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("0 SECONDS", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi! hi!   hi!", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "DNOCES0", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi..", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'44", charArray16);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaa", " P 0 Y        T 0          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0SECOND", "P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D", 33, 19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0SECONDP0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D" + "'", str4, "0SECONDP0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D");
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...", 969, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0:00:00.306", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444P0Y000DT00000.099104444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 24, "###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str3, "###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  0I!00noce00  0noce0  ", "S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...", "Y0M0DT0H0M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "'M'M'd'DT'H'H'm'M's.S'S'Hi!#######################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Hi!4hi!444hi!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!4hi!444hi!" + "'", str2, "Hi!4hi!444hi!");
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("H", "4444444444444444444444444444444444444444444444AAHI!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'0 second", "0:00:00.07");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'                                       hI!hI!h...hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'P'yyyy'Y'M'M'd'DT'H'                                       hI!hI!h...hi!" + "'", str1, "'P'yyyy'Y'M'M'd'DT'H'                                       hI!hI!h...hi!");
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "HI!HI!HI!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HHHHI!HI!HI!HI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!hi!hi! ", (java.lang.CharSequence) "H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!hi!hi! " + "'", charSequence2, "hi!hi!hi! ");
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 6, "aaaa0:00:00.018");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa0:00:00.018" + "'", str2, "aaaa0:00:00.018");
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("p0Y000DT00000.010100Y0M0DT0H0M0.001S", " P yyyy Y        T H H         0I!p0y000dt00000.099-1HI!p0aaaaaaaaaaaaaaaa0I!p0y000dt00000.099-1HI!p0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("p-1y11m30dt23h59m59.993s0DAY88a", 52, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih", 30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0:00:00.033");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.033" + "'", str1, "0:00:00.033");
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444444444444444444444444444444444444444444!IHAA4444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!", "0:00:00.135");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!");
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("P0Y0M0DT0H0M0.115S", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aahi!p0000y0m0dt0h0m0.99s", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                           aahi!p0000y0m0dt0h0m0.99s" + "'", str2, "                                                                           aahi!p0000y0m0dt0h0m0.99s");
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aahi!", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!" + "'", str2, "aahi!");
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahHI hHI hHI hHIhhhhHI hHI hHI hHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! " + "'", str2, "p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("::.99", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 224, 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "P0Y0M0DT0H0M0.051S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0 SECOND");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 43, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "H S0H S000H SH S0H S000H SH##hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("P0Y0M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "P-1Y11M30DT23H59M59.999");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "P0Y0M0DT0H0M0.045S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "..", "AAP0Y000DT00000.0459");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000I" + "'", str1, "I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000I");
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "'p'YYYY'y'm'm'D'dt'h'");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'p'YYYY'y'm'm'D'dt'h'" + "'", str5, "'p'YYYY'y'm'm'D'dt'h'");
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("230.00:00:0", (int) (short) 1, 115);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "30.00:00:0" + "'", str3, "30.00:00:0");
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("01990.00000td000y0p", "0i4444444444444444444444444444444444444444444444aahi4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0", 54, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0" + "'", str3, "hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045shHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0");
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!" + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0000000000000000000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) " DAY4                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " DAY4                                                                                               " + "'", str1, " DAY4                                                                                               ");
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("SDNOCES 0", "230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SDNOCES 0" + "'", str2, "SDNOCES 0");
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("p-1y11m30dt23h59m59.983s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p-1y11m30dt23h59m59.983s" + "'", str1, "p-1y11m30dt23h59m59.983s");
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "P0Y0M0DT0H0M0.015S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("           44459711441145942344TD43041144Y400-14P4", "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P0Y0M0DT0H0M0.107S", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0:00:00.032", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!H", "p0y0m0dt0h0m0.024s");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.032" + "'", str3, "0:00:00.032");
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI...", "0:00:00.010", 18, 970);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAAAAAAAAAA0:00:00.010" + "'", str4, "AAAAAAAAAAAAAAAAAA0:00:00.010");
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("T 00", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44", "                                                                                            P0Y0M0DT0H0M0.000S                                                                                            P0Y0M0DT0H0M0.000Shi!", 41, 281);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44                                                                                            P0Y0M0DT0H0M0.000S                                                                                            P0Y0M0DT0H0M0.000Shi!" + "'", str4, "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'44                                                                                            P0Y0M0DT0H0M0.000S                                                                                            P0Y0M0DT0H0M0.000Shi!");
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaP0Y000DT00000.0459", 281, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################################################################################################################################################################################################################aaP0Y000DT00000.0459" + "'", str3, "#####################################################################################################################################################################################################################################################################aaP0Y000DT00000.0459");
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("P0Y000DT00000", 0, 82);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000" + "'", str3, "P0Y000DT00000");
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", "                P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" + "'", str2, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 930, "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!h...P0Y000DT00000.0991", "p0y000dt00000.0991", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                       " + "'", str2, "                                                       ");
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        char[] charArray12 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!Hi!hi!", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'H'0 seconds", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "H         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0-10DT07430-10.1913599982", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI" + "'", str1, "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI");
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!4hi!444hi!4", "                                                                                                      aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4hi!444hi!4" + "'", str2, "4hi!444hi!4");
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 50, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 495, true, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 101, (long) 77, "     743i!i!i! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     743i!i!i! " + "'", str3, "     743i!i!i! ");
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!hi!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!", "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!" + "'", str2, "hi!hi!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!");
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh###########iHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHhiHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                              aahi!  ", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi!" + "'", str3, "aahi!");
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     " + "'", str3, "                    i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     ");
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0haaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11024");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0haaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11024" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0haaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11024");
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "sdnoces");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str1, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAA###############################################################################################################################################", " P yyyy Y        T H H         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaHi!Hi!H...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0:00:00.00", "hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "P-1Y11M30DT23H59M59.923S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.923S" + "'", str1, "P-1Y11M30DT23H59M59.923S");
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      ", 96, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      " + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      ");
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("i!Hi!Hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...", "0 DAYS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  I!", "hi!", 18);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("D 0", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                       p-1y11m30dt23h59m59.999s", 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0:00:00.032", '4');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("P0Y0M0DT0H0M0.002S", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.032" + "'", str8, "0:00:00.032");
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("T H HI", 143, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AAAAAAAAAAAAAAA...", "hS H000S H0S HS H000S H0S HS H000S H0S Hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAA..." + "'", str2, "AAAAAAAAAAAAAAA...");
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("0         ", strArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, 'a');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!ahi!aaahi!a" + "'", str21, "hi!ahi!aaahi!a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!ahi!aaahi!a" + "'", str23, "hi!ahi!aaahi!a");
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", "'m'm'D'dt'h'h'M'm'S.s's'hI!", (int) (short) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4!ih444!ih4!ih", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                            I:II:IIII32                                            ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "001560.00000TD000Y0p", "0 D", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                            I:II:IIII32                                            ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str4, "                                            I:II:IIII32                                            ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!" + "'", str1, "!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!ihaa                                                                                             !i0!i0!i0!i0!i0!i0!i0!i0!i0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihaa!i0!i0!i0!i0!i0!i0!i0!i0!i0" + "'", str1, "!ihaa!i0!i0!i0!i0!i0!i0!i0!i0!i0");
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h", 143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P0Y0M0DT0H0M0.970S", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.970S" + "'", str2, "P0Y0M0DT0H0M0.970S");
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0s 0s 0", "aahi!p0000y0m0dt0h0m0.99s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("  HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!HI!" + "'", str1, "HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!HI!");
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "P0Y000DT00000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("5940hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0", "P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SPaahi!P0000Y0M0DT0H0M0.99SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5940hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0" + "'", str2, "5940hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0");
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                            P0Y0M0DT0H0M0.000S", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            P0Y0M0DT0H0M0.000S" + "'", str2, "                                                                                            P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099");
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 2, (long) (byte) 0, "aahi!P0000Y0-10DT07430-10.99359999144444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi!P0000Y0-10DT07430-10.99359999144444444" + "'", str3, "aahi!P0000Y0-10DT07430-10.99359999144444444");
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0", "!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0" + "'", str2, "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0");
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!", "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hhhaaaa", "S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032", 110, "I! HI! HI! HI! HI! HI! HI! HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032" + "'", str3, "0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032");
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", 8, 79);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444...", "S010.0M0H0TD0M0Y0Ph");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI" + "'", str1, "HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI");
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                               hi! ", "  HI!  HI!  HI!  HI!  HI!  HI..", "   AAHI!P0000Y0M0DT0H0M0.99S   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               hi! " + "'", str3, "                                                                                               hi! ");
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h###########i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "####################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1", "i0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1" + "'", str2, "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1");
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "00Y0M0DT0H0M0.001S0Y0M0DT0H0M0.001Sseconds");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("S ", "M59.872S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", 118, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("P0Y0M0DT0H0M0.191S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.191S" + "'", str1, "P0Y0M0DT0H0M0.191S");
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("S ", (int) (byte) -1, "P-1Y11M30DT23H59M59.780S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "S " + "'", str3, "S ");
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi! hi!   hi! ", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi!   hi! " + "'", str2, "hi! hi!   hi! ");
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                    S                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 135, "0:00:00.001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.001" + "'", str2, "0:00:00.001");
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray17 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray17);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence6, charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0:00:00.043", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                              ", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi!4hi!444hi!4", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!HI!HI!HI!HI..P0Y0M0DT0H0M0.446S", charArray17);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 77 + "'", int25 == 77);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "  hi!  hi!  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 8, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0DT0H0M0.002S", "P0Y0M0DT0H0M0.289S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("T H H", "hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099", (int) (byte) 1);
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa", strArray4, strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ', 101, 372);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa" + "'", str6, "aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                   0I!", "0:00:00.087");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0I!p0y000dt00000.099-1HI!p0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                             0 SECOND");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                             0 SECOND" + "'", str1, "                                                                                             0 SECOND");
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P-1Y11M30DT23H59M59.983S", "HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.099S", ' ');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "hhh", 8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a', 33, 8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", strArray5, strArray9);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray9);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split(".099-1hi!P0Y000DT00000.099-1");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", strArray9, strArray17);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, ' ', 280, 18);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  " + "'", str14, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!" + "'", str18, "   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                       000i!i!...", "aaP0Y000DT00000.0459");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                        hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!" + "'", str1, "hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!");
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("P0Y0M0DT0H0M0.015S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.015S" + "'", str1, "P0Y0M0DT0H0M0.015S");
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 54, (long) 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.987S" + "'", str2, "P-1Y11M30DT23H59M59.987S");
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("I!Hi!Hi", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "'M'M'd'DT'H'H'm'M's.S'S'Hi!#######################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!Hi!Hi" + "'", str3, "I!Hi!Hi");
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("t h h", "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t h h" + "'", str2, "t h h");
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("AAAAAAAA###############################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAA###############################################################################################################################################" + "'", str1, "AAAAAAAA###############################################################################################################################################");
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!", 78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("999.95095032TD03011Y1-P", "HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("0 SECONDS", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "              44 0a00              ", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("           44459711441145942344TD43041144Y400-14P4", charArray16);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!", 476);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi! hi!   hi HI!  HI..hi! hi!   hi", "hi!  hi!  hi!  hi!  hi!  hi..", 227);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!   hi HI!  HI..hi! hi!   hi" + "'", str3, "hi! hi!   hi HI!  HI..hi! hi!   hi");
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("0", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("230.00:00:0hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M0.010ShP0Y0M0D", "S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0" + "'", str3, "0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0I!0");
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", "'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("P0Y0M0DT0H0M0.086S", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        char[] charArray15 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0 DAYS", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "P-1Y11030DT23059059.9839", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("DAYS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DAYS" + "'", str1, "DAYS");
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0" + "'", str1, "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0");
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("8010.00000TD000Y0Ph", "44459711441145942344TD43041144Y400-14P4", 32);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi");
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.000S                ", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S                " + "'", str2, "P0Y0M0DT0H0M0.000S                ");
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI" + "'", str1, "HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI!                                                                                       HI!HI!H...HI");
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0 days", "0i0", 33);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("HHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.045s", strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("230.00:00:0                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "230.00:00:0                                                                               " + "'", str1, "230.00:00:0                                                                               ");
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P-1Y11M30DT23H59M59.123S", 90, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.123S'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S''P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'" + "'", str3, "P-1Y11M30DT23H59M59.123S'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S''P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                  .                                               i!", 372);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...3H59M59.872S", 191);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        ...3H59M59.872S                                                                                        " + "'", str2, "                                                                                        ...3H59M59.872S                                                                                        ");
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "P0Y0M0DT0H0M0.096S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099S");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "S0 S0 S0", "AAAAAAAAAAAAAAAAAA0:00:00.010", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0i!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "0i!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                      'p'yyyy'y'm'm'd'dt'h'", "hi!444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444", "0 SECONDS");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                      'p'yyyy'y'm'm'd'dt'h'" + "'", str3, "                                                                                                                      'p'yyyy'y'm'm'd'dt'h'");
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P-1Y11M30DT23H59M59.993S", "Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!        hi!                        hi!        ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44 days");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "PpYpMpDTpHpMpTp96S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ppYpMpDTpHpMpTp96S" + "'", str1, "ppYpMpDTpHpMpTp96S");
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                            0:00:00.032                                            ", "M30DT23H59M59.872S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H     ", 608, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("P0Y000DT00000.01010", "                     sdnoces 0                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.01010" + "'", str2, "P0Y000DT00000.01010");
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            00noce0 0                                           " + "'", str3, "                                            00noce0 0                                           ");
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "... HI...", "                                                                                                                         P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "P-1Y11M30DT23H59M59.853S", "444444444444444I4444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", 8);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hi!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!", "", 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!" + "'", str3, "hi!hi!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!i!I!I!");
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("'p'YYYY'y'm'm'D'dt'h'", 961, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("8639930noce86399 0", "P0Y0M0DT0H0M0.009S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 281);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.0450", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAp000000t0h000.0450" + "'", str2, "AAp000000t0h000.0450");
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("p0Y000DT00000.01010", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0Y000DT00000.01010" + "'", str3, "p0Y000DT00000.01010");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...######################################################################################################################################################################################", "hi!  hi!  hi!  hi!  hi!  hi..hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...######################################################################################################################################################################################" + "'", str2, "...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...######################################################################################################################################################################################");
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "secondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecondssecondsIHsecoS'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'!ihaa", (java.lang.CharSequence) "                                                                                                                                                                                                        P0Y0M0DT0H0M0.100S         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                     sdnoces 0                     ", (java.lang.CharSequence) "P0Y0-10DT07430-10.0013599969");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi" + "'", str1, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi");
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", " S0 S0 S0 ", 372, 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " S0 S0 S0 " + "'", str4, " S0 S0 S0 ");
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0" + "'", charSequence2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0");
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0SECOND", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0SECOND" + "'", str2, "0SECOND");
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                       Hi!Hi!H...HI!", "44 days");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAAAAAAAAAA0:00:00.010", "p0y000dt00000.09910");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", "!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi", 4, 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aa!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S" + "'", str4, "aa!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " DAYS                                                                                                DAYS                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        char[] charArray5 = new char[] { ' ', ' ' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI! ", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "00 D", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(" DAYS                                                                                                DAYS                                                                                               ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!hi!h...P0Y000DT00000.0991", "hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11024");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0" + "'", charSequence2, " !I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0");
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                               h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i############                                                                                                ", "p-1y11m30dt23h59m59.993s");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'SocesHIsdnocessdnocesHIsdnocessdnAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("P0Y000DT00000.01010", "                                                Hi!                                                 ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hi!hi!#######################", strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!4hi!444hi!", 9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y000DT00000.01010" + "'", str4, "P0Y000DT00000.01010");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                    S                                                                                                                                          S                                                                      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S S hi!" + "'", str1, "S S hi!");
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                'P'yyyy...", "P0Y000DT00000.065100", "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("           44459711441145942344TD43041144Y400-14P4", "P0Y0M0DT0H0M0.063S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("       ...hi!4444444444444444444444444444444444444444444444a44444444444444444444444444444444444444", 3, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ...hi!4444444444444444444444444444444444444444444444a44444444444444444444444444444444444444" + "'", str3, "       ...hi!4444444444444444444444444444444444444444444444a44444444444444444444444444444444444444");
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00noce0 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces", 118, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces" + "'", str3, "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces");
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0:00:00.017", "0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0 ", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaa" + "'", str1, "0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa0 daysaaaaaaaaaa");
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                       hi!hi!hi!                                                                       ", "                                                                                             aahi!", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("i!", 970);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P", "H        ", 191);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0:00:00.02", 97, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444440:00:00.02" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444440:00:00.02");
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("      0 seconds      ", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     0 seconds                      " + "'", str2, "                     0 seconds                      ");
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 93, 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("######################################HP0Y000DT00000.01010#######################################", "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  -10 0 0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! 4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("sdnoces 0", "                                            I:II:IIII32                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sdnoces 0" + "'", str2, "sdnoces 0");
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!", "I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                    'p'yyyy'y'm'm'd'dt'h'0 seconds", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                    'p'yyyy'y'm'm'd'dt'h'0 seconds" + "'", str3, "                                                                                                                                                                                                                                                                    'p'yyyy'y'm'm'd'dt'h'0 seconds");
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!ahi!hi!hi!a", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "P0Y0M0DT0H0M0.035S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("P0Y0M0DT0H0M0.045S", "hi! hi!   hi!hi! hi!   hi!hi! hi!   hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.045S" + "'", str2, "P0Y0M0DT0H0M0.045S");
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("P0Y0M0DT0H0M0.930S4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0y0m0dt0h0m0.930s4444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "p0y0m0dt0h0m0.930s4444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S540.0M0H0TD0M0Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "S540.0M0H0TD0M0Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("..", "!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".." + "'", str2, "..");
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H");
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "SDNOCES 0", "syad 44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "p-1y11m30dt23h59m59.808s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p-1y11m30dt23h59m59.808s" + "'", str1, "p-1y11m30dt23h59m59.808s");
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi...", "P-1Y11M30DT23H59M59.780S");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hhh", (java.lang.CharSequence) "999.95095032TD03011Y1-P");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P0Y0M0DT0H0M0.053S", "aahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                Hi!                                                 ", (java.lang.CharSequence) "                                                                           aahi!p0000y0m0dt0h0m0.99s");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("P0Y000DT00000.065100", "P0Y0M0DT0H0M0.041S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("I!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.09");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "  hi!  hi!  !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("######p00-1", "H         H         H         H         H         H         H         H         H         H         H aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444      ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " I0i!44444", "                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", "!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444" + "'", str2, "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032" + "'", str3, "0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032");
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 D0 D0 D0 hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SM'M'd'DT'H'H'm'M's.S'S'44", "                                                                                                                                44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "0:00:00.039");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "hHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAA0I0AAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAA0I0AAAAAAAAAAAAAAA");
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("T H H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "THH" + "'", str1, "THH");
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("743i!i!i! ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 53, "P0Y0M0DT0H0M0.031S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03153" + "'", str2, "P0Y000DT00000.03153");
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("S130.0M0H0TD0M0Y0P", "H   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "S130.0M0H0TD0M0Y0P" + "'", str3, "S130.0M0H0TD0M0Y0P");
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0Y0M0DT0H0M0.100S", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0Y0M0DT0H0M0.100S" + "'", str2, "0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'd", 108, "HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'dHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'dHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                               P00-1Y11M30DT23H59M59.964S44                                                                                                                                ", (java.lang.CharSequence) "#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P", "H        ", 191);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0 ", 227, (int) (short) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P" + "'", str9, "P");
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495", "0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.032", "P0Y0M0DT0H0M0.051S##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M", 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495" + "'", str4, "Hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495");
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "aaaaaaaaaaHi!Hi!H...", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("-1Y11-130DT2374359-159.999359998900000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1Y11-130D" + "'", str2, "-1Y11-130D");
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0i!0i!0i!0i!0i!0i!0i!0i!0i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i!0i!0i!0i!0i!0i!0i!0i!0i!" + "'", str1, "0i!0i!0i!0i!0i!0i!0i!0i!0i!");
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0:00:00.051", 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str1, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444440:00:00.0434444444", "0:00:00.047");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444440:00:00.0434444444" + "'", str2, "4444440:00:00.0434444444");
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444444444...", "P00-1Y11M30DT23H59M59.964S44                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", "HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 ", "hi! hi!   hi! ");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi", "P0Y0M0DT0H0M0.003SP0Y0M0DT0H0M0.003SP0Y0M00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH" + "'", str1, "!iH");
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...", " days");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                       Hi!", "                                                                                                                                44459711441145942344TD43041144Y400-14P4                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(" #0 days 0 hours 0 minutes 0 seconds !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444", "hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "         H", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i..." + "'", str2, "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i...");
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444444444444444                    444444444444444444                    444444                                                                                                                                                                                                                                                                    'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", 102, 289);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444                    444444444444444444                    444444                    Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H                                                     'P'YYYY'Y'M'M'D'DT'H'0 SECONDS" + "'", str4, "444444444444444444                    444444444444444444                    444444                    Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H                                                     'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "'m'm'D'dt'h'h'M'm'S.s's'hI!", (int) '4');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("          Hi!                                                           hi!", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("0S 0S 0", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'SocesHIsdnocessdnocesHIsdnocessdnAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnocesHIsdnocessdnoces", 31, 495);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1", 7, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1" + "'", str3, "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99p00-1");
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("P0Y0M0DT0H0M0.097S", "HI!HI!HI! ", "P0Y0M0DT0H0M0.271S");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hI!hI!h..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...", "AAHI!p0000y0-10dt07430-10.99359999");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ..." + "'", str2, "...hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI! ...");
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0SECONDP0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0SECONDP0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D" + "'", str1, "0SECONDP0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D");
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!4hi!444hi HI!  HI..hi!4hi!444hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp000000t0h000.0450", "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000H S0H S000H SH S0H S000H SH S0H S000H S00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 189);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!4hi!444hi!4", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("hi!        hi!                        hi!", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!4hi!444hi!4" + "'", str4, "hi!4hi!444hi!4");
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "", 143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("p0Y0M0DT0H0M0.002S", 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("##########################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H###########################", 0, " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0Y0M0DT0H0M0.001Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H###########################" + "'", str3, "##########################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H###########################");
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 13, (long) 27, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099", "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.99" + "'", str2, "0:00:00.99");
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "P0Y000DT00000.151372");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aahi!P0000Y0-10DT07430-10.99359999144444444");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0 D0 D0 D0 D0 D0 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 D0 D0 D0 D0 D0 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44" + "'", str1, "0 D0 D0 D0 D0 D0 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44");
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" P yyyy Y        T H H         ", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " P yyyy Y        T H H         " + "'", str2, " P yyyy Y        T H H         ");
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI! Hi!Hi!H...HI!", "                                                       ", 134, 19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI! Hi!Hi!H...HI! H                                                       " + "'", str4, "HI! Hi!Hi!H...HI! H                                                       ");
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!", "0 D");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 280);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.280S" + "'", str1, "P0Y0M0DT0H0M0.280S");
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!", "010.00:00:0", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("P-1Y11M30DT23H59M59.808S", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11" + "'", str2, "P-1Y11");
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                44459711441145942344TD43041144Y400-14P4                                                                                                                               ", "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                44459711441145942344TD43041144Y400-14P4                                                                                                                               " + "'", str2, "                                                                                                                                44459711441145942344TD43041144Y400-14P4                                                                                                                               ");
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!..." + "'", str1, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...");
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaa0i0aaaaaaaaaaaaaaa", "i0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaa");
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                         P0Y0M0DT0H0M0.099S", "                                                                                                                      'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 101, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("I", "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0S 0S 0S  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.093S", "440a00");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 372, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032", 54, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032" + "'", str3, "0:00:00.032                                                                                              HI!0:00:00.032                                                                                              HI!0:00:00.032");
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("P0Y0M0DT0H0M0.930S", "P00-1Y11M30DT23H59M59.999S00000000000000000000000000000023i!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) " AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAS H000S H0S HS H000S H0S HS H000S H0S H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.099S                                            I:II:IIII32                                            P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099S                                            I:II:IIII32                                            P0Y0M0DT0H0M0.099S", "HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI!", 495);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        char[] charArray9 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 D", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P-1Y11M30DT23H59M59.872S", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih", "Hi!Hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("IH                            4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444!ih", 115, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...                                                       hI!hI!h...hi!                          ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... hI!hI!h...hi! ..." + "'", str1, "... hI!hI!h...hi! ...");
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                    ", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih !ih                                                                                                !ih                                                                                               ", charArray16);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("P0Y000DT00000.03153", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03153" + "'", str3, "P0Y000DT00000.03153");
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("Aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M" + "'", str1, "##hi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M");
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("P0Y000DT00000", "       ...hi!4444444444444444444444444444444444444444444444a44444444444444444444444444444444444444", "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000" + "'", str3, "P0Y000DT00000");
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                              ", "##'P'yyyy'");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!HI!HI!H                                           ", 126);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!H                                           " + "'", str2, "!HI!HI!H                                           ");
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 78, (long) 81, "00 D", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 115, (long) (short) 100, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str3, "i!0000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("P0Y0M0DT0H0M0.099S", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2, "P0Y0M0DT0H0M0.099S");
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0:00:00.003", "i!00000000000000000000000000743i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "01990.00000td000y0p");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}

