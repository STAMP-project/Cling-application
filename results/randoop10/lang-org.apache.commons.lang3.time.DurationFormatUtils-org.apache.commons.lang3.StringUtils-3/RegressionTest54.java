import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest54 {

    public static boolean debug = false;

    @Test
    public void test27001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27001");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 906, (long) 201);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.295S" + "'", str2, "P-1Y11M30DT23H59M59.295S");
    }

    @Test
    public void test27002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27002");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "Hhhaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test27003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27003");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Y0M0D  hi!  hi!  hi!  hi!  hi!  hi!  hi", "aaaaaaaaaaHi!Hi!H...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "444444444444444  HI!444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444  HI!444444444444444" + "'", str1, "444444444444444  HI!444444444444444");
    }

    @Test
    public void test27005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27005");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "p-1Y11-130DT2374359-159.9243599968");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p-1Y11-130DT2374359-159.9243599968" + "'", str2, "p-1Y11-130DT2374359-159.9243599968");
    }

    @Test
    public void test27006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27006");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!i!i!", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27007");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  hi", " !Ip YYYY y        t      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!'y'm'm' 'dt'h'h'M'      0 seconds      'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!'p'!!!!                                           !i0!i0!i0!i0!i0!i0!i0!i0!i0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI", "P0Y0M0DT0H0M0.775S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27009");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "'P'yyyy'Y'M'M'd'DT'i!Hi!H..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test27010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27010");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("#############################################################################p0y0m0dt0h0m0.100s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################p0y0m0dt0h0m0.100s" + "'", str1, "#############################################################################p0y0m0dt0h0m0.100s");
    }

    @Test
    public void test27011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27011");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("sdnoces  ", "", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test27012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("P0Y0M0DT0H0M0.080S", "P0Y0M0DT0H0M0.024");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.080S" + "'", str2, "P0Y0M0DT0H0M0.080S");
    }

    @Test
    public void test27013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("S100.0MI I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "000000000000000000I!I!I!I!I!I!I!I!I!I!I!I!44I!44I!44I!44I!44I..y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y0m0dt0h0y");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S100.0MI I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "S100.0MI I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test27014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27014");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hHHHHHH####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aahi!D", "4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!4yyyy4P4 HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!D" + "'", str2, "aahi!D");
    }

    @Test
    public void test27016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27016");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("S540.0M0H0TD0M0Y0PAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###############################################################################################  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27017");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444P-1Y11030444444444000I!I!I!4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444", 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27018");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0s 0s 0s  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0s 0s 0s  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih" + "'", str3, " !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0s 0s 0s  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih");
    }

    @Test
    public void test27019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" hi!  hi!  h", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27020");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("28010.00000td000y0ph");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27021");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!Hi!hi!", "!hi!hi!hi!hi!hi!h", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("p0Y000DT00000.01010hi!444444400noce0  4444444444444444a4444444444444444444444444444444444444444444444", "P-1Y11M30DT23H59M59.872S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0Y000DT00000.01010hi!444444400noce0  4444444444444444a4444444444444444444444444444444444444444444444" + "'", str2, "p0Y000DT00000.01010hi!444444400noce0  4444444444444444a4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27023");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "p0y0m0dt0h0m0.151s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27024");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("p000000t0h000.2710 0a00                                        ", 0, 930);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p000000t0h000.2710 0a00                                        " + "'", str3, "p000000t0h000.2710 0a00                                        ");
    }

    @Test
    public void test27025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27025");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27026");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         P-1Y11M30DT23H59M59.930                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "AAHI!P0000Y0M0DT0H0M0.99S", 259);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27027");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000H S0H S000H SH S0H S000H SH S0H S000H S00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 282);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27028");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                              HI", "!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(" SAAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M", "PYYYYY0MDDT00 SECONDS", "P-1Y11M30DT23H59M59.965S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " SAAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M" + "'", str3, " SAAHI!HP0Y0M0DT0H0M0.010SHP0Y0M0DT0H0M");
    }

    @Test
    public void test27030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27030");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 161);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.161S" + "'", str1, "P0Y0M0DT0H0M0.161S");
    }

    @Test
    public void test27031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27031");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("P00-1Y11030DT23059059.964144");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P00-1Y11030DT23059059.964144" + "'", str1, "P00-1Y11030DT23059059.964144");
    }

    @Test
    public void test27033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27033");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("         s870.0m0h0td0m0y0p          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27034");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("h23AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp00059030t0h0590.04559", 3, "P0Y000DT00000.139900");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h23AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp00059030t0h0590.04559" + "'", str3, "h23AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp00059030t0h0590.04559");
    }

    @Test
    public void test27035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                  #############################################################################p0y0m0dt0h0m0.100s                                                                  " + "'", str1, "                                                                  #############################################################################p0y0m0dt0h0m0.100s                                                                  ");
    }

    @Test
    public void test27036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...                  8010.00000TD000Y0P...                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                  8010.00000td000y0p...                   " + "'", str1, "...                  8010.00000td000y0p...                   ");
    }

    @Test
    public void test27037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!", "P0Y0M0D...                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!" + "'", str2, "0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!   000000I!  I!  I!  I!  I!  I0i!0i!0i!0i!0i!0i!0i!0i!0i!");
    }

    @Test
    public void test27038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Hi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aaS0aS0aS0ahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!", "230.00:00:0                                                                               hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "230.00:00:0                                                                               hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    " + "'", str2, "230.00:00:0                                                                               hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ");
    }

    @Test
    public void test27039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27039");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 19);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.019" + "'", str1, "0:00:00.019");
    }

    @Test
    public void test27040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P0Y000DT00000.034903", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03903" + "'", str2, "P0Y000DT00000.03903");
    }

    @Test
    public void test27041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                           p0000y0m0dth0 seconds                      ", "444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44HI!44HI!44!HI!44HI!44HI!44H:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495:00:00.495");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                           p0000y0m0dth0 seconds                      " + "'", str2, "                                                                                                                                           p0000y0m0dth0 seconds                      ");
    }

    @Test
    public void test27042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "I!                                                                                                  P                                                                                                  I..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!                                                                                                  P                                                                                                  I.." + "'", str1, "I!                                                                                                  P                                                                                                  I..");
    }

    @Test
    public void test27043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-'P'yyyy'Y'M'M'd'DT'H'H'm'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27044");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", "!ih !ih                                                                                                !ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27045");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "P0Y0M0DT0H0M0.032S                                                                       ", (java.lang.CharSequence) "AAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "P0Y0M0DT0H0M0.032S                                                                       " + "'", charSequence2, "P0Y0M0DT0H0M0.032S                                                                       ");
    }

    @Test
    public void test27046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27046");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hi      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                      'P'YYYY'Y'M'M'D'DT'H'0 SECONDS                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "28010'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!.'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi222222aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hi!hi!hi222222aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27047");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P-1Y11M30DTS0 S0 S0P-1Y11M30DT2", "AAAAAAAA###############################################################################################################################################", "000000000");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test27048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27048");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "P-1Y11M30DT23H59M59.923S");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27049");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("p-1y11m30dt23h59m59.983s", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "P-1Y11M30DT23H59M59.952S");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test27050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27050");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) ".s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's.s's");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27051");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("########################################################################444444444444444444", "         s s hi!", 204);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27052");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27053");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 62, (long) 2, "   Hi!Hi!hi!aaaaaaaaaaaaaaaaap0y0m0dt0h0m0.100saaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   23i!i!hi!aaaaaaaaaaaaaaaaap00059030t0h0590.10059aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "   23i!i!hi!aaaaaaaaaaaaaaaaap00059030t0h0590.10059aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 521);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27055");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "pi!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086000000i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086ti!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.0860i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086hi!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086000i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.086.i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                   743I!I!I!0:00:00.0860000", "AAAAAAAAAASYAD 0AAAAHHHAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD 0AAAAHHHAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test27056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27056");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                ", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27057");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ys  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  daysaa  daysi!  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days  days");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "YS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYSAA  DAYSI!  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS" + "'", str1, "YS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYSAA  DAYSI!  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS  DAYS");
    }

    @Test
    public void test27058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27058");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444P0Y000DT00000.0682254444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27059");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444aa.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-1.099-1hi!P0Y000DT00000.099-14444444444444444444444444444444444444444444444", "##");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...I!  HI!  HI!  HI!  HI..", "01990.00000td000y0p", 0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!HI!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("44days", strArray8, strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!59M59.999");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("43i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44days" + "'", str11, "44days");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test27060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27060");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("P0Y0M0DT0H0M0.003S", 151, 274);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!                                                                                                hi! hi!", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                                                                                hi! hi!" + "'", str3, "hi!                                                                                                hi! hi!");
    }

    @Test
    public void test27062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! s0 s0 s0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!Ih !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH 0s 0s 0s !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH" + "'", str1, "!Ih !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH 0s 0s 0s !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH !IH");
    }

    @Test
    public void test27063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27063");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27064");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444" + "'", str1, "444!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi!4hi!444hi hi!  hi..hi!4hi!444hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             HI!4HI!444HI HI!  HI..HI!4HI!444HI" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             HI!4HI!444HI HI!  HI..HI!4HI!444HI");
    }

    @Test
    public void test27066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("p0y0m0dt0h0m0.062s", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!i!i!                                                                                                                                                           ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!i!i!                                                                                                                                                           " + "'", str3, "I!i!i!                                                                                                                                                           ");
    }

    @Test
    public void test27068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!" + "'", str1, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!");
    }

    @Test
    public void test27069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("P-1Y11M30DT23H59M59.894S", 135, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "P0Y0M0DT0H0M0.476S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27071");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi! hi! hi!", 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27072");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("P0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD", "P0Y0M0DT0H0M0.397S", "0:00:00.013");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD" + "'", str3, "P0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD");
    }

    @Test
    public void test27073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27073");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 82, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test27074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27074");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 572, (long) 102, "         4444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         4444444444444444444444444444" + "'", str3, "         4444444444444444444444444444");
    }

    @Test
    public void test27075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27075");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("###############", "                                       Hi!Hi!H...HIPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "00Y0M0DT0H0M0.001S 0YDNOCES000Y0M0DT0H0M0.001S 0Y", "                                                                                       Hi!               P0Y000DT00000.065100");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test27077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27077");
        char[] charArray5 = new char[] { '4' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi! hI!hI!h...hi!", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".s's.s's.s's.s's.s's.s's.s's.s's", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test27078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                       HI!HI!HI!HI!HI!HI...                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                       HI!HI!HI!HI!HI!HI...                                                                                                        " + "'", str1, "                                                                                                       HI!HI!HI!HI!HI!HI...                                                                                                        ");
    }

    @Test
    public void test27079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!", " 0 0.0 040  0 0 0  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!" + "'", str2, "i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!HI!  i!  i!");
    }

    @Test
    public void test27080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27080");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                            p0y0m0dt0h0m0.395s", "                                                                                                                                                 440a00", "P0Y0M0DT0H0M0                                                                                                                                                                                                                                                                  P-1Y11M30DT23H59M59.930S", 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                            p0y0m0dt0h0m0.395s" + "'", str4, "                                                            p0y0m0dt0h0m0.395s");
    }

    @Test
    public void test27081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27081");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  HI!  HI!  HI!  HI!  HI!  HI..", "0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444", 10);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("p0Y000DT00000.01010", "P0Y0M0DT0H0M0.031S", 79);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("0:00:00.090", strArray4, strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.090" + "'", str9, "0:00:00.090");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test27082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27082");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 845, "Aaaaaaaaaaaaaaaaaaaaa", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27083");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("######P00-1                        ", "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", "hi!4hi!444hi HI!  HI..hi!4hi!444hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######P00-1                        " + "'", str3, "######P00-1                        ");
    }

    @Test
    public void test27084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27084");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               p0Y000DT00000.0101");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("   00i!i!hi!   00i!i!hi!   00i!i!hi!  AAAAAAAAAAAAAAAAAAAAA...   00i!i!hi!   00i!i!hi!   00 00I!  I.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   00I!I!HI!   00I!I!HI!   00I!I!HI!  aaaaaaaaaaaaaaaaaaaaa...   00I!I!HI!   00I!I!HI!   00 00i!  i." + "'", str1, "   00I!I!HI!   00I!I!HI!   00I!I!HI!  aaaaaaaaaaaaaaaaaaaaa...   00I!I!HI!   00I!I!HI!   00 00i!  i.");
    }

    @Test
    public void test27086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("P0Y0M0DT0H0M0.011S", "                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test27087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27087");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.080Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "-00P                                                                                              ", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27090");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                 P0Y0M0DT0H0M0.037S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27091");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P-1Y11M30DT23H59M59.233S", (int) (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.233S" + "'", str3, "P-1Y11M30DT23H59M59.233S");
    }

    @Test
    public void test27092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.013aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                               44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'" + "'", str1, "44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'");
    }

    @Test
    public void test27094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                           aahi!p    y m dt h m    s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27095");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0.001S", '4');
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444444444444444444444444444444444444444444  hi!4444444444444444444444444444444444444444444444", strArray3, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444444444444444444444444444444444444444  hi!4444444444444444444444444444444444444444444444" + "'", str5, "4444444444444444444444444444444444444444444444  hi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27096");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAA...", 55, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ... hI!hI!h...hi! ...", "0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320 00000000000aahi!P0000Y0M0DT0H0M0.645S0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27098");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("        P0Y000DT000000.0:00:00.038        P0Y00DT00000.", "Y0M0D  hi!  hi!  hi!  hi!  hi!  hi!  hi", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT.::.38PT." + "'", str3, "PT.::.38PT.");
    }

    @Test
    public void test27099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27099");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih", "Hi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aaS0aS0aS0ahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!aahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                        ", "                                                                                                                                44955970.00000TD000Y0P                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                        " + "'", str2, "                                                        ");
    }

    @Test
    public void test27101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27101");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444hi! hi! hi! hi!hhhhi! hi! hi! hi!444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27102");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0.104S", 'a');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!P0Y0M0DT0H0M", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!P0Y0M0DT0H0M" + "'", str6, "Hi!P0Y0M0DT0H0M");
    }

    @Test
    public void test27103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27103");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                         P-1Y11M30DT23H59M59.424S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27104");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("PP0Y0M0DT0H0M0.191S0P0Y0M0DT0H0M0.191SYP0Y0M0DT0H0M0.191S0P0Y0M0DT0H0M0.191SM");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PP0Y0M0DT0H0M0.191S0P0Y0M0DT0H0M0.191SYP0Y0M0DT0H0M0.191S0P0Y0M0DT0H0M0.191SM" + "'", str1, "PP0Y0M0DT0H0M0.191S0P0Y0M0DT0H0M0.191SYP0Y0M0DT0H0M0.191S0P0Y0M0DT0H0M0.191SM");
    }

    @Test
    public void test27106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27106");
        char[] charArray10 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT00000.001-1P0Y000DT000P-1Y11M30DT23H59M59.894S", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test27107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("::.99aaaaaaaaaaP-1Y11030DT23059059.97844::.99aaaaaaaaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(".                                      hi!hi!hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".                                      hi!hi!hi!" + "'", str2, ".                                      hi!hi!hi!");
    }

    @Test
    public void test27109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27109");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27110");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "           P-1Y11030DT23059059.97780", "HI! Hi!Hi!H...HI! H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("y0m0dt0h0", "-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-0p-1y11m30dt23h59m59.942s", "hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!4440i!hi!4hi!444hi!4hi!4hi!444hi!4hi!4hi!444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "y0m0dt0h0" + "'", str3, "y0m0dt0h0");
    }

    @Test
    public void test27112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27112");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaa0:00:00.00aaaaaaaaaaaaaaaaaaaaHI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444                            hi", "PpYpMpDTpHpMpTp96SPpYpMpDTpHpMpTp9PpYpMpDTpHpMpTp96SPpYpMpDTpHpMpTp9");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27113");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "...   P0Y0M0DT0H0M0.035S                                       ", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27114");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!P0Y000DT00000.099495hi!P0Y000DT00000.099495P0Y000DT00000.099495P0Y000DT00000.099495hi!P0Y000DT00000.099495", (java.lang.CharSequence) "P0Y000DT00000.031151");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27115");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aahi!hP0Y0M0DT0H0M0.010ShP0Y0M0DT0H0M", "hI!hI!HI!", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27116");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'aaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27117");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y000DT00000.020134P0Y000DT00000.020134P 0 d P0Y000DT00000.020134P0Y000DT00000.020134P", "                              AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                               ", 54);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045SHhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045SHhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP", 139);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045SHhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP" + "'", str2, "0.00:00:0230.00:00:0230.00:00:023044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045SHhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP");
    }

    @Test
    public void test27119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("ih  !ih  !ih  !ih  !ih  !ih  !ih  D0M0Y                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "...aaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih  !ih  !ih  !ih  !ih  !ih  !ih  D0M0Y                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "ih  !ih  !ih  !ih  !ih  !ih  !ih  D0M0Y                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test27120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27120");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!                                                                                       ha!ha!h...hi!", "P0Y0M0DT0H0M0.134S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("###t 00###", "hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hi#!# #hIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("P0Y0M0DT0H0M0.034S", "p0y000dt00000.07111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y000dt00000.07111" + "'", str2, "p0y000dt00000.07111");
    }

    @Test
    public void test27123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27123");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "###########################p0Y0M0DT0H0M0.464");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27125");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("PT.::.38PT.", "   I   I   I   I   I   I  I  I  I   I   I   I   I   I   I   I   I   I   I   I ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27126");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0aaaahhHaaaaaaaaaaaaaaaaaaaaaaaaaaaasyad 0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAASYAD 0AAAAHHhAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD 0AAAAHHhAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD 0" + "'", str1, "AAAAAAAAAASYAD 0AAAAHHhAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD 0AAAAHHhAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD 0");
    }

    @Test
    public void test27127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27127");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaap0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaap0y0m0dt0h0m0.045s" + "'", str1, "aaaaaaaaaaaap0y0m0dt0h0m0.045s");
    }

    @Test
    public void test27128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0:00:00.033", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          0:00:00.033          " + "'", str2, "          0:00:00.033          ");
    }

    @Test
    public void test27129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27129");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-0p-1y11m30dt23h59m59.942s", "  hi!  hi!  hi!  hi!  hi!  hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27131");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0s 0s 0s");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                              hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test27133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44444444444Y0M0DT0H04444444444", "P0Y0M0DT0H0M0.008S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444Y0M0DT0H04444444444" + "'", str2, "44444444444Y0M0DT0H04444444444");
    }

    @Test
    public void test27134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("SDNOCES 0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SDNOCES 0" + "'", str1, "SDNOCES 0");
    }

    @Test
    public void test27135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27135");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "P0Y000DT00000.271126");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y000DT00000.271126" + "'", str1, "P0Y000DT00000.271126");
    }

    @Test
    public void test27136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                          0DAY-1616567371                                            I:II:IIII32                                            0DAY                                            I:II:IIII32                                            0DAY                                            I:II:IIII32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27137");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 40, 0L, "P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PyyyyYM-1dDTH743m-1s.S3599960Hi!00000PyyyyYM-1dDTH743m-1s.S3599960Hi!TDPyyyyYM-1dDTH743m-1s.S3599960Hi!000PyyyyYM-1dDTH743m-1s.S3599960Hi!YPyyyyYM-1dDTH743m-1s.S3599960Hi!0PyyyyYM-1dDTH743m-1s.S3599960Hi!PPyyyyYM-1dDTH743m-1s.S3599960Hi!h" + "'", str3, "PyyyyYM-1dDTH743m-1s.S3599960Hi!00000PyyyyYM-1dDTH743m-1s.S3599960Hi!TDPyyyyYM-1dDTH743m-1s.S3599960Hi!000PyyyyYM-1dDTH743m-1s.S3599960Hi!YPyyyyYM-1dDTH743m-1s.S3599960Hi!0PyyyyYM-1dDTH743m-1s.S3599960Hi!PPyyyyYM-1dDTH743m-1s.S3599960Hi!h");
    }

    @Test
    public void test27138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Y000DT00000.031");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "y000dt00000.031" + "'", str1, "y000dt00000.031");
    }

    @Test
    public void test27139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S");
    }

    @Test
    public void test27140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "'p'YYYY'y'm'm'D'dt'h'                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                       HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!", "hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                       HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!" + "'", str2, "                                                                                       HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi!");
    }

    @Test
    public void test27142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !i" + "'", str1, "ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !ih !i");
    }

    @Test
    public void test27143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!" + "'", str2, "hi!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!");
    }

    @Test
    public void test27144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27144");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0         ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test27145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27145");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P-1Y11M30DT23H59M59.987S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("216.00:00:0", " HI!  HI.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HI!  HI." + "'", str2, " HI!  HI.");
    }

    @Test
    public void test27147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27147");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P0Y000DT00000.004281");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("0I!       0I!       0I!       0I!  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27148");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! i!", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! i!" + "'", str3, "  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! i!");
    }

    @Test
    public void test27149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.1001                                                                                          #############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.1001", "aahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.1001                                                                                          #############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.1001" + "'", str2, "#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.1001                                                                                          #############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.1001");
    }

    @Test
    public void test27150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27150");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih" + "'", str1, "!ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih !ih!ih!ih");
    }

    @Test
    public void test27151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27151");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aap0y000dt00000.0459", "0:00:00.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27152");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "H", (java.lang.CharSequence) "I!I!I!I!I!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27153");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...i!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", 18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27154");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "hi!", (int) (short) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', 52, 51);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test27155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27155");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "P-1Y11M30DT23H59M59.853S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27156");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "#############################################################################P0Y0M0DT0H0M0.100S", (java.lang.CharSequence) "-1Y11030DT23059059.99379");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test27157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27157");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("... HI..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27158");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!p0y000dt00000.099495hi!p0y000dt00000.099495p0y000dt00000.099495p0y000dt00000.099495hi!p0y000dt00000.099495", "  I!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27159");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase(":00:00.139", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27160");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("p0y0m0dt0h0m0.062s", "...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27161");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0 D0 D0 D0 D0 D0 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", "       HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 D0 D0 D0 D0 D0 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44" + "'", str3, "0 D0 D0 D0 D0 D0 'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44");
    }

    @Test
    public void test27162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("p-1y11m30dt23h59m59.937s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27163");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("P0Y0M0DT0H0M0.382S", 99, 612);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" P 0 Y        T 0          0I!p000000t00000.099-10I!p0aaaaaaaaaaaaaaaa0I!p000000t00000.099-10I!p0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "P-1Y11M30DT23H59M59.894S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " P 0 Y        T 0          0I!p000000t00000.099-10I!p0aaaaaaaaaaaaaaaa0I!p000000t00000.099-10I!p0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, " P 0 Y        T 0          0I!p000000t00000.099-10I!p0aaaaaaaaaaaaaaaa0I!p000000t00000.099-10I!p0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27165");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) " DAY86                                                                                                DAY                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27166");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 5, "######P00-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######P00-1" + "'", str2, "######P00-1");
    }

    @Test
    public void test27167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27167");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("##################...", "4444440:00:00.0434444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27168");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00000000", "aaaaaaaaaaaaaaaaaaaa0:00:00.00aaaaaaaaaaaaaaaaaaaaHI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444                            hi");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27169");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("P0Y0M0DT0H0M0.065S");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 161 + "'", int3 == 161);
    }

    @Test
    public void test27170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27170");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                       HI!HI!HI!HI!HI!HI...                                                                                                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27171");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071Shi!4hi!444hi!4P0Y0M0DT0H0M0.071S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27172");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("1", "#################################0:00:00.289##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27173");
        char[] charArray10 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0DT0H0M0.003S", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                  P                                                                                                  ", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test27174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27174");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0.000S", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", (int) (byte) -1);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SPaahi!P0000Y0M0DT0H0M0.99SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test27175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27175");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("P0Y0M0DT0H0M0.139S", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.139S" + "'", str3, "P0Y0M0DT0H0M0.139S");
    }

    @Test
    public void test27176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27176");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("440A0", "!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!Iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ..", ".065100");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27177");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                               P0Y000DT00000.09910", '#');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                               0:00:00.032", strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '4');
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                               44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                              ", strArray11, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3, strArray18);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                               44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                              " + "'", str19, "                               44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str20, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27178");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 41, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test27179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27179");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("h!ih!ih!ih!i  i!h!ih!ih!ih!i       p     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27180");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!P0Y000DT00000.099495hi!P0Y000DT000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!P0Y000DT00000.099495HI!P0Y000DT000" + "'", str1, "HI!P0Y000DT00000.099495HI!P0Y000DT000");
    }

    @Test
    public void test27181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27181");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                               44's's.s'm'm'h'h'td'd'm'm'y'yyyy'p'                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str1, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test27183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27183");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", strArray3, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 134, 95);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str7, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test27184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27184");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                         hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                                       0743i!i!...I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27185");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHih                            4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444!ih", (java.lang.CharSequence) "4YYYY4P4                                                                                                                                                                                                  HI!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHih                            4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444!ih" + "'", charSequence2, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hiHIHIHIHIHIHIHIHIHIHIHIHIHIHih                            4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444!ih");
    }

    @Test
    public void test27186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("0:00:00.017", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.017" + "'", str2, "0:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.0170:00:00.017");
    }

    @Test
    public void test27187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                             Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                                    HI!                                                                Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "hs0hs000hshs0hs000hsh##HI##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                                    HI!                                                                Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "                                             Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                                    HI!                                                                Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test27188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", " HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S");
    }

    @Test
    public void test27189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27189");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!00000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!TD'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!000'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!Y'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!0'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!P'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'Hi!h");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "S0 S0 S0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach(":00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00" + "'", str6, ":00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:0AAHI!p0000y0-10dt07430-10.993599990:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00");
    }

    @Test
    public void test27190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27190");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!i!i!", "00NOCE0#0", 83);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27191");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "444444444444444444 444444444444444444 444444 'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27192");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("p0y0m0dt0h0m0.000s", "P-1Y11M30DT23H59M59.853S", "############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", 190);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "p0y0m0dt0h0m0.000s" + "'", str4, "p0y0m0dt0h0m0.000s");
    }

    @Test
    public void test27193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27193");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444440:00:00.02");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P0Y000DT00000.065100", "::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99::.99P00-1", 190);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            743I!  P-1Y11-130DT2374359-159.9033599964...000000000000000000000000000000743I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I", strArray5, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '#', (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            743I!  P-1Y11-130DT2374359-159.9033599964...000000000000000000000000000000743I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I" + "'", str10, "                                                                                                                                                                                                                                                            hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!                                                                                                                                                                                                                                                            743I!  P-1Y11-130DT2374359-159.9033599964...000000000000000000000000000000743I!                                                                                       I!I!...I!                                                                                       I!I!...I!                                                                                       I!I");
    }

    @Test
    public void test27194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27194");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("P0Y000DT00000.0711");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y000DT00000.0711" + "'", str1, "P0Y000DT00000.0711");
    }

    @Test
    public void test27195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-00P-0p-1y11m30dt23h59m59.942s", "HI!4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444                            hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27196");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("i!hi!hi!hi!h!iHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "P yyyy Y        T###########################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("#0 0a000 0 hour 0 0inute00 0 econ00 !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444                                                                                             0 -1616567633ECONDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#0 0a000 0 hour 0 0inute00 0 econ00 !4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444...!4444444444444444444444444444444444444444444444aahi!4444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("444444444i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M...", "                                                                                                                                           'p'yyyy'y'm'm'd'dt'h'0 seconds                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M..." + "'", str2, "444444444i!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M...");
    }

    @Test
    public void test27199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27199");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444p0y0m0dt0h0m0.003sp0y0m0dt0h0m0.003sp0y0m00444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (byte) 100, 61);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444444444444444444444444444444444444444444444444444..." + "'", str3, "...4444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test27200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27200");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("############i!0000000000000000000000000743i!i!i!!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0414 0 0  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0 0 0  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih 0 0 0  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ihDT00000.086414", "              P0Y0  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0" + "'", str1, "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0");
    }

    @Test
    public void test27202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27202");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                               4P41-004Y44114034DT44324954114411795444                                                                                                                                ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("h                                                                                                                          ...", 30, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h                                                                                                                          ..." + "'", str3, "h                                                                                                                          ...");
    }

    @Test
    public void test27204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27204");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("h        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h        " + "'", str1, "h        ");
    }

    @Test
    public void test27205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27205");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P0Y000DT00000.020134", "                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", 435);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27206");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !P0Y0M0DT0H0M0.030Sh AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27207");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("P0Y0M0P-1Y11M30DT23H59M59.679S", "P0Y0M0DT0H0M0.080S..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27208");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi! hi! hi!                                                                                ", "0:00:00.612", 20);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27209");
        char[] charArray10 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                0", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P00-", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##'P'yyyy'", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!P-1Y11M30DTS0 S0 S0P-1Y11M30DT2", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "############i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 96 + "'", int12 == 96);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
    }

    @Test
    public void test27210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27210");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                      'P'YYYY'Y'M'M'D'DT'H'0 SECONDS", "", 53);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1 0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    0 0 0 aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test27211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27211");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 106, (long) 484, "Hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27212");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" P0Y0M0DT0H0M0.395S               ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!" + "'", str3, "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test27213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27213");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 25, (long) 12, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27214");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        int int22 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                      'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44                                                                                                                                ", strArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.Class<?> wildcardClass24 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "aahi!" + "'", str19, "aahi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "  hi!" + "'", str21, "  hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 281 + "'", int22 == 281);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test27215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0days", 121);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0days" + "'", str2, "0days");
    }

    @Test
    public void test27216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                   P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                        aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa", 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                        aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa" + "'", str2, "                P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                                                                                  P0Y0M0DT0H0M0.126S                        aaaaaaaaaaaaaaaaaaa   ###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA    aaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27217");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi", "!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi" + "'", str2, "44 IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI  hi");
    }

    @Test
    public void test27218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27218");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 146, "-1113235959.88", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1113235959.88" + "'", str3, "-1113235959.88");
    }

    @Test
    public void test27219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                        p0Y000DT00000.065100", "P0Y0M0DT0H0M0...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                        p0Y000DT00000.065100" + "'", str2, "                                                                                                                                                                                                                                        p0Y000DT00000.065100");
    }

    @Test
    public void test27220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27220");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (java.lang.CharSequence) "0 daysaahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("P0Y000DT00000.000282", "0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27222");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                            !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0       !I0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!", "0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320I!i!i!...0I!i!i!...0I!i!i!...0I!i!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!" + "'", str2, "hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!                                                                                       hI!hI!h...hi!");
    }

    @Test
    public void test27224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27224");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 58, (long) 134);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.076S" + "'", str2, "P0Y0M0DT0H0M0.076S");
    }

    @Test
    public void test27225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                           ", 197, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!                                                                                                                                           " + "'", str3, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!                                                                                                                                           ");
    }

    @Test
    public void test27226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27226");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAA...P0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0H0M0.280SP0Y0M0DT0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S 0S 00S 0S 00S 0S 00S 0S 00S ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27227");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P-1Y11030DT23059059.9839444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 0000000000000000000I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I! I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "8639930noce86399 0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27228");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0a:a00a:a00a                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                             P-1Y11M30DT23H59M59.991S                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                                              hi!                                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27229");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                       Hi!Hi!hi!", "aaaaaaaaaaaap0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aa0i!p000000-100t07430-10.99359999144444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aa0i!p000000-100t07430-10.99359999144444444" + "'", str1, "Aa0i!p000000-100t07430-10.99359999144444444");
    }

    @Test
    public void test27231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27231");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 903, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test27232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27232");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih" + "'", str1, "!ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih");
    }

    @Test
    public void test27233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27233");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 27, (long) 697, "p0Y0M0DT0H0M0.464");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p0Y000DT00000.464" + "'", str3, "p0Y000DT00000.464");
    }

    @Test
    public void test27234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("             0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0 ", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0 " + "'", str3, "             0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320 ...0 ...0 ...0 ");
    }

    @Test
    public void test27235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27235");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("aahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", 32);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("!i0                                                                                             ", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("......0", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aahi!" + "'", str6, "aahi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aahi!" + "'", str9, "aahi!");
    }

    @Test
    public void test27236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27236");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "Hhhaaaaa", 102);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test27237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27237");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("P0Y0M0DT0H0M0.097P0Yp0y0m0dt0h0m0.003sp0y0m0dt0h0m0.003sp0y0m0097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0                                               DAYS                                               ", "HI!  HI!  HI!  HI!  HI!  HI..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27238");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test27239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27239");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...0HS0HS000HSHS0HS000HSHS0HS000HS000000000000000000000000000000000000000000000000000000000000000...", "!I!I!!I!I0:00:00.277");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27240");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4hi!a                            HI4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test27241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27241");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aap0y000dt00000.0459");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27242");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa99.::", "0DAY88                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27243");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I000000000000000000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "TH", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27244");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) " D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 ' D0 D0 D0 '");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27245");
        char[] charArray11 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1Y11M30DT23H59M59.964S44                                                                                                                               ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test27246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27246");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P", "0 0.0 040  0 0 0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              " + "'", str1, "                                              ");
    }

    @Test
    public void test27248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27248");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                44'S'S.s'M'm'H'H'TD'd'M'M'Y'yyyy'P'                                                                                                                               ", ".s's");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               " + "'", str5, "                                                                                                                                444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test27249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27249");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'H", 336);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27250");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(":00:00.09", 125, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27251");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.091S", "                      0:00:00.007");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27252");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444S4S4M4m4H4H4TD4d4M4M4Y4yyyy4P4", ' ');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!0S0S00S0S00S0S00S0S00S", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0DAYS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27254");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("p-1y11m30dt23h59m59.993s0DAY88a", "HP0Y0M0DT0H0M0.019SaaaaaaaaaaaaP0Y0M0DT0H0M0.019SaaaaaaaaaaaaP0Y0M0DT0H0M0.019SaaaaaaaaaaaaP0Y0M0DT0H0M0.019Sa", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27255");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27256");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IH                            4444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444!IH", "0:00:00.110", 930);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27257");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!ih !ih                   H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !P0Y0M0DT0H0M0.030Sh AAAAAAAAAAAAAAAAAAAAAAAAA!ih !ih                   ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !P0Y0M0DT0H0M0.030Sh AAAAAAAAAAAAAAAAAAAAAAAAA!ih !ih                   " + "'", str2, "                H ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH ! IH !P0Y0M0DT0H0M0.030Sh AAAAAAAAAAAAAAAAAAAAAAAAA!ih !ih                   ");
    }

    @Test
    public void test27258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27258");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0...3h59059.8720 ...3h59059.8720seconds", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "p0y0m0dt0h0m0.195s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27260");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("p-1Y11M30DT23H59M59.924S", "hi!4hi!444hi!40i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!4444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444                            0I", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test27261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) ".099sp0y0m0dt0h0m0.099sp0y0m0dt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27262");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!p00-1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", ".099SP0Y0M0DT0H0M0.099SP0Y0M0DT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27263");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                                                                               hi! ", "                                                                                              hi!", 8);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Y0M0DT0H0", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !ih  !i");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split(" P yyyy Y        T H H          ", "  HI!  HI!  HI!  HI!  HI!  HI...", 3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("##############################################################", strArray8, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "##############################################################" + "'", str13, "##############################################################");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PyyyyY        T H H          " + "'", str14, "PyyyyY        T H H          ");
    }

    @Test
    public void test27264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("P0Y0M0DT0H0M0.274S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.274S" + "'", str1, "P0Y0M0DT0H0M0.274S");
    }

    @Test
    public void test27265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##################################################################################00000000", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################00000000" + "'", str2, "##################################################################################00000000");
    }

    @Test
    public void test27266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27266");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) ":00:00.902");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27267");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320 HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320#:#00#:#00#.#0320", "P0Y0M0DT0H0M0.365S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27268");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(" : i!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444  ", ".", "P0Y0M0DT0H0M0.082S", 47);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " : i!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444  " + "'", str4, " : i!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444  ");
    }

    @Test
    public void test27269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27269");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ", "P-1Y11M30DT23H59M59.902S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27270");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                  #############################################################################P0Y0M0DT0H0M0.100S                                                                 ", "hhhhhhhhhhhAAHI!'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27271");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("p0y0m0dt0h0m0.065s", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27272");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("010 0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27273");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("######################################################################################################################################################################################################################################################################0i!0i!0i!0i!0i!0i!0i!0i!0i!                                                                                             aahi!####################################################################################################################################################################################################################################################################################################################################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27274");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0hhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y000dt00000.0459", "  i!  i!HI!  i!  i!HI!  i!  i!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27275");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "0:00:00.016");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("i0", "P0Y0M0DT0H0M0.484S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i0" + "'", str2, "i0");
    }

    @Test
    public void test27277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("P0Y0M0DT0H0M0.011S", "h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test27278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27278");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("h P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S0s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 00s 0s 0", "                                                                                                                 ::.99aaaaaaaaaap-1y11m30dt23h59m59.978s::.99aaaaaaaaaa                                                                                                                 444!ih4!ih", 495);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27279");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                          743i!i!i! ", "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("           4444444444444444444444444444A4444444444444444444444444444444444444444444444", "yyyy'Y'M'M");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           4444444444444444444444444444A4444444444444444444444444444444444444444444444" + "'", str2, "           4444444444444444444444444444A4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27281");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0:00:00.135", 0, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.135" + "'", str3, "0:00:00.135");
    }

    @Test
    public void test27282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27282");
        char[] charArray11 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P0Y0M0DT0H0M0.003S", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "H H T        Y yyyy P", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test27283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27283");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "t 00", (java.lang.CharSequence) "0:00:00.318");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27284");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!  HI!  HI!  HI!  HI!  HI...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 PYYYYY0MDDT0H0M43.S44", 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27285");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaSDNOCES                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("P-1Y11M30DT23H59M59.912S", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.912S" + "'", str2, "P-1Y11M30DT23H59M59.912S");
    }

    @Test
    public void test27287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27287");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("p  y  m  dt  h  m  .  s", 15, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p  y  m  dt  h  m  .  s" + "'", str3, "p  y  m  dt  h  m  .  s");
    }

    @Test
    public void test27288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27288");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray15 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0:00:00.043", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "'P'yyyy'Y'M'M'd'DT'''m'M's.S'S", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                 ...", charArray15);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test27289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27289");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("P0Y0M0DT0H0M0.053S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27290");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " DAYS                                                                                               ", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hhi!4hi!444hi HI!  HI..hi!4hi!444hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27291");
        char[] charArray10 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("'p'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI!", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Y0M0DT0H0", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0:00:00.012", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test27292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27292");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44 days", '4');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I days" + "'", str5, "  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I days");
    }

    @Test
    public void test27293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27293");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) ":00:00.052");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27294");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P0Y0M0DT0H0M0.064S", "s's.s'm'm'h'h'td'd'm'm'y'yyyy'p'!ihaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27295");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("P-1Y11M30DT23H59M59.999S", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str3, "P-1Y11M30DT23H59M59.999S");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str4, "P-1Y11M30DT23H59M59.999S");
    }

    @Test
    public void test27296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27296");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(":aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa:aaa1a1a:aa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                              ", "p-1y11m30dt23h59m59.808s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              " + "'", str2, "                                              ");
    }

    @Test
    public void test27298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27298");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "             059.872103              ", (java.lang.CharSequence) "                               pa0aYa0aMa0aDTa0aHa0aMa0a.a045aS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test27299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27299");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459");
    }

    @Test
    public void test27300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27300");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              p0y000dt00000.010100y000dt00000.001110", "00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce00I00noce000noce0");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("p-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8aa:aaap-ayaam3aat23h59m59a8a8a", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 0, 61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              p0y000dt00000.010100y000dt00000.001110" + "'", str5, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              p0y000dt00000.010100y000dt00000.001110");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test27301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0:00:00.09");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.09" + "'", str1, "0:00:00.09");
    }

    @Test
    public void test27302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27302");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                            I:II:IIII32                                            ");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray9, strArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray16);
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray16);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                          h23AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp00059030t0h0590.04559                                                                                                                                                                                                                                                                          ", strArray3, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!" + "'", str21, "hi!hi!hi!");
    }

    @Test
    public void test27303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27303");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444440:00:00.0", 25, 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444444444444444444444444..." + "'", str3, "...444444444444444444444444...");
    }

    @Test
    public void test27304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27304");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 118, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11087", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11087" + "'", str3, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11030DT23059059.11087");
    }

    @Test
    public void test27305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27305");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0i!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!h0:00:00.306", "...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27306");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!#######0I!##", "P0Y0M0DT0H0M0.281S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "0Y0M0DT0H0M0.99S                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27308");
        char[] charArray15 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi!", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "H P00-1Y11M30DT23H59M59.964S44 0Y0M0DT0H0M0.010S", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "P0Y0M0DT0H0M0.101S", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                               P0Y0M0DT0H0M0.271S                                                                                               hi! hi!", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "808.95M95H32TD03M11Y1-P", charArray15);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 79 + "'", int22 == 79);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test27309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!p0y0m0dt0h0m0.056sI!p0y0m0dt0h0m0.056sI!p0y0m0dt0h0m0.056sI!p0y0m0dt0h0m0.056sI!p0y0m0dt0h0m0.056sI...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "P0Y000DT00000.00591");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test27310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!  HI!  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH  !IH", "999.95095!ih  IIIIIIIIIIIIIIII0000000000000000");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27311");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P-1Y11030DT23059059.97215", "P0Y0M0DT0H0M0.080S..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.#I#..#.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27312");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135 HI!  HI..0:00:00.135", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                       P0Y0M0DT0H0M0.271                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27313");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!h", (java.lang.CharSequence) "P-1Y11M30DT23H59M59.819S                                                                       hi!hi!hi!                                                                                                                                              hi!hi!hi!                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27314");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! hi! hi! hi!hhhhi! hi! hi! hi!Hi!P0Y0M0DT0H0M0.099Shi!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099Shi!P0Y0M0DT", 900, 484);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27315");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0Y0M0DT0H0M0.089S");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27316");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "P0Y000DT00000.271126");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0Y000DT00000.271126" + "'", str1, "p0Y000DT00000.271126");
    }

    @Test
    public void test27317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(":00:");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":00:" + "'", str1, ":00:");
    }

    @Test
    public void test27318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27318");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 474);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.474S" + "'", str1, "P0Y0M0DT0H0M0.474S");
    }

    @Test
    public void test27319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27319");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str1, "P0Y0M0DT0H0M0.032S");
    }

    @Test
    public void test27320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27320");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!", "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'44", 8);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##hi!", "                                                                                              hi!", 98);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("I  I  I  I  I  I", strArray6, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44 0a0                                                                                     ...", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I  I  I  I  I  I" + "'", str13, "I  I  I  I  I  I");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test27321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27321");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 79);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.079S" + "'", str1, "P0Y0M0DT0H0M0.079S");
    }

    @Test
    public void test27322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27322");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444HI4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444444444444444444", "4444440:00:00.0434444444", 503);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("P0Y0M0DT0H0M0.097");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.097" + "'", str1, "P0Y0M0DT0H0M0.097");
    }

    @Test
    public void test27324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27324");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 190, "                                     ::::::::32                                      ", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     ::::::::32                                      " + "'", str3, "                                     ::::::::32                                      ");
    }

    @Test
    public void test27325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27325");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("p00-1y11-130dt2374359-159.999359998900000000000000000000000000000023i!i!i!i!i!i!i!i!i!i!i!i!i...", "hi! hi! hi! hi!hhhhi! hi! hi! hi!aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27326");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP-1Y11M30DT23H59M59.606SP-1Y11M3", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             HI!4HI!444HI HI!  HI..HI!4HI!444HI", 274);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27327");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.019Saaaaaaaaaaaa", "i!000000000000000000000000073i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", 76);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27328");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(" HI! HI! HI! HI! HI! HI! HI! HI", "iHhiHhiHhiHhp-1Y11M30DT23H59M59.924S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27329");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("I000000000000000IIIIIIIIIIIIIII  hi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27330");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split(" P yyyy Y        T H H          ", "0:00:00.000", 5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split(" DAYS");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("-1Y11M30DT23H59M59.964S44                                                                                                                                ", strArray6, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hp0y0m0dt0h0m0.097s   ", strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1Y11M30DT23H59M59.964S44                                                                                                                                " + "'", str9, "-1Y11M30DT23H59M59.964S44                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DAYS" + "'", str11, "DAYS");
    }

    @Test
    public void test27331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27331");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                  AAHI!P0000Y0M0DT0H0M0.99S", "AAAAAAAAAAAAAAAAAAAA                          'P'!!!!'Y'M'M' 'DT'H'H'm'M'.S'S'Hi!", 918);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27332");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!P0Y0M0DT0H0M0.099SHI!P0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SP0Y0M0DT0H0M0.099SHI!P0Y0M0DT0H0M0.099", "P0Y0M0DT0H0M0.289SI!4444444444444444444444444444444444444444444444AAHI!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27333");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0i0", "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "iP0Y0M0DT0H0M0.103SP0Y0M0DT0H0M0.103SP0Y0M0DT0H0M0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test27334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27334");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P-1Y11M30DT23H59M59.809S", "sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 848, (int) (byte) 0);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny(".872S", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test27335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27335");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "hi!", (int) (short) 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!hi!h...", strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test27336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27336");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "00NOCE0#0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27337");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444                    444444444444444444                    444444                    Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H                                                     'P'YYYY'Y'M'M'D'DT'H'0 SECONDS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "i!hi!hi!hi!h!iHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27339");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                      'p'YYYY'y'm'm'D'dt'h'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0:00:00.139#########0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-'P'yyyy'Y'M'M'd'DT'H'H'm'.01010#######################################", "I:II:IIII32");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.139#########0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-'P'yyyy'Y'M'M'd'DT'H'H'm'.01010#######################################" + "'", str2, "0:00:00.139#########0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-'P'yyyy'Y'M'M'd'DT'H'H'm'.01010#######################################");
    }

    @Test
    public void test27341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27341");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("        P0Y0M0DT0H0M0.100S         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test27342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27342");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0:00:00.0974444444444444444444444444444444444444444444444AAHI!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.090:00:00.1060:00:00.0974444444444444444444444444444444444444444444444AAHI!44444444444444444444444444444444444444444444444Y4YYYY4P4         0:00:00.09", 846);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27343");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "P-1Y11M30DT23H59M59.932S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27344");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27345");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("743I!I!I! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27346");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray16 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##hi!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.000S", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone(charSequence4, charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0000000I!44I!44I!44!I!44I!44I!44", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h444!ih4!ih..I0  !I", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test27347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27347");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("555555555555555555555453249953555555555555555555555", "                                                  .                                      hi!hi!hi!", 612);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                    i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "i!0i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P0Y0M0DT0H0M0.011S", "  HI! ###############################################################  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ...#######################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27350");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Y0M0DT0H0M");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("001560.00000TD000Y0p  hP00-1Y11030DT23059", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Y0M0DT0H0M" + "'", str4, "Y0M0DT0H0M");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test27351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0econ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0econ" + "'", str1, "0econ");
    }

    @Test
    public void test27352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27352");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0 seconds");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                            P-1Y11M30DT23H59M59.950S", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test27353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27353");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4hi!444hi!4", 87, "!I!I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4hi!444hi!4!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!" + "'", str3, "4hi!444hi!4!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!I!I!!");
    }

    @Test
    public void test27354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27354");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 71, "0000000000000000000000000000000000i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i" + "'", str3, "0000000000000000000000000000000000i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
    }

    @Test
    public void test27355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27355");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("P0Y0M0DT0H0M0.176S", 91);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27356");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0:00:00.139#########0I!p0y000dt00000.099-1HI!p0y000dt00000.099-1p0y000dt00000.099-1p0y000dt00000.099-1HI!p0y000dt00000.099-'P'yyyy'Y'M'M'd'DT'H'H'm'.01010#######################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 193 + "'", int1 == 193);
    }

    @Test
    public void test27357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "P0Y0M0DT0H0M0.323S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p0Y0M0DT0H0M0.323S" + "'", str1, "p0Y0M0DT0H0M0.323S");
    }

    @Test
    public void test27358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27358");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("IH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                   0I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test27359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27359");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!                                                                                                                                           ", "                                                                 h!ih!ih!ih!i  i!h!ih!ih!ih!i       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                           hi!                                                                                                hi! hi!                                            ", "I!HI!HI!HI!HI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                           hi!                                                                                                hi! hi!                                            " + "'", str2, "                                                                                                                                           hi!                                                                                                hi! hi!                                            ");
    }

    @Test
    public void test27361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27361");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aahi!", 100, "  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! aahi!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  " + "'", str3, "  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! aahi!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  ");
    }

    @Test
    public void test27362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27362");
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
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaa", charArray18);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAA", charArray18);
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                               hi!                                                                                                hi! hi!", charArray18);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test27363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27363");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0:...", 931, 282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27364");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          ", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27365");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("P0Y0M0DT0H0M0.024S", 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27366");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("'p'!!!!'y'm'm''dt'h'h'm'm'.s's'hi!", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'p'!!!!'y'm'm''dt'h'h'm'm'.s's'hi!" + "'", str3, "'p'!!!!'y'm'm''dt'h'h'm'm'.s's'hi!");
    }

    @Test
    public void test27367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27367");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0:00:00.081", "p0y0m0dt0h0m0.100s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.081" + "'", str2, "0:00:00.081");
    }

    @Test
    public void test27369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27369");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0M0DT0", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0000000I!                                                                                       I!I!...I!                 I!I!..", "                                                                                                                         P0Y0M0DT0H0M0.099S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27371");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 110 + "'", int1 == 110);
    }

    @Test
    public void test27372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27372");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("4P41-004Y44114034DT4432495411441179544");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4P41-004Y44114034DT4432495411441179544" + "'", str1, "4P41-004Y44114034DT4432495411441179544");
    }

    @Test
    public void test27373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27373");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("s690.0M0H0TD0M0Y0P");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "s690.0M0H0TD0M0Y0P" + "'", str1, "s690.0M0H0TD0M0Y0P");
    }

    @Test
    public void test27374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27374");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("P0Y0M0DT0H0M0.056S", "", 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056S" + "'", str3, "P0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056SP0Y0M0DT0H0M0.056S");
    }

    @Test
    public void test27375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27375");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0", "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ai!aaaaaaaaaaaaaaaa2ahi!aaai!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test27376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27376");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "       !ih    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27377");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aa0i!p000000-100t07430-10.99359999144444444", " hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", 107);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("0HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test27378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27378");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!hi!hi!hi!hi", 274, 906);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi" + "'", str3, "hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test27379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27379");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 49);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.049" + "'", str1, "0:00:00.049");
    }

    @Test
    public void test27380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27380");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27381");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" !I!I!I347", 74, "     4yyyy4P4                                                                                                                                                                                                  HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     4yyyy4P4                    !I!I!I347     4yyyy4P4                   " + "'", str3, "     4yyyy4P4                    !I!I!I347     4yyyy4P4                   ");
    }

    @Test
    public void test27382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ", "p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101p0Y000DT00000.0101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    " + "'", str2, "230.00:00:0                                                                               hi!                   63540.00000TD000Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ");
    }

    @Test
    public void test27383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27383");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HP0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27384");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27385");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27386");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaHIaH", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test27387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27387");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("#############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.1001                                                                                          #############################################################################P0Y000DT00000.100115#############################################################################P0Y000DT00000.1001", " SECONDSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                               ", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("P-1Y11-130DT2374359-159.9323599041", 417, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11-130DT2374359-159.9323599041444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11-130DT2374359-159.9323599041444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("##i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!p0y0m0dt0h0m0.271s days", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ysa##i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!p0y0m0dt0h0m0.271s d" + "'", str2, "ysa##i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!p0y0m0dt0h0m0.271s d");
    }

    @Test
    public void test27390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27390");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("###############################################################################################", "0:00:00.029", ":00:");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27391");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       0000000000000000000I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!  I!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "T23H59M59.999S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27392");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       P-1Y11M30DT23 59M59.926S44444444444444444444444444444444444444444444444   44   44   44    44   44   44        P-1Y11M30DT23 59M");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("P0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H" + "'", str2, "P0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H0M0.041SP0Y0M0DT0H");
    }

    @Test
    public void test27394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("           ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           " + "'", str2, "           ");
    }

    @Test
    public void test27395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa day                                                                                                     ", "S100.0M0#########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa day                                                                                                     " + "'", str2, "0i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa day                                                                                                     ");
    }

    @Test
    public void test27396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27396");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaa0i0aaaaaaaaaaaaaa", "                                                                                                                                                  320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.03");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27397");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!I!", 288, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi!4hi!444hi hi!  hi..hi!4hi!444hi", (int) ' ', "  0econ00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi!4hi!444hi hi!  hi..hi!4hi!444hi" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi!4hi!444hi hi!  hi..hi!4hi!444hi");
    }

    @Test
    public void test27399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                    'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!                    ", "                                       P0Y0M0DT0H0M0.395S                                       ", "0...3h59059.8720 ...3h59059.8720seconds");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!                    " + "'", str3, "                    'p'!!!!'y'm'm' 'dt'h'h'M'm'.s's'hI!                    ");
    }

    @Test
    public void test27400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("P0Y000000000000000000-1P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0P0Y0PD", "########################################################################444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27401");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.03");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.03" + "'", str1, "0:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.0320:00:00.03");
    }

    @Test
    public void test27402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi! hi!   hi HI!  HI..hi! hi!   hi", "  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi!   hi HI!  HI..hi! hi!   hi" + "'", str2, "hi! hi!   hi HI!  HI..hi! hi!   hi");
    }

    @Test
    public void test27403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27403");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "P-1Y11M30DT23H59M59.935S", "999.95M95H32TD03M11Y1-P");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27404");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " 0 0 0  0 0 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test27405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27405");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("P0Y0M0DT0H0M0.099S", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "  hi!" + "'", str8, "  hi!");
    }

    @Test
    public void test27406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27406");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT", "", "808.95M95H32TD03M11Y1-P");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT" + "'", str3, "P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000D0:00:00.030P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT00000.01010P0Y000DT");
    }

    @Test
    public void test27407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(" I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I II!HI!HI!HI!HI!H...", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I II!HI!HI!HI!HI!H..." + "'", str2, " I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I I II!HI!HI!HI!HI!H...");
    }

    @Test
    public void test27408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27408");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI...AAAAAAAAAAAAAAAAAAP0Y0000DT0a00a9915");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                       Hi!Hi!H...HI!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       Hi!Hi!H...HI!" + "'", str2, "                                       Hi!Hi!H...HI!");
    }

    @Test
    public void test27410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27410");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                    HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...                  8010.00000td000y0p...                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("::.99", "0:00:00.028");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "::.99" + "'", str2, "::.99");
    }

    @Test
    public void test27413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0:00:00.031");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.031" + "'", str1, "0:00:00.031");
    }

    @Test
    public void test27414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("  HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!HI!", "!ih !ih !ih !ih !ih !ih !ih !ih !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!HI!" + "'", str2, "  HI!  HI!  HI!  HI!  HI!  HI..HI!HI!H...HI HI!HI!");
    }

    @Test
    public void test27415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444444I! HI! HI! HI! HI! HI! HI! HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444I! HI! HI! HI! HI! HI! HI! HI" + "'", str1, "444444I! HI! HI! HI! HI! HI! HI! HI");
    }

    @Test
    public void test27416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27416");
        char[] charArray10 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("0 DAYS", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         1010.00000TD000Y0p        ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("0:00:00.034", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test27417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27417");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("p0Y000DT00000.464", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27418");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! s0 s0 s0 HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! HI! hI!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             hi!4hi!444hi HI!  HI..hi!4hi!444", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27419");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                 P-1Y11M30DT23H59M59.926S                                                                                                                                                                                                                                                                                                                                                                                                                  ", "ih  !ih  !ih  !ih  !ih  !ih  !ih  D0M0Y", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasdnoces0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27421");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("P-1Y11-130DT2374359-159.9503599971");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11-130DT2374359-159.9503599971" + "'", str1, "P-1Y11-130DT2374359-159.9503599971");
    }

    @Test
    public void test27422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("P0Y000DT00000.06316");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y000DT00000.06316" + "'", str1, "P0Y000DT00000.06316");
    }

    @Test
    public void test27423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27423");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!   hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!       hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi", 190);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27424");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0...3h59059.8720 ...3h59059.8720seconds");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27425");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444444444444444444444441-990.00000TD000Y0P!ih1-990.1-990.00000TD000Y0P!ih1-990.1-990.00000TD000Y0P!ih1-990.aa4444444444444444444444444444444444444444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P4444444444!IH!IH!IH44444444403M11Y1-P", "S0 S0 S0 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAp0y0m0dt0h0m0.027s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27426");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                        ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27427");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "AAAAAAAAAAAAP0y0m0dt0h0m0.045s", 103);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "P-1Y11M30DT23H59M59.977S");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test27428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27428");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!...hi!P0Y0M0DT0H0M0.002Shi!P0Y  i!", "'p'!!!!'y'm'm''dt'h'h'm'm'.s's'hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27429");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) " HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", (java.lang.CharSequence) "p0Y0M0DT0H0M0.289Si!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27430");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...I!  HI!  HI!  HI!  HI..", "01990.00000td000y0p", 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!HI!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("44days", strArray5, strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("Y0M0DT0H0M", strArray7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "", 955, 604);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44days" + "'", str8, "44days");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test27431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27431");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test27432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27432");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 281, (long) 102, "P-1Y11M30DT23H59M59.679S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                  ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test27434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27434");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("      HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!", 591, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27435");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27436");
        char[] charArray9 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "459", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test27437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27437");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("P-1Y11M30DT23H59M59.977S                       ", "                                                                                                                                                                                                                                                                                                                                                                                                                                  0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000:60800:6080000:6080:60800:6080000:6080:60800:6080000:60800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27438");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!iH", 567);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27439");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  hi!  hi!  !ih  !ih  !ih  !ih  !ih  !00noce0 0h  !ih  !ih  !ih  !ih  !ih  ", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27440");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", 80);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("S498.95M95H32TD03M11Y1-P");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S498.95M95H32TD03M11Y1-P" + "'", str1, "S498.95M95H32TD03M11Y1-P");
    }

    @Test
    public void test27442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27442");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 970, (long) 845, "###################################hi!", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27443");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = new char[] { '4' };
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0i!4444444444444444444444444444444444444444444444aahi!444444444444444444444444444444444444444444444", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test27444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("0 DAYS", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi" + "'", str6, "hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi");
    }

    @Test
    public void test27445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27445");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "4yyyy4P4                                                                                                                               ", (java.lang.CharSequence) "   I!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27446");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HS0HS000HSHS0HS000HSH##hi##", "P-1Y11030DT23059059.711100                                                           ", "0i!P0Y000DT00000.099-1hi!P0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HS0HS000HSHS0HS000HSH##hi##" + "'", str3, "HS0HS000HSHS0HS000HSH##hi##");
    }

    @Test
    public void test27447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27447");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" HHHHHHHHHHHaahi!'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", "P0Y0M0D...                             ", 19);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "0i!4444444444444444444444444444444444444444444444aahi!4444444444444444444444444444444444444444444444 day", 47, 43);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test27448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27448");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!", 205);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...P-1Y11M30DT23H59M59.233S52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...P-1Y11M30DT23H59M59.233S52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...P-1Y11M30DT23H59M59.233S52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...P-1Y11M30DT23H59M59.233S52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...P-1Y11M30DT23H59M59.233S52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...P-1Y11M30DT23H59M59.233S52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...P-1Y11M30DT23H59M59.233S52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...P-1Y11M30DT23H59M59.233S52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...P-1Y11M30DT23H59M59.233S52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...P-1Y11M30DT23H59M59.233S52 000052 0052 052 000052 0052 052 000052 0052 052 000052 0052...", "0140 0 0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! " + "'", str2, "p0y0  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi! ");
    }

    @Test
    public void test27451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27451");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("      HI!aahi!P0000Y0-10DT07430-10.99359999      HI!", 84, "               P0Y000DT00000.065100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      HI!aahi!P0000Y0-10DT07430-10.99359999      HI!               P0Y000DT00000.065" + "'", str3, "      HI!aahi!P0000Y0-10DT07430-10.99359999      HI!               P0Y000DT00000.065");
    }

    @Test
    public void test27452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27452");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI", (int) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI" + "'", str3, "'YYYY'y'm'm'D'dt'h'h'M'm'S.s's'hI");
    }

    @Test
    public void test27453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27453");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!s0s0s0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "P0Y0M0DT0H0M0.010S");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 118, 34);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test27454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27454");
        char[] charArray9 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P-1Y11M30DT23H59M59.903S", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                            P0Y0M0DT0H0M0.000S", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "              44 days              ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 92 + "'", int12 == 92);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test27455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27455");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hI!hI!h...hi!..", "P0Y000DT00000.020134", 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! S0 S0 S0 hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27457");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("P0Y0-10DT07430-10.1663599218", "!I!I!I!I!I!I!I!I!", 289);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27458");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("T 0 ", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIh                                                                                                                                 'P'yyyy...", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "##############################################################");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test27459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27459");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces  HI!sdnoces  sdnoces", "p0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MP0Y0MPD");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27460");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0DT0H0M0.097P0Y0M0                                               DAYS                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                     ", 298);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test27462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27462");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAHI!P0000Y0-10DT07430-10.99359999144444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27463");
        char[] charArray10 = new char[] { '#', '4', 'a', ' ', '4', '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i00i0", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("P0Y0M0DT0H0M0.097", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###########ihHHAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4a 44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4a 44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4, a,  , 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
    }

    @Test
    public void test27464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27464");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("################P-1Y11M30DT23H59M59.991S#####################", "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################### 0Y0M0DT0H0M0.001S           ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                                                                                      aahi!'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27465");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi! hi!   hi HI!  HI..hi! hi!   hi", " aaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test27466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27466");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("P0Y0M0DT0H0M0.036S", "000AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP000000T0H000.0450", "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.0459hhP-1Y11M30DT23H59M59.110S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.036S" + "'", str3, "P0Y0M0DT0H0M0.036S");
    }

    @Test
    public void test27467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test27468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27468");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27469");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                           a...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a..." + "'", str1, "a...");
    }

    @Test
    public void test27470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("      Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test27471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27471");
        char[] charArray8 = new char[] { ' ', '#', ' ', ' ' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "P-1Y11M30DT23H59M59.903S", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "230.00:00:0", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAASYAD 0AAAAHHhAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD 0AAAAHHhAAAAAAAAAAAAAAAAAAAAAAAAAAAASYAD 0", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
    }

    @Test
    public void test27472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27472");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                              aahi!  ", "  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("i!i!i!", "######P00-1                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!i!i!" + "'", str2, "i!i!i!");
    }

    @Test
    public void test27474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27474");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               'M'M'd'DT'H'H'm'M's.S'S'Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27475");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0...", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", 16);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27476");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("000000000000I!  I!  I!  I!  I!  I..I!I!...I I!I!", "aaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                       T 00", "sdnoces 0'H'TD'd'M'M'Y'yyyy'P'                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                       T 00" + "'", str2, "                                                                                                       T 00");
    }

    @Test
    public void test27478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I  0000000000000743I!  I!  I!  I!  I!  I...  I!  I!  I!  I!  I!  I...  I!  I!  I!  I days");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "syad I  !I  !I  !I  ...I  !I  !I  !I  !I  !I  ...I  !I  !I  !I  !I  !I3470000000000000  I  !I  !I  !I  ...I  !I  !I  !I  !I  !I  ...I  !I  !I  !I  !I  !I3470000000000000  " + "'", str1, "syad I  !I  !I  !I  ...I  !I  !I  !I  !I  !I  ...I  !I  !I  !I  !I  !I3470000000000000  I  !I  !I  !I  ...I  !I  !I  !I  !I  !I  ...I  !I  !I  !I  !I  !I3470000000000000  ");
    }

    @Test
    public void test27479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27479");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days", "P0Y0M0DT0H0M0.107S", 49);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                                             059.872103                                              ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days" + "'", str5, "!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44daysaa44daysi!44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days44days");
    }

    @Test
    public void test27480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27480");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("              44 days              ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27481");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0...", ' ');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("P0Y0M0DT0H0M0.000S", "hi!hi!hi! ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("0SECOND", (java.lang.Object[]) strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("0:00:00.290", (java.lang.Object[]) strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("####################################################################################################################################################################################################################################################################################################################################################################################", strArray4, strArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!                   S540.0M0H0TD0M0Y0Paaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                    ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str10, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str11, "P0Y0M0DT0H0M0.000S");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "####################################################################################################################################################################################################################################################################################################################################################################################" + "'", str12, "####################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test27482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27482");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "P-1Y11M30DT23H59M59.711S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27483");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("P-1Y11M30DT23H59M59.965S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.965S" + "'", str1, "P-1Y11M30DT23H59M59.965S");
    }

    @Test
    public void test27484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("DPM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0P");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DPM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0" + "'", str1, "DPM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0PM0Y0");
    }

    @Test
    public void test27485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27485");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P-1Y11M30DT23H59M59.986S", 28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27486");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27487");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!" + "'", str1, "hi!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!HI! HI! HI! HI! HI! HI! HI! HI!hi!HI! HI! HI! HI! HI! HI! HI! HI!");
    }

    @Test
    public void test27488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27488");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      ", 126, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      " + "'", str3, "44444444444P0Y0M0DT0H0M0.030Sh         AAAAAAAAAAAAAAAAAAAAAAAAA                                      IH                      ");
    }

    @Test
    public void test27489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27489");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "  hi! hi! hi! hi!hhhhi! hi! hi! hi!   ", (java.lang.CharSequence) "P0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0M0DT0H0M0.071SP0Y0                                                                                                                      PYYYYY0MDDT00 SECONDS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 186 + "'", int2 == 186);
    }

    @Test
    public void test27490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27490");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "P-1Y11-130DT2374359-159.9523599990", (java.lang.CharSequence) "P-1Y11M30444444444HI!HI!HI!444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test27491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27491");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hp0y0m0dt0h0m0.097s   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27492");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("##################hi! hi! hi!                                                                                ###################'                                            I:II:IIII32", "hhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0:00:00.09P0:00:00.0900:00:00.09Y0:00:00.0900:00:00.09M0:00:00.0900:00:00.09DT0:00:00.0900:00:00.09H0:00:00.0900:00:00.09M0:00:00.0900:00:00.09.0:00:00.090450:00:00.09S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27493");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0 0 0  0 0 0.930s");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27494");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0 SECONDS");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ", "'p'YYYY'y'm'm'D'dsdnoces'p'YYYY'y'm'm'D'd");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray2, strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! " + "'", str6, "  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI!  HI! ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test27495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhaaaa");
    }

    @Test
    public void test27496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0" + "'", str2, "!I!I!I347                                                                                   !i0!i0!i0!i0!i0!i0!i0!i0!i0");
    }

    @Test
    public void test27497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hi! hi!   hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi! hi!   hi!" + "'", str1, "Hi! hi!   hi!");
    }

    @Test
    public void test27498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" : i!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444  ", "aa!ih !ih                                                                                                !ih                                                                             hi!                                                                                                hi! hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.045S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " : i!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444  " + "'", str2, " : i!4444444444444444444444444444444444444444444444aahi!44444444444444444444444444444444444444444  ");
    }

    @Test
    public void test27499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!                                                                                                                                                                                                                                                  ", "AA0I!p000000-100t07430-10.99359999144444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  S0 S0 S0 hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!  hi!                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test27500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27500");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("S H000S H0S HS H000S H0S HS H000S H0S H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}

