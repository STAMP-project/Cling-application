import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("deuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "deuuuuuuuuuuuuuuuu" + "'", str1, "deuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo xh yi yo za zh zu", "Chinesisch                                                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ZH_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZH_TW" + "'", str1, "ZH_TW");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents(charSequence0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("0 0a00", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00" + "'", str2, "0 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a000 0a00");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", '#');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0 seconds", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("W", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                    " + "'", str6, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         " + "'", str2, "                                         ");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("P-1Y11M30DT23H59M59.975S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("anglais (Canada)", "de-DE", 336);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...INUTES 0 SECOND)", "\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category1, locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str5 = locale0.getDisplayScript(locale2);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.lang.String str7 = locale2.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale2.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English (Canada)" + "'", str7, "English (Canada)");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", "0e_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY4 0 0OUR4 0 0INUTE04 0 ECOND)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str1, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "fran\347ais");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097", "HI!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 3, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097" + "'", str4, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097" + "'", str5, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        timeZone1.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("");
        int int8 = timeZone7.getRawOffset();
        java.lang.String str9 = timeZone7.getID();
        java.time.ZoneId zoneId10 = timeZone7.toZoneId();
        boolean boolean11 = timeZone1.hasSameRules(timeZone7);
        boolean boolean12 = timeZone7.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeZone7.getOffset(24, 336, 120, 32, 98, 336);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT" + "'", str9, "GMT");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("P0Y0M0DT0H0M0.001S", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "fran\347ais");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fran\347ais" + "'", str1, "fran\347ais");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "0 DAYS 0 HOURS 0 MINUTES 0 SECOND", (java.lang.CharSequence) "...chHeure de Gr...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECOND" + "'", charSequence2, "0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                     !i0", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("de-DE", "P0Y000DT00000.00120", "z");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de-DE" + "'", str3, "de-DE");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.100" + "'", str1, "0:00:00.100");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H" + "'", str3, "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI" + "'", str2, "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "W");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "w" + "'", str1, "w");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2, "P-1Y11M30DT23H59M59.901S");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's", locale2);
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale locale7 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str8 = locale5.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str11 = locale7.getDisplayName(locale10);
        java.lang.String str12 = locale7.getDisplayScript();
        java.lang.String str13 = locale2.getDisplayVariant(locale7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("44P0Y0-10DT07430-10.034359990044", locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's" + "'", str3, "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587" + "'", str11, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "44P0Y0-10DT07430-10.034359990044" + "'", str14, "44P0Y0-10DT07430-10.034359990044");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("-GB");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0 DAYS 0 HOURS 0 MINUTES 0 SECOND", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECOND" + "'", str2, "0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon", "Chine0e");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("zh_tw", 24, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 3, (long) 31, "de-DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0e-DE" + "'", str3, "0e-DE");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444", "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Chinese(China)", (java.lang.CharSequence) "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category3, locale4);
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList7 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "P00-1Y11M30DT23H59M59.991S");
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale[] localeArray13 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList14 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList14, localeArray13);
        java.util.Locale locale16 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList14);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale[] localeArray20 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        java.util.Locale locale23 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList21);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList18, 'a');
        java.util.Locale locale27 = new java.util.Locale("");
        java.lang.String str28 = locale27.getScript();
        java.util.Locale locale29 = java.util.Locale.CHINESE;
        java.util.Locale locale32 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.util.Locale.Category category34 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category34, locale35);
        java.util.Locale locale37 = java.util.Locale.CHINA;
        java.util.Locale locale38 = java.util.Locale.PRC;
        java.lang.String str39 = locale37.getDisplayLanguage(locale38);
        java.util.Locale locale40 = java.util.Locale.CHINA;
        java.util.Locale locale41 = java.util.Locale.PRC;
        java.util.Locale locale43 = java.util.Locale.GERMANY;
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale43);
        java.lang.String str45 = locale41.getDisplayVariant(locale43);
        java.util.Locale.Category category46 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category46, locale47);
        java.util.Locale locale49 = java.util.Locale.CHINESE;
        java.util.Locale locale50 = java.util.Locale.PRC;
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale52);
        java.lang.String str54 = locale50.getDisplayVariant(locale52);
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.util.Locale locale56 = java.util.Locale.ITALY;
        java.util.Locale locale57 = java.util.Locale.PRC;
        java.util.Locale locale59 = java.util.Locale.GERMANY;
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale59);
        java.lang.String str61 = locale57.getDisplayVariant(locale59);
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.util.Locale locale63 = java.util.Locale.ROOT;
        java.lang.String str64 = locale63.getLanguage();
        java.util.Locale locale65 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale27, locale29, locale32, locale33, locale35, locale38, locale40, locale41, locale47, locale49, locale50, locale55, locale56, locale57, locale62, locale63, locale65 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.util.Locale[] localeArray73 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.Locale locale76 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.Locale locale77 = java.util.Locale.PRC;
        java.util.Locale locale79 = java.util.Locale.GERMANY;
        java.lang.String str80 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale79);
        java.lang.String str81 = locale77.getDisplayVariant(locale79);
        java.util.Locale locale82 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet83 = locale82.getUnicodeLocaleKeys();
        java.util.Locale locale84 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet85 = locale84.getUnicodeLocaleKeys();
        java.util.Locale locale86 = java.util.Locale.CHINESE;
        java.lang.String str87 = locale84.getDisplayName(locale86);
        java.util.Locale locale88 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray89 = new java.util.Locale[] { locale77, locale82, locale84, locale88 };
        java.util.ArrayList<java.util.Locale> localeList90 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList90, localeArray89);
        java.util.Locale locale92 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.Locale locale95 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList94);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap96 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList97 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap96);
        java.lang.String str99 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "#####################################################################################################################");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertEquals(locale32.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category34.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u4e2d\u6587" + "'", str39, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + category46 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category46.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
// flaky:         org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(locale76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str87, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNull(locale92);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNull(locale95);
        org.junit.Assert.assertNotNull(languageRangeList97);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CAN", "HI!                          ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\u683c\u6797\u5a01\u6cbb\u6642\u9593", 52, 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u6642\u9593" + "'", str3, "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.util.Locale locale1 = new java.util.Locale("en-GB");
        java.util.Locale.setDefault(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("p000000t00000.0230");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: p000000t00000.0230");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "en-gb");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                               Canada                                               ", "                  ", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "anglais (Canada)", "Italy", 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" + "'", str4, "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444" + "'", str1, "4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh_44444444444444444444444444444zh_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_44444444444444444444444444444zh_");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.util.Locale locale1 = java.util.Locale.UK;
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category2, locale3);
        java.lang.String str5 = locale3.getLanguage();
        java.lang.String str6 = locale1.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet7 = locale3.getUnicodeLocaleKeys();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale3);
        java.util.Set<java.lang.Character> charSet9 = locale3.getExtensionKeys();
        java.lang.String str11 = locale3.getExtension('a');
        java.lang.String str12 = locale3.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str8, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CA" + "'", str12, "CA");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0 days 0 hours 0 minutes 0 seco");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECO" + "'", str1, "0 DAYS 0 HOURS 0 MINUTES 0 SECO");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = locale4.getLanguage();
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale4.getISO3Country();
        java.lang.String str9 = locale0.getDisplayName(locale4);
        java.lang.String str10 = locale4.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str5, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str9, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                     !I0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.util.Locale locale2 = new java.util.Locale("ANGLAIS (CANADA)", "ja");
        org.junit.Assert.assertEquals(locale2.toString(), "anglais (canada)_JA");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("China");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "china" + "'", str1, "china");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's", 17, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'" + "'", str1, "!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444444444444444444444444444           HI!", "CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444           HI!" + "'", str2, "44444444444444444444444444444444444444           HI!");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\u4e2d\u570b", "GMT", "                                                                                                                     !i0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ih");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.util.Locale locale7 = new java.util.Locale("P0Y0M0DT0H0M0.090S");
        java.util.Locale locale10 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.lang.String str13 = locale11.toLanguageTag();
        java.lang.String str14 = locale7.getDisplayLanguage(locale11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale7);
        boolean boolean16 = languageRange1.equals((java.lang.Object) locale7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih" + "'", str2, "ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih" + "'", str3, "ih");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ih" + "'", str4, "ih");
        org.junit.Assert.assertEquals(locale7.toString(), "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals(locale10.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str12, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "p0y0m0dt0h0m0.090s" + "'", str14, "p0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str15, "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Canada", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaGreenwich Mean Time", "\u6cd5\u6587\u6cd5\u56fd)", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("zh_44444444444444444444444444444zh_", "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAYchinois");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_44444444444444444444444444444zh_" + "'", str2, "zh_44444444444444444444444444444zh_");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0:00:00.010", "hi!#######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0:00:00.010", (int) '4', 120);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("x", "FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x" + "'", str2, "x");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("           HI!", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           HI!" + "'", str3, "           HI!");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "P-1Y11M30DT23H59M59.964S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)", 0, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de_zh_tw (P0Y0-10DT07430-10.0343" + "'", str3, "de_zh_tw (P0Y0-10DT07430-10.0343");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("#######P0Y0M0DT0H0M0.000S#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######p0y0m0dt0h0m0.000s#######" + "'", str1, "#######p0y0m0dt0h0m0.000s#######");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        java.lang.String str3 = timeZone1.getID();
        int int4 = timeZone1.getRawOffset();
        int int6 = timeZone1.getOffset((long) (short) 1);
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = timeZone1.inDaylightTime(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0", 0, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!44444444444444444444444444444", strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("", "", 100);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444", strArray7, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("0 seconds", (java.lang.Object[]) strArray7);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("eng", strArray7);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str13, "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ZH_tw", "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH_tw" + "'", str2, "ZH_tw");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 4, "eng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("               zh               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Greenwich Mean Time", "                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ", "                                                                                                                    !I0", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Greenwich Mean Time" + "'", str4, "Greenwich Mean Time");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ZH_tw", " und ", "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZH_tw" + "'", str3, "ZH_tw");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0 days 0 hours 0 minutes 0 seconds                                                                  ", "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECONDS0 DAYS 0 HOURS 0 MINUTES 0 SECON", "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale4.getExtension('a');
        java.lang.String str7 = locale0.getDisplayVariant(locale4);
        java.lang.String str8 = locale4.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "deu" + "'", str8, "deu");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("W");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "w" + "'", str1, "w");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.util.Locale locale3 = new java.util.Locale("!I0", "P0Y0M0DT0H0M0.034S");
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale.setDefault(locale3);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase(" I!", locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str4, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " I!" + "'", str7, " I!");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd)", (java.lang.CharSequence) "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\uad6d\uc911\uc5b4\uad6d\uc911sia\347narf)anihc( esenihc", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!I0", "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Chinese (China)", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str5 = locale1.getDisplayCountry(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale1);
        java.lang.String str7 = locale1.getISO3Language();
        java.lang.String str8 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str6, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0320.00000td000y0p", "0I!                                                                                              ", 10, 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0320.000000I!                                                                                              " + "'", str4, "0320.000000I!                                                                                              ");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("P0Y0M0DT0H0M0.001S", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("0:00:00.000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.00" + "'", str1, "0:00:00.00");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("P0Y0M0DT0H0M0.090S0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 ho", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!IH#####################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI", "P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        char[] charArray14 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 seconds", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0 seconds", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0:00:00.097", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0 days", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", (java.lang.CharSequence) "P-1Y11M30DT23H59M59.999S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("-GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-gb" + "'", str1, "-gb");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44P0Y0-10DT07430-10.034359990044", "United States");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("deuuuuuuuuuuuuuuuu", "CAN", 4);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = timeZone5.getID();
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.lang.String str9 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "\u6cd5\u6587\u6cd5\u56fd)", false, timeZone5);
        java.util.TimeZone.setDefault(timeZone5);
        java.lang.String str11 = timeZone5.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str9, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Greenwich Mean Time" + "'", str11, "Greenwich Mean Time");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.util.Locale locale4 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str5 = locale1.getDisplayCountry(locale4);
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        java.lang.Class<?> wildcardClass7 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale4.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("english (united states)", "                                                                                                                    !I0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "english (united states)" + "'", str2, "english (united states)");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GMT+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=gmt+00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("####################################################################################################################", "P-1Y11M30DT23H59M59.964S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int16 = timeZone13.getRawOffset();
        java.time.ZoneId zoneId17 = timeZone13.toZoneId();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale24);
        java.util.Locale.Builder builder27 = builder22.setLocale(locale24);
        java.lang.String str28 = locale21.getDisplayLanguage(locale24);
        java.lang.String str29 = locale21.getDisplayScript();
        java.lang.String str30 = timeZone13.getDisplayName(true, 0, locale21);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "99.00:00:0" + "'", str26, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "GMT" + "'", str30, "GMT");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("de_DE", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de_DE" + "'", str2, "de_DE");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("####################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################################################################################" + "'", str1, "####################################################################################################################");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "P0Y000DT00000.0230");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale1);
        boolean boolean4 = locale1.hasExtensions();
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.UK;
        java.util.Locale.setDefault(category6, locale7);
        java.lang.String str9 = locale7.getVariant();
        java.lang.String str10 = locale7.toLanguageTag();
        java.util.Set<java.lang.Character> charSet11 = locale7.getExtensionKeys();
        java.lang.String str12 = locale1.getDisplayCountry(locale7);
        java.util.Locale locale14 = new java.util.Locale("en-GB");
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale7.getDisplayName(locale14);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "99.00:00:0" + "'", str3, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-GB" + "'", str10, "en-GB");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals(locale14.toString(), "en-gb");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English (United Kingdom)" + "'", str16, "English (United Kingdom)");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        boolean boolean18 = timeZone6.observesDaylightTime();
        java.time.ZoneId zoneId19 = timeZone6.toZoneId();
        java.lang.String str20 = timeZone6.getID();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("");
        int int23 = timeZone22.getRawOffset();
        java.lang.String str24 = timeZone22.getID();
        int int25 = timeZone22.getRawOffset();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone("");
        java.lang.String str33 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone32);
        boolean boolean34 = timeZone32.observesDaylightTime();
        java.util.TimeZone timeZone40 = java.util.TimeZone.getTimeZone("");
        java.lang.String str41 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone40);
        boolean boolean42 = timeZone32.hasSameRules(timeZone40);
        boolean boolean43 = timeZone26.hasSameRules(timeZone32);
        boolean boolean44 = timeZone26.observesDaylightTime();
        java.time.ZoneId zoneId45 = timeZone26.toZoneId();
        boolean boolean46 = timeZone22.hasSameRules(timeZone26);
        boolean boolean47 = timeZone6.hasSameRules(timeZone26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = timeZone26.getDisplayName(false, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GMT" + "'", str20, "GMT");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GMT" + "'", str24, "GMT");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u4e2d\u6587" + "'", str33, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u6587" + "'", str41, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(zoneId45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0:00:00.017", "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 89, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0I!                                                                                              ", 52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale4);
        java.lang.String str7 = locale1.getDisplayVariant(locale4);
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleKeys();
        java.util.Locale locale12 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale12.getLanguage();
        java.util.Locale locale15 = locale12.stripExtensions();
        java.lang.String str16 = locale4.getDisplayVariant(locale15);
        java.lang.String str17 = locale15.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "99.00:00:0" + "'", str6, "99.00:00:0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!ih" + "'", str14, "!ih");
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str17, "P0Y0M0DT0H0M0.034S");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S" + "'", str1, "'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("P0Y0M0DT0H0M0.032S", "ih", "!I");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.util.Locale locale1 = new java.util.Locale("en-GB");
        java.util.Locale.setDefault(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "en-gb");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("P-1Y11M30DT23H59M59.901S", "!ih!ih!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("44444444444444444444444444444444444444           HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444 HI!" + "'", str1, "44444444444444444444444444444444444444 HI!");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.util.Locale locale1 = new java.util.Locale("0:00:00.99");
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.util.Locale locale5 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str6 = locale2.getDisplayCountry(locale5);
        java.lang.String str7 = locale1.getDisplayScript(locale2);
        java.lang.String str8 = locale1.getDisplayCountry();
        java.lang.String str9 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "0:00:00.99");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.99" + "'", str9, "0:00:00.99");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("canada", "0 days 0 hours 0 minutes 0 seconds", "fR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "canada" + "'", str3, "canada");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("zh_TW", (int) 'u', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444", "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...chHeure de Gr...", "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale14);
        java.util.Locale.Builder builder17 = builder12.setLocale(locale14);
        java.lang.String str18 = locale11.getDisplayLanguage(locale14);
        java.lang.String str19 = locale11.getDisplayScript();
        java.util.Locale.Builder builder20 = builder8.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder20.setLanguage("anglais(Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: anglais(Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "99.00:00:0" + "'", str16, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("fR", "Engli0h (Unite0 120tate0)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "de_DEde_DEde_DEdeng");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("p0y0m0dt0h0m0.000s", "-gb");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p0y0m0dt0h0m0.000s" + "'", str2, "p0y0m0dt0h0m0.000s");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.util.Locale locale3 = new java.util.Locale("", "", "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.lang.Class<?> wildcardClass4 = locale3.getClass();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("Chine");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setExtension('#', "!I");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-GB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.990:00:00.99", 19, 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("undundun_0 DAYS 0 HOURS 0 MINUTES 0 SECONDSundundund", "\uad6d\uc911\uc5b4\uad6d\uc911sia\347narf)anihc( esenihc", "Chine0e");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("UN00UNUN_0 day32 0 0our32 0 0inute032 0 econdUN000UNUN", "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S", (int) (byte) 10, 89);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UN00UNUN_0_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S" + "'", str4, "UN00UNUN_0_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("deu", "0 0a00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "deu" + "'", str2, "deu");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI", "UN00UNUN_0_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0P0Y0M0DT0H0M0.020S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!" + "'", str2, "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        boolean boolean18 = timeZone6.observesDaylightTime();
        java.time.ZoneId zoneId19 = timeZone6.toZoneId();
        java.lang.String str20 = timeZone6.getID();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("");
        int int23 = timeZone22.getRawOffset();
        java.lang.String str24 = timeZone22.getID();
        int int25 = timeZone22.getRawOffset();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone("");
        java.lang.String str33 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone32);
        boolean boolean34 = timeZone32.observesDaylightTime();
        java.util.TimeZone timeZone40 = java.util.TimeZone.getTimeZone("");
        java.lang.String str41 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone40);
        boolean boolean42 = timeZone32.hasSameRules(timeZone40);
        boolean boolean43 = timeZone26.hasSameRules(timeZone32);
        boolean boolean44 = timeZone26.observesDaylightTime();
        java.time.ZoneId zoneId45 = timeZone26.toZoneId();
        boolean boolean46 = timeZone22.hasSameRules(timeZone26);
        boolean boolean47 = timeZone6.hasSameRules(timeZone26);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = timeZone6.getOffset((int) (byte) 10, 96, 32, 153, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GMT" + "'", str20, "GMT");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GMT" + "'", str24, "GMT");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u4e2d\u6587" + "'", str33, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u6587" + "'", str41, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(zoneId45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("          0I!          ", "P0Y0M0DT0H0M0.090S0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 ho");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          0I!" + "'", str2, "          0I!");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0:00:00.000", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            0:00:00.000" + "'", str2, "            0:00:00.000");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "zh_tw");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = timeZone1.inDaylightTime(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0 DAYS 0 HOURS 0 MINUTES 0 SECOND", 104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 4, (long) 18, "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY14 0 0OUR14 0 0INUTE14 0 ECOND)" + "'", str3, "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY14 0 0OUR14 0 0INUTE14 0 ECOND)");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Germany", (int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Germany" + "'", str3, "Germany");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\uc77c\ubcf8\uc5b4", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("Chine");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setExtension('4', "undundun_0 DAYS 0 HOURS 0 MINUTES 0 SECONDSundundund");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("dnu", (double) 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=63.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("p000000t00000.0230");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p000000t00000.0230" + "'", str1, "p000000t00000.0230");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("CA", 'u', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CA" + "'", str3, "CA");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("p0y000dt00000.0230");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=p0y000dt00000.0230");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "de");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category7, locale8);
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "Chinese (China)");
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale[] localeArray17 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList18 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList18, localeArray17);
        java.util.Locale locale20 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList18);
        java.util.Collection<java.util.Locale> localeCollection21 = null;
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList23 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, localeCollection21, filteringMode22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale[] localeArray27 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList28 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList28, localeArray27);
        java.util.Locale locale30 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList28);
        java.util.Locale.Category category31 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category31, locale32);
        java.util.Set<java.lang.String> strSet34 = locale32.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strSet34);
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strSet34, filteringMode36);
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList37);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode22.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertTrue("'" + category31 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category31.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode36.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("EN-GB", "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale.setDefault(category11, locale12);
        java.lang.String str14 = locale12.getVariant();
        java.util.Set<java.lang.String> strSet15 = locale12.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder16 = builder10.setLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.removeUnicodeLocaleAttribute("                                      hi!                                                 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                       hi!                                                  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Korean", "0 days");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("P0Y0-10DT07430-10.0343599900I!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=p0y0-10dt07430-10.0343599900i!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                     !i0", "de_DEde_DEde_DEdeng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                     !i0" + "'", str2, "                                                                                                                     !i0");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0e-DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0e-de" + "'", str1, "0e-de");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("fran\347ais", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais" + "'", str2, "fran\347ais");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0I!", 21, "0:00:00.100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.10I!0:00:00.1" + "'", str3, "0:00:00.10I!0:00:00.1");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                P0Y000DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("P0Y0M0DT0H0M0.068S", "", "danaC");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0 0a00", "!ih#######", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a00" + "'", str3, "0 0a00");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("de_dede_dede_dedeng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=de_dede_dede_dedeng");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("TE0", "...chHeure de Gr...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        int int8 = timeZone5.getOffset((long) 3);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444", "P0Y0M0DT0H0M0.020S", 19);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("danaC", "P-1Y11M30DT23H59M59.964S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0:00:00.100", "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("P0Y0M0DT0H0M0.032S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str1, "P0Y0M0DT0H0M0.032S");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00          0I!          0:00:00.0000:00:00.0000:00:00.0000:00:00.0000:00:", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        timeZone1.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("");
        int int8 = timeZone7.getRawOffset();
        java.lang.String str9 = timeZone7.getID();
        java.time.ZoneId zoneId10 = timeZone7.toZoneId();
        boolean boolean11 = timeZone1.hasSameRules(timeZone7);
        timeZone1.setID("\u6cd5\u6587\u6cd5\u56fd)");
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int16 = timeZone15.getRawOffset();
        boolean boolean17 = timeZone1.hasSameRules(timeZone15);
        java.lang.String str18 = timeZone15.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GMT" + "'", str9, "GMT");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Greenwich Mean Time" + "'", str18, "Greenwich Mean Time");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguage("EN-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: EN-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.lang.String[] strArray1 = java.util.Locale.getISOLanguages();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', (int) 'a', (int) '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("TE0", (java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaTE0abTE0aeTE0afTE0akTE0amTE0anTE0arTE0asTE0avTE0ayTE0azTE0baTE0beTE0bgTE0bhTE0biTE0bmTE0bnTE0boTE0brTE0bsTE0caTE0ceTE0chTE0coTE0crTE0csTE0cuTE0cvTE0cyTE0daTE0deTE0dvTE0dzTE0eeTE0elTE0enTE0eoTE0esTE0etTE0euTE0faTE0ffTE0fiTE0fjTE0foTE0frTE0fyTE0gaTE0gdTE0glTE0gnTE0guTE0gvTE0haTE0heTE0hiTE0hoTE0hrTE0htTE0huTE0hyTE0hzTE0iaTE0idTE0ieTE0igTE0iiTE0ikTE0inTE0ioTE0isTE0itTE0iuTE0iwTE0jaTE0jiTE0jvTE0kaTE0kgTE0kiTE0kjTE0kkTE0klTE0kmTE0knTE0koTE0krTE0ksTE0kuTE0kvTE0kwTE0kyTE0laTE0lbTE0lgTE0liTE0lnTE0loTE0ltTE0luTE0lvTE0mgTE0mhTE0miTE0mkTE0mlTE0mnTE0moTE0mrTE0msTE0mtTE0myTE0naTE0nbTE0ndTE0neTE0ngTE0nlTE0nnTE0noTE0nrTE0nvTE0nyTE0ocTE0ojTE0omTE0orTE0osTE0paTE0piTE0plTE0psTE0ptTE0quTE0rmTE0rnTE0roTE0ruTE0rwTE0saTE0scTE0sdTE0seTE0sgTE0siTE0skTE0slTE0smTE0snTE0soTE0sqTE0srTE0ssTE0stTE0suTE0svTE0swTE0taTE0teTE0tgTE0thTE0tiTE0tkTE0tlTE0tnTE0toTE0trTE0tsTE0ttTE0twTE0tyTE0ugTE0ukTE0urTE0uzTE0veTE0viTE0voTE0waTE0woTE0xhTE0yiTE0yoTE0zaTE0zhTE0zu" + "'", str6, "aaTE0abTE0aeTE0afTE0akTE0amTE0anTE0arTE0asTE0avTE0ayTE0azTE0baTE0beTE0bgTE0bhTE0biTE0bmTE0bnTE0boTE0brTE0bsTE0caTE0ceTE0chTE0coTE0crTE0csTE0cuTE0cvTE0cyTE0daTE0deTE0dvTE0dzTE0eeTE0elTE0enTE0eoTE0esTE0etTE0euTE0faTE0ffTE0fiTE0fjTE0foTE0frTE0fyTE0gaTE0gdTE0glTE0gnTE0guTE0gvTE0haTE0heTE0hiTE0hoTE0hrTE0htTE0huTE0hyTE0hzTE0iaTE0idTE0ieTE0igTE0iiTE0ikTE0inTE0ioTE0isTE0itTE0iuTE0iwTE0jaTE0jiTE0jvTE0kaTE0kgTE0kiTE0kjTE0kkTE0klTE0kmTE0knTE0koTE0krTE0ksTE0kuTE0kvTE0kwTE0kyTE0laTE0lbTE0lgTE0liTE0lnTE0loTE0ltTE0luTE0lvTE0mgTE0mhTE0miTE0mkTE0mlTE0mnTE0moTE0mrTE0msTE0mtTE0myTE0naTE0nbTE0ndTE0neTE0ngTE0nlTE0nnTE0noTE0nrTE0nvTE0nyTE0ocTE0ojTE0omTE0orTE0osTE0paTE0piTE0plTE0psTE0ptTE0quTE0rmTE0rnTE0roTE0ruTE0rwTE0saTE0scTE0sdTE0seTE0sgTE0siTE0skTE0slTE0smTE0snTE0soTE0sqTE0srTE0ssTE0stTE0suTE0svTE0swTE0taTE0teTE0tgTE0thTE0tiTE0tkTE0tlTE0tnTE0toTE0trTE0tsTE0ttTE0twTE0tyTE0ugTE0ukTE0urTE0uzTE0veTE0viTE0voTE0waTE0woTE0xhTE0yiTE0yoTE0zaTE0zhTE0zu");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale9);
        java.lang.String str11 = locale7.getDisplayVariant(locale9);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale14.getDisplayName(locale16);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale7, locale12, locale14, locale18 };
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.Locale locale22 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap23);
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        java.lang.String str27 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale[] localeArray31 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList32 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList32, localeArray31);
        java.util.Locale locale34 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList32);
        java.util.Collection<java.util.Locale> localeCollection35 = null;
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList37 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, localeCollection35, filteringMode36);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList29, "!ih");
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Locale[] localeArray43 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.Locale locale46 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList44);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList41, 'a');
        java.util.Locale locale50 = new java.util.Locale("");
        java.lang.String str51 = locale50.getScript();
        java.util.Locale locale52 = java.util.Locale.CHINESE;
        java.util.Locale locale55 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale56 = java.util.Locale.ROOT;
        java.util.Locale.Category category57 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category57, locale58);
        java.util.Locale locale60 = java.util.Locale.CHINA;
        java.util.Locale locale61 = java.util.Locale.PRC;
        java.lang.String str62 = locale60.getDisplayLanguage(locale61);
        java.util.Locale locale63 = java.util.Locale.CHINA;
        java.util.Locale locale64 = java.util.Locale.PRC;
        java.util.Locale locale66 = java.util.Locale.GERMANY;
        java.lang.String str67 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale66);
        java.lang.String str68 = locale64.getDisplayVariant(locale66);
        java.util.Locale.Category category69 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale70 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category69, locale70);
        java.util.Locale locale72 = java.util.Locale.CHINESE;
        java.util.Locale locale73 = java.util.Locale.PRC;
        java.util.Locale locale75 = java.util.Locale.GERMANY;
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale75);
        java.lang.String str77 = locale73.getDisplayVariant(locale75);
        java.util.Locale locale78 = java.util.Locale.CHINA;
        java.util.Locale locale79 = java.util.Locale.ITALY;
        java.util.Locale locale80 = java.util.Locale.PRC;
        java.util.Locale locale82 = java.util.Locale.GERMANY;
        java.lang.String str83 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale82);
        java.lang.String str84 = locale80.getDisplayVariant(locale82);
        java.util.Locale locale85 = java.util.Locale.getDefault();
        java.util.Locale locale86 = java.util.Locale.ROOT;
        java.lang.String str87 = locale86.getLanguage();
        java.util.Locale locale88 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray89 = new java.util.Locale[] { locale50, locale52, locale55, locale56, locale58, locale61, locale63, locale64, locale70, locale72, locale73, locale78, locale79, locale80, locale85, locale86, locale88 };
        java.util.ArrayList<java.util.Locale> localeList90 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList90, localeArray89);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap95 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList96 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap95);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str17, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode36.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh");
        org.junit.Assert.assertEquals(locale55.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertTrue("'" + category57 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category57.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\u4e2d\u6587" + "'", str62, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + category69 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category69.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale70);
// flaky:         org.junit.Assert.assertEquals(locale70.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(locale85);
// flaky:         org.junit.Assert.assertEquals(locale85.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNotNull(languageRangeList96);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("HI!44444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!44444444444444444444444444444");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("CAN", "\u6cd5\u6587\u6cd5\u56fd)", "\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s", 19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CAN" + "'", str4, "CAN");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("                       44444444444444444444444444444W");
        java.lang.String str2 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("China");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "China" + "'", str1, "China");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("P0Y0M0DT0H0M0.000S", 24, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.000S444444" + "'", str3, "P0Y0M0DT0H0M0.000S444444");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0days0hours0minutes0seco");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                         ", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                hi!                                                 ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0days0hours0minutes0seco" + "'", str5, "0days0hours0minutes0seco");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("aaTE0abTE0aeTE0afTE0akTE0amTE0anTE0arTE0asTE0avTE0ayTE0azTE0baTE0beTE0bgTE0bhTE0biTE0bmTE0bnTE0boTE0brTE0bsTE0caTE0ceTE0chTE0coTE0crTE0csTE0cuTE0cvTE0cyTE0daTE0deTE0dvTE0dzTE0eeTE0elTE0enTE0eoTE0esTE0etTE0euTE0faTE0ffTE0fiTE0fjTE0foTE0frTE0fyTE0gaTE0gdTE0glTE0gnTE0guTE0gvTE0haTE0heTE0hiTE0hoTE0hrTE0htTE0huTE0hyTE0hzTE0iaTE0idTE0ieTE0igTE0iiTE0ikTE0inTE0ioTE0isTE0itTE0iuTE0iwTE0jaTE0jiTE0jvTE0kaTE0kgTE0kiTE0kjTE0kkTE0klTE0kmTE0knTE0koTE0krTE0ksTE0kuTE0kvTE0kwTE0kyTE0laTE0lbTE0lgTE0liTE0lnTE0loTE0ltTE0luTE0lvTE0mgTE0mhTE0miTE0mkTE0mlTE0mnTE0moTE0mrTE0msTE0mtTE0myTE0naTE0nbTE0ndTE0neTE0ngTE0nlTE0nnTE0noTE0nrTE0nvTE0nyTE0ocTE0ojTE0omTE0orTE0osTE0paTE0piTE0plTE0psTE0ptTE0quTE0rmTE0rnTE0roTE0ruTE0rwTE0saTE0scTE0sdTE0seTE0sgTE0siTE0skTE0slTE0smTE0snTE0soTE0sqTE0srTE0ssTE0stTE0suTE0svTE0swTE0taTE0teTE0tgTE0thTE0tiTE0tkTE0tlTE0tnTE0toTE0trTE0tsTE0ttTE0twTE0tyTE0ugTE0ukTE0urTE0uzTE0veTE0viTE0voTE0waTE0woTE0xhTE0yiTE0yoTE0zaTE0zhTE0zu");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=aate0abte0aete0afte0akte0amte0ante0arte0aste0avte0ayte0azte0bate0bete0bgte0bhte0bite0bmte0bnte0bote0brte0bste0cate0cete0chte0cote0crte0cste0cute0cvte0cyte0date0dete0dvte0dzte0eete0elte0ente0eote0este0ette0eute0fate0ffte0fite0fjte0fote0frte0fyte0gate0gdte0glte0gnte0gute0gvte0hate0hete0hite0hote0hrte0htte0hute0hyte0hzte0iate0idte0iete0igte0iite0ikte0inte0iote0iste0itte0iute0iwte0jate0jite0jvte0kate0kgte0kite0kjte0kkte0klte0kmte0knte0kote0krte0kste0kute0kvte0kwte0kyte0late0lbte0lgte0lite0lnte0lote0ltte0lute0lvte0mgte0mhte0mite0mkte0mlte0mnte0mote0mrte0mste0mtte0myte0nate0nbte0ndte0nete0ngte0nlte0nnte0note0nrte0nvte0nyte0octe0ojte0omte0orte0oste0pate0pite0plte0pste0ptte0qute0rmte0rnte0rote0rute0rwte0sate0scte0sdte0sete0sgte0site0skte0slte0smte0snte0sote0sqte0srte0sste0stte0sute0svte0swte0tate0tete0tgte0thte0tite0tkte0tlte0tnte0tote0trte0tste0ttte0twte0tyte0ugte0ukte0urte0uzte0vete0vite0vote0wate0wote0xhte0yite0yote0zate0zhte0zu");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", (java.lang.Object[]) strArray8);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!44444444444444444444444444444", strArray16);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("", "", 100);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444", strArray16, strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("'P'yyyy''''d''''m''s.''", strArray8, strArray16);
        boolean boolean24 = locale1.equals((java.lang.Object) strArray16);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!44444444444444444444444444444" + "'", str10, "HI!44444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str22, "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'P'yyyy''''d''''m''s.''" + "'", str23, "'P'yyyy''''d''''m''s.''");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (short) -1, 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\347\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str4, "Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\347\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!!ih!ih!...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587!ih!ih!i" + "'", str2, "\u4e2d\u6587!ih!ih!i");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                     !I0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!I0" + "'", str1, "!I0");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("OURS 0 MI", 0, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0e_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY4 0 0OUR4 0 0INUTE04 0 ECOND)", "!ih#######");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("P0Y0M0DT0H0M0.001S");
        java.lang.String str2 = timeZone1.getID();
        boolean boolean3 = timeZone1.observesDaylightTime();
        int int5 = timeZone1.getOffset((long) 10);
        java.lang.String str6 = timeZone1.getID();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GMT" + "'", str6, "GMT");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("!IH#####################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH#####################################################################################################################" + "'", str1, "!IH#####################################################################################################################");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale2.getISO3Country();
        java.util.Set<java.lang.Character> charSet5 = locale2.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 41, (long) 52, "tes", false, timeZone5);
        boolean boolean8 = timeZone5.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "te0" + "'", str7, "te0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("P-1Y11M30DT23H59M59.964S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S469.95M95H32TD03M11Y1-P" + "'", str1, "S469.95M95H32TD03M11Y1-P");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 97);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.097" + "'", str1, "0:00:00.097");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("x", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x" + "'", str3, "x");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Chine0e", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "P-1Y11M30DT23H59M59.901S");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "fran\347ais");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("CA", "en-CA", "P0Y0M0DT0H0M0.010S");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                      hi!                                                 ", "-GB");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        int int16 = timeZone13.getRawOffset();
        int int17 = timeZone13.getRawOffset();
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) ' ', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!" + "'", str1, "eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.util.Locale locale2 = new java.util.Locale("", "444444444444444444444444444444444444444444444444444444444de_DE4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals(locale2.toString(), "_444444444444444444444444444444444444444444444444444444444DE_DE4444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Chine", 18, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("P0Y0M0DT0H0M0.031S", "0 DAYS 0 HOURS 0 MINUTES 0 SECO");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ", "p0y0m0dt0h0m0.000s");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("FR", "                                                                                                                              !I0                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "Royaume-Uni");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR" + "'", str3, "FR");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("0e-DE", "DE", "0:00:00.017", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0e-0:00:00.017" + "'", str4, "0e-0:00:00.017");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("fran\347ais", "w");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.UK;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.lang.String str5 = locale4.getScript();
        java.util.Set<java.lang.Character> charSet6 = locale4.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        char[] charArray11 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "de-DE", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("\u4e2d\u6587", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "c#n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str1, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!IH#####################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH#####################################################################################################################" + "'", str1, "!IH#####################################################################################################################");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("S469.95M95H32TD03M11Y1-P", (int) (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "S469.95M95H32TD03M11Y1-P" + "'", str3, "S469.95M95H32TD03M11Y1-P");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("anglais (Canada)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais (Canada)" + "'", str1, "anglais (Canada)");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("99.00:00:0", "x");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("United States", strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("99.00:00:0", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...chHeure de Gr...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...chHeure de Gr...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...chHeure de Gr...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ZH_TW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0320.000000I!                                                                                              ", "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S                        ", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444" + "'", str3, "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.util.Locale locale2 = new java.util.Locale("0:00:00.000", "zh_TW");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.setDefault(locale4);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.lang.String str8 = locale6.getDisplayLanguage(locale7);
        java.lang.String str9 = locale4.getDisplayLanguage(locale7);
        java.lang.String str10 = locale2.getDisplayVariant(locale7);
        java.lang.String str11 = locale2.getLanguage();
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet14 = locale12.getExtensionKeys();
        java.lang.String str15 = locale12.getISO3Language();
        boolean boolean16 = locale2.equals((java.lang.Object) str15);
        org.junit.Assert.assertEquals(locale2.toString(), "0:00:00.000_ZH_TW");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fra" + "'", str15, "fra");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "France");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY14 0 0OUR14 0 0INUTE14 0 ECOND)", (int) '4', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0I!", "0e-de");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0e-DE", (-1), 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0e-DE" + "'", str3, "0e-DE");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "zh_44444444444444444444444444444zh_");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 8, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("-GB", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GB" + "'", str2, "GB");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("   ...M0.001S    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0:00:00.99");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.99" + "'", str1, "0:00:00.99");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.99" + "'", str1, "0:00:00.99");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0 DAYS 0 HOURS 0 MINUTES 0 SECO", (int) (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0:00:00.017", "zho");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.017" + "'", str2, "0:00:00.017");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\u6cd5\u6587\u6cd5\u56fd)", "!IH#####################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str2, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" und ", "          0I!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "               zh              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               zh              " + "'", str1, "               zh              ");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "P0Y0-10DT07430-10.0343599900", "aaxabxaexafxakxamxanxarxasxavxayxazxbaxbexbgxbhxbixbmxbnxboxbrxbsxcaxcexchxcoxcrxcsxcuxcvxcyxdaxdexdvxdzxeexelxenxeoxesxetxeuxfaxffxfixfjxfoxfrxfyxgaxgdxglxgnxguxgvxhaxhexhixhoxhrxhtxhuxhyxhzxiaxidxiexigxiixikxinxioxisxitxiuxiwxjaxjixjvxkaxkgxkixkjxkkxklxkmxknxkoxkrxksxkuxkvxkwxkyxlaxlbxlgxlixlnxloxltxluxlvxmgxmhxmixmkxmlxmnxmoxmrxmsxmtxmyxnaxnbxndxnexngxnlxnnxnoxnrxnvxnyxocxojxomxorxosxpaxpixplxpsxptxquxrmxrnxroxruxrwxsaxscxsdxsexsgxsixskxslxsmxsnxsoxsqxsrxssxstxsuxsvxswxtaxtextgxthxtixtkxtlxtnxtoxtrxtsxttxtwxtyxugxukxurxuzxvexvixvoxwaxwoxxhxyixyoxzaxzhxzu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "un00unun_0 DAY32 0 0OUR32 0 0INUTE032 0 ECONDun000unun");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("en-CA", "p0y000dt00000.0230");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale4);
        java.lang.String str7 = locale1.getDisplayVariant(locale4);
        java.lang.String[] strArray9 = java.util.Locale.getISOCountries();
        java.lang.String[] strArray10 = null;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("99.00:00:0", strArray9, strArray10);
        boolean boolean12 = locale4.equals((java.lang.Object) "99.00:00:0");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "99.00:00:0" + "'", str6, "99.00:00:0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "99.00:00:0" + "'", str11, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaGreenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.util.Locale locale1 = java.util.Locale.UK;
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category2, locale3);
        java.lang.String str5 = locale3.getLanguage();
        java.lang.String str6 = locale1.getDisplayScript(locale3);
        java.util.Set<java.lang.String> strSet7 = locale3.getUnicodeLocaleKeys();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale3);
        java.util.Set<java.lang.Character> charSet9 = locale3.getExtensionKeys();
        java.lang.String str11 = locale3.getExtension('a');
        java.lang.String str12 = locale3.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str8, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u6cd5\u6587\u6cd5\u56fd)", 'x');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####################################################################################################################", "0 days 0 hours 0 minutes 0 seconds", (int) '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("                       44444444444444444444444444444", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                       44444444444444444444444444444" + "'", str8, "                       44444444444444444444444444444");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("-gb");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-gb" + "'", str1, "-gb");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "fran\347\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.121S" + "'", str2, "P0Y0M0DT0H0M0.121S");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)", "44444444444444444444444444444444444444           HI!", "te0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)" + "'", str3, "de_zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("P0Y0M0DT0H0M0.121S", "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("te0");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setUnicodeLocaleKeyword("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu" + "'", str1, "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("danac", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       danac                        " + "'", str2, "                       danac                        ");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                         ", 120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category7, locale8);
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "Chinese (China)");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, "P0Y0M0DT0H0M0.020S");
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale[] localeArray19 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.Locale locale22 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList20);
        java.util.Collection<java.util.Locale> localeCollection23 = null;
        java.util.Locale.FilteringMode filteringMode24 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, localeCollection23, filteringMode24);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList17, "!ih");
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Locale[] localeArray31 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList32 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList32, localeArray31);
        java.util.Locale locale34 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList32);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList29, 'a');
        java.util.Locale locale38 = new java.util.Locale("");
        java.lang.String str39 = locale38.getScript();
        java.util.Locale locale40 = java.util.Locale.CHINESE;
        java.util.Locale locale43 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale44 = java.util.Locale.ROOT;
        java.util.Locale.Category category45 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category45, locale46);
        java.util.Locale locale48 = java.util.Locale.CHINA;
        java.util.Locale locale49 = java.util.Locale.PRC;
        java.lang.String str50 = locale48.getDisplayLanguage(locale49);
        java.util.Locale locale51 = java.util.Locale.CHINA;
        java.util.Locale locale52 = java.util.Locale.PRC;
        java.util.Locale locale54 = java.util.Locale.GERMANY;
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale54);
        java.lang.String str56 = locale52.getDisplayVariant(locale54);
        java.util.Locale.Category category57 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category57, locale58);
        java.util.Locale locale60 = java.util.Locale.CHINESE;
        java.util.Locale locale61 = java.util.Locale.PRC;
        java.util.Locale locale63 = java.util.Locale.GERMANY;
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale63);
        java.lang.String str65 = locale61.getDisplayVariant(locale63);
        java.util.Locale locale66 = java.util.Locale.CHINA;
        java.util.Locale locale67 = java.util.Locale.ITALY;
        java.util.Locale locale68 = java.util.Locale.PRC;
        java.util.Locale locale70 = java.util.Locale.GERMANY;
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale70);
        java.lang.String str72 = locale68.getDisplayVariant(locale70);
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.util.Locale locale74 = java.util.Locale.ROOT;
        java.lang.String str75 = locale74.getLanguage();
        java.util.Locale locale76 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale38, locale40, locale43, locale44, locale46, locale49, locale51, locale52, locale58, locale60, locale61, locale66, locale67, locale68, locale73, locale74, locale76 };
        java.util.ArrayList<java.util.Locale> localeList78 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList78, localeArray77);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList81);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode24.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh");
        org.junit.Assert.assertEquals(locale43.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertTrue("'" + category45 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category45.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u4e2d\u6587" + "'", str50, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + category57 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category57.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNotNull(localeList82);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("de", "HI!44444444444444444444444444444", "ENGLISH (UNITED STATES)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (short) -1, "HI!                          ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("#####################################################################################################################", "zh_44444444444444444444444444444zh_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "\uc911\uad6d\uc5b4\uc911\uad6d)", 42);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i" + "'", str3, "\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.002" + "'", str1, "0:00:00.002");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-GB", "P0Y0M0DT0H0M0.097S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("en", "0I!                                                                                              ", "", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("chinois", "                                                P0Y000DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'" + "'", str1, "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                     !i0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setScript("4444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 4444444444444444444444444444444444444444444444444444 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!44444444444444444444444444444", 31, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!44444444444444444444444444444" + "'", str3, "HI!44444444444444444444444444444");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ja");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale.Builder builder10 = builder5.setLanguage("France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("de_dede_dede_dedeng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: de_dede_dede_dedeng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("");
        int int18 = timeZone17.getRawOffset();
        java.lang.String str19 = timeZone17.getID();
        int int20 = timeZone17.getRawOffset();
        boolean boolean21 = timeZone5.hasSameRules(timeZone17);
        int int23 = timeZone5.getOffset((long) (short) 10);
        int int24 = timeZone5.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GMT" + "'", str19, "GMT");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\uad6d\uc911\uc5b4\uad6d\uc911", "...chHeure de Gr...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazh_TWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category3, locale4);
        java.lang.String str6 = locale4.getLanguage();
        java.lang.String str7 = locale2.getDisplayScript(locale4);
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleKeys();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("0 DAYS 0 HOURS 0 MINUTES 0 SECONDS", locale4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", locale4);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS" + "'", str9, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str10, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa", "-GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!ih!ih!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                hi!                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("44444444444444444444444444444444444444           HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale.Builder builder10 = builder5.setLanguage("France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder5.setScript("                zh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                 zh [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int2 = timeZone1.getRawOffset();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("");
        int int5 = timeZone4.getRawOffset();
        int int6 = timeZone4.getRawOffset();
        timeZone4.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("");
        int int11 = timeZone10.getRawOffset();
        java.lang.String str12 = timeZone10.getID();
        java.time.ZoneId zoneId13 = timeZone10.toZoneId();
        boolean boolean14 = timeZone4.hasSameRules(timeZone10);
        boolean boolean15 = timeZone10.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone10);
        boolean boolean17 = timeZone1.hasSameRules(timeZone10);
        boolean boolean18 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GMT" + "'", str12, "GMT");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = timeZone6.getDisplayName(true, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", '#');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0 seconds", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                    " + "'", str5, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0:00:00.010", "p000000t00000.0230");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        char[] charArray6 = new char[] { '4', '#' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "'P'yyyy''''d''''m''s.''", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("#######P0Y0M0DT0H0M0.000S#######", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy''''d''''m''s.''", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 3, (long) 4, "Chinese(China)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chine0e(China)" + "'", str3, "Chine0e(China)");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\u683c\u6797\u5a01\u6cbb\u6642\u9593", "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        int int6 = timeZone5.getRawOffset();
        java.lang.String str7 = timeZone5.getID();
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.lang.String str9 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "\u6cd5\u6587\u6cd5\u56fd)", false, timeZone5);
        timeZone5.setRawOffset((int) 'a');
        int int13 = timeZone5.getOffset((long) (-1));
        java.lang.String str14 = timeZone5.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str9, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Heure de Greenwich" + "'", str14, "Heure de Greenwich");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.util.Locale locale1 = new java.util.Locale("P0Y0M0DT0H0M0.023S");
        org.junit.Assert.assertEquals(locale1.toString(), "p0y0m0dt0h0m0.023s");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("#####################################################################################################################", "Chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################################################" + "'", str2, "#####################################################################################################################");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u6cd5\u6587\u6cd5\u56fd)", "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("fr_FR", "0e-de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr_FR" + "'", str2, "fr_FR");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str1, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("en-GB", "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Greenwich Mean Time" + "'", str2, "Greenwich Mean Time");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("");
        int int24 = timeZone23.getRawOffset();
        java.lang.String str25 = timeZone23.getID();
        java.time.ZoneId zoneId26 = timeZone23.toZoneId();
        java.lang.String str27 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "\u6cd5\u6587\u6cd5\u56fd)", false, timeZone23);
        boolean boolean28 = timeZone0.hasSameRules(timeZone23);
        timeZone0.setRawOffset((int) '#');
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GMT" + "'", str25, "GMT");
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str27, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("de_zh_tw (P0Y0-10DT07430-10.0343", "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str2, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("fran\347ais", "United Kingdom", "P0Y0M0DT0H0M0.001S", 11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fran\347ais" + "'", str4, "fran\347ais");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("danaC", "P0Y0M0DT0H0M0.032S");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationISO((long) 14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.014S" + "'", str1, "P0Y0M0DT0H0M0.014S");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "44444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                    !I0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!I0" + "'", str1, "!I0");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!ih#######", "0 days");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(96);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!ih!ih!...", "danac", "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih#######", "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                                                                                    ", (int) 'u');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder0.setLanguage("");
        java.util.Locale.Builder builder10 = builder7.setExtension('x', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setScript("P-1Y11M30DT23H59M59.901S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: P-1Y11M30DT23H59M59.901S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\uad6d\uc911\uc5b4\uad6d\uc911", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\u4e2d\u6587\u4e2d\u56fd)", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("eneneneneneneneneneneneneneneneneHI!HI!HI!ihHI!HI!HI", "fR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("P0Y0M0DT0H0M0.023S", "#####################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.023S" + "'", str2, "P0Y0M0DT0H0M0.023S");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i", "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i" + "'", str2, "\uc911\uad6d\uc5b4\uc911\uad6d)!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#######P0Y0M0DT0H0M0.000S#######", "p0y0m0dt0h0m0.090s", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("p0y0m0dt0h0m0.000s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=p0y0m0dt0h0m0.000s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("        zh", "P0Y0-10DT07430-10.0323599998", (int) 'x');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("P0Y000DT00000.0230", 32, (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(336);
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int2 = timeZone1.getRawOffset();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("");
        int int5 = timeZone4.getRawOffset();
        int int6 = timeZone4.getRawOffset();
        timeZone4.setID("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("");
        int int11 = timeZone10.getRawOffset();
        java.lang.String str12 = timeZone10.getID();
        java.time.ZoneId zoneId13 = timeZone10.toZoneId();
        boolean boolean14 = timeZone4.hasSameRules(timeZone10);
        boolean boolean15 = timeZone10.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone10);
        boolean boolean17 = timeZone1.hasSameRules(timeZone10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = timeZone1.getOffset(52, (int) (byte) 0, 0, 2, 32, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GMT" + "'", str12, "GMT");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("c#n", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c#n" + "'", str2, "c#n");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                              !I0                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 224 + "'", int1 == 224);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "P0Y000DT00000.0230");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                              !I0                                      P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "P-1Y11M30DT23H59M59.901S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int10 = timeZone9.getRawOffset();
        java.lang.String str11 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.023S", false, timeZone9);
        java.lang.String str12 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 'x', "CAN", true, timeZone9);
        java.time.ZoneId zoneId13 = timeZone9.toZoneId();
        int int15 = timeZone9.getOffset((long) (short) 100);
        int int16 = timeZone9.getRawOffset();
        java.lang.String str17 = timeZone9.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y000DT00000.0230" + "'", str11, "P0Y000DT00000.0230");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CAN" + "'", str12, "CAN");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Heure de Greenwich" + "'", str17, "Heure de Greenwich");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.time.ZoneId zoneId16 = timeZone13.toZoneId();
        timeZone13.setRawOffset(224);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(zoneId16);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) " I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon" + "'", str1, "0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 seconds0 days 0 hours 0 minutes 0 secon");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\u4e2d\u6587!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ip0y0m0dt0h0m0.090s", "hi!#######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444zh_tw");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                     !i0", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("x", "0 days 0 hours 0 minutes 0 seconds                                                                  ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0I!", "P0Y0M0DT0H0M0.031S", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("p0y0m0dt0h0m0.020s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=p0y0m0dt0h0m0.020s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("de_zh_tw (P0Y0-10DT07430-10.0343");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=de_zh_tw(p0y0-10dt07430-10.0343");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ih");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale[] localeArray9 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.Locale locale12 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList7, 'a');
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getScript();
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.util.Locale locale21 = new java.util.Locale("", "0 days 0 hours 0 minutes 0 seconds");
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.util.Locale.Category category23 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category23, locale24);
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.util.Locale locale27 = java.util.Locale.PRC;
        java.lang.String str28 = locale26.getDisplayLanguage(locale27);
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.util.Locale locale30 = java.util.Locale.PRC;
        java.util.Locale locale32 = java.util.Locale.GERMANY;
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale32);
        java.lang.String str34 = locale30.getDisplayVariant(locale32);
        java.util.Locale.Category category35 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category35, locale36);
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.util.Locale locale39 = java.util.Locale.PRC;
        java.util.Locale locale41 = java.util.Locale.GERMANY;
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale41);
        java.lang.String str43 = locale39.getDisplayVariant(locale41);
        java.util.Locale locale44 = java.util.Locale.CHINA;
        java.util.Locale locale45 = java.util.Locale.ITALY;
        java.util.Locale locale46 = java.util.Locale.PRC;
        java.util.Locale locale48 = java.util.Locale.GERMANY;
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale48);
        java.lang.String str50 = locale46.getDisplayVariant(locale48);
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.util.Locale locale52 = java.util.Locale.ROOT;
        java.lang.String str53 = locale52.getLanguage();
        java.util.Locale locale54 = java.util.Locale.GERMANY;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale16, locale18, locale21, locale22, locale24, locale27, locale29, locale30, locale36, locale38, locale39, locale44, locale45, locale46, locale51, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale locale59 = java.util.Locale.UK;
        java.util.Locale.Category category60 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale61 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category60, locale61);
        java.lang.String str63 = locale61.getLanguage();
        java.lang.String str64 = locale59.getDisplayScript(locale61);
        java.util.Set<java.lang.String> strSet65 = locale61.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet65);
        boolean boolean67 = languageRange1.equals((java.lang.Object) languageRangeList7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih" + "'", str2, "ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih" + "'", str3, "ih");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ih" + "'", str5, "ih");
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertEquals(locale21.toString(), "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category23.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u6587" + "'", str28, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + category35 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category35.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "de_DE");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category60 + "' != '" + java.util.Locale.Category.FORMAT + "'", category60.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "en" + "'", str63, "en");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("p0y0m0dt0h0m0.000s", "0e-0:00:00.017");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.lang.Class<?> wildcardClass1 = filteringMode0.getClass();
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "P0Y0M0DT0H0M0.031S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444P-1Y11M30DT23H59M59.990S");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          0I!", "dnu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("               zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ", 'a', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               " + "'", str3, "               zh_tw (P0Y0-10DT07430-10.0343599900,0 DAYS 0 HOURS 0 MINUTES 0 SECOND)               ");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setLanguage("...ch0eure 0e Gr...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ...ch0eure 0e Gr... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "china");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        java.lang.String str2 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Heure de Greenwich" + "'", str2, "Heure de Greenwich");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u4e2d\u6587\u4e2d\u56fd)", "Engli0h (Unite0 120tate0)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("W", "CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO", 11, "0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("P-1Y11M30DT23H59M59.975S", "Korean");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        int int2 = timeZone1.getRawOffset();
        int int3 = timeZone1.getRawOffset();
        int int4 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale9);
        java.lang.String str11 = locale7.getDisplayVariant(locale9);
        java.util.Locale.Category category12 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category12, locale13);
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleKeys();
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.lang.String str20 = locale18.getDisplayLanguage();
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale25.getDisplayVariant();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = locale27.getDisplayLanguage();
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleKeys();
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.lang.String str33 = locale30.getDisplayName(locale32);
        java.lang.String str34 = locale32.getCountry();
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale9, locale13, locale16, locale18, locale21, locale23, locale24, locale25, locale27, locale32 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList36, filteringMode38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Locale[] localeArray43 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.Locale locale46 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.Locale locale47 = java.util.Locale.PRC;
        java.util.Locale locale49 = java.util.Locale.GERMANY;
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale49);
        java.lang.String str51 = locale47.getDisplayVariant(locale49);
        java.util.Locale.Category category52 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category52, locale53);
        java.util.Set<java.lang.String> strSet55 = locale53.getUnicodeLocaleKeys();
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleKeys();
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.util.Locale locale59 = locale58.stripExtensions();
        java.lang.String str60 = locale58.getDisplayLanguage();
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.util.Locale locale62 = locale61.stripExtensions();
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.util.Locale locale64 = java.util.Locale.TAIWAN;
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale65.getDisplayVariant();
        java.util.Locale locale67 = java.util.Locale.CHINA;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.lang.String str69 = locale67.getDisplayLanguage();
        java.util.Locale locale70 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet71 = locale70.getUnicodeLocaleKeys();
        java.util.Locale locale72 = java.util.Locale.CHINESE;
        java.lang.String str73 = locale70.getDisplayName(locale72);
        java.lang.String str74 = locale72.getCountry();
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale49, locale53, locale56, locale58, locale61, locale63, locale64, locale65, locale67, locale72 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList76, filteringMode78);
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList76, filteringMode80);
        java.lang.Class<?> wildcardClass82 = languageRangeList1.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category12.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chinois" + "'", str20, "chinois");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "chinois" + "'", str29, "chinois");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str33, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + category52 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category52.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "chinois" + "'", str60, "chinois");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "chinois" + "'", str69, "chinois");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str73, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertTrue("'" + filteringMode80 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode80.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Chine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "hine0euuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "####################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str3, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.lang.String str4 = locale3.getLanguage();
        java.lang.String str5 = locale3.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS_0 DAYS 0 HOURS 0 MINUTES 0 SECONDS");
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!#######", strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.concatWith("\u4e2d\u570b", (java.lang.Object[]) strArray16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.concatWith("0days0hours0minutes0seco", (java.lang.Object[]) strArray16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str18, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str19, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y0M0DT0H0M0.034Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("EN-GB", "canada");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("!I", (double) 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=96.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("zh_CN", 63, "zho");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz" + "'", str3, "zh_CNzhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhoz");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("anglais (Canada)", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "UNITED STATES");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uNITED STATES" + "'", str1, "uNITED STATES");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaGreenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaGreenwich Mean Time" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaGreenwich Mean Time");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                P0Y000DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153" + "'", str2, "00DT00000.090153hiP0Y000DT00000.090153!P0Y000DT00000.090153");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale9);
        java.lang.String str11 = locale7.getDisplayVariant(locale9);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale14.getDisplayName(locale16);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale7, locale12, locale14, locale18 };
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.Locale locale22 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList24, strMap25);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale.Category category30 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category30, locale31);
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strSet33);
        java.lang.String str35 = java.util.Locale.lookupTag(languageRangeList24, (java.util.Collection<java.lang.String>) strList34);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str17, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category30.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd))" + "'", str1, "\u6cd5\u6587\u6cd5\u56fd))");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("P00-1Y11M30DT23H59M59.991S", "\uad6d\uc911\uc5b4\uad6d\uc911sia\347narf)anihc( esenihc", "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "H!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 DAYS 0 HOURS 0 MINUTES 0 SECOND" + "'", str1, "0 DAYS 0 HOURS 0 MINUTES 0 SECOND");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("fr_FR", "United States", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Africa/AbidjanAfrica/AccraAfrica/BamakoAfrica/BanjulAfrica/BissauAfrica/CasablancaAfrica/ConakryAfrica/DakarAfrica/El_AaiunAfrica/FreetownAfrica/LomeAfrica/MonroviaAfrica/NouakchottAfrica/OuagadougouAfrica/Sao_TomeAfrica/TimbuktuAmerica/DanmarkshavnAntarctica/TrollAtlantic/CanaryAtlantic/FaeroeAtlantic/FaroeAtlantic/MadeiraAtlantic/ReykjavikAtlantic/St_HelenaEireEtc/GMTEtc/GMT+0Etc/GMT-0Etc/GMT0Etc/GreenwichEtc/UCTEtc/UTCEtc/UniversalEtc/ZuluEurope/BelfastEurope/DublinEurope/GuernseyEurope/Isle_of_ManEurope/JerseyEurope/LisbonEurope/LondonGBGB-EireGMTGMT0GreenwichIcelandPortugalUCTUTCUniversalWETZulu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Locale.setDefault(category10, locale11);
        java.util.Locale locale13 = java.util.Locale.getDefault(category10);
        java.util.Locale locale14 = java.util.Locale.getDefault(category10);
        java.util.Locale.setDefault(category0, locale14);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale16.getDisplayLanguage(locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "99.00:00:0" + "'", str8, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        char[] charArray11 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "               zh               ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0days0hours0minutes0seco", (java.lang.CharSequence) "p-1Y11M30DT23H59M59.975S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                       danac                        ", (int) 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         danac                                                          " + "'", str2, "                                                         danac                                                          ");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.addUnicodeLocaleAttribute("               zh               ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                zh                [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!44444444444444444444444444444", '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!                                                                                              ", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                       44444444444444444444444444444W", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\u4e2d\u570b", "UNITED STATES");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u570b" + "'", str2, "\u4e2d\u570b");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        boolean boolean5 = locale2.hasExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("eng", locale2);
        java.lang.String str7 = locale2.toLanguageTag();
        java.util.Locale locale11 = new java.util.Locale("!IH", "P0Y0M0DT0H0M0.034S", "\u6cd5\u6587\u6cd5\u56fd)");
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.lang.String str13 = locale11.getLanguage();
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale15);
        boolean boolean18 = locale15.hasExtensions();
        java.util.Set<java.lang.String> strSet19 = locale15.getUnicodeLocaleKeys();
        java.lang.String str20 = locale11.getDisplayCountry(locale15);
        java.util.Locale.Category category21 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category21, locale22);
        java.lang.String str24 = locale15.getDisplayScript(locale22);
        java.lang.String str25 = locale22.getISO3Country();
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale locale27 = builder26.build();
        java.util.Locale.setDefault(locale27);
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.util.Locale locale30 = java.util.Locale.PRC;
        java.lang.String str31 = locale29.getDisplayLanguage(locale30);
        java.lang.String str32 = locale27.getDisplayLanguage(locale30);
        java.lang.String str33 = locale30.getISO3Language();
        java.util.Locale locale36 = new java.util.Locale("!I0", "P0Y0M0DT0H0M0.034S");
        java.lang.String str37 = locale30.getDisplayVariant(locale36);
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale locale39 = builder38.build();
        java.util.Locale locale40 = builder38.build();
        java.util.Locale.Builder builder41 = builder38.clear();
        java.util.Locale.Builder builder42 = builder41.clearExtensions();
        java.util.Locale.Builder builder43 = builder42.clear();
        java.util.Locale locale44 = builder43.build();
        java.lang.String str45 = locale30.getDisplayScript(locale44);
        java.lang.String str46 = locale30.getDisplayScript();
        java.lang.String str47 = locale22.getDisplayScript(locale30);
        java.util.Set<java.lang.String> strSet48 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str49 = locale2.getDisplayName(locale22);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ENG" + "'", str6, "ENG");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!ih" + "'", str13, "!ih");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "99.00:00:0" + "'", str17, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str20, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.FORMAT + "'", category21.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CAN" + "'", str25, "CAN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u6587" + "'", str31, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zho" + "'", str33, "zho");
        org.junit.Assert.assertEquals(locale36.toString(), "!i0_P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Chinese (China)" + "'", str49, "Chinese (China)");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("P0Y000DT00000.0230", "0:00:00.99");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("");
        int int18 = timeZone17.getRawOffset();
        java.lang.String str19 = timeZone17.getID();
        int int20 = timeZone17.getRawOffset();
        boolean boolean21 = timeZone5.hasSameRules(timeZone17);
        timeZone17.setID("...chHeure de Gr...");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GMT" + "'", str19, "GMT");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("danac", "GMT+00:00", 2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("TE0", "aa ab ae af ak am an ar as av ay az ba be bg bh bi bm bn bo br bs ca ce ch co cr cs cu cv cy da de dv dz ee el en eo es et eu fa ff fi fj fo fr fy ga gd gl gn gu gv ha he hi ho hr ht hu hy hz ia id ie ig ii ik in io is it iu iw ja ji jv ka kg ki kj kk kl km kn ko kr ks ku kv kw ky la lb lg li ln lo lt lu lv mg mh mi mk ml mn mo mr ms mt my na nb nd ne ng nl nn no nr nv ny oc oj om or os pa pi pl ps pt qu rm rn ro ru rw sa sc sd se sg si sk sl sm sn so sq sr ss st su sv sw ta te tg th ti tk tl tn to tr ts tt tw ty ug uk ur uz ve vi vo wa wo #h yi yo za zh zu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("GB", 100, "P0Y0M0DT0H0M0.001S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GBP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT" + "'", str3, "GBP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT0H0M0.001SP0Y0M0DT");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!                          ...", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaap0y0m0dt0h0m0.034saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "p-1Y11M30DT23H59M59.975S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "           HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setUnicodeLocaleKeyword("-gb", "0danaC:danaC00danaC:danaC00danaC.danaC097");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: -gb [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND" + "'", str2, "_0 DAY10 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND_0 DAY 0 0OUR10 0 0INUTE10 0 ECOND");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("English (United Kingdom)", "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'nglish (United Kingdom)" + "'", str4, "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'nglish (United Kingdom)");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\u683c\u6797\u5a01\u6cbb\u6642\u9593");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u6642\u9593" + "'", str1, "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale1);
        boolean boolean4 = locale1.hasExtensions();
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.UK;
        java.util.Locale.setDefault(category6, locale7);
        java.lang.String str9 = locale7.getVariant();
        java.lang.String str10 = locale7.toLanguageTag();
        java.util.Set<java.lang.Character> charSet11 = locale7.getExtensionKeys();
        java.lang.String str12 = locale1.getDisplayCountry(locale7);
        java.lang.String str13 = locale7.getLanguage();
        java.lang.Object obj14 = locale7.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "99.00:00:0" + "'", str3, "99.00:00:0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-GB" + "'", str10, "en-GB");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "en_GB");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u570b", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!I0", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!I0" + "'", str3, "!I0");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("                                ...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                                 ... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "xChinesischxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("zh_tw", "Germany", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_tw" + "'", str3, "zh_tw");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.lang.String str4 = locale1.getDisplayScript();
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.util.Locale locale8 = new java.util.Locale("\u4e2d\u6587", "                                                                                                    ");
        java.lang.String str9 = locale5.getDisplayCountry(locale8);
        java.lang.String str10 = locale1.getDisplayCountry(locale8);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals(locale8.toString(), "\u4e2d\u6587_                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...INUTES 0 SECOND)", "ihihtestestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm'ss's'", "4444444444444444P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\uc77c\ubcf8\uc5b4", "!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc77c\ubcf8\uc5b4" + "'", str2, "\uc77c\ubcf8\uc5b4");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        char[] charArray6 = new char[] { '4', '#' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0 days 0 hours 0 minutes 0 seconds", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!                                                                                              ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "tes", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!HI!ihHI!HI!HI", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, #]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("zh", "CAN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setVariant("hi!#######");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi!####### [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0 days 0 hours 0 minutes 0 seconds                                                                  ", "", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("!ih!ih!...testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        java.lang.String str2 = timeZone1.getID();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone1.getDisplayName(true, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("0:00:00.99");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 0:00:00.99 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...ch0eure 0e Gr...", "0e-DE", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...ch0eure 0e Gr..." + "'", str3, "...ch0eure 0e Gr...");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "P-1Y11M30DT23H59M59.947S", 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S" + "'", str3, "                                 P-1Y11M30DT23H59M59.947S0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 14, (long) (byte) -1, "P-1Y11M30DT23H59M59.990S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9903599985" + "'", str3, "P-1Y11-130DT2374359-159.9903599985");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                       44444444444444444444444444444W", "4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       44444444444444444444444444444W" + "'", str2, "                       44444444444444444444444444444W");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\u4e2d\u6587!ih!ih!i", "stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'nglish (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587!ih!ih!i" + "'", str2, "\u4e2d\u6587!ih!ih!i");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0danaC:danaC00danaC:danaC00danaC.danaC097", "P0Y0M0DT0H0M0.99S", "P0Y0M0DT0H0M0.023S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0danaC:danaC00danaC:danaC00danaC.danaC097" + "'", str3, "0danaC:danaC00danaC:danaC00danaC.danaC097");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!ih", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i" + "'", str2, "!i");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("United States", "P0Y0M0DT0H0M0.023S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444444444444", 63, "                                                                                                                    !I0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     4444444444444444444444444444444444444444444444444444      " + "'", str3, "     4444444444444444444444444444444444444444444444444444      ");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.lang.String str1 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS((long) 89);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.089" + "'", str1, "0:00:00.089");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "P0Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str1, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("stestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'nglish (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "STESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'NGLISH (uNITED kINGDOM)" + "'", str1, "STESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST'P'YYYY'Y'M'M'D'DT'H'H'M'M'S.S'S'NGLISH (uNITED kINGDOM)");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0I!                                                                                              ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0I!                                                                                              " + "'", str2, "0I!                                                                                              ");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("P0Y000DT00000.0230", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("p0y0m0dt0h0m0.090s", 336);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                              p0y0m0dt0h0m0.090s" + "'", str2, "                                                                                                                                                                                                                                                                                                                              p0y0m0dt0h0m0.090s");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale2);
        java.lang.String str4 = locale0.getDisplayVariant(locale2);
        java.lang.String str5 = locale0.getDisplayVariant();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("99.00:00:0");
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale10);
        java.util.Locale.Builder builder13 = builder8.setLocale(locale10);
        java.lang.String str14 = locale7.getDisplayLanguage(locale10);
        java.lang.String str15 = locale0.getDisplayCountry(locale10);
        java.util.Locale locale17 = new java.util.Locale("!IH");
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = locale0.getDisplayName(locale17);
        java.util.Locale locale20 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "99.00:00:0" + "'", str12, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd" + "'", str15, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale17.toString(), "!ih");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "!ih" + "'", str18, "!ih");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese (China)" + "'", str19, "Chinese (China)");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("44444444444444444444444444444444444444           HI!", "                                                                                     0:00:00.000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("OURS 0 MI", "Rf", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OUhS 0 MI" + "'", str3, "OUhS 0 MI");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaTE0abTE0aeTE0afTE0akTE0amTE0anTE0arTE0asTE0avTE0ayTE0azTE0baTE0beTE0bgTE0bhTE0biTE0bmTE0bnTE0boTE0brTE0bsTE0caTE0ceTE0chTE0coTE0crTE0csTE0cuTE0cvTE0cyTE0daTE0deTE0dvTE0dzTE0eeTE0elTE0enTE0eoTE0esTE0etTE0euTE0faTE0ffTE0fiTE0fjTE0foTE0frTE0fyTE0gaTE0gdTE0glTE0gnTE0guTE0gvTE0haTE0heTE0hiTE0hoTE0hrTE0htTE0huTE0hyTE0hzTE0iaTE0idTE0ieTE0igTE0iiTE0ikTE0inTE0ioTE0isTE0itTE0iuTE0iwTE0jaTE0jiTE0jvTE0kaTE0kgTE0kiTE0kjTE0kkTE0klTE0kmTE0knTE0koTE0krTE0ksTE0kuTE0kvTE0kwTE0kyTE0laTE0lbTE0lgTE0liTE0lnTE0loTE0ltTE0luTE0lvTE0mgTE0mhTE0miTE0mkTE0mlTE0mnTE0moTE0mrTE0msTE0mtTE0myTE0naTE0nbTE0ndTE0neTE0ngTE0nlTE0nnTE0noTE0nrTE0nvTE0nyTE0ocTE0ojTE0omTE0orTE0osTE0paTE0piTE0plTE0psTE0ptTE0quTE0rmTE0rnTE0roTE0ruTE0rwTE0saTE0scTE0sdTE0seTE0sgTE0siTE0skTE0slTE0smTE0snTE0soTE0sqTE0srTE0ssTE0stTE0suTE0svTE0swTE0taTE0teTE0tgTE0thTE0tiTE0tkTE0tlTE0tnTE0toTE0trTE0tsTE0ttTE0twTE0tyTE0ugTE0ukTE0urTE0uzTE0veTE0viTE0voTE0waTE0woTE0xhTE0yiTE0yoTE0zaTE0zhTE0zu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0:00:00.99", 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("DE", "P0Y0M0DT0H0M0.000S444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S444444" + "'", str2, "P0Y0M0DT0H0M0.000S444444");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinesisch (China)" + "'", str1, "Chinesisch (China)");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Greenwich Mean Time" + "'", str2, "Greenwich Mean Time");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "uNITED STATES");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("dnu", "P0Y0M0DT0H0M0.121S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("can");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "can" + "'", str1, "can");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097", "zh_44444444444444444444444444444zh_");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder7 = builder5.setLanguage("und");
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getScript();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet14 = locale12.getExtensionKeys();
        java.lang.String str15 = locale12.getISO3Language();
        java.util.Locale.Builder builder16 = builder7.setLocale(locale12);
        boolean boolean17 = locale12.hasExtensions();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fra" + "'", str15, "fra");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("");
        java.lang.String str7 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone6);
        boolean boolean8 = timeZone6.observesDaylightTime();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("");
        java.lang.String str15 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone14);
        boolean boolean16 = timeZone6.hasSameRules(timeZone14);
        boolean boolean17 = timeZone0.hasSameRules(timeZone6);
        boolean boolean18 = timeZone0.observesDaylightTime();
        java.time.ZoneId zoneId19 = timeZone0.toZoneId();
        timeZone0.setRawOffset(153);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zoneId19);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        char[] charArray10 = new char[] { 'a', ' ', '#', '4', '#', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "z", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a #4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , #, 4, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", '#');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0 seconds", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                    " + "'", str5, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaP0Y000DT00000.034-1aaaaaaaaaaaaaaaaaaGreenwich Mean Time", "zh_tw (P0Y0-10DT07430-10.0343599900,0 DAY14 0 0OUR14 0 0INUTE14 0 ECOND)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...INUTES 0 SECOND)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...INUTES 0 SECOND)" + "'", str1, "...INUTES 0 SECOND)");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Locale locale2 = java.util.Locale.KOREAN;
        java.lang.String str3 = locale2.getDisplayVariant();
        java.lang.String str4 = locale0.getDisplayName(locale2);
        boolean boolean5 = locale2.hasExtensions();
        boolean boolean6 = locale2.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc77c\ubcf8\uc5b4" + "'", str4, "\uc77c\ubcf8\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("en-CA", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI!44444444444444444444444444444", "44444444444444444444444444444444444444           HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("DE", "zh-CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DE" + "'", str2, "DE");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("99.00:00:0", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI!HI!HI!ihHI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ih");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("Chine0e", "'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ', 3, (-1));
        boolean boolean12 = languageRange1.equals((java.lang.Object) str11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih" + "'", str2, "ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih" + "'", str3, "ih");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ih" + "'", str4, "ih");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.util.Locale locale3 = new java.util.Locale("testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'", "0I!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(locale3.toString(), "testestestestestestestestestestestestestestestestestestestestest'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's'_0I!_hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Greenwich Mean Time", "de");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("            0:00:00.000", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("FR", "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("United States", "aaaaaaaaaaaaaa...", "ENGLISH (UNITED STATES)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "United States" + "'", str3, "United States");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H", "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H" + "'", str2, "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\u6cd5\u6587\u6cd5\u56fd)", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str2, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 21, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2, "P-1Y11M30DT23H59M59.989S");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("fran\347ais", 224, 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.lang.String str6 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone5);
        boolean boolean7 = timeZone5.observesDaylightTime();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        java.lang.String str14 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, 0L, "\u4e2d\u6587", true, timeZone13);
        boolean boolean15 = timeZone5.hasSameRules(timeZone13);
        timeZone13.setID("zh");
        java.util.TimeZone.setDefault(timeZone13);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Chinesisch", "P0Y0-10DT07430-10.0343599900I!", "                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch" + "'", str3, "Chinesisch");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("ng", "te0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setRegion("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0e-de", "GMT", 32, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GMT" + "'", str4, "GMT");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                P0Y0M0DT0H0M0.090ShiP0Y0M0DT0H0M0.090S!P0Y0M0DT0H0M0.090S", "P0Y0M0DT0H0M0.023S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444440 DAYS 0 HOURS 0 MINUTES 0 SECO", "                                                                                     0:00:00.000");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u683c\u6797\u5a01\u6cbb\u6642\u9593", 336, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh_tw");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_tw");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 'x', false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd))");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale locale6 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("HI!", locale9);
        java.lang.String str11 = locale7.getDisplayVariant(locale9);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.lang.String str17 = locale14.getDisplayName(locale16);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray19 = new java.util.Locale[] { locale7, locale12, locale14, locale18 };
        java.util.ArrayList<java.util.Locale> localeList20 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList20, localeArray19);
        java.util.Locale locale22 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList20);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, '4');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str17, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("fran\347\uc911\uad6d\uc5b4\uc911\uad6d)", "   te0    ");
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                     !i0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaChinese (China)aaaaaaaaaaaaa");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("EN-GB");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category4, locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleKeys();
        java.util.Locale locale9 = new java.util.Locale("");
        java.util.Locale locale11 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str12 = locale9.getDisplayScript(locale11);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("P0Y0M0DT0H0M0.034S");
        java.lang.String str15 = locale11.getDisplayName(locale14);
        java.lang.String str16 = locale5.getDisplayScript(locale11);
        java.lang.String str17 = locale3.getDisplayVariant(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = locale5.getUnicodeLocaleType("#######p0y0m0dt0h0m0.000s#######");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: #######p0y0m0dt0h0m0.000s#######");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Germany", (int) 'u', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Germany##############################################################################################################" + "'", str3, "Germany##############################################################################################################");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "!IH#####################################################################################################################", 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!IH#####################################################################################################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("99.00:00:0", locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setLanguageTag("'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 'p'yyyy'y'm'm'd'dt'h'h'm'm's.s's [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99.00:00:0" + "'", str4, "99.00:00:0");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "P-1Y11M30DT23H59M59.901S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str1, "P-1Y11M30DT23H59M59.901S");
    }
}
